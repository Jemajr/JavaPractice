//program to check if a date is in the spring (march 20 -> june 20)

class SpringSeason {
  public static void main (String[] args) {
    // march to june is 3 -> 6
    // march and may = 31 days; april and june = 30 days;

    int mar = 3;
    int apr = 4;
    int may = 5;
    int jun = 6;

    boolean res = true;

    int month = Integer.parseInt(args[0]);
    int day = Integer.parseInt(args[1]);

    if ((month == mar) || (month == may)) {
      if ((day >= 1) || (day < 31)) {
        res = true;
      } else {
        res = false;
        System.out.println(res);
      }
    } 
    
    else if ((month == apr) || (month == jun)) {
      if ((day >= 1) || (day < 30)) {
        res = true;
      } else {
        res = false;
      }
    }

    System.out.println(res);
  }
}