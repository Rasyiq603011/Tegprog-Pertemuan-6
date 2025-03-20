// ****************************************************************
// Factorials.java
// Reads integers from the user and prints the factorial of each.
//
// ****************************************************************
import java.util.Scanner;
public class Factorials{
    public static void main(String[] args){
        String keepGoing = "y";
        Scanner scan = new Scanner(System.in);
        while (keepGoing.equals("y") || keepGoing.equals("Y")){
            System.out.print("Enter an integer: ");
            boolean validInput = true;
            int val =0;
            try{
                val = scan.nextInt();

            } catch (Exception e){
                System.out.println(e.getCause()+" Hanya menerima input angka");
                validInput = false;
                scan.nextLine();
            }

            if(validInput){
                try{
                    System.out.println("Factorial(" + val + ") = "+ MathUtils.factorial(val));
                }catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
            }

            System.out.print("Another factorial? (y/n) ");
            keepGoing = scan.next();
        }
        scan.close();
    }
}