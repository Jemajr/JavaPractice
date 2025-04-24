class TwentQuestions {
  public static void main (String[] args) {
    // this is a guessing game
    int answer = (int) (Math.random()*1000);
    int guess = 0;

    while (guess != answer) {
      if (guess > answer) {
        System.out.println("Too low");
      } else if (guess < answer) {
        System.out.println("too low");
      } else {
        System.out.println("You win!!");
      }
    }
  }
}