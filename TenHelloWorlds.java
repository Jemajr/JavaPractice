public class TenHelloWorlds {
  public static void main (String[] args) {
    // System.out.print("Hi, ");
    // System.out.print(args[0]);
    // System.out.print(", ");
    // System.out.print(args[1]);
    // System.out.print(", and ");
    // System.out.print(args[2]);

    int i = 1;
        while (i <= 10) {
            System.out.println(i + "th Hello world");
            i = i + 1;
        }

    System.out.println("");
    System.out.println("using a for loop");
    System.out.println("");


    for (i=1; i<10; i++){
      System.out.println(i + "th Hello world");
    }
  }
}