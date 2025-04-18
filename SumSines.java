class SumSines {
  public static void main (String[] args) {
    int first_angle = Integer.parseInt(args[0]);
    int second_angle = Integer.parseInt(args[1]);
    double first_sine = Math.sin(first_angle * 2);
    double second_sine = Math.sin(second_angle * 3);
    double total = first_sine + second_sine;

    String res = String.format("sin(2*%d) + sin(3*%d) = %f", first_angle, second_angle, total);
    System.out.println(res);
  }
}