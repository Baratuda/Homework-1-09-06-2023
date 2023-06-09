import java.util.Scanner;
public class Task4 {
   static int convertType(int number, String str){
      str = str.replace("?", Integer.toString(number));
      return Integer.parseInt(str); 
   }
   static String fieldsInputer(Scanner sc, String message){
      System.out.println(message);
      return sc.next();
   }
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String firstNum = fieldsInputer(sc, "Please input first number: ");
      String secondNum = fieldsInputer(sc, "Please input second number: ");
      String resultNum = fieldsInputer(sc, "Please input result: ");
      
      for(int i = 0; i<10; i++){
         int firstNumber = convertType(i,firstNum);
         int secondNumber = convertType(i,secondNum);
         int result = convertType(i,resultNum);
         if(firstNumber+secondNumber == result) {
            System.out.printf("Result: d% + d% = d", firstNumber,secondNumber,result);
            break;
         }
         if(i==9) System.out.println("Please, try to unput another numbers. The equation with these numbers does not exist");
      }
   }
}
