//HOTEL MANAGEMENT SYSTEM


package corejava.hotelmanagement;

import java.util.ArrayList;
import java.util.Scanner;

public  class HotelManagement {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("==============================================");
		System.out.println("::::Welcome To Our Hotel MANTRA::::");
		System.out.println("==============================================");
		while(true) 
		{
			
			System.out.println("1.Login Status");
			System.out.println("2.Display Room Details");
			System.out.println("3.Rooms Availability");
			System.out.println("4.Book Room To Stay");
			System.out.println("5.Order Food");
			System.out.println("6.Checkout");
			System.out.println("7.Exit From Here");
		    System.out.println("Enter your choice:::");
			int choice = sc.nextInt();
			
			switch (choice)
			{
			
			case 1:
				int num ,name;
				System.out.println("Enter number of persons arrived to our hotel:");
				 String[] number = new String[sc.nextInt()];      
				  
				
				System.out.println("Enter names of each person:");
				 String names=sc.next();
				 for(int i=0;i<number.length;i++) {
					 number[i]=sc.nextLine();
				 }
				System.out.println("Give the country name you belongs to");
				 String country = sc.next();
				System.out.println("Enter Gender");
				String gender=sc.next();
				System.out.println("----------------------------------------------------------------------");
				System.out.println("Give Your ID Proof:");
				        System.out.println("Enter Your Choice:\n 1.Aadhar card\n 2.Pan card\n 3.Driving license\n 4.Voter id\n"); 
				        int ch=sc.nextInt();
				        switch(ch) {
				        case 1:
				        	System.out.println("Enter Your Aadharnumber");
				               long adhar=sc.nextLong(); 
				               break;
				        case 2:
				        	System.out.println("Enter Your Pan id");
				        	int pan=sc.nextInt();
				        	break;
				        case 3:
				        	System.out.println("Enter Your License Number");
				        	int license=sc.nextInt();
				        	break;
				        case 4:
				        	System.out.println("Enter Your Voter ID");
				        	int ID=sc.nextInt();
				        	break;
				          default:
				                System.out.println("try between 1  and   4");
				        		break;
				        }
				        System.out.println("Give Signature Of The Person");
				        String sign = sc.next();
				       
				        if(sign.equals(names)) 
				        {
				        	System.out.println("Valid");
				        	System.out.println("Checked in Successfully");
				        }
				        else 
				        {
				        	
				        	 System.out.println("not checked in ");
				        	 System.out.println("Sign is Invalid: Please enter proper sign,that must be your name");
				              String proper=sc.next();
				        }
				        char wish1;
						 System.out.println("\nContinue : (y/n)");
				           wish1=sc.next().charAt(0); 
				           
				        if(wish1=='y'||wish1=='Y')   
						{
							
						}
						else if(wish1=='n'||wish1=='N'){
							break;
						}
						else{
							if(!(wish1=='y'||wish1=='Y'||wish1=='n'||wish1=='N'))
				               System.out.println("Invalid Option");
				               System.out.println("\nContinue : (y/n)");
				               wish1=sc.next().charAt(0); 
				           }
			
			case 2:
				System.out.println("----------------------------------------------------------------------");
				   System.out.println("The Rooms are:");
				   System.out.println("----------------------------------------------------------------------");
					   System.out.println("1.Luxary Single Room");
					   System.out.println("2.Luxary Double Room");
					   System.out.println("3.Highclass Single Room");
					   System.out.println("4.Highclass Double Room");
					   System.out.println("5.Groundlevel Single Room");
					   System.out.println("Enter Your Choice:::");
						int choice1 = sc.nextInt();
					switch(choice1) {
					case 1:System.out.println("Number of double beds : 2\n AC :no\n Free breakfast : Yes\n Charge per day:5000 ");
	                break;
	            case 2:System.out.println("Number of double beds : 2\n AC : yes\n Free breakfast : Yes\n Charge per day:4000  ");
	                break;
	            case 3:System.out.println("Number of single beds : 1\n AC : no\n  Free breakfast : Yes\n Charge per day:3500  ");
	                break;
	            case 4:System.out.println("Number of single beds : 1\n AC : yes\n  Free breakfast : Yes\n Charge per day:2200 ");
	                break;
	            case 5:System.out.println("Number of single beds : 1\n AC : No\n  Free breakfast : Yes\n Charge per day:1200 ");
	            default:
	                System.out.println("Enter valid option");
	                break;
					}
					char wish2;
					 System.out.println("\nContinue : (y/n)");
			           wish2=sc.next().charAt(0); 
			           
			        if(wish2=='y'||wish2=='Y')   
					{
						
					}
					else if(wish2=='n'||wish2=='N'){
						break;
					}
					else{
						if(!(wish2=='y'||wish2=='Y'||wish2=='n'||wish2=='N'))
			               System.out.println("Invalid Option");
			               System.out.println("\nContinue : (y/n)");
			               wish2=sc.next().charAt(0); 
			           }

			            
			           
			           
			case 3:
				ArrayList <Integer> a=new ArrayList<Integer>();
				a.add(10);      //luxury_singleerrom
				a.add(20);      //luxury_doublerrom
				a.add(10);      //HighclassSingleRoom
				a.add(20);      //HighclassDoubleRoom
				a.add(15);      //Groundlevelsingleroom
			
				System.out.println("----------------------------------------------------------------------");
				System.out.println("Availability Of Rooms:");
				System.out.println("----------------------------------------------------------------------");
				System.out.println("1.Luxary Single Room\n  2.Luxary Double Room\n 3.Highclass Single Room\n  4.Highclass Double Room\n  5.Groundlevel Single Room\n ");
				System.out.println("choose room type");
				       int rooms=sc.nextInt();
				       switch(rooms) {
				       case 1:
				    	   System.out.println("No: Of Rooms Available : "+a.get(0));
				    	   break;
				       case 2:
				    	   System.out.println("No: Of Rooms Available :  "+a.get(1));
				    	   break;
				       case 3:
				    	   System.out.println("No: Of Rooms Available :  "+a.get(2));
				    	   break;
				       case 4:
				    	   System.out.println("No: Of Rooms Available :  "+a.get(3));
				    	   break;
				       case 5:
				    	   System.out.println("No: Of Rooms Available :  "+a.get(4));
				    	   break;
				    	   default:
				    		   System.out.println("invalid option");
				       }
				       char wish0;
						 System.out.println("\nContinue : (y/n)");
				           wish0=sc.next().charAt(0); 
				           if(!(wish0=='y'||wish0=='Y'||wish0=='n'||wish0=='N'))
				           {
				               System.out.println("Invalid Option");
				               System.out.println("\nContinue : (y/n)");
				               wish0=sc.next().charAt(1); 
				           }

			            
			case 4:
				System.out.println("----------------------------------------------------------------------");
				System.out.println("Book Room To Stay");
				System.out.println("----------------------------------------------------------------------");
				char book;
				System.out.println("will you book the room now(y/n)");
				book=sc.next().charAt(0);
				if(book=='y'||book=='Y') {
					
				}
				else
				{
					break;
				}
				System.out.println("choose which type of room you want");
				System.out.println("1.Luxary Single Room-first floor\n  2.Luxary Double Room-second floor\n 3.Highclass Single Room-third floor\n  4.Highclass Double Room-fourth floor\n  5.Groundlevel Single Room-fifth floor\n ");
				  int roomtype=sc.nextInt();
				 char wish3;
				  switch(roomtype) 
				  {
				  case 1:
				
					  System.out.println("choose room no: which room you want ");
					  System.out.println("rooms are:");
						for (int i = 1; i <=10; i++) {
							
							//System.out.print(String.format("%3d,",i));
							System.out.print("  "+i);
						}
						int roomno1=sc.nextInt();
						break;
				  case 2:
					 
					  System.out.println("choose room no: which room you want ");
					  System.out.println("rooms are:");
						for (int i = 11; i <=30; i++) {
							//System.out.print(String.format("%3d,",i));
							System.out.print("  "+i);
						}
						int roomno2=sc.nextInt();
						break;
				  case 3:
					  System.out.println("choose room no: which room you want ");
					  System.out.println("rooms are:");
						for (int i = 31; i <=40; i++) {
							//System.out.print(String.format("%3d,",i));
							System.out.print("  "+i);
						}
						int roomno3=sc.nextInt();
						break;
				  case 4:
					  System.out.println("choose room no: which room you want ");
					  System.out.println("rooms are:");
						for (int i = 41; i <=61; i++) {
							//System.out.print(String.format("%3d,",i));
							System.out.print("  "+i);
						}
						int roomno4=sc.nextInt();
						break;
				  case 5:
					  System.out.println("choose room no: which room you want ");
					  System.out.println("rooms are:");
						for (int i = 61; i <=76; i++) {
							System.out.print("  "+i);
						}
						int roomno5=sc.nextInt();
						break;
						default:
							System.out.println("invalid");
				  }		
				  String names1, contact, gender1;
			        String name2 = null, contact2 = null; 
			        String gender2="";
			       
			        if(roomtype==1||roomtype==3||roomtype==5) {
			        System.out.print("\nEnter Customer Name: ");
			        names1 = sc.next();
			        System.out.print("Enter Contact Number: ");
			        contact=sc.next();
			        System.out.print("Enter Gender: ");
			        gender1 = sc.next();
			        
			        System.out.println("Room Booked by :"+names1);
			        }
			        else
				    
			        {
			        	System.out.print("\nEnter Customer Name: ");
			        names1 = sc.next();
			        System.out.print("Enter Contact Number: ");
			        contact=sc.next();
			        System.out.print("Enter Gender: ");
			        gender1 = sc.next();
			        System.out.print("Enter Second Customer Name: ");
			        name2 = sc.next();
			        System.out.print("Enter Contact Number: ");
			        contact2=sc.next();
			        System.out.print("Enter Gender: ");
			        gender2 = sc.next();
			        System.out.println("Room Booked by :"+names1+" and "+name2);
			        }
					 System.out.println("\nContinue : (y/n)");
			           wish3=sc.next().charAt(0); 
			           
			        if(wish3=='y'||wish3=='Y')   
					{
						
					}
					else if(wish3=='n'||wish3=='N'){
						break;
					}
					else{
						if(!(wish3=='y'||wish3=='Y'||wish3=='n'||wish3=='N'))
			               System.out.println("Invalid Option");
			               System.out.println("\nContinue : (y/n)");
			               wish2=sc.next().charAt(0); 
			           }
			case 5: 
				int itemno;
				int quantity;
				float price;
				char w;
	
				System.out.println("room you booked:");
				int room0=sc.nextInt();
				System.out.println("----------------------------------------------------------------------");
				System.out.println("order food:");
				System.out.println("----------------------------------------------------------------------");
				System.out.println("food ordered by room no:");
				int room1=sc.nextInt();
				if(room0==room1) {
					
				System.out.println("==========");
				System.out.println("menu");
				System.out.println("==========");
			
				System.out.println("choose what you want");
				 }
				else {
					System.out.println("room is not booked by you");
					System.out.println("please select correct room no:");
					int e=sc.nextInt();
				}
				
				
				try {
					do {
				System.out.println(" 1.sandwich \t\t Rs.40 \n 2.Burger \t\t Rs.50\n 3.Noodels \t\t Rs.45 \n 4.Chicken parata \t Rs.60 \n");
				
				
				int opt=sc.nextInt();
				
				switch(opt) {
				case 1:System.out.println("quantity:");
				       int qua=sc.nextInt();
				       price=qua*40;
				       System.out.println("bill :"+price);
				       break;
				case 2:System.out.println("quantity:");
			           int qua1=sc.nextInt();
			           price=qua1*50;
				       System.out.println("bill :"+price);
			           
			           break;
			           
				case 3:System.out.println("quantity:");
			           int qua2=sc.nextInt();
			           price=qua2*45;
				       System.out.println("bill :"+price);
			           break;
				case 4:System.out.println("quantity:");
			           int qua3=sc.nextInt();
			           price=qua3*60;
				       System.out.println("bill :"+price);
			           break;
		
			           default:
			        	   System.out.println("choose valid option");
				}
				
				     System.out.println("do you want any thing else(y/n)");
				
	                  w=sc.next().charAt(0); 
				     }
	                  while(w=='y'||w=='Y');
	            	
	                 }
				       catch(NullPointerException e)
	                {
	                   System.out.println("\nRoom not booked");
	                 }
	                   catch(Exception e)
	               {
	                 System.out.println("Cannot be done");
	                }
			           System.out.println("continue(y/n)");
			          char c;
			           w=sc.next().charAt(0); 
			case 6:
	    	   System.out.println("====================");
	    	   System.out.println("Checkout");
	    	   System.out.println("====================");
	    	   System.out.println("room no :");
	    	   int r=sc.nextInt();
				System.out.println("give signature");
				String s=sc.next();
				
				
	    	   System.out.println(" Do you want to checkout ? (y/n)");
               w=sc.next().charAt(0);
              if(w=='y'||w=='Y') 
              {
            	  System.out.println("================");
            	  System.out.println("Checkout status");
            	  System.out.println("================");
            	  System.out.println("give room no: to checkout");
            	  int out=sc.nextInt();
            	  if(r==out)
            	  {
            	  System.out.println("room no:"+ r +" is used by:"+ s);
            	  }
            	  else  
            	  {
            		  System.out.println("room not booked by you");
            		  System.out.println("please select room you booked");
            		  int re=sc.nextInt();
            		   
            			  System.out.println("room no:"+ re +" is used by:"+ s);
            	  
            	  }
            	 
            		  
            	 }
              else {
            	  break;
              }
             
              System.out.println("choose floor you had registered:\n 1st floor \t 2nd floor \t 3rd floor \t 4rth floor\t 5thfloor");
              int bill=sc.nextInt();
              System.out.println( "processing.........");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 System.out.println("\n*******");
	              System.out.println(" Bill:-");
	              System.out.println("*******");
                 switch(bill) {
                 
                   case 1:  
                	   System.out.println("\n===============");
            	  System.out.println("\nRoom Charge - "+5000);
                  System.out.println("food charge---cleared");
                  System.out.println("service charges:"+1000);
                  System.out.println("\n===============");
                  int Bill1=6000;
                  System.out.println(":::  Amount  :::"+Bill1);
                  
                  break;
                  
			      case 2:  
			    	  System.out.println("\n===============");
			    	  System.out.println("\nRoom Charge- "+4000);
	                  System.out.println("food charge----cleared");
	                  System.out.println("service charges:"+1200);
	                  System.out.println("\n===============");
	                  int Bill2=5200;
	                  System.out.println(":::  Amount  :::"+Bill2);
	                  
	                  break;
			   
			   case 3:  
			   
				   System.out.println("\nRoom Charge - "+3500);
	                  System.out.println("\n===============");
	                  System.out.println("food charge---cleared");
	                  System.out.println("service charges:"+700);
	                  int Bill3=4200;
	                  System.out.println(":::  Amount  :::"+Bill3);
	                  
	                  break;
			   case 4:
				      System.out.println("\n===============");
	                  System.out.println("\nRoom Charge - "+2200);
	                  System.out.println("food charge---cleared");
	                  System.out.println("service charges:"+900);
	                  System.out.println("\n===============");
	                  int Bill4=3100;
	                  System.out.println(":::  Amount  :::"+Bill4);
	                  
	                  break;
			   case 5:
				      System.out.println("\n===============");
				      System.out.println("\nRoom Charge - "+1200);
	                  System.out.println("food charge---cleared");
	                  System.out.println("service charges:"+500);
	                  System.out.println("\n===============");
	                  int Bill=1700;
	                  System.out.println("******* Total Amount ******"+Bill);
	                  
	                  break;
	                  default:
	                	  System.out.println("invalid");
                
            }
                 System.out.println("==========================");
                 System.out.println("deallocated successfully");
                 System.out.println("==========================");
                 System.out.println(":::::::::::::THANK YOU::::::::::::::");
					System.out.println("      REVISIT OUR HOTEL AGAIN");
                 System.out.println("\n exit: ( press y)");
			        char wish;
		            wish=sc.next().charAt(0); 
		            if(!(wish=='y'||wish=='Y'))
		            {
		                System.out.println("Invalid Option please press valid option ");
		                String valid=sc.next();
		            }else {
		            	
		               break;
		               
		            }
		           
			case 7:
			
				break;
				
                
            }
           
         }
	    	   
		
     }
	}
				
			
	



