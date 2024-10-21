public class Main {
  public static void main(String[] args) {

    int[] nums = {11,1, 2,4,6,7,8,3,5,9,0, 23};
    LearnArrays mynumbers = new LearnArrays();
    mynumbers.printArray(nums);
    System.out.println(" ");

    int[] results = mynumbers.removeEven(nums);

    mynumbers.printArray(results);
    System.out.println(" ");

    //Reversed Array
    mynumbers.reversedArray(nums, 0, nums.length-1);
    mynumbers.printArray(nums);
    System.out.println(" ");



    System.out.print("The minimum value is: ");
    System.out.println(mynumbers.findMin(nums));



  }
}
