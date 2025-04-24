import java.util.Scanner; // importing the scanner to read user input

class TwentQuestions {
  public static void main (String[] args) {
    Scanner cin = new Scanner(System.in);  // creating a scanner object

    // this is a guessing game
    int answer = 1 + (int) (Math.random()*100);
    int guess = 0;

    System.out.print("I'm thinking of a number ");  // inform the user it's a game
    System.out.println("between 1 and 100");

    while (guess != answer) {

      System.out.println("What's your guess");
      guess = Integer.parseInt(cin.nextLine());  // reading user input

      if (guess > answer) {
        System.out.println("Too high");
      } else if (guess < answer) {
        System.out.println("Too low");
      } else {
        System.out.println("You win!!");
        cin.close(); // close the scanner
      }
    }
  }
}