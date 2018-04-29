


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


public class MGLab1
{
 int q;
 final int MAX_CODE=65536;    // size of code memory
 final int MAX_DATA=65536;  // size of data memory
 final int HALT=0;
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
 final int EQ=16;
 final int NE=17;
 final int GT=18;
 final int GE=19;
 final int LT=20;
 final int LE=21;
 final int LABEL=22;
 final int GOTO=23;
 final int GOFALSE=24;
 final int GOTRUE=25;
 final int PRINT=26;
 final int READ=27;
 final int GOSUB=28;
 final int RET=29;
 int [] code;
 int [] data;
 int PC;
 int IR;
 boolean run;
 Stack<Integer> stack;   // data stack
 Stack<Integer> callStack;  // call stack
 public MGLab1()  throws IOException
 {
  code=new int[MAX_CODE];
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
  while(run)
{
   getNextInstruction();
   decodeAndRunInstruction();
  }
 }
 public void getNextInstruction() {
  IR=code[PC++];
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

  switch(opcode)
  {
   case HALT:
    run=false;
    break;
   case PUSH:
    stack.push(operand);
    break;
   case RVALUE:
    stack.push(data[operand]);
    break;
   case LVALUE:
    stack.push(operand);
    break;
   case POP:
    stack.pop();
    break;
   case STO:
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
  if (IR==0) run=false;
 }
 public static void main(String [] args)  throws IOException
 {
  StackMachineStub vm=new StackMachineStub();
  System.out.println("Beginning Execution...");
       vm.execute();
  System.out.println("Done");
 }

}