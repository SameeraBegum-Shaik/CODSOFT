import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;


class randomGenerator {
    private int number;
    public int inputNumber;
    public int noOfGuesses;

    public randomGenerator() {
        Random rand = new Random();
        int number = rand.nextInt(100) + 1;
    }

    public int getNumber() {
        return number;
    }
}
    class NumOfGuesses{
        private int score;
        public NumOfGuesses(int count){
            score=count;
        }
        public int getScore(){
            return score;
        }
    }
    public class Guessnumber {
        public static void main(String[] args) {
            String choice;
            int rounds_played = 1;
            do {
                Scanner sc = new Scanner(System.in);
                randomGenerator rg = new randomGenerator();
                int randomNum = rg.getNumber();
                int userInput = -1;
                int count = 0;
                int maxAttempts = 9;
                System.out.println("Round: "+rounds_played);
                System.out.println("Guess a number between 1 to 100.You have only 9 attempts ");
                while (count < maxAttempts) {
                    System.out.println("Guess a Number: ");
                    userInput = sc.nextInt();
                    count++;
                    if (userInput == randomNum) {
                        System.out.println("you have guessed the number correctly in " + count + " tries");
                        break;
                    } else if (userInput < randomNum) {
                        System.out.println("Too low!");
                    } else if (userInput > randomNum) {
                        System.out.println("Too High!");
                    }
                }
                if (count == maxAttempts && randomNum != userInput) {
                    System.out.println("Maximum attempts reached.The number is " + randomNum);
                }
                NumOfGuesses guess = new NumOfGuesses(count);
                System.out.println("Your score: " + guess.getScore());
                System.out.println("Do you want to play another round(yes/no):");
                choice = sc.next();
                if(choice.equalsIgnoreCase("yes")){
                    rounds_played++;
                }
            }while( choice.equalsIgnoreCase("yes"));
            }
        }