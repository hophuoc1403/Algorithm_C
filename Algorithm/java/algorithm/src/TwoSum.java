import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class TwoSum {


  public static void main(String[]args){
    int[] array = {1,2,3,4,5,6,7,8};
    findTwoSum(array,10);
  }

  // person way
  public static void findTwoSum(int[] args, int number) {
    int firstPosition = 0;
    int[] result = new int[0];

    while (firstPosition < args.length) {
    int firstNumber = args[firstPosition];
      int secondNumber = number - firstNumber;
     int secondPosition  = Arrays.binarySearch(args,secondNumber);
      if(secondPosition >= 0) {
        result= new int[]{firstNumber, secondNumber};
        break;
      }
      else {
        firstPosition ++;
      }
    }
   if(result.length == 0){
     System.out.println("no result");
   }
    else {
     System.out.println("answer : " + result[0] + result[1]);
   }
  }

  // professional way
  public int[] find(int [] args,int number){
    Map<Integer,Integer> complements = new HashMap<>();
    for(int i = 0;i <args.length;i++){
      Integer complementIndex = complements.get(args[i]);
      if(complementIndex != null) {
        return new int[] {i,complementIndex};
      }
      complements.put(number - args[i],i);
    }
    return args;
  }
}
