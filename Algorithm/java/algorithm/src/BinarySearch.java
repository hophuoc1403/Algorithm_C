public class BinarySearch {


  public static void main(String[] args) {
    int[] array = {1,2,3,4,5,6,7};
    System.out.println(search(array,8));
   }

   // search in middle each subArray
  public static int search(int[] args,int number){
    int high = args.length -1;
    int low = 0;
    while (low <= high) {
      int middlePosition = (low + high) / 2;
      int middleNumber = args[middlePosition];
      if(middleNumber == number){
        return middleNumber;
      }else if(middleNumber  > number){
        high--;
      }else {
        low++;
      }
    }
    return -1;
  }
}
