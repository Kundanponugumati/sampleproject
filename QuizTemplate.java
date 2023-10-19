import java.util.Scanner;

public class QuizTemplate {
    int Qid;
    String Question;
    String Option1;
    String Option2;
    String Option3;
    String Option4;
    String CorrectAnswer;
    Scanner sc = new Scanner(System.in);
     int Marks=0;
    public void questions() {

        for(Qid=1;Qid<=5;Qid++) {


            if (Qid == 1) {
                System.out.println("Question:1");
                System.out.println("How Many Bytes are Required to Store Int DataType?");
                System.out.println("Option 1: 1");
                System.out.println("Option 2: 2");
                System.out.println("Option 3: 4");
                System.out.println("Option 4: 8");
                CorrectAnswer = "4";
                getAnswer1();
            }
            if (Qid == 2) {
                System.out.println("Question:2");
                System.out.println("How Many Bytes are Required to Store Char DataType?");
                System.out.println("Option 1: 1");
                System.out.println("Option 2: 2");
                System.out.println("Option 3: 4");
                System.out.println("Option 4: 8");
                CorrectAnswer = "1";
                getAnswer2();
            }
            if (Qid == 3) {
                System.out.println("Question:1");
                System.out.println("How Many Bytes are Required to Store Float DataType?");
                System.out.println("Option 1: 1");
                System.out.println("Option 2: 2");
                System.out.println("Option 3: 4");
                System.out.println("Option 4: 8");
                CorrectAnswer = "4";
                getAnswer3();
            }
            if (Qid == 4) {
                System.out.println("Question:1");
                System.out.println("How Many Bytes are Required to Store double DataType?");
                System.out.println("Option 1: 1");
                System.out.println("Option 2: 2");
                System.out.println("Option 3: 4");
                System.out.println("Option 4: 8");
                CorrectAnswer = "8";
                getAnswer4();
            }
            if (Qid == 5) {
                System.out.println("Question:1");
                System.out.println("How Many Bytes are Required to Store long DataType?");
                System.out.println("Option 1: 1");
                System.out.println("Option 2: 2");
                System.out.println("Option 3: 4");
                System.out.println("Option 4: 8");
                CorrectAnswer = "8";
                getAnswer5();
            }

        }
        System.out.println(Marks);
    }
    public void getAnswer1()
    {
        System.out.println("please enter the Answer");
        Scanner sc2 = new Scanner(System.in);
        String Answer = sc2.nextLine();
        if(Answer.equals("4")) {
            System.out.println("yeah!! ");
            Marks = Marks + 2;
        }
        else
        {
            System.out.println("Nope");
        }
        Marks = Marks-1;
    }
    public void getAnswer2()
    {
        System.out.println("please enter the Answer");
        Scanner sc2 = new Scanner(System.in);
        String Answer = sc2.nextLine();
        if(Answer.equals("1")) {
            System.out.println("yeah!! ");
            Marks = Marks+2;
        }
        else
        {
            System.out.println("Nope");
            Marks = Marks-1;
        }
    }
    public void getAnswer3()
    {
        System.out.println("please enter the Answer");
        Scanner sc2 = new Scanner(System.in);
        String Answer = sc2.nextLine();
        if(Answer.equals("4")) {
            System.out.println("yeah!! ");
            Marks = Marks+2;
        }
        else
        {
            System.out.println("Nope");
            Marks = Marks-1;
        }
    }
    public void getAnswer4()
    {
        System.out.println("please enter the Answer");
        Scanner sc2 = new Scanner(System.in);
        String Answer = sc2.nextLine();
        if(Answer.equals("8")) {
            System.out.println("yeah!! ");
            Marks = Marks+2;
        }
        else
        {
            System.out.println("Nope");
            Marks = Marks-1;
        }
    }
    public void getAnswer5()
    {
        System.out.println("please enter the Answer");
        Scanner sc2 = new Scanner(System.in);
        String Answer = sc2.nextLine();
        if(Answer.equals("8")) {
            System.out.println("yeah!! ");
            Marks = Marks+2;
        }
        else
        {
            System.out.println("Nope");
            Marks = Marks-1;
        }
    }


}
