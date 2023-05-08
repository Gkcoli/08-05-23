import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);  
     System.out.println("Pangalan ng Tao: ");
     String name = scan.nextLine();
     System.out.println("Ilagay ang edad: ");
     int age = scan.nextInt();

    Tao t1 = new Tao(name, age);
        System.out.println(t1.getName() + ", " + t1.getAge());
    
    }
}
