import java.util.Scanner;
import java.util.Random;

public class Duke {

    public static void printline(){
        System.out.println("_______________________________________");
    }

    public static void introduction(){
        int byebye = (int)Math.floor((Math.random() * 7) + 1);
        switch (byebye) {
            case 1:
                System.out.println("Welcome Back Sir, Jarvis at your assistance");
                break;
            case 2:
                System.out.println("Good to see you alive, Sir");
                break;
            case 3:
                System.out.println("Back from Saving the world, Sir?");
                break;
            case 4:
                System.out.println("Good Day Sir, The weather in Malibu is 72 degrees with scattered clouds. The surf conditions are fair with waist to shoulder highlines, high tide will be at 10:52 a.m.");
                break;
            case 5:
                System.out.println("Working on a secret project, are we, sir?");
                break;
            case 6:
                System.out.println("As always sir, a great pleasure watching you work");
                break;
            case 7:
                System.out.println("Welcome back, sir. I've also prepared a safety briefing for you to entirely ignore");
                break;
        }
    }

    public static void farewell(){
        int byebye = (int)Math.floor((Math.random() * 7) + 1);
        switch (byebye) {
            case 1:
                System.out.println("Out Saving the world with the Avengers, Sir?");
                break;
            case 2:
                System.out.println("Have a good day Sir");
                break;
            case 3:
                System.out.println("Have you forgotten your Ironman Suit?");
                break;
            case 4:
                System.out.println("Maybe take the subway instead of flying Sir");
                break;
            case 5:
                System.out.println("Out to get your Cheeseburger Sir?");
                break;
            case 6:
                System.out.println("The world should thank you for your service, Sir");
                break;
            case 7:
                System.out.println("Of Course Sir, it is my pleasure serving you");
                break;
        }
    }

    public static void system(){
        introduction();
        printline();
        int counter=0;
        String [] items = new String [100] ;
        String line;
        Scanner input = new Scanner(System.in);

        while(true)
        {
            line=input.nextLine();
            if (line.equals("bye")) {
                printline();
                farewell();
                break;
            }
            else if (line.equals("list")) {
                printline();
                for(int i=0;i<counter;i++){
                    System.out.println(i+1 + ". " + items[i]);
                }
            }
            else
            {
                items[counter]=line;
                counter++;
                printline();
                System.out.println("added: " + line);
            }
            printline();
        }
    }

    public static void main(String[] args) {
        String logo = "  ╭┳━━━┳━━━┳╮  ╭┳━━┳━━━╮\n"
                + "  ┃┃╭━╮┃╭━╮┃╰╮╭╯┣┫┣┫╭━╮┃\n"
                + "  ┃┃┃ ┃┃╰━╯┣╮┃┃╭╯┃┃┃╰━━╮\n"
                + "╭╮┃┃╰━╯┃╭╮╭╯┃╰╯┃ ┃┃╰━━╮┃\n"
                + "┃╰╯┃╭━╮┃┃┃╰╮╰╮╭╯╭┫┣┫╰━╯┃\n"
                + "╰━━┻╯ ╰┻╯╰━╯ ╰╯ ╰━━┻━━━╯";
        System.out.println(logo);
        printline();
        system();
    }
}
