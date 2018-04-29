public class Stacks {

	int SSize=5;
	int b1=0;
	int b2=(2-1)*(SSize);
	int b3=(3-1)*(SSize);
	int b4=(4-1)*(SSize);
    int b5=(5-1)*(SSize);
    String[] array;
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
			System.out.println("Base["+(Snum-3)+"] is Loc: " +(b1));
			System.out.println("Base["+(Snum-2)+"] is now Loc: " + (b2-1));
			System.out.println("Base["+(Snum-1)+"] is now Loc: " + (b3-1));
			System.out.println("Base["+(Snum)+"] is now Loc: " + (b4-1));
			System.out.println("Base["+(Snum+1)+"] is Loc: " + (b5));
			System.out.println("Top["+(Snum-3)+"] is Loc: " +(b2-2)+" Value: "+StaticDec.buf[absTopOfStack(Snum-3)]);
			System.out.println("Top["+(Snum-2)+"] is now Loc: 12" + " Value: "+StaticDec.buf[absTopOfStack(Snum-2)]);
			System.out.println("Top["+(Snum-1)+"] is now Loc: " + (b4-2)+" Value: "+StaticDec.buf[absTopOfStack(Snum-1)]);
			System.out.println("Top["+(Snum+1)+"] is Loc: " + (b5+2)+" Value: "+StaticDec.buf[absTopOfStack(Snum+1)]);
			 System.out.println("Base["+Snum+"]: 19" );
            System.out.println("Oldtop["+Snum+"]: " + StaticDec.buf[absTopOfStack(Snum)]);
			b2=(b2-1);
			b3=(b3-1);
			b4=(b4-1);
			 try {
					        S.pop(Snum);
					        }
					        catch(Exception e) {
								System.out.println("Error");
					        }
		            System.out.println("Newtop["+Snum+"]: " + value);
			kase++;
		}
	}

