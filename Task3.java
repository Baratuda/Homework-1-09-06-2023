import java.util.Scanner;
public class Task3 {
   static int calculator(int firstNumber, int secondNumber, String operation){
      int result = 0;
      switch(operation){
         case("+"):
            result = firstNumber+secondNumber;
            break;
         case("-"):
            result = firstNumber-secondNumber;
            break;
         case("*"):
            result = firstNumber*secondNumber;
            break;
         case("/Task4.java"):
            result = firstNumber/secondNumber;
            break;   
      }
      return result;
   }
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int firstNumber = Integer.parseInt(Task4.fieldsInputer(sc, "Please input first number:"));
      int secondNumber = Integer.parseInt(Task4.fieldsInputer(sc, "Please input second number:"));
      String operation = Task4.fieldsInputer(sc, "Please input operation:");
      System.out.printf("Result: %d %s %d = %d ",firstNumber,operation,secondNumber,calculator(firstNumber, secondNumber, operation));
   }
}
