class FivePerLine {
  public static void main (String[] args){
    /// one for loop and one if statement
    /// prints the integers from 1000 to 2000
    /// printing five per line
    /// use % operator
    /// 
    /// go from 1000 to 2000
    /// integers are basically whole numbers 1 2 3 4 5
    
    int counter = 1;

    for (int i = 1000; i < 2000; i++) {
      if (counter % 5 != 0){
        System.out.print(i + " ");  // added a space to separate numbers
      } else {
        System.out.println(i);
      }
    }
  }
}