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
    if(arr==null || arr.length == 0) {
      throw new IllegalArgumentException("Invlaid Input");
    }
    int min = arr[0];
    for(int i =1; i<arr.length; i++){
      if(arr[i]<min){
        min = arr[i];
      }
    }
    return min;
  }

  //Finding the second Max
  public int secondMax(int[] arr){
    if(arr==null || arr.length <2) {
      throw new IllegalArgumentException("Invlaid Input");
    }

    int max = Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;

    for(int i=1; i<arr.length; i++){
      if(arr[i]>max){
        secondMax = max;
        max = arr[i];
      }
      else if(arr[i]>secondMax && arr[i] != max){
        secondMax = arr[i];
      }
    }

    return secondMax;
  }

  //Making all zeros trail in an array
  public int[] trailingZeros(int[] arr, int N) {
    int j =0; //focus on the zeorth element
    for(int i=0;i<N; i++){ // i will focus on non zeroth element
      if(arr[i]!=0 && arr[j]==0){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
      if(arr[j] != 0){
        j++;
      }

    }
    return arr;
  }
  //Resizing an array
  public int[] resize(int[] arr, int capacity){
    int[] temp = new int[capacity];
    for(int i=0;i<arr.length; i++){
      temp[i] = arr[i];
    }
    return temp;
  }

  //Find missing number given an araay n-1
  public int findMissingValue(int[] arr){
    int n = arr.length +1;
    int sum = n * (n+1)/2;
    for(int item: arr){
      sum = sum - item;
    }
    return sum;
  }

  //Find if a string is a Palidrome
  public boolean checkPalidrome(String word){
    char[] wordCharacter = word.toCharArray();
    int start = 0;
    int end = word.length() -1;
    while(start<end){
      if(wordCharacter[start]!=wordCharacter[end]){
        return false;
      }
      start++;
      end--;
    }
    return true;
  }

}
