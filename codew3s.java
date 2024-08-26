//JAVA IF ESLE 
public class Main {
  public static void main(String[] args) {
    int x = 20;
    int y = 18;
    if (x > y) {
      System.out.println("x is greater than y");
    }  
  }
}
 // output : x is greater than y

 //JAVA WHILE LOOP
public class Main {
  public static void main(String[] args) {
    int i = 0;
    while (i < 5) {
      System.out.println(i);
      i++;
    }  
  }
}
// output
0
1
2
3
4

  //JAVA FOR LOOP
  for (int i = 0; i < 5; i++) {
  System.out.println(i);
}
// output 
0
1
2
3
4

  // JAVA EACH LOOP
  String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (String i : cars) {
  System.out.println(i);
}
// OUTPUT 
Volvo
BMW
Ford
Mazda

  // JAVA SWITCH
  int day = 4;
switch (day) {
  case 1:
    System.out.println("Monday");
    break;
  case 2:
    System.out.println("Tuesday");
    break;
  case 3:
    System.out.println("Wednesday");
    break;
  case 4:
    System.out.println("Thursday");
    break;
  case 5:
    System.out.println("Friday");
    break;
  case 6:
    System.out.println("Saturday");
    break;
  case 7:
    System.out.println("Sunday");
    break;
}
// Outputs "Thursday" (day 4)
