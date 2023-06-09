import java.util.ArrayList;
import java.util.Arrays;
public class Task2{
	public static void main(String[] args) {
		ArrayList<Integer> primeNumberList = new ArrayList<>(Arrays.asList(2));
		for(int i=3; i<1000; i++){
         for(int j = 2; j<=Math.ceil(Math.sqrt(i)); j++){
            if(i%j==0) break;
            if(j==Math.ceil(Math.sqrt(i))) primeNumberList.add(i);
         }
      }
      System.out.println(primeNumberList);
	}
}
 
