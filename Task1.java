import java.util.Scanner;
public class Task1 {
   static int calculator(int number, String operation){
      int result = 0;
      switch(operation){
         case("+"):
         for(int i = 1 ; i<=number; i++) result = result + i;
         break;
         case("*"):
         result = 1;
         for(int i = 1 ; i<=number; i++) result = result * i;
         break;
      }
      return result;
   }
  
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int number = Integer.parseInt(Task4.fieldsInputer(sc, "Please input number for looking for the n-th triangular number and n! this number:"));
      System.out.println("Triangular number: "+calculator(number, "+"));
      System.out.println("Factorial number: "+calculator(number, "*"));

   }
}