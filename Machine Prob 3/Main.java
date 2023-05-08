import ClassPack.*;
import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);  
   // Tao
//    System.out.println("Pangalan ng Tao: ");
//    String name = scan.nextLine();
//    System.out.println("Ilagay ang edad: ");
//    int age = scan.nextInt();

//   Tao t1 = new Tao(name, age);
//       System.out.println(t1.getName() + ", " + t1.getAge());
   
   
   
   
    //  System.out.println("Type ng Hayop: ");
    //  String type = scan.nextLine();
    //  System.out.println("Pangalan ng Hayop: ");
    //  String hayop = scan.nextLine();
    //  System.out.println("Breed ng Hayop: ");
    //  String breed = scan.nextLine();

    //  Animal a1 = new Animal(type, hayop, breed);
    //  System.out.println("Type ng Hayop " + a1.getanimalType() + "\n" + "Pangalan ng Hayop " + a1.getanimalPangalan() + "\n"+ "Breed ng Hayop " + a1.getanimalBreed());

    System.out.println("Pangalan ng Employee: ");
    String name = scan.nextLine();
    System.out.println("Job Title: ");
    String title = scan.nextLine();
    System.out.println("Salary: ");
    int sahod = scan.nextInt();

    Employee e1 = new Employee(name, title, sahod);
    System.out.println("Pangalan " + e1.getEmployeeName() + "\n" + "Trabaho " + e1.getemployeeJobTitle() + "\n" + "Salary " + e1.getSalary(sahod));


 
     scan.close();
   
    }
}
