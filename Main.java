
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main.mainphone();
    }

    public static void mainphone(){
        Scanner command = new Scanner(System.in);

        System.out.println("******************************");
        System.out.println("(A)dd");
        System.out.println("(D)elete");
        System.out.println("(E)Mail Search");
        System.out.println("(P)rint list");
        System.out.println("(S)earch Name");
        System.out.println("(Q)uit");
        System.out.println("******************************");
        System.out.println("Please enter a command: ");
        String entry = command.nextLine().toUpperCase();
        System.out.println(entry);
        checker(entry);
    }

    public static void checker(String answer) {
        String[] answers = new String[]{"A", "D", "E", "P", "Q", "S"};
        int woosh = Arrays.binarySearch(answers, answer);
        boolean check = woosh >= 0;
       if (check){
           mo(answer);
       }else{
           mainphone();
       }
    }
    public static void mo(String answery){
        switch (answery) {
            case "A" -> ContactBook.addContact();
            case "D" -> ContactBook.deleteContact();
            case "E" -> ContactBook.searchEmail();
            case "P" -> ContactBook.printContactList();
            case "S" -> ContactBook.searchContact();
            case "Q" -> System.out.println("Bye");
        }
    }
}
