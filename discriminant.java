class discriminant {
  public static void main (String[] args) {
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int c = Integer.parseInt(args[2]);

    double discriminant = b*b - 4.0*a*c;
    
    if (discriminant < 0.0) {
      System.out.println("no real roots");
    } else {
      System.out.println((-b + discriminant)/2.0);
      System.out.println((-b - discriminant)/2.0);
    }
  }
}