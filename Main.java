import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Exception = An event that interrupts the normal flow of a program
        //                      (Dividing by zero, file not found, mismatch input type)
        //                      Surround any dangerous code with a try{} block
        //                       try{}, catch{}, finally{}
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("entrez 1er nombre");
            int a = scanner.nextInt();
            System.out.println("entrez 2eme nombre");
            int b = scanner.nextInt();
            System.out.println(a / b);
        }
        catch(ArithmeticException e){
            System.out.println("il est impossible de diviser par zero");
        }
        catch(InputMismatchException e){
            System.out.println("Vous devez entrer un nombre");
        }
        finally{
            scanner.close();
            System.out.println("Au Revoir !");
        }
    }
}
