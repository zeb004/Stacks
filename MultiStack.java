 public class MultiStack {

int b1=0;
int b2=5;
int b3=10;
int b4=15;
int b5=20;
 	static class msv {
         static StackMain stack = new StackMain();
         static int stackCount = stack.getCount();
		static int mem= stack.getMemory();
 	    static final int stackSize = 5;
         static int stackL0 = stack.getL0();

         static String[] buffer = new String[stackSize*stackCount];
 	    static int[] stackPointer = new int[stackCount];
     }
     int size=msv.stackSize;
 	void push(int stackNum, String value, MultiStack stack) //throws Exception
     {
 		if(msv.stackPointer[stackNum] >= msv.stackSize){
             System.out.println("ERROR!");

             if(stackNum==1) {
				 b2++;
			System.out.println("BASE["+stackNum+"]: " + (stackNum-1)*(msv.stackSize));
             System.out.println("OLDTOP["+stackNum+"]: " + msv.buffer[absTopOfStack(stackNum)]);
             try {
             stack.pop(stackNum);} catch(Exception er){System.out.println("ERROR: " + er);}
             System.out.println("NEWTOP["+stackNum+"]: " + value);
 			//throw new Exception("Error: Stack Overflow.");
 		}
			  else if (stackNum==2) {
			 System.out.println("ERROR!");
			 b3++;
             System.out.println("BASE["+stackNum+"]: " + b2);
             System.out.println("OLDTOP["+stackNum+"]: " + msv.buffer[absTopOfStack(stackNum)]);
             try {
             stack.pop(stackNum);} catch(Exception er){System.out.println("ERROR: " + er);}
             System.out.println("NEWTOP["+stackNum+"]: " + value);
 			//throw new Exception("Error: Stack Overflow.");
 		}
 		else if (stackNum==3) {
		System.out.println("ERROR!");
			 b4++;
             System.out.println("BASE["+stackNum+"]: " + b3);
             System.out.println("OLDTOP["+stackNum+"]: " + msv.buffer[absTopOfStack(stackNum)]);
             try {
             stack.pop(stackNum);} catch(Exception er){System.out.println("ERROR: " + er);}
             System.out.println("NEWTOP["+stackNum+"]: " + value);
 			//throw new Exception("Error: Stack Overflow.");
 		}
 		else if (stackNum==4) {
		System.out.println("ERROR!");
			 b5++;
             System.out.println("BASE["+stackNum+"]: " + b4);
             System.out.println("OLDTOP["+stackNum+"]: " + msv.buffer[absTopOfStack(stackNum)]);
             try {
             stack.pop(stackNum);} catch(Exception er){System.out.println("ERROR: " + er);}
             System.out.println("NEWTOP["+stackNum+"]: " + value);
 			//throw new Exception("Error: Stack Overflow.");
 		}
 		else if (stackNum==5) {
		System.out.println("ERROR!, Stack out of Mem");
             System.out.println("BASE["+stackNum+"]: " + b5);
             System.out.println("OLDTOP["+stackNum+"]: " + msv.buffer[absTopOfStack(stackNum)]);
             try {
             stack.pop(stackNum);} catch(Exception er){System.out.println("ERROR: " + er);}
             System.out.println("NEWTOP["+stackNum+"]: " + value);
 			//throw new Exception("Error: Stack Overflow.");
 		}
	}
 		msv.stackPointer[stackNum]++;
 		msv.buffer[absTopOfStack(stackNum)] = value;
 	}

 	String pop(int stackNum) throws Exception{
 		if(isEmpty(stackNum)) throw new Exception("Error: This stack's empty");
 		String popped = msv.buffer[absTopOfStack(stackNum)];
 		msv.stackPointer[stackNum]--;
 		return popped;
 	}

 	boolean isEmpty(int stackNum){
 		return msv.stackPointer[stackNum] == 0;
 	}

 	int absTopOfStack(int stackNum){
 		return stackNum*msv.stackSize + (msv.stackL0 + msv.stackPointer[stackNum]);
 	}
}