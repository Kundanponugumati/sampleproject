import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Quiz App Build by Kundan Sai Ponugumati");
        System.out.println("Welcome to Quiz App");
        System.out.println("Press 1 if Your Student or 2 if You are Teacher");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==1)
        {
            QuizTemplate qt = new QuizTemplate();
            qt.questions();
        }
    }
}