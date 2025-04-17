class LeapYear {
  public static void main (String[] args) {
    boolean IsLeapYear;
    int year = Integer.parseInt(args[0]);

    IsLeapYear = (year % 4 == 0);

    IsLeapYear = IsLeapYear && (year % 100 != 0);  // and operator

    IsLeapYear = IsLeapYear || (year % 400 == 0);  // or operator

    System.out.println(IsLeapYear);

    double result = 10.0/3; // at least one of the numbers has to be a decimal to get a decimal result

    System.out.println("result = " + result);  // practicing with numbers
  }
}