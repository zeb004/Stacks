public class Stack {
    static class msv {
        static Main stack = new Main();
        static int stackCount = stack.getCount();
        static final int stackSize = stack.getMemory();
        static int stackL0 = stack.getL0();
        static String[] buffer = new String[stackSize*stackCount];
        static int[] stackPointer = new int[stackCount];
    }
    void push(int stackNum, String value, MultiStack stack) //throws Exception
    {
        if(msv.stackPointer[stackNum] + 1 >= msv.stackSize){
            System.out.println("ERROR!");
            System.out.println("BASE["+stackNum+"]: " + msv.stackPointer[msv.stackL0]);
            System.out.println("OLDTOP["+stackNum+"]: " + msv.buffer[absTopOfStack(stackNum)]);
            try {
        stack.pop(stackNum);} catch(Exception er){System.out.println("ERROR: " + er);}
            System.out.println("NEWTOP["+stackNum+"]: " + value);
            //throw new Exception("Error: Stack Overflow.");
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