DROP DATABASE IF EXISTS quanlythuvien;
CREATE DATABASE quanlythuvien;
USE quanlythuvien;

DROP TABLE IF EXISTS muon_tra;
DROP TABLE IF EXISTS nguoidung;
DROP TABLE IF EXISTS sach;


CREATE TABLE nguoidung(
    tentaikhoan VARCHAR(100) NOT NULL UNIQUE,             
    matkhau VARCHAR(100) NOT NULL,
    manguoidung VARCHAR(20) UNIQUE,
    tennguoidung VARCHAR(100) NOT NULL,
    vaitro ENUM('admin', 'thành viên') NOT NULL,                          
    gioitinh ENUM('nam', 'nữ', 'ẩn') NOT NULL,   
    email VARCHAR(100) NOT NULL,                
    diachi VARCHAR(100) NOT NULL,
    PRIMARY KEY(MANGUOIDUNG),
    CONSTRAINT ktravaitro CHECK (vaitro IN ('admin', 'thành viên')),
    CONSTRAINT ktragioitinh CHECK (gioitinh IN ('nam', 'nữ', 'ẩn'))
);

CREATE TABLE sach (
    maSach VARCHAR(20) PRIMARY KEY,      
    theLoai VARCHAR(50) NOT NULL,        
    tenSach VARCHAR(100) NOT NULL,       
    tenTacGia VARCHAR(100) NOT NULL,   
    namXuatBan INT NOT NULL,
    soLuongCon INT NOT NULL,             
    tinhTrang ENUM('Có thể mượn', 'Đã có người mượn') NOT NULL,
    CONSTRAINT ktratinhtrangsach CHECK (tinhTrang IN ('Có thể mượn', 'Đã có người mượn'))
);

CREATE TABLE muon_tra (
    maID INT AUTO_INCREMENT PRIMARY KEY,
    manguoidung VARCHAR(8) NOT NULL,
    maSach VARCHAR(20) NOT NULL,
    ngayMuon DATE,
    ngayTra DATE,
    FOREIGN KEY (manguoidung) REFERENCES nguoidung(manguoidung),
    FOREIGN KEY (maSach) REFERENCES sach(maSach)
);

-- trigger truoc khi muon sach
DELIMITER //
CREATE TRIGGER check_soLuongmuon
BEFORE INSERT ON muon_tra
FOR EACH ROW
BEGIN
    IF (SELECT soLuongCon FROM sach WHERE maSach = NEW.maSach) = 0 THEN
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Sách đã được mượn hết.';
    END IF;
END //
DELIMITER ;

-- trigger muon sach
DELIMITER //
CREATE TRIGGER trigger_muonsach
AFTER INSERT ON muon_tra
FOR EACH ROW
BEGIN
	UPDATE sach
    SET soLuongCon = soLuongCon - 1
    WHERE sach.maSach = NEW.maSach;
END //
DELIMITER ;

-- trigger tra sach
DELIMITER //
CREATE TRIGGER trigger_trasach
AFTER DELETE ON muon_tra
FOR EACH ROW
BEGIN
	UPDATE sach
    SET soLuongCon = soLuongCon + 1
    WHERE sach.maSach = OLD.maSach;
END //
DELIMITER ;

-- Cập nhật tình trạng dựa trên số lượng còn
DELIMITER //
CREATE TRIGGER capnhattinhtrang
BEFORE UPDATE ON sach
FOR EACH ROW
BEGIN
    IF NEW.soLuongCon = 0 THEN
        SET NEW.tinhTrang = 'Đã có người mượn';
    ELSE
        SET NEW.tinhTrang = 'Có thể mượn';
    END IF;
END //
DELIMITER ;

INSERT INTO nguoidung (tentaikhoan, matkhau, manguoidung, tennguoidung, vaitro, gioitinh, email, diachi) VALUES
('admin', '1809','2005', 'manhdung', 'admin', 'nam', 'dung@gmail.com', 'vĩnh phúc');
INSERT INTO sach (maSach, theLoai, tenSach, tenTacGia, namXuatBan, soLuongCon, tinhTrang) VALUES
('S001','Công nghệ thông tin', 'Introduction to Algorithms', 'Thomas H. Cormen', 2009, 5, 'Có thể mượn'),
('S002','Lập trình', 'Clean Code', 'Robert C. Martin', 2008, 3,'Có thể mượn'),
('S003','Bảo mật', 'Applied Cryptography', 'Bruce Schneier', 2015, 2, 'Có thể mượn');



