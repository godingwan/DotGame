public class SimpleDotGameTestDrive {
  public static void main (String[] args) {
    SimpleDotGame dotGame = new SimpleDotGame();

    int[] location = {2,3,4}
    dotGame.setLocationCells(location);

    String userGuess = "2";
    String result = dotGame.checkYourself(userGuess);
    String testResult = "failed";

    if (result.equals("hit")) {
      testResult = "passed";
    }

    System.out.println(testResult);
  }
}
