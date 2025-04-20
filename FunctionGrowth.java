class FunctionGrowth {
  public static void main (String[] args) {
    // ln(n) | n | nln(n) | n2 | n3 | 2^n
    // n: 16 -> 2048
    System.out.println("ln(n) \t n \t nln(n) \t n^2 \t n^3 \t 2^n");

    for (int n = 16; n <= 2048; n *= 2) {
      System.out.print(Math.log(n));
      System.out.print("\t");
      System.out.print(n);
      System.out.print("\t");
      System.out.print(n*Math.log(n));
      System.out.print("\t");
      System.out.print(Math.pow(n, 2));
      System.out.print("\t");
      System.out.print(Math.pow(n, 3));
      System.out.print("\t");
      System.out.print(Math.pow(2, n));
    }
    
  }
}