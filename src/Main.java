import arrays.LearnArrays;

public class Main {
  public static void main(String[] args) {

    int[] nums = {3,0,6,11,0,8,0,9};
    LearnArrays mynumbers = new LearnArrays();
    //print array
    System.out.print("Our array is: ");
    mynumbers.printArray(nums);
    System.out.println(" ");

    //Reversed Array
    System.out.print("The reversed array is: ");
    mynumbers.reversedArray(nums, 0, nums.length-1);
    mynumbers.printArray(nums);
    System.out.println(" ");

    //show odd values in the array
    System.out.print("The odd values in our array are: ");
    int[] results = mynumbers.removeEven(nums);
    mynumbers.printArray(results);
    System.out.println(" ");

    //Minimum value in the array
    System.out.print("The minimum value is: ");
    System.out.println(mynumbers.findMin(nums));

    //Seconnd maximum value in our array is:
    System.out.print("The second Max value is: ");
    System.out.println(mynumbers.secondMax(nums));

    //Move the zero value to be trailing
    System.out.print("The array with trailing zeros: ");
    mynumbers.printArray(mynumbers.trailingZeros(nums, nums.length));

    //Resizing array to size 10
    System.out.print("Resized array: ");
    mynumbers.printArray(mynumbers.resize(nums, 10));

    // Check string palidrome
    String first_word = "madam";
    String second_word = "that";
    System.out.println("The word => " + first_word + " is a palidrome? " + mynumbers.checkPalidrome(first_word));
    System.out.println("The word => " + second_word + " is a palidrome? " +mynumbers.checkPalidrome(second_word));



  }
}
