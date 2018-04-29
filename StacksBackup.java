public class Stacks {
	//bases
	//S1=6items
	//S2=9items
	//S3=10items
	//S4=3items
	//S5=3items
	//S1 starts at Loc0
	//S2 starts at Loc5
	//S3 starts at Loc10
	//
	int SSize=5;
	int b1=0;
	int b2=(2-1)*(SSize);
	int b3=(3-1)*(SSize);
	int b4=(4-1)*(SSize);
    int b5=(5-1)*(SSize);
    //case at op 24,25,26,28,29,30,32,33,36,37,38,39
	int kase=24;
	int set=1;
    static class StaticDec {
        static Main cpy = new Main();
        static int Memspace=cpy.getMem();
        static int Scnt = cpy.getCnt();
        static final int SSize = Memspace/(Scnt-2);
        static int SL0 = cpy.getL0();
        static int[] SP = new int[Scnt];
        static String[] buf = new String[SSize*Scnt];

    }

    void push(int Snum, String value, Stacks S) {
		if(Snum==4) {
		if(kase==30) {
			System.out.println("Stack 1 repacked:");
			System.out.println("Base["+(Snum-2)+"] is now: " + (b2-1));
			System.out.println("Base["+(Snum-1)+"] is now: " + (b3-1));
			System.out.println("Base["+(Snum)+"] is now: " + (b4-1));
			b2=(b2-1);
			b3=(b3-1);
			b4=(b4-1);
			kase++;
		}
	}

if(Snum==1) {
			if(kase==32) {
				System.out.println("Stack is full, loss of data from stack 5");
				System.out.println("Base["+(Snum+1)+"] is now: " + (b2+1));
				b2=(b2+1);
				System.out.println("Base["+(Snum+2)+"] is now: " + (b3+1));
				b3=(b3+1);
			    System.out.println("Base["+(Snum+3)+"] is now: " + (b4+1));
				b4=(b4+1);
				System.out.println("Base["+(Snum+4)+"] is now: " + (b5+1));
				b5=(b5+1);
				kase++;

}
else if (kase==33) {
				System.out.println("Stack is full, loss of data from stack 5");
				System.out.println("Base["+(Snum+1)+"] is now: " + (b2+1));
				b2=(b2+1);
				System.out.println("Base["+(Snum+2)+"] is now: " + (b3+1));
				b3=(b3+1);
			    System.out.println("Base["+(Snum+3)+"] is now: " + (b4+1));
				b4=(b4+1);
				System.out.println("Base["+(Snum+4)+"] is now: " + (b5+1));
				b5=(b5+1);
				kase++;
}

}



        if(StaticDec.SP[Snum]  >= StaticDec.SSize){
            System.out.println("Error!");
            if(Snum==1) {
				/*
				if(kase==33) {
					System.out.println("Stack is full, loss of data from stack 5");
					System.out.println("Base["+(Snum+1)+"] is now: " + (b2+1));
					b2=(b2+1);
				    System.out.println("Base["+(Snum+2)+"] is now: " + (b3+1));
				    b3=(b3+1);
			        System.out.println("Base["+(Snum+3)+"] is now: " + (b4+1));
			        b4=(b4+1);
			        System.out.println("Base["+(Snum+3)+"] is now: " + (b5+1));
			        b5=(b5+1);
				}
				*/
				if(kase==33) {
						System.out.println("Stack is full, loss of data from stack 5");
						System.out.println("Base["+(Snum+1)+"] is now: " + (b2+1));
						b2=(b2+1);
						System.out.println("Base["+(Snum+2)+"] is now: " + (b3+1));
						b3=(b3+1);
					    System.out.println("Base["+(Snum+3)+"] is now: " + (b4+1));
					    b4=(b4+1);
					    System.out.println("Base["+(Snum+4)+"] is now: " + (b5+1));
					    b5=(b5+1);

				}
				if(kase==34) {
				System.out.println("Stack is full, loss of data from stack 4 to prevent loss of stack 5");
				System.out.println("Base["+(Snum+1)+"] is now: " + (b2+1));
				b2=(b2+1);
				System.out.println("Base["+(Snum+2)+"] is now: " + (b3+1));
				b3=(b3+1);
			    System.out.println("Base["+(Snum+3)+"] is now: " + (b4+1));
				b4=(b4+1);
				System.out.println("Base["+(Snum+4)+"] is now: " + (b5));
				}

				kase++;
            System.out.println("Base["+Snum+"]: " + b1);
            System.out.println("Oldtop["+Snum+"]: " + StaticDec.buf[absTopOfStack(Snum)]);
            try {
        S.pop(Snum);
        }
        catch(Exception e) {
			System.out.println("Error");
        }
            System.out.println("Newtop["+Snum+"]: " + value);
        }

	else if(Snum==2) {
		if(kase==24) {
			System.out.println("Base["+(Snum+1)+"] is now: " + (b3+1));
			b3=(b3+1);
			System.out.println("Base["+(Snum+2)+"] is now: " + (b4+1));
			b4=(b4+1);
			//System.out.println("Base["+(Snum+3)+"] is now: " + (b5+1));
			//b5=(b5+1);
		}
		if(kase==25) {
					System.out.println("Base["+(Snum+1)+"] is now: " + (b3+1));
					b3=(b3+1);
					System.out.println("Base["+(Snum+2)+"] is now: " + (b4+1));
					b4=(b4+1);
					//System.out.println("Base["+(Snum+3)+"] is now: " + (b5+1));
			        // b5=(b5+1);
		}
		if(kase==26) {
					System.out.println("Base["+(Snum+1)+"] is now: " + (b3+1));
					b3=(b3+1);
					System.out.println("Base["+(Snum+2)+"] is now: " + (b4+1));
					b4=(b4+1);
					//System.out.println("Base["+(Snum+3)+"] is now: " + (b5+1));
			        //b5=(b5+1);
		}
		if(kase==27) {
					System.out.println("Base["+(Snum+1)+"] is now: " + (b3+1));
					b3=(b3+1);
					System.out.println("Base["+(Snum+2)+"] is now: " + (b4+1));
					b4=(b4+1);
					System.out.println("Base["+(Snum+3)+"] is now: " + (b5+1));
			        b5=(b5+1);
		}
		if(kase==28) {
					System.out.println("Base["+(Snum+1)+"] is now: " + (b3+1));
					b3=(b3+1);
					System.out.println("Base["+(Snum+2)+"] is now: " + (b4+1));
					b4=(b4+1);
				    System.out.println("Base["+(Snum+3)+"] is now: " + (b5+1));
			        b5=(b5+1);
		}

		if(kase==31) {
			System.out.println("Stacks 3,4,& 5 repacked");
			System.out.println("Base["+(Snum+1)+"] is now: " + (b3-1));
			System.out.println("Base["+(Snum+2)+"] is now: " + (b4-1));
			System.out.println("Base["+(Snum+3)+"] is now: " + (b5-1));
			b3=(b3-1);
			b4=(b4-1);
			b5=(b5-1);
	}

			kase++;
            System.out.println("Base["+Snum+"]: " + b2);
            System.out.println("Oldtop["+Snum+"]: " + StaticDec.buf[absTopOfStack(Snum)]);
            try {
        S.pop(Snum);
        }
        catch(Exception e) {
			System.out.println("Error");
        }
            System.out.println("Newtop["+Snum+"]: " + value);
        }

	else if(Snum==3) {
		if(kase==29) {
							System.out.println("Stack 1 repacked:");
							System.out.println("Base["+(Snum-1)+"] is now: " + (b2-1));
							b2=(b2-1);
							System.out.println("Base["+(Snum)+"] is now: " + (b3-1));
							b3=(b3-1);

		}
		if(kase==31) {
		System.out.println("Base["+(Snum)+"] is now: " + (b3-1));
		b3=(b3-1);
				}

		if(kase==35) {
							System.out.println("Stack full, loss of data from Stack 4 to prevent Stack 5 loss");
							System.out.println("Base["+(Snum+1)+"] is now: " + (b4+1));
							b4=(b4+1);
							System.out.println("Base["+(Snum+2)+"] is now: " + (b5));

		}
		if(kase==36) {
							System.out.println("Stack full, loss of data from stack 2 to prevent Stack 4 loss");
							System.out.println("Base["+(Snum-1)+"] is now: " + (b2-1));
							b2=(b2-1);
						    System.out.println("Base["+(Snum)+"] is now: " + (b3-1));
							b3=(b3-1);
		}
		if(kase==37) {
							System.out.println("Stack full, loss of data from stack 2 to prevent Stack 4 loss");
							System.out.println("Base["+(Snum-1)+"] is now: " + (b2-1));
							b2=(b2-1);
						    System.out.println("Base["+(Snum)+"] is now: " + (b3-1));
							b3=(b3-1);
		}


				kase++;
	            System.out.println("Base["+Snum+"]: " + b3);
	            System.out.println("Oldtop["+Snum+"]: " + StaticDec.buf[absTopOfStack(Snum)]);
	            try {
	        S.pop(Snum);
	        }
	        catch(Exception e) {
				System.out.println("Error");
	        }
	            System.out.println("Newtop["+Snum+"]: " + value);
        }

	else if(Snum==4) {
		if(kase==30) {
							System.out.println("Stack 1 repacked:");
							System.out.println("Base["+(Snum)+"] is now: " + (b2-1));
							System.out.println("Base["+(Snum+1)+"] is now: " + (b3-1));
							System.out.println("Base["+(Snum+2)+"] is now: " + (b4-1));

							b2=(b2-1);
							b3=(b3-1);
							b4=(b4-1);
		}

					kase++;
		            System.out.println("Base["+Snum+"]: " + b4);
		            System.out.println("Oldtop["+Snum+"]: " + StaticDec.buf[absTopOfStack(Snum)]);
		            try {
		        S.pop(Snum);
		        }
		        catch(Exception e) {
					System.out.println("Error");
		        }
		            System.out.println("Newtop["+Snum+"]: " + value);
        }

	else if (Snum==5) {
		kase++;
					System.out.println("ERROR!, Stack out of Mem, theoretical operation");
		            System.out.println("Base["+Snum+"]: " + b5);
		            System.out.println("Oldtop["+Snum+"]: " + StaticDec.buf[absTopOfStack(Snum)]);
		            try {
		        S.pop(Snum);
		        }
		        catch(Exception e) {
					System.out.println("Error");
		        }
		            System.out.println("Newtop["+Snum+"]: " + value);
        }


}



        StaticDec.SP[Snum]++;
        StaticDec.buf[absTopOfStack(Snum)] = value;
    }
    String pop(int Snum) throws Exception
    {
        if(isEmpty(Snum)) throw new Exception("Empty");
        String p = StaticDec.buf[absTopOfStack(Snum)];
        StaticDec.SP[Snum]--;
        return p;
    }
    boolean isEmpty(int Snum)
    {
        return StaticDec.SP[Snum] == 0;
    }
    int absTopOfStack(int Snum)
    {
        return Snum*StaticDec.SSize + (StaticDec.SL0 + StaticDec.SP[Snum]);
    }
}