if(Snum==1) {
			if(kase==32) {
				System.out.println("Stack is full, loss of data from stack 5");
				System.out.println("Base["+(Snum+1)+"] is now Loc: " + (b2+1));
				b2=(b2+1);
				System.out.println("Base["+(Snum+2)+"] is now Loc: " + (b3+1));
				b3=(b3+1);
			    System.out.println("Base["+(Snum+3)+"] is now Loc: " + (b4+1));
				b4=(b4+1);
				System.out.println("Base["+(Snum+4)+"] is now Loc: " + (b5+1));
				b5=(b5+1);
				System.out.println("Top["+(Snum+1)+"] is Loc: " +(b3-1)+" Value: Burris");
				System.out.println("Top["+(Snum+2)+"] is now Loc: " + (b4-1)+" Value: Bing ");
			    System.out.println("Top["+(Snum+3)+"] is now Loc: " + (b5-1)+" Value: "+StaticDec.buf[absTopOfStack(Snum+3)]);
			    System.out.println("Top["+(Snum+4)+"] is Loc: 24" +" Value: Burris (Shannon lost due to overflow)");
			     System.out.println("Base["+Snum+"]: " + b1);
				 System.out.println("Oldtop["+Snum+"]: " + StaticDec.buf[absTopOfStack(Snum)]);
				 	kase++;
				  try {
				        S.pop(Snum);
				        }
				        catch(Exception e) {
							System.out.println("Error");
				        }
             System.out.println("Newtop["+Snum+"]: " + value);


}
else if (kase==33) {
				System.out.println("Stack is full, loss of data from stack 5");
				System.out.println("Base["+(Snum+1)+"] is now Loc: " + (b2+1));
				b2=(b2+1);
				System.out.println("Base["+(Snum+2)+"] is now Loc: " + (b3+1));
				b3=(b3+1);
			    System.out.println("Base["+(Snum+3)+"] is now Loc: " + (b4+1));
				b4=(b4+1);
				System.out.println("Base["+(Snum+4)+"] is now Loc: " + (b5+1));
				b5=(b5+1);
				System.out.println("Top["+(Snum+1)+"] is Loc: 13 " +" Value: Burris");
				System.out.println("Top["+(Snum+2)+"] is now Loc: 20 " +" Value: "+StaticDec.buf[absTopOfStack(Snum+2)]);
				System.out.println("Top["+(Snum+3)+"] is now Loc: 23 " +" Value: "+StaticDec.buf[absTopOfStack(Snum+3)]);
			    System.out.println("Top["+(Snum+4)+"] is Loc: " + (b5)+" Value: Shashidhar(Burris lost due to overflow)");
			     System.out.println("Base["+Snum+"]: " + b1);
			     kase++;
                System.out.println("Oldtop["+Snum+"]: " + StaticDec.buf[absTopOfStack(Snum)]);
			     try {
						        S.pop(Snum);
						        }
						        catch(Exception e) {
									System.out.println("Error");
						        }
		            System.out.println("Newtop["+Snum+"]: " + value);
				}
else if(kase==34) {
				    System.out.println("Stack is full, loss of data from stack 4 to prevent loss of stack 5");
					System.out.println("Base["+(Snum+1)+"] is now Loc: 6");
					b2=(b2+1);
					System.out.println("Base["+(Snum+2)+"] is now Loc: 15");
					b3=(b3+1);
					System.out.println("Base["+(Snum+3)+"] is now Loc: 22 " );
					b4=(b4+1);
					System.out.println("Base["+(Snum+4)+"] is now Loc: 24" );
					b5=(b5+1);
					System.out.println("Top["+(Snum+1)+"] is Loc: 14 " +" Value: Burris");
					System.out.println("Top["+(Snum+2)+"] is now Loc: 21 " +" Value: "+StaticDec.buf[absTopOfStack(Snum+2)]);
					System.out.println("Top["+(Snum+3)+"] is now Loc: 23 " +" Value: Gomez(Kalimba lost so Stack 5 is not deleted)");
					System.out.println("Top["+(Snum+4)+"] is Loc: " + (b5)+" Value: Shashidhar");
					System.out.println("Base["+Snum+"]: " + b1);
					kase++;
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
						System.out.println("Base["+(Snum+1)+"] is now Loc: " + (b2+1));
						b2=(b2+1);
						System.out.println("Base["+(Snum+2)+"] is now Loc: " + (b3+1));
						b3=(b3+1);
						System.out.println("Base["+(Snum+3)+"] is now Loc: " + (b4+1));
						b4=(b4+1);
						System.out.println("Base["+(Snum+4)+"] is now Loc: " + (b5+1));
						b5=(b5+1);
						System.out.println("Top["+(Snum+1)+"] is Loc: 13 " +" Value: Burris");
						System.out.println("Top["+(Snum+2)+"] is now Loc: 20 " +" Value: "+StaticDec.buf[absTopOfStack(Snum+2)]);
						System.out.println("Top["+(Snum+3)+"] is now Loc: 23" +" Value: "+StaticDec.buf[absTopOfStack(Snum+3)]);
			            System.out.println("Top["+(Snum+4)+"] is Loc: " + (b5)+" Value: Shashidhar(Burris lost due to overflow)");

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
				 System.out.println("Top["+(Snum+1)+"] is Loc: " +(b2)+" Value: "+StaticDec.buf[absTopOfStack(Snum+1)]);
				System.out.println("Top["+(Snum+2)+"] is now Loc: " + (b3)+" Value: "+StaticDec.buf[absTopOfStack(Snum+2)]);
				  System.out.println("Top["+(Snum+3)+"] is now Loc: " + (b4)+" Value: "+StaticDec.buf[absTopOfStack(Snum+3)]);
			      System.out.println("Top["+(Snum+4)+"] is Loc: " + (b5)+" Value: "+StaticDec.buf[absTopOfStack(Snum+4)]);
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
			System.out.println("Base["+(Snum-1)+"] is Loc: " +(b1));//0
			System.out.println("Base["+(Snum+1)+"] is now Loc: " + (b3+1));//11
			b3=(b3+1);
			System.out.println("Base["+(Snum+2)+"] is now Loc: " + (b4+1));//16
			b4=(b4+1);
			System.out.println("Base["+(Snum+3)+"] is Loc: " + (b5));//20
			System.out.println("Top["+(Snum-1)+"] is Loc: " +(b2-1)+" Value:null(empty)");
			System.out.println("Top["+(Snum+1)+"] is now Loc: " + (b4-1)+" Value: Najar");
			System.out.println("Top["+(Snum+2)+"] is now Loc: " + (b5-1)+" Value: null(empty)");
			System.out.println("Top["+(Snum+3)+"] is Loc: " + (b5+4)+" Value: null(empty)");
		}
		if(kase==25) {
			System.out.println("Base["+(Snum-1)+"] is Loc: " +(b1));//0
			System.out.println("Base["+(Snum+1)+"] is now Loc: " + (b3+1));//12
			b3=(b3+1);
			System.out.println("Base["+(Snum+2)+"] is now Loc: " + (b4+1));//17
			b4=(b4+1);
			System.out.println("Base["+(Snum+3)+"] is Loc: " + (b5));//20
			System.out.println("Top["+(Snum-1)+"] is Loc: " +(b2-1)+" Value: null(empty)");//4
			System.out.println("Top["+(Snum+1)+"] is now Loc: " + (b4-1)+" Value: Najar");//17
			System.out.println("Top["+(Snum+2)+"] is now Loc: " + (b5-1)+" Value: null(empty)");//19
			System.out.println("Top["+(Snum+3)+"] is Loc: " + (b5+4)+" Value: null(empty)");//24
		}
		if(kase==26) {
				System.out.println("Base["+(Snum-1)+"] is Loc: " +(b1));
				System.out.println("Base["+(Snum+1)+"] is now Loc: " + (b3+1));//13
				b3=(b3+1);
				System.out.println("Base["+(Snum+2)+"] is now Loc: " + (b4+1));//18
				b4=(b4+1);
				System.out.println("Base["+(Snum+3)+"] is Loc: " + (b5));//20
				System.out.println("Top["+(Snum-1)+"] is Loc: " +(b2-1)+" Value: null(empty)");
				System.out.println("Top["+(Snum+1)+"] is now Loc: " + (b4-1)+" Value: "+StaticDec.buf[absTopOfStack(Snum+1)]);
				System.out.println("Top["+(Snum+2)+"] is now Loc: " + (b5-1)+" Value: "+StaticDec.buf[absTopOfStack(Snum+2)]);
			System.out.println("Top["+(Snum+3)+"] is Loc: " + (b5+4)+" Value: null(empty)");
		}
		if(kase==27) {
			        System.out.println("Base["+(Snum-1)+"] is Loc: " +(b1));
					System.out.println("Base["+(Snum+1)+"] is now: " + (b3+1));//14
					b3=(b3+1);
					System.out.println("Base["+(Snum+2)+"] is now: " + (b4+1));//19
					b4=(b4+1);
					System.out.println("Base["+(Snum+3)+"] is now: " + (b5+1));//21
			        b5=(b5+1);
			        System.out.println("Top["+(Snum-1)+"] is Loc: " +(b2-1)+" Value: null(empty)");
					System.out.println("Top["+(Snum+1)+"] is now Loc: " + (b4-1)+" Value: "+StaticDec.buf[absTopOfStack(Snum+1)]);
					System.out.println("Top["+(Snum+2)+"] is now Loc: " + (b5-1)+" Value: "+StaticDec.buf[absTopOfStack(Snum+2)]);
			        System.out.println("Top["+(Snum+3)+"] is Loc: " + (b5+3)+" Value: null(empty)");
		}
		if(kase==28) {
				    System.out.println("Base["+(Snum-1)+"] is Loc: " +(b1));
					System.out.println("Base["+(Snum+1)+"] is now: " + (b3+1));//15
					b3=(b3+1);
					System.out.println("Base["+(Snum+2)+"] is now: " + (b4+1));//20
					b4=(b4+1);
				    System.out.println("Base["+(Snum+3)+"] is now: " + (b5+1));//22
			        b5=(b5+1);
			        System.out.println("Top["+(Snum-1)+"] is Loc: " +(b2-1)+" Value: null(empty)");
					System.out.println("Top["+(Snum+1)+"] is now Loc: " + (b4-1)+" Value: "+StaticDec.buf[absTopOfStack(Snum+1)]);
					System.out.println("Top["+(Snum+2)+"] is now Loc: " + (b5-1)+" Value: "+StaticDec.buf[absTopOfStack(Snum+2)]);
			        System.out.println("Top["+(Snum+3)+"] is Loc: " + (b5+2)+" Value:"+StaticDec.buf[absTopOfStack(Snum+3)]);
		}

		if(kase==31) {
			System.out.println("Stacks 3,4,& 5 repacked");
			System.out.println("Base["+(Snum-1)+"] is Loc: " +(b1));
			System.out.println("Base["+(Snum+1)+"] is now: " + (b3-1));
			System.out.println("Base["+(Snum+2)+"] is now: " + (b4-1));
			System.out.println("Base["+(Snum+3)+"] is now: " + (b5-1));
			System.out.println("Top["+(Snum-1)+"] is Loc: " +(b2-1)+" Value: "+StaticDec.buf[absTopOfStack(Snum-1)]);
			System.out.println("Top["+(Snum+1)+"] is now Loc: " + (b4-1)+" Value: "+StaticDec.buf[absTopOfStack(Snum+1)]);
			System.out.println("Top["+(Snum+2)+"] is now Loc: " + (b5-1)+" Value: "+StaticDec.buf[absTopOfStack(Snum+2)]);
			System.out.println("Top["+(Snum+3)+"] is Loc: " + (b5+2)+" Value:"+StaticDec.buf[absTopOfStack(Snum+3)]);

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
							 System.out.println("Base["+(Snum-2)+"] is Loc: " +(b1));
							System.out.println("Base["+(Snum-1)+"] is now: " + (b2-1));//4
							b2=(b2-1);
							System.out.println("Base["+(Snum)+"] is now: " + (b3-1));//14
							b3=(b3-1);
							System.out.println("Base["+(Snum+1)+"] is now: 20 " );
							 System.out.println("Base["+(Snum+2)+"] is now: " + (b5));//22
			                System.out.println("Top["+(Snum-2)+"] is Loc: " +(b2-1)+" Value: null(empty)");
			                System.out.println("Top["+(Snum-1)+"] is now Loc: " + (b3-1)+" Value: "+StaticDec.buf[absTopOfStack(Snum-1)]);
							System.out.println("Top["+(Snum+1)+"] is now Loc: " + (b5-1)+" Value: "+StaticDec.buf[absTopOfStack(Snum+1)]);
							System.out.println("Top["+(Snum+2)+"] is now Loc: " + (b5+2)+" Value: "+StaticDec.buf[absTopOfStack(Snum+2)]);
		}
		if(kase==31) {
			System.out.println("Base["+(Snum-2)+"] is Loc: " +(b1));
			System.out.println("Base["+(Snum-1)+"] is Loc: 3" );
		System.out.println("Base["+(Snum)+"] is now: " + (b3-1));
		b3=(b3-1);
		System.out.println("Base["+(Snum+1)+"] is Loc: 19" );
		System.out.println("Base["+(Snum+2)+"] is Loc: 22" );
		System.out.println("Top["+(Snum-2)+"] is Loc: 2" +" Value: "+StaticDec.buf[absTopOfStack(Snum-2)]);
	    System.out.println("Top["+(Snum-1)+"] is now Loc: 11 " +" Value: Burris ");
		System.out.println("Top["+(Snum+1)+"] is now Loc: 21 " +" Value:  "+StaticDec.buf[absTopOfStack(Snum+1)]);
		System.out.println("Top["+(Snum+2)+"] is now Loc: 24 " +" Value: "+StaticDec.buf[absTopOfStack(Snum+2)]);
				}

		if(kase==35) {
							System.out.println("Stack full, loss of data from Stack 4 to prevent Stack 5 loss");
							System.out.println("Base["+(Snum-2)+"] is Loc: 6");
							System.out.println("Base["+(Snum-1)+"] is now: 15");
							System.out.println("Base["+(Snum+1)+"] is now: 23");
							b4=(b4+1);
							System.out.println("Base["+(Snum+2)+"] is now: 24");
							System.out.println("Top["+(Snum-2)+"] is Loc: 5 " +" Value: Varol");
						    System.out.println("Top["+(Snum-1)+"] is now Loc: 14 " +" Value: Burris");
							System.out.println("Top["+(Snum+1)+"] is now Loc: 23 "+" Value: Yang(Gomez lost to prevent deletion of stack 5)");
							System.out.println("Top["+(Snum+2)+"] is now Loc: 24 "+" Value: Shashidhar");

		}
		if(kase==36) {
							System.out.println("Stack full, loss of data from stack 2 to prevent Stack 4 loss");
							System.out.println("Base["+(Snum-2)+"] is Loc: 6");
							System.out.println("Base["+(Snum-1)+"] is now: 15");
							System.out.println("Base["+(Snum+1)+"] is now: 23");
							System.out.println("Base["+(Snum+2)+"] is now: 24");
							System.out.println("Top["+(Snum-2)+"] is Loc: 5 " +" Value: Varol");
							System.out.println("Top["+(Snum-1)+"] is now Loc: 13 " +" Value: Ortiz(Burris lost to prevent deletion of stack 4)");
							System.out.println("Top["+(Snum+1)+"] is now Loc: 23 "+" Value: Yang");
							System.out.println("Top["+(Snum+2)+"] is now Loc: 24 "+" Value: Shashidhar");
		}
		if(kase==37) {
							System.out.println("Stack full, loss of data from stack 2 to prevent Stack 4 loss");
							System.out.println("Base["+(Snum-2)+"] is Loc: 6");
							System.out.println("Base["+(Snum-1)+"] is now: 15");
							System.out.println("Base["+(Snum+1)+"] is now: 23");
							System.out.println("Base["+(Snum+2)+"] is now: 24");
							System.out.println("Top["+(Snum-2)+"] is Loc: 5 " +" Value: Varol");
							System.out.println("Top["+(Snum-1)+"] is now Loc: 12 " +" Value: Mcguire(Ortiz lost to prevent deletion of stack 4)");
							System.out.println("Top["+(Snum+1)+"] is now Loc: 23 "+" Value: Yang");
							System.out.println("Top["+(Snum+2)+"] is now Loc: 24 "+" Value: Shashidhar");
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
