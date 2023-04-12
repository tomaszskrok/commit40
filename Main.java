import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    try {
      System.out.println("0 ==> Dodaj dodaj studenta ");
      System.out.println("1 ==> Wypisz dane studenta");
      System.out.println("2 ==> Opuść program");
      Scanner scanner = new Scanner(System.in);
      int choose = scanner.nextInt();

      if (choose==1)
      {
        System.out.println("Wprowadź dane studenta: ");
        
      }
      else if(choose==0)
      {}
      //Service s = new Service();
      //s.addStudent(new Student("", 20));
      //s.addStudent(new Student("", 21));

      //var students = s.getStudents();
      //for(Student current : students) {
        //System.out.println(current.ToString());
      }
    } //catch (IOException e) {

    }
  }
}