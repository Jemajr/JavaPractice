public class KickBoxer {
  public static void main (String[] args) {
    // this program will take in a weight as an input and print out the corresponding kickboxing class

    int[] range = {112, 115, 118, 122, 126, 130, 135, 140, 147, 154, 160, 167, 174, 183, 189, 198, 209};

    String[] category = {"Fly Weight", "Super Fly Weight", "Bantam Weight", "Super Bantam Weight", "Feather Weight", "Super Feather Weight", "Light Weight", "Super Light Weight", "Welter Weight", "Super Welter Weight", "Middle Weight", "Super Middle Weight", "Light Heavy Weight", "Super Light Heavy Weight", "Cruiser Weight", "Super Cruiser Weight", "Heavy Weight", "Super Heavy Weight"};

    int w = Integer.parseInt(args[0]);

    if (w < 0) {
      System.out.println("Invalid Weight"); // edge case
    } else if (w > 209)
  }
}
