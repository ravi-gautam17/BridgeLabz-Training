/*
 * Online Quiz Application 🧠
 * Ask 5 questions (MCQs) from a user.
 * Use arrays and for-loop.
 * Record score.
 * Switch for answer checking.
 * Apply clear indentation and structured layout
 */

import java.util.Scanner;

public class OnlineQuizApplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Quiz Application. Answer the following questions:\n");

        String[] questions = {
            "1. Who is known as the \"Father of the Indian Constitution\"?\n"
            + "1. Jawaharlal Nehru\n"
            + "2. Mahatma Gandhi\n"
            + "3. Dr. B. R. Ambedkar\n"
            + "4. Sardar Vallabhbhai Patel",

            "2. Which country won the ICC Cricket World Cup 2019?\n"
            + "1. Australia\n"
            + "2. India\n"
            + "3. England\n"
            + "4. New Zealand",

            "3. Who is the current Prime Minister of India?\n"
            + "1. Rahul Gandhi\n"
            + "2. Narendra Modi\n"
            + "3. Amit Shah\n"
            + "4. Arvind Kejriwal",

            "4. Who is known as the \"God of Cricket\"?\n"
            + "1. Virat Kohli\n"
            + "2. MS Dhoni\n"
            + "3. Brian Lara\n"
            + "4. Sachin Tendulkar",

            "5. The Lok Sabha is a part of which branch of the Indian government?\n"
            + "1. Judiciary\n"
            + "2. Executive\n"
            + "3. Legislature\n"
            + "4. Election Commission"
        };

        int[] correct = {3, 3, 2, 4, 3};
        int correctAns = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.print("Enter your answer: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                case 2:
                case 3:
                case 4:
                    if (choice == correct[i]) {
                        System.out.println("CORRECT ANSWER\n");
                        correctAns++;
                    } else {
                        System.out.println("WRONG ANSWER\n");
                    }
                    break;
                default:
                    System.out.println("INVALID OPTION\n");
            }
        }

        System.out.println("TOTAL CORRECT ANSWERS: " + correctAns);
        sc.close();
    }
}

