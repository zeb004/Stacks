//********
/* Dr. McGuire, this assignmnet has me stumped. I've gone over the logic muliple times and I cannot find a problem with it.
The logic flow is as follows:
1. define int g =0 as index to code array
2. ask user for file name
3. open file via file/data stream
4. While not EOF, read in integer and store in code[g]
5. increment g
6. call getnextinstruction and fetch code form code[PC++]
7. Shift 16 bits for opcode
8. mask out all except bits 15-0 for operand
9. convert both operand and opcode to b10 for use, since
program uses b10
10. do operations
For the life of me, I cannot figure out why it will not work
I manually assigned values to opcode and operand and it works, but I
do not know how to properly make a binary file, and since we did not
get a sample bin file to run, I cannot know for certain if it will
run. The bin files I made for it are not working, but I do not know
how to make a bin file. I do know that manually assigning binary values to operand and opcode
will work, so if it cannot read data correctly from the bin file, I am
sorry I had no way of properly testing it.
*/
import java.util.Stack;
import java.io.*;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.*;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Scanner;
import java.io.DataInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class StackMachineStub
{
 int q;
 final int MAX_CODE=65536;    // size of code memory
 final int MAX_DATA=65536;  // size of data memory
 final int HALT=0;   // a few opcodes defined
 final int PUSH =1;
 final int RVALUE=2;
 final int LVALUE=3;
 final int POP=4;
 final int STO =5;
 final int COPY=6;
 final int ADD=7;
 final int SUB=8;
 final int MPY=9;
 final int DIV=10;
 final int MOD=11;
 final int NEG=12;
 final int NOT=13;
 final int ORL=14;
 final int ANDL=15;
 final int ORB=16;
 final int ANDB=17;
 final int XORB=18;
 final int SHL=19;
 final int SHR=20;
 final int SAR=21;
 final int EQ=22;
 final int NE=23;
 final int GT=24;
 final int GE=25;
 final int LT=26;
 final int LE=27;
 final int LABEL=28;
 final int GOTO=29;
 final int GOFALSE=30;
 final int GOTRUE=31;
 final int PRINT=32;
 final int READ=33;
 final int GOSUB=34;
 final int RET=35;
 int [] code;     // reference for the memory modules
 int [] data;
 int PC;       // we need a couple of registers
 int IR;
 boolean run;
 Stack<Integer> stack;   // data stack
 Stack<Integer> callStack;  // call stack
 public StackMachineStub()  throws IOException
 {
  code=new int[MAX_CODE];  // constructor initializes the stack machine;
  data=new int[MAX_DATA];
  PC=0;
  run=true;
  stack=new Stack<Integer>();
  callStack=new Stack<Integer>();
  Scanner scan=new Scanner(System.in);
  int g=0;
  boolean endOfFile=false;     // EOF flag
  System.out.println("Enter file name:");
  String s = scan.next();
  // Create the binary file input objects.
  FileInputStream fstream=new FileInputStream(s);
  DataInputStream inputFile=new DataInputStream(fstream);
  System.out.println("Reading numbers from the file:");
  // Read the contents of the file.
   while (!endOfFile) {
      try {
         code[g]=inputFile.readInt();
	      //System.out.println(code[g]);
 	      g++;
             }
             catch (EOFException e) {
                endOfFile=true;
             }
        }
 }
 public void execute() {
  while(run)       // the old fetch-execute cycle
{
   getNextInstruction();
   decodeAndRunInstruction();
  }
 }
 public void getNextInstruction() {
  IR=code[PC++];     // fetching is straightforward
 }
 public void decodeAndRunInstruction() {
 //Conversion form binary to base10, as it uses the base 10
//to find operations and operands
  int opcode1=IR >> 16;     // pull of the opcode and the operands bits 20-16
  int operand1=IR & 0xFFFF;
  int decimal=0;
  int power=0;
  int decimal2=0;
  int power2=0;
while(true){
 if(opcode1==0){
	break;
 } else {
   	  int tmp=opcode1%10;
 	  decimal+=tmp*Math.pow(2, power);
  	  opcode1=opcode1/10;
  	  power++;
 }
}
while(true){
 if(operand1==0){
	break;
 } else {
  	 int tmp2=operand1%10;
   	decimal2+=tmp2*Math.pow(2, power2);
   	operand1=operand1/10;
   	power2++;
 }
}
int opcode=decimal;
int operand=decimal2;

  switch(opcode)      // what we do depends on what opcode we have
  {         // most of these are pretty straight forward
   case HALT:
    run=false;
    break;
   case PUSH:      // push a literal value
    stack.push(operand);
   // System.out.println("PLS");
    break;
   case RVALUE:     // push the contents of a memory address
    stack.push(data[operand]);
    break;
   case LVALUE:     // push the address (which, come to think of it, is exactly the same as pushing a literal)
    stack.push(operand);
    break;
   case POP:
    stack.pop();    //pop literal value;
    break;
   case STO:      // store the value on top of the stack in the address directly below it on the stack
    int rvalue=stack.pop();
    int lvalue=stack.pop();
    data[lvalue]=rvalue;
    break;
   case COPY:
    stack.push(stack.pop());
    break;
   case ADD:
    stack.push(stack.pop()+stack.pop());
    break;
   case SUB:
    stack.push(stack.pop()-stack.pop());
    break;
   case MPY:
    stack.push(stack.pop()*stack.pop());
    break;
   case DIV:
    stack.push(stack.pop()/stack.pop());
    break;
   case MOD:
    stack.push(Math.floorMod(stack.pop(),stack.pop()));
    break;
   case NEG:
    stack.push(Math.negateExact(stack.pop()));
    break;
   case NOT:
    stack.push(~stack.pop());
    break;
   case ORL:
    if(stack.pop()==data[operand]||stack.pop()==data[operand])
     stack.push(1);
    else
     stack.push(0);
    break;
   case ANDL:
    if(stack.pop()==data[operand]&&stack.pop()==data[operand])
     stack.push(1);
    else
     stack.push(0);
    break;
   case ORB:
    stack.push(stack.pop()|stack.pop());
    break;
   case ANDB:
    stack.push(stack.pop()&stack.pop());
    break;
   case XORB:
    stack.push(stack.pop()^stack.pop());
    break;
   case SHL:
    stack.push(stack.pop()>>>-1);
    break;
   case SHR:
    stack.push(stack.pop()>>>1);
    break;
   case SAR:
    stack.push(stack.pop()>>1);
    break;
   case EQ:
    if(stack.pop()==stack.pop())
     stack.push(1);
    else
     stack.push(0);
    break;
   case NE:
    if(stack.pop()!=stack.pop())
     stack.push(1);
    else
     stack.push(0);
    break;
   case GT:
    if(stack.pop()>stack.pop())
     stack.push(1);
    else
     stack.push(0);
    break;
   case GE:
    if(stack.pop()>=stack.pop())
     stack.push(1);
    else
     stack.push(0);
    break;
   case LT:
    if(stack.pop()<stack.pop())
     stack.push(1);
    else
     stack.push(0);
    break;
   case LE:
    if(stack.pop()<=stack.pop())
     stack.push(1);
    else
     stack.push(0);
    break;
   case LABEL:
    q=stack.pop();
    break;
   case GOTO:
    IR=q;
    break;
   case GOFALSE:
    if(stack.pop()==0)
     IR=q;
    break;
   case GOTRUE:
    if(stack.pop()!=0)
     IR=q;
    break;
   case PRINT:
    String bin=stack.pop().toString();
    int res=0;
    for(int x=bin.length();x>0;x--)
    {
     if(bin.substring(x+1,x).equals("1"))
      res+=Math.pow(2,x);
    }
    System.out.println(res);
    break;
   case READ:
    Scanner n=new Scanner(System.in);
    String n1=n.nextLine();
    int b=Integer.parseInt(n1,2);
    stack.push(b);
    break;
   case GOSUB:
    callStack.push(PC);
    IR=PC;
    break;
   case RET:
    PC=callStack.pop();
    break;
   default:      // oops!
    System.err.println("Unimplemented opcode");
    System.exit(opcode);
  }
  if (IR==0) run=false;    // Isn't this redundant?  Oh, well leave it in for now
 }
 public static void main(String [] args)  throws IOException
 {
  StackMachineStub vm=new StackMachineStub();   // create our virtual stack machine
  System.out.println("Beginning Execution...");
       vm.execute();   // and, let it go, let it go .....
  System.out.println("Done");
 }

}