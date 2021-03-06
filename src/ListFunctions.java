import java.util.Scanner;

public class ListFunctions{
  //can take 0,1, or 2 numbers
  //returns sum
  public static int add(String numbers){
    int runningTotal = 0;
    if(numbers.length() == 0){
      return runningTotal;
     }
    Scanner s = new Scanner(numbers).useDelimiter(",");
    while(s.hasNext()){
      runningTotal += s.nextInt();
    }
    return runningTotal;
   }
}
