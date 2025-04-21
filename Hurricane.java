class Hurrican {
  public static void main (String[] args) {
    // this program will take wind speed as an argument and return if it qualifies as a hurrican or not
    int windSpeed = Integer.parseInt(args[0]);

    /*
     * 1	74 - 95
2	96 - 110
3	111 - 130
4	131 - 155
5	155 and above
     */

     if (windSpeed < 74) {
      System.out.println("Not a hurricane");
     } 
     
     else if ((windSpeed >= 74) && (windSpeed <= 95)) {
      System.out.println("Category 1");
     }

     else if ((windSpeed >= 96) && (windSpeed <= 110)) {
      System.out.println("Category 2");
     }

     else if ((windSpeed >= 111) && (windSpeed <= 130)) {
      System.out.println("Category 3");
     }

     else if ((windSpeed >= 131) && (windSpeed <= 155)) {
      System.out.println("Category 4");
     }

     else if (windSpeed >= 156) {
      System.out.println("Category 5");
     }
  }
}