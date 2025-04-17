public class Distance {
  public static void main (String[] args) {
    double a = Double.parseDouble(args[0]);
    double b = Double.parseDouble(args[1]);

    double c_sqr = (a*a) + (b*b);

    double dist = Math.sqrt(c_sqr);

    System.out.println("Euclidean distance = " + dist);
  }
}