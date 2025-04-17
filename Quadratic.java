public class Quadratic {
  public static void main (String[] args) {
    double a = Double.parseDouble(args[0]);
    double b = Double.parseDouble(args[1]);
    double c = a + b;
    System.out.println(a + " + " + b + " = " + c);
    double sqrt = Math.sqrt(a);
    System.out.println("The square root of " + a + " = " + sqrt);
  }
}