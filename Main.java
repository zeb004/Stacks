import java.util.*;
import java.io.*;
import java.util.Stack;
import java.util.Vector;
public class Main{

    //Static Int Declaration
    static class StaticInt {
        static int Num = 0;
        static int Mem = 0;
        static int L0 = 0;
}

    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
        System.out.println("Amt of Mem is");
        StaticInt.Mem = scan.nextInt();
        System.out.println("L0 is");
        StaticInt.L0 = scan.nextInt();
        System.out.println("Num of stacks is");
        StaticInt.Num = scan.nextInt();
        Scanner CMD1 = new Scanner(System.in);
        Scanner StackNum1 = new Scanner(System.in);
        Scanner Value= new Scanner(System.in);
		Stacks S = new Stacks();
		String CMD =" ";
		System.out.println("Lower Bound of array?");
		int low=scan.nextInt();
		System.out.println("Upper bound of array?");
		int high=scan.nextInt();
	do {
			System.out.println("Push or Pop?");
		    System.out.println("Press q to exit");
       		CMD=CMD1.next();
            if(CMD.equalsIgnoreCase("push")){
				System.out.println("Onto which stack?");
                int StackNum = StackNum1.nextInt();
                System.out.println("Info:");
                String Info = Value.next();
                S.push(StackNum, Info, S);
            }

            else if(CMD.equalsIgnoreCase("pop")){
                System.out.println("From which stack?");
		        int StackNum = StackNum1.nextInt();
		        try {
                System.out.println(S.pop(StackNum));
			}
			 catch(Exception e){
            System.out.println("Error");
            }
		}
            else if(CMD.equalsIgnoreCase("q")){
                System.out.println("Closing");
            }
            else{
                System.out.println(" ");
            }
        } while (!CMD.equalsIgnoreCase("q"));
		scan.close();
		CMD1.close();
		StackNum1.close();
		Value.close();

    }

    public int getCnt(){
        return StaticInt.Num+2;
    }

    public int getMem() {
        return StaticInt.Mem;
    }

    public int getL0() {
        return StaticInt.L0;
    }

}