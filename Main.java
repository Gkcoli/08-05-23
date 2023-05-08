import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);  
     System.out.println("Type ng Hayop: ");
     String type = scan.nextLine();
     System.out.println("Pangalan ng Hayop: ");
     String hayop = scan.nextLine();
     System.out.println("Breed ng Hayop: ");
     String breed = scan.nextLine();

     Animal a1 = new Animal(type, hayop, breed);
     System.out.println("Type ng Hayop " + a1.getanimalType() + "\n" + "Pangalan ng Hayop " + a1.getanimalPangalan() + "\n"+ "Breed ng Hayop " + a1.getanimalBreed());


     
   
    }
}
