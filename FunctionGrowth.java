class FunctionGrowth {
  public static void main (String[] args) {
    System.out.println("log n\tn\tn log n\tn^2\tn^3");
            for (long n = 2; n <= 2048; n *= 2) {
              System.out.print((int) Math.log(n));
              System.out.print('\t');
              System.out.print(n);
              System.out.print('\t');
              System.out.print((int) (n * Math.log(n)));
              System.out.print('\t');
              System.out.print(n * n);
              System.out.print('\t');
              System.out.print(n * n * n);
              System.out.println();
            }
    
  }
}