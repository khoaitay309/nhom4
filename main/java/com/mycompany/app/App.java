public class App{
    public static void main(String[] args){
        Book myBook = new Book("TheTexBook", "Donald knuth", 483);
        //Time myTime = new Time();
        //Recursion myRecursion = new Recursion();
        //NNcollection myNNcollection = new NNcollection();
        //NameNumber myNameNumber = new NameNumber();
        System.out.println(myBook.title);
        System.out.println(myBook.author);
        System.out.println(myBook.numPages);
    }
}