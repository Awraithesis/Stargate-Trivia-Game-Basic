package aPG;
import java.util.Scanner;
public class StargateTrivia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Establish the questions
        
        String[] questions = {
            "1. Which Earth chevron number led the explorers to Atlantis?",
            "2. Which Greek God artifact was used to separate goauld symbiotes from their hosts?",
            "3. What animal was communicating with Atlantis to help them avoid catastrophe?",
            "4. What planet did Teyla come from?",
            "5. Which character nearly ascended into pure energy?"
        };
        
        //Establish the answers
        
        String[] options = {
            "A. 2\tB. 5\tC. 6\tD. 9",
            "A. Hammer\tB. Helmet\tC. Staff\tD. Ship",
            "A. Elephant\tB. Whale\tC. Giraffe\tD. Lion",
            "A. Abeydos\tB. Satida\tC. Ethos\tD. Lantia",
            "A. Weir\tB. Samantha\tC. John\tD. Rodney"
        };

        char[] answers = {'D', 'A', 'B', 'C', 'D'};

        int score = 0;

        // Shown User Interface Questions and Answers
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.println(options[i]);
            System.out.print("Please Choose (A, B, C, or D): ");
            char userAnswer = Character.toUpperCase(scanner.next().charAt(0));

       // User interfaced responses based upon their answers
            if (userAnswer == answers[i]) {
                System.out.println("That is Correct!!!");
                score++;
            } else {
                System.out.println("That is Incorrect, Please Try Again.");
            }
            System.out.println();
        }

        // Percentage calculation based upon amount of answers correct out of 5
        double percentageScore = (double) score / questions.length * 100;
        System.out.printf("Your final score: %.2f%%\n", percentageScore);

        scanner.close();
    }
}
