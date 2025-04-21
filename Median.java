import java.util.Arrays;

class Median {
  public static void main (String[] args){
    // this program will take in 5 numbers and return the median
    int first = Integer.parseInt(args[0]);
    int second = Integer.parseInt(args[1]);
    int third = Integer.parseInt(args[2]);
    int fourth = Integer.parseInt(args[3]);
    int fifth = Integer.parseInt(args[4]);

    int[] nums = {first, second, third, fourth, fifth};
   
    Arrays.sort(nums);

    System.out.println(nums[2]);

  }
}