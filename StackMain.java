import java.util.*;

public class StackMain{

    static class StackMainVariables {
        static int N = 0;
        static int M = 0;
        static int L0 = 0;
        static Scanner userInput = new Scanner(System.in);
    }

    public static void main(String[] args){

        System.out.println("Total Amount of Memory: ");
        StackMainVariables.M = StackMainVariables.userInput.nextInt(); //total amount of memory received from user.

        System.out.println("Value of L\u2080");
        StackMainVariables.L0 = StackMainVariables.userInput.nextInt(); //value of L0 received from user.

        System.out.println("Number of Stacks: ");
        StackMainVariables.N = StackMainVariables.userInput.nextInt(); //number of stacks received from user input.

        System.out.println("Enter your operations: ");
        System.out.println("To quit, type q");

        String userCommand = " ";
        String[] space = new String[3];
        String cmdValue;
        String[] command = new String[3];
        MultiStack ms = new MultiStack();

        do {
            userCommand = StackMainVariables.userInput.nextLine();
            command = userCommand.split("");
            space = userCommand.split(" ");
            cmdValue = space[space.length - 1];

            if(command[0].equalsIgnoreCase("i")){
                int user_selected_stack = Integer.parseInt(command[1]);
                String user_value = cmdValue;
                try {
                    ms.push(user_selected_stack, user_value, ms);
                } catch(Exception er){
                    System.out.println("Error: " + er);
                }
            }
            else if(command[0].equalsIgnoreCase("d")){
                int user_selected_stack = Integer.parseInt(command[1]);
                try {
                    System.out.println(ms.pop(user_selected_stack));
                } catch(Exception er){
                    System.out.println("Error: " + er);
                }
            }
            else if(command[0].equalsIgnoreCase("q")){
                System.out.println("Goodbye!");
            }
            else{
                System.out.println(" ");
            }
        } while (!command[0].equalsIgnoreCase("q"));
        StackMainVariables.userInput.close();

    }

    public int getCount(){
        return StackMainVariables.N+2;
    }

    public int getMemory() {
        return StackMainVariables.M;
    }

    public int getL0() {
        return StackMainVariables.L0;
    }

}