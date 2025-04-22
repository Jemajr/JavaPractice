class MathRandom {
  public static void main (String[] args) {
    /// I'm using this program to understand the range for Math.random() in java
    
    int num1 = (int) Math.random();
    System.out.println("num1: " + num1);

    double num2 = Math.random();
    System.out.println("num2: " + num2);

    double num3 = Math.random() * 10;
    System.out.println("num3: " + num3);

    double num4 = Math.random() * 100;
    System.out.println("num4: " + num4);

    int num5 = (int) (Math.random() * 10);
    System.out.println("num5: " + num5);

    int num6 = (int) ((Math.random() * 10) + 1);
    System.out.println("num6: " + num6);
  }
}