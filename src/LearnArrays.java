public class LearnArrays {

  public void printArray(int[] numbersArray){
    for(int number : numbersArray ){
      System.out.print(number + " ");
    }
  }

  // In Java an array must be declared with a size.
  public int[] removeEven(int[] arr){
    int noOfOddItems = 0;
    for(int item:arr){
      if(item %2 !=0){
        noOfOddItems ++;
      }
    }

    int[] result = new int[noOfOddItems];
    int idx = 0;
    for(int item : arr){
      if(item % 2 != 0){
        result[idx] = item;
        idx ++;
      }

    }
    return result;

  }

  //Reversing an Array
  public void reversedArray(int[] arr, int start, int end) {
    while (start < end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }

  //Finding minimum value in an array
  public int findMin(int[] arr){
    int min = arr[0];
    for(int i =1; i<arr.length; i++){
      if(arr[i]<min){
        min = arr[i];
      }
    }
    return min;
  }

  public static void main(String[] args) {

    int[] nums = {12,7,23};

    //Printing items in our array.
    LearnArrays mynumbers = new LearnArrays();
    mynumbers.printArray(nums);


    //Odd items in our array.
    int[] results = mynumbers.removeEven(nums);
    System.out.println(" ");
    mynumbers.printArray(results);

    //Reversed Array
    mynumbers.reversedArray(nums, 0, nums.length-1);
    System.out.println(" ");
    mynumbers.printArray(nums);
  }
}
