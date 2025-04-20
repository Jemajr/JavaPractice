class AllEqual {
  public static void main (String[] args){
    int first = Integer.parseInt(args[0]);
    int second = Integer.parseInt(args[1]);
    int third = Integer.parseInt(args[2]);

    if ((first == second) && (first == third)) {
      System.out.println(true);
    }
    else {
      System.out.println(false);
    }
  }
}