import java.util.Scanner;

public class Teacher {
     QuizTemplate [] qt = new QuizTemplate[5];

    void disp() {
        for(int i=0;i<5;i++)
        {
        qt[i] = new QuizTemplate();
        }
        System.out.println("Please enter you name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        for(int i=0 ; i<5;i++)
        {
            System.out.println(name + "enter the question Q "+ i);
            qt[i].Question = sc.nextLine();
            System.out.println(name + " enter Option1");
            qt[i].Option1 = sc.nextLine();
            System.out.println(name + " enter Option2");
            qt[i].Option2 = sc.nextLine();
            System.out.println(name + " enter Option3");
            qt[i].Option3 = sc.nextLine();
            System.out.println(name + " enter Option4");
            qt[i].Option4 = sc.nextLine();
            System.out.println(name+ " enter Correct Answer");
            qt[i].CorrectAnswer = sc.nextLine();
        }
    }
}
