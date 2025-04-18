class SumTwoDice {
  public static void main (String[] args) {

    // double num = 5.789;
    // int num1 = (int) num;  // learned that this will only take the integer part of a decimal number
    // System.out.println(num1);

    int first = (int)(Math.random() * 6) + 1;
    int second = (int)(Math.random()* 6) + 1;
    int total = first + second;

    System.out.println("first number: "+ first);
    System.out.println("second number: "+ second);
    System.out.println("total: " + total);
  }
}