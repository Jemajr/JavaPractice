class LeapYear {
  public static void main (String[] args) {
    boolean IsLeapYear;
    int year = Integer.parseInt(args[0]);

    IsLeapYear = (year % 4 == 0);

    IsLeapYear = IsLeapYear && (year % 100 != 0);  // and operator

    IsLeapYear = IsLeapYear || (year % 400 == 0);  // or operator

    System.out.println(IsLeapYear);
  }
}