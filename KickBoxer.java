public class KickBoxer {
  public static void main (String[] args) {
    // this program will take in a weight as an input and print out the corresponding kickboxing class

    int[] range = {112, 115, 118, 122, 126, 130, 135, 140, 147, 154, 160, 167, 174, 183, 189, 198, 209};

    String[] category = {"Fly Weight", "Super Fly Weight", "Bantam Weight", "Super Bantam Weight", "Feather Weight", "Super Feather Weight", "Light Weight", "Super Light Weight", "Welter Weight", "Super Welter Weight", "Middle Weight", "Super Middle Weight", "Light Heavy Weight", "Super Light Heavy Weight", "Cruiser Weight", "Super Cruiser Weight", "Heavy Weight", "Super Heavy Weight"};

    int w = Integer.parseInt(args[0]);

    // A better way would be to use a for-loop than multiple if-else statements

    if (w < 0) {
      System.out.println("Invalid Weight"); // edge case

    } else if (w > range[16]) {
      System.out.println(category[17]);
    } else if (w > range[15]) {
      System.out.println(category[16]);
    } else if (w > range[14]) {
      System.out.println(category[15]);
    } else if (w > range[13]) {
      System.out.println(category[14]);
    } else if (w > range[12]) {
      System.out.println(category[13]);
    } else if (w > range[11]) {
      System.out.println(category[12]);
    } else if (w > range[10]) {
      System.out.println(category[11]);
    } else if (w > range[9]) {
      System.out.println(category[10]);
    } else if (w > range[8]) {
      System.out.println(category[9]);
    } else if (w > range[7]) {
      System.out.println(category[8]);
    } else if (w > range[6]) {
      System.out.println(category[7]);
    } else if (w > range[5]) {
      System.out.println(category[6]);
    } else if (w > range[4]) {
      System.out.println(category[5]);
    } else if (w > range[3]) {
      System.out.println(category[4]);
    } else if (w > range[2]) {
      System.out.println(category[3]);
    } else if (w > range[1]) {
      System.out.println(category[2]);
    } else if (w > range[0]) {
      System.out.println(category[1]);
    } else {
      System.out.println(category[0]);
    }
  }
}
