class LeapYear {
  public static void main (String[] args) {
    boolean IsleapYear;
    int year = Integer.parseInt(args[0]);

    IsleapYear = (year % 100 == 0);
    System.out.println(IsleapYear);
  }
}