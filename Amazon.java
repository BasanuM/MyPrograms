import java.time.format.DateTimeFormatter; 
import java.time.LocalDateTime;
import java.util.*;
class Amazon 
{
	   static ArrayList<String> sl= new ArrayList<String>();
	   static ArrayList<Integer> il= new ArrayList<Integer>();
	   static ArrayList<Integer> tl= new ArrayList<Integer>();
	   static int count;
	   static int count1;
	   static int n1;
	   static int n2;
	   
	   static Scanner scn = new Scanner(System.in);
		public static void main(String[] args) throws InputMismatchException
		{
			System.out.println("\n\n@@@@@@@@@@@@@@@@@@@@@@@---->|     WELCOME TO AMAZON     |<----@@@@@@@@@@@@@@@@@@@@@@@\n\n");  
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"); 
			LocalDateTime now = LocalDateTime.now(); 
			System.out.println("                                                                   "+dtf.format(now)); 
			LOGIN();
			
		}
		public static void LOGIN()
		{

				System.out.println("PLEASE ENTER LOGIN DETAILS");
				System.out.println("ENTER USERNAME\n");
				String s=scn.next();
				System.out.println();
				for (int i=0;i<s.length() ;i++ )
				{
					if (s.charAt(i)>=65 && s.charAt(i)<=90 ||s.charAt(i)>=97 && s.charAt(i)<=122 )
					{	
					}
					else
					{
						System.out.println("Give valid input\n");
						LOGIN();
						break;
					}
				}
				NUMBER();
		}
		public static void NUMBER()
		{
				System.out.println("ENTER MOBILE NUMBER\n");
				String s=scn.next();
				if (s.length()==10)
				{
					for (int i=0;i<s.length();i++ )
					{
						if (s.charAt(i)>=48 && s.charAt(i)<=57)
						{
						}
						else
						{
							System.out.println("ENTER VALID NUMBER\n");
							NUMBER();
						}
					}
				}
				else
				{
					System.out.println("ENTER VALID NUMBER\n");
					NUMBER();
				}
				CATEGORIES();
		}

		public static void CATEGORIES()
		{
			System.out.println("\n!!!!!!!!!!!!______CATEGORIES______!!!!!!!!!!!!");	
			System.out.println("\n1:CLOTHING AND ACCESSORIES");
			System.out.println("2:HOME AND KITCHEN");
			System.out.println("3:ELECTRONICS");
			System.out.println("4:MOBILES");
			System.out.println("5:GO TO CART");
			System.out.println("0:EXIT");		
			int n=scn.nextInt();
			switch (n)
			{
				case 0:EXIT();
				break;
				case 1 : CLOTHING();
				break;
				case 2 : HOME();
				break;
				case 3:ELECTRONICS();
				break;
				case 4: MOBILES();
				break;
				case 5:cart();
				break;
				default:System.out.println("PLEASE GIVE THE CORRECT INPUT");
				CATEGORIES();
			}
		}
		private static void HOME()
		{
			System.out.println("\n1:COOKING  ");
			System.out.println("2:TABLEWARE"); 
			System.out.println("3:STORAGE  ");
			System.out.println("4:BACK");
			System.out.println("0:EXIT");
			int n=scn.nextInt();
			switch (n)
			{
				case 1 : COOKING();
				break;
				case 2 : TABLEWARE();
				break;
				case 3: STORAGE();
				break;
				case 4: CATEGORIES();
				break;
				case 0:EXIT();
				break;
				default:System.out.println("PLEASE GIVE THE CORRECT INPUT");
				HOME();
			}
		}
		private static void COOKING()
		{
			System.out.println();
			System.out.println("WHAT WOULD YOU LIKE TO BUY??");
			System.out.println("1:COOKER          RS:7000");
			System.out.println("2:PANS            Rs:3500");
			System.out.println("3:TAWAS           Rs:2000");
			System.out.println("4:BACK");
			System.out.println("0:EXIT");
			int n=scn.nextInt();
			switch (n)
			{
				case 1 : sl.add("COOKER    ");
						 il.add(7000);
					     COOKER();
				break;
				case 2 : sl.add("PANS      ");
						 il.add(3500);
						 PANS();
				break;
				case 3: sl.add("TAWA      ");
						 il.add(2000);
						 TAWA();
				break;
				case 4: HOME();
				break;
				case 0:EXIT();
				break;
				default:System.out.println("PLEASE GIVE THE CORRECT INPUT");
				COOKING();
			}
		}
		private static void COOKER()
		{
			System.out.println();
			System.out.println("NUMBER OF COOKER YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);  
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			switch (n)
			{
			case 1 : HOME();
					 break;
			case 2 : cart();
			         break;
			default:System.out.println("ENTER VALID INPUT");
						COOKER();
			}
				
		}
		private static void PANS()
		{
			System.out.println();
			System.out.println("NUMBER OF PANS YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);  
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			switch (n)
			{
			case 1 : HOME();
					 break;
			case 2 : cart();
			         break;
			default:System.out.println("ENTER VALID INPUT");
						PANS();
			}				
		}
		private static void TAWA()
		{
			System.out.println();
			System.out.println("NUMBER OF PANS YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);  
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			switch (n)
			{
			case 1 : HOME();
					 break;
			case 2 : cart();
			         break;
			default:System.out.println("ENTER VALID INPUT");
						TAWA();
			}				
		}

//-----------------------------------DINNER SET---------------------------------			
		private static void TABLEWARE ()
		{
			System.out.println();
			System.out.println("WHAT WOULD YOU LIKE TO BUY??");
			System.out.println("1:DINNER_SET          RS:700");
			System.out.println("2:CASSEROLES          Rs:500");
			System.out.println("3:BOWLS               Rs:200");
			System.out.println("4:BACK");
			System.out.println("0:EXIT");
			int n=scn.nextInt();
			switch (n)
			{
				case 1 : sl.add("DINNER_SET");
						 il.add(700);
					     DINNER_SET();
				break;
				case 2 : sl.add("CASSEROLES");
						 il.add(500);
						 CASSEROLES();
				break;
				case 3: sl.add("BOWLS     ");
						 il.add(200);
						 BOWLS();
				break;
				case 4: HOME();
				break;
				case 0:EXIT();
				break;
				default:System.out.println("PLEASE GIVE THE CORRECT INPUT");
				TABLEWARE();
			}
		}
		private static void DINNER_SET()
		{
			System.out.println();
			System.out.println("NUMBER OF DINNER_SET YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);  
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			switch (n)
			{
			case 1 : HOME();
					 break;
			case 2 : cart();
			         break;
			default:System.out.println("ENTER VALID INPUT");
						DINNER_SET();
			}
				
		}
		private static void CASSEROLES()
		{
			System.out.println();
			System.out.println("NUMBER OF CASSEROLES YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);  
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			switch (n)
			{
			case 1 : HOME();
					 break;
			case 2 : cart();
			         break;
			default:System.out.println("ENTER VALID INPUT");
						CASSEROLES();
			}				
		}
		private static void BOWLS()
		{
			System.out.println();
			System.out.println("NUMBER OF BOWLS YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);  
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			switch (n)
			{
			case 1 : HOME();
					 break;
			case 2 : cart();
			         break;
			default:System.out.println("ENTER VALID INPUT");
						BOWLS();
			}				
		}
		private static void STORAGE ()
		{
			System.out.println();
			System.out.println("WHAT WOULD YOU LIKE TO BUY??");
			System.out.println("1:LUNCHBOX          Rs:500");
			System.out.println("2:FLASKS            Rs:100");
			System.out.println("3:RACKS             Rs:900");
			System.out.println("4:BACK");
			System.out.println("0:EXIT");
			int n=scn.nextInt();
			switch (n)
			{
				case 1 : sl.add("LUNCHBOX  ");
						 il.add(700);
					     LUNCHBOX();
				break;
				case 2 : sl.add("FLASKS    ");
						 il.add(500);
						 FLASKS();
				break;
				case 3: sl.add("RACKS     ");
						 il.add(200);
						 RACKS();
				break;
				case 4: HOME();
				break;
				case 0:EXIT();
				break;
				default:System.out.println("PLEASE GIVE THE CORRECT INPUT");
				STORAGE();
			}
		}
		private static void LUNCHBOX()
		{
			System.out.println();
			System.out.println("NUMBER OF LUNCHBOX YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);  
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			switch (n)
			{
			case 1 : HOME();
					 break;
			case 2 : cart();
			         break;
			default:System.out.println("ENTER VALID INPUT");
						LUNCHBOX();
			}
				
		}
		private static void FLASKS()
		{
			System.out.println();
			System.out.println("NUMBER OF FLASKS YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);  
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			switch (n)
			{
			case 1 : HOME();
					 break;
			case 2 : cart();
			         break;
			default:System.out.println("ENTER VALID INPUT");
						FLASKS();
			}				
		}
		private static void RACKS()
		{
			System.out.println();
			System.out.println("NUMBER OF RACKS YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);  
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			switch (n)
			{
			case 1 : HOME();
					 break;
			case 2 : cart();
			         break;
			default:System.out.println("ENTER VALID INPUT");
						RACKS();
			}				
		}
		private static void ELECTRONICS()
		{
			System.out.println("\n1:TV");
			System.out.println("2:AIRCOOLER"); 
			System.out.println("3:WASHINGMACHINE");
			System.out.println("4:BACK");
			System.out.println("0:EXIT");
			int n=scn.nextInt();
			switch (n)
			{
				case 1 : TV();
				break;
				case 2 : AIR_COOLER();
				break;
				case 3: WASHING_MACHINE();
				break;
				case 4: CATEGORIES();
				break;
				case 0:EXIT();
				break;
				default:System.out.println("PLEASE GIVE THE CORRECT INPUT");
				ELECTRONICS();
			}
		}
			private static void TV()
		{
			System.out.println();
			System.out.println("CHOOSE YOUR BRAND");
			System.out.println();
			System.out.println("1:ONIDA");
			System.out.println("2:LG");
			System.out.println("3:PANASONIC");
			System.out.println("5:BACK");
			System.out.println("0:EXIT");
			int n=scn.nextInt();
			switch (n)
			{
				case 0 : EXIT();
				break;
				case 1 : ONIDA();
				break;
				case 2 : LG();
				break;
				case 3: PANASOINC();
				break;
				case 5: ELECTRONICS();
				break;
				default:System.out.println("PLEASE GIVE THE CORRECT INPUT");
				TV();
			}
		}
			private static void AIR_COOLER()
		{
			System.out.println();
			System.out.println("CHOOSE YOUR BRAND");
			System.out.println();
			System.out.println("1:SAMSUNG_AC");
			System.out.println("2:TOSHIBA_AC");
			System.out.println("3:VOLTAS_AC");
			System.out.println("5:BACK");
			System.out.println("0:EXIT");
			int n=scn.nextInt();
			switch (n)
			{
				case 0 : EXIT();
				break;
				case 1 : SAMSUNG_AC();
				break;
				case 2 : TOSHIBA_AC();
				break;
				case 3: VOLTAS_AC();
				break;
				case 5: ELECTRONICS();
				break;
				default:System.out.println("PLEASE GIVE THE CORRECT INPUT");
				AIR_COOLER();
			}
		}
			private static void WASHING_MACHINE()
		{
			System.out.println();
			System.out.println("CHOOSE YOUR BRAND");
			System.out.println();
			System.out.println("1:WHIRLPOOL");
			System.out.println("2:BOSCH");
			System.out.println("3:GODREJ");
			System.out.println("5:BACK");
			System.out.println("0:EXIT");
			int n=scn.nextInt();
			switch (n)
			{
				case 0 : EXIT();
				break;
				case 1 : WHIRLPOOL();
				break;
				case 2 : BOSCH();
				break;
				case 3: GODREJ();
				break;
				case 5: ELECTRONICS();
				break;
				default:System.out.println("PLEASE GIVE THE CORRECT INPUT");
				WASHING_MACHINE();
			}
		}
		private static void ONIDA()
		{
			System.out.println();
			System.out.println("WHICH SERIES WOULD YOU LIKE TO BUY??");
			System.out.println("1:ONIDA 21                RS:27000");
			System.out.println("2:ONIDA 32                Rs:36500");
			System.out.println("3:ONIDA 42                Rs:48000");
			System.out.println("4:BACK");
			System.out.println("0:EXIT");
			int n=scn.nextInt();
			switch (n)
			{
				case 1 : sl.add("ONIDA 21  ");
						 il.add(27000);
					     ONIDA21();
				break;
				case 2 : sl.add("ONIDA 32  ");
						 il.add(36500);
						 ONIDA32();
				break;
				case 3: sl.add("ONIDA 42  ");
						 il.add(48000);
						 ONIDA42();
				break;
				case 4: TV();
				break;
				case 0:EXIT();
				break;
				default:System.out.println("PLEASE GIVE THE CORRECT INPUT");
				ONIDA();
			}
		}
		private static void ONIDA21()
		{
			System.out.println();
			System.out.println("NUMBER OF TV's YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);  
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			switch (n)
			{
			case 1 : TV();
					 break;
			case 2 : cart();
			         break;
			default:System.out.println("ENTER VALID INPUT");
						ONIDA21();
			}
				
		}
		private static void ONIDA32()
		{
			System.out.println();
			System.out.println("TOTAL No. OF TV's YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			switch (n)
			{
			case 1 : TV();
					 break;
			case 2 : cart();
				     break;
			default:System.out.println("ENTER VALID INPUT");
						ONIDA32();
			}
		}
		private static void ONIDA42()
		{
			System.out.println();
			System.out.println("TOTAL No. OF TV's YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			System.out.println();
			switch (n)
			{
			case 1 : TV();
					 break;
			case 2 : cart();
					 break;
			default:System.out.println("ENTER VALID INPUT");
						ONIDA42();
			}
		}
		private static void LG()
		{
			System.out.println();
			System.out.println("WHICH SERIES WOULD YOU LIKE TO BUY??");
			System.out.println("1:LG 21                RS:22000");
			System.out.println("2:LG 32                Rs:36500");
			System.out.println("3:LG 42                Rs:38000");
			System.out.println("4:BACK");
			System.out.println("0:EXIT");
			int n=scn.nextInt();
			switch (n)
			{
				case 1 : sl.add("LG 21     ");
						 il.add(22000);
					     LG21();
				break;
				case 2 : sl.add("LG 32     ");
						 il.add(36500);
						 LG32();
				break;
				case 3: sl.add("LG 42     ");
						 il.add(38000);
						 LG42();
				break;
				case 4: TV();
				break;
				case 0:EXIT();
				break;
				default:System.out.println("PLEASE GIVE THE CORRECT INPUT");
				LG();
			}
		}
		private static void LG21()
		{
			System.out.println();
			System.out.println("NUMBER OF TV's YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);  
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			switch (n)
			{
			case 1 : TV();
					 break;
			case 2 : cart();
			         break;
			default:System.out.println("ENTER VALID INPUT");
						LG21();
			}
				
		}
		private static void LG32()
		{
			System.out.println();
			System.out.println("TOTAL No. OF TV's YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			switch (n)
			{
			case 1 : TV();
					 break;
			case 2 : cart();
				     break;
			default:System.out.println("ENTER VALID INPUT");
						LG32();
			}
		}
		private static void LG42()
		{
			System.out.println();
			System.out.println("TOTAL No. OF TV's YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			System.out.println();
			switch (n)
			{
			case 1 : TV();
					 break;
			case 2 : cart();
					 break;
			default:System.out.println("ENTER VALID INPUT");
						LG42();
			}
			
		}
			private static void PANASOINC()
		{
			System.out.println();
			System.out.println("WHICH SERIES WOULD YOU LIKE TO BUY??");
			System.out.println("1:PANASOINC 21                RS:28000");
			System.out.println("2:PANASOINC 32                Rs:32500");
			System.out.println("3:PANASOINC 42                Rs:48000");
			System.out.println("4:BACK");
			System.out.println("0:EXIT");
			int n=scn.nextInt();
			switch (n)
			{
				case 1 : sl.add("PANASOINC 21");
						 il.add(28000);
					     PANASOINC21();
				break;
				case 2 : sl.add("PANASOINC 32");
						 il.add(32500);
						 PANASOINC32();
				break;
				case 3: sl.add("PANASOINC 42");
						 il.add(48000);
						 PANASOINC42();
				break;
				case 4: TV();
				break;
				case 0:EXIT();
				break;
				default:System.out.println("PLEASE GIVE THE CORRECT INPUT");
				PANASOINC();
			}
		}
		private static void PANASOINC21()
		{
			System.out.println();
			System.out.println("NUMBER OF TV's YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);  
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			switch (n)
			{
			case 1 : TV();
					 break;
			case 2 : cart();
			         break;
			default:System.out.println("ENTER VALID INPUT");
						PANASOINC21();
			}
				
		}
		private static void PANASOINC32()
		{
			System.out.println();
			System.out.println("TOTAL No. OF TV's YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			switch (n)
			{
			case 1 : TV();
					 break;
			case 2 : cart();
				     break;
			default:System.out.println("ENTER VALID INPUT");
						PANASOINC32();
			}
		}
		private static void PANASOINC42()
		{
			System.out.println();
			System.out.println("TOTAL No. OF TV's YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			System.out.println();
			switch (n)
			{
			case 1 : TV();
					 break;
			case 2 : cart();
					 break;
			default:System.out.println("ENTER VALID INPUT");
						PANASOINC42();
			}
			
		}	
//_______________________________________________________________AC_______________________
private static void SAMSUNG_AC()
		{
			System.out.println();
			System.out.println("WHICH SERIES WOULD YOU LIKE TO BUY??");
			System.out.println("1:SAMSUNG_AC Z                RS:18000");
			System.out.println("2:SAMSUNG_AC C                Rs:12500");
			System.out.println("3:SAMSUNG_AC M                Rs:28000");
			System.out.println("4:BACK");
			System.out.println("0:EXIT");
			int n=scn.nextInt();
			switch (n)
			{
				case 1 : sl.add("SAMSUNG_AC Z");
						 il.add(18000);
					     SAMSUNG_ACZ();
				break;
				case 2 : sl.add("SAMSUNG_AC C");
						 il.add(12500);
						 SAMSUNG_ACC();
				break;
				case 3: sl.add("SAMSUNG_AC M");
						 il.add(28000);
						 SAMSUNG_ACM();
				break;
				case 4: AIR_COOLER();
				break;
				case 0:EXIT();
				break;
				default:System.out.println("PLEASE GIVE THE CORRECT INPUT");
				SAMSUNG_AC();
			}
		}
		private static void SAMSUNG_ACZ()
		{
			System.out.println();
			System.out.println("NUMBER OF AIR_COOLER's YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);  
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			switch (n)
			{
			case 1 : AIR_COOLER();
					 break;
			case 2 : cart();
			         break;
			default:System.out.println("ENTER VALID INPUT");
						SAMSUNG_ACZ();
			}
				
		}
		private static void SAMSUNG_ACC()
		{
			System.out.println();
			System.out.println("TOTAL No. OF AIR_COOLER's YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			switch (n)
			{
			case 1 : AIR_COOLER();
					 break;
			case 2 : cart();
				     break;
			default:System.out.println("ENTER VALID INPUT");
						SAMSUNG_ACC();
			}
		}
		private static void SAMSUNG_ACM()
		{
			System.out.println();
			System.out.println("TOTAL No. OF AIR_COOLER's YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			System.out.println();
			switch (n)
			{
			case 1 : AIR_COOLER();
					 break;
			case 2 : cart();
					 break;
			default:System.out.println("ENTER VALID INPUT");
						SAMSUNG_ACM();
			}
		}
			private static void TOSHIBA_AC()
		{
			System.out.println();
			System.out.println("WHICH SERIES WOULD YOU LIKE TO BUY??");
			System.out.println("1:TOSHIBA_AC Z                RS:22000");
			System.out.println("2:TOSHIBA_AC C                Rs:22500");
			System.out.println("3:TOSHIBA_AC M                Rs:21000");
			System.out.println("4:BACK");
			System.out.println("0:EXIT");
			int n=scn.nextInt();
			switch (n)
			{
				case 1 : sl.add("TOSHIBA_AC Z");
						 il.add(22000);
					     TOSHIBA_ACZ();
				break;
				case 2 : sl.add("TOSHIBA_AC C");
						 il.add(22500);
						 TOSHIBA_ACC();
				break;
				case 3: sl.add("TOSHIBA_AC M");
						 il.add(21000);
						 TOSHIBA_ACM();
				break;
				case 4: AIR_COOLER();
				break;
				case 0:EXIT();
				break;
				default:System.out.println("PLEASE GIVE THE CORRECT INPUT");
				TOSHIBA_AC();
			}
		}
		private static void TOSHIBA_ACZ()
		{
			System.out.println();
			System.out.println("NUMBER OF AIR_COOLER's YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);  
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			switch (n)
			{
			case 1 : AIR_COOLER();
					 break;
			case 2 : cart();
			         break;
			default:System.out.println("ENTER VALID INPUT");
						TOSHIBA_ACZ();
			}
				
		}
		private static void TOSHIBA_ACC()
		{
			System.out.println();
			System.out.println("TOTAL No. OF AIR_COOLER's YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			switch (n)
			{
			case 1 : AIR_COOLER();
					 break;
			case 2 : cart();
				     break;
			default:System.out.println("ENTER VALID INPUT");
						TOSHIBA_ACC();
			}
		}
		private static void TOSHIBA_ACM()
		{
			System.out.println();
			System.out.println("TOTAL No. OF AIR_COOLER's YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			System.out.println();
			switch (n)
			{
			case 1 : AIR_COOLER();
					 break;
			case 2 : cart();
					 break;
			default:System.out.println("ENTER VALID INPUT");
						TOSHIBA_ACM();
			}	
		}
			private static void VOLTAS_AC()
		{
			System.out.println();
			System.out.println("WHICH SERIES WOULD YOU LIKE TO BUY??");
			System.out.println("1:VOLTAS_AC Z                RS:19000");
			System.out.println("2:VOLTAS_AC C                Rs:22500");
			System.out.println("3:VOLTAS_AC M                Rs:22000");
			System.out.println("4:BACK");
			System.out.println("0:EXIT");
			int n=scn.nextInt();
			switch (n)
			{
				case 1 : sl.add("VOLTAS_AC Z");
						 il.add(19000);
					     VOLTAS_ACZ();
				break;
				case 2 : sl.add("VOLTAS_AC C");
						 il.add(22500);
						 VOLTAS_ACC();
				break;
				case 3: sl.add("VOLTAS_AC M");
						 il.add(22000);
						 VOLTAS_ACM();
				break;
				case 4: AIR_COOLER();
				break;
				case 0:EXIT();
				break;
				default:System.out.println("PLEASE GIVE THE CORRECT INPUT");
				VOLTAS_AC();
			}
		}
		private static void VOLTAS_ACZ()
		{
			System.out.println();
			System.out.println("NUMBER OF AIR_COOLER's YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);  
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			switch (n)
			{
			case 1 : AIR_COOLER();
					 break;
			case 2 : cart();
			         break;
			default:System.out.println("ENTER VALID INPUT");
						VOLTAS_ACZ();
			}
				
		}
		private static void VOLTAS_ACC()
		{
			System.out.println();
			System.out.println("TOTAL No. OF AIR_COOLER's YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			switch (n)
			{
			case 1 : AIR_COOLER();
					 break;
			case 2 : cart();
				     break;
			default:System.out.println("ENTER VALID INPUT");
						VOLTAS_ACC();
			}
		}
		private static void VOLTAS_ACM()
		{
			System.out.println();
			System.out.println("TOTAL No. OF AIR_COOLER's YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			System.out.println();
			switch (n)
			{
			case 1 : AIR_COOLER();
					 break;
			case 2 : cart();
					 break;
			default:System.out.println("ENTER VALID INPUT");
						VOLTAS_ACM();
			}
		}
//--------------------------------------------------WASHING MACHINE----------
			private static void WHIRLPOOL()
		{
			System.out.println();
			System.out.println("WHICH SERIES WOULD YOU LIKE TO BUY??");
			System.out.println("1:WHIRLPOOL T                RS:29000");
			System.out.println("2:WHIRLPOOL L                Rs:22500");
			System.out.println("3:WHIRLPOOL A                Rs:24000");
			System.out.println("4:BACK");
			System.out.println("0:EXIT");
			int n=scn.nextInt();
			switch (n)
			{
				case 1 : sl.add("WHIRLPOOL T");
						 il.add(29000);
					     WHIRLPOOLT();
				break;
				case 2 : sl.add("WHIRLPOOL L");
						 il.add(22500);
						 WHIRLPOOLL();
				break;
				case 3: sl.add("WHIRLPOOL A");
						 il.add(24000);
						 WHIRLPOOLA();
				break;
				case 4: WASHING_MACHINE();
				break;
				case 0:EXIT();
				break;
				default:System.out.println("PLEASE GIVE THE CORRECT INPUT");
				WHIRLPOOL();
			}
		}
		private static void WHIRLPOOLT()
		{
			System.out.println();
			System.out.println("NUMBER OF WASHING_MACHINE's YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);  
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			switch (n)
			{
			case 1 : WASHING_MACHINE();
					 break;
			case 2 : cart();
			         break;
			default:System.out.println("ENTER VALID INPUT");
						WHIRLPOOLT();
			}
				
		}
		private static void WHIRLPOOLL()
		{
			System.out.println();
			System.out.println("TOTAL No. OF WASHING_MACHINE's YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			switch (n)
			{
			case 1 : WASHING_MACHINE();
					 break;
			case 2 : cart();
				     break;
			default:System.out.println("ENTER VALID INPUT");
						WHIRLPOOLL();
			}
		}
		private static void WHIRLPOOLA()
		{
			System.out.println();
			System.out.println("TOTAL No. OF WASHING_MACHINE's YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			System.out.println();
			switch (n)
			{
			case 1 : WASHING_MACHINE();
					 break;
			case 2 : cart();
					 break;
			default:System.out.println("ENTER VALID INPUT");
						WHIRLPOOLA();
			}
		}
		private static void BOSCH()
		{
			System.out.println();
			System.out.println("WHICH SERIES WOULD YOU LIKE TO BUY??");
			System.out.println("1:BOSCH T                RS:26000");
			System.out.println("2:BOSCH L                Rs:23500");
			System.out.println("3:BOSCH A                Rs:32000");
			System.out.println("4:BACK");
			System.out.println("0:EXIT");
			int n=scn.nextInt();
			switch (n)
			{
				case 1 : sl.add("BOSCH T   ");
						 il.add(26000);
					     BOSCHT();
				break;
				case 2 : sl.add("BOSCH L   ");
						 il.add(23500);
						 BOSCHL();
				break;
				case 3: sl.add("BOSCH A   ");
						 il.add(32000);
						 BOSCHA();
				break;
				case 4: WASHING_MACHINE();
				break;
				case 0:EXIT();
				break;
				default:System.out.println("PLEASE GIVE THE CORRECT INPUT");
				BOSCH();
			}
		}
		private static void BOSCHT()
		{
			System.out.println();
			System.out.println("NUMBER OF WASHING_MACHINE's YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);  
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			switch (n)
			{
			case 1 : WASHING_MACHINE();
					 break;
			case 2 : cart();
			         break;
			default:System.out.println("ENTER VALID INPUT");
						BOSCHT();
			}
				
		}
		private static void BOSCHL()
		{
			System.out.println();
			System.out.println("TOTAL No. OF WASHING_MACHINE's YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			switch (n)
			{
			case 1 : WASHING_MACHINE();
					 break;
			case 2 : cart();
				     break;
			default:System.out.println("ENTER VALID INPUT");
						BOSCHL();
			}
		}
		private static void BOSCHA()
		{
			System.out.println();
			System.out.println("TOTAL No. OF WASHING_MACHINE's YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			System.out.println();
			switch (n)
			{
			case 1 : WASHING_MACHINE();
					 break;
			case 2 : cart();
					 break;
			default:System.out.println("ENTER VALID INPUT");
						BOSCHA();
			}
		}
			private static void GODREJ()
		{
			System.out.println();
			System.out.println("WHICH SERIES WOULD YOU LIKE TO BUY??");
			System.out.println("1:GODREJ T                RS:26000");
			System.out.println("2:GODREJ L                Rs:23500");
			System.out.println("3:GODREJ A                Rs:32000");
			System.out.println("4:BACK");
			System.out.println("0:EXIT");
			int n=scn.nextInt();
			switch (n)
			{
				case 1 : sl.add("GODREJ T  ");
						 il.add(26000);
					     GODREJT();
				break;
				case 2 : sl.add("GODREJ L  ");
						 il.add(23500);
						 GODREJL();
				break;
				case 3: sl.add("GODREJ A  ");
						 il.add(32000);
						 GODREJA();
				break;
				case 4: WASHING_MACHINE();
				break;
				case 0:EXIT();
				break;
				default:System.out.println("PLEASE GIVE THE CORRECT INPUT");
				GODREJ();
			}
		}
		private static void GODREJT()
		{
			System.out.println();
			System.out.println("NUMBER OF WASHING_MACHINE's YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);  
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			switch (n)
			{
			case 1 : WASHING_MACHINE();
					 break;
			case 2 : cart();
			         break;
			default:System.out.println("ENTER VALID INPUT");
						GODREJT();
			}
				
		}
		private static void GODREJL()
		{
			System.out.println();
			System.out.println("TOTAL No. OF WASHING_MACHINE's YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			switch (n)
			{
			case 1 : WASHING_MACHINE();
					 break;
			case 2 : cart();
				     break;
			default:System.out.println("ENTER VALID INPUT");
						GODREJL();
			}
		}
		private static void GODREJA()
		{
			System.out.println();
			System.out.println("TOTAL No. OF WASHING_MACHINE's YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			System.out.println();
			switch (n)
			{
			case 1 : WASHING_MACHINE();
					 break;
			case 2 : cart();
					 break;
			default:System.out.println("ENTER VALID INPUT");
						GODREJA();
			}
		}
//------------------------------CLOTHING---------------------------------------------
		private static void CLOTHING()
		{
			System.out.println("\n1:MEN");
			System.out.println("2:WOMEN");
			System.out.println("3:BACK");
			System.out.println("0:EXIT");
			int n=scn.nextInt();
			switch (n)
			{
				case 1 : MEN();
				break;
				case 2 : WOMEN();
				break;
				case 3: CATEGORIES();
				break;
				case 0:EXIT();
				break;
				default:System.out.println("PLEASE GIVE THE CORRECT INPUT");
				CLOTHING();
			}
		}
			private static void WOMEN()
		{
			System.out.println();
			System.out.println("CHOOSE YOUR BRAND");
			System.out.println();
			System.out.println("1:ALLEN SOLLY");
			System.out.println("2:VANHEUSEN");
			System.out.println("3:RAYMOND");
			System.out.println("4:PUMA");
			System.out.println("5:BACK");
			System.out.println("6:CATEGORIES");
			System.out.println("0:EXIT");
			int n=scn.nextInt();
			switch (n)
			{
				case 0 : EXIT();
				break;
				case 1 : ALLENSOLLY();
				break;
				case 2 : VANHEUSEN();
				break;
				case 3: RAYMOND();
				break;
				case 4: PUMA();
				break;
				case 5: CLOTHING();
				break;
				case 6: CATEGORIES();
				break;
				default:System.out.println("PLEASE GIVE THE CORRECT INPUT");
				WOMEN();
			}
		}
		private static void ALLENSOLLY()
		{
			System.out.println();
			System.out.println("WHAT YOU WANT TO BUY");
			System.out.println();
			System.out.println("1:T-SHIRTS    RS:1500");
			System.out.println("2:JEANS       RS:2500");
			System.out.println("3:SKIRTS      RS:1800");
			System.out.println("4:KURTI       RS:1500");
			System.out.println("5:BACK");
			System.out.println("0:EXIT");
			int n=scn.nextInt();
			switch (n)
			{
				case 0 : EXIT();
						break;
				case 1 :TSHIRTS();
						break;
				case 2 :JEANS();
						break;
				case 3: SKIRTS();
						break;
				case 4:KURTI();
						break;
				case 5: WOMEN();
						break;
		
				default:System.out.println("PLEASE GIVE THE CORRECT INPUT");
				ALLENSOLLY();
			}
		}
		private static void VANHEUSEN()
		{
			System.out.println();
			System.out.println("WHAT YOU WANT TO BUY");
			System.out.println();
			System.out.println("1:T-SHIRTS    RS:1500");
			System.out.println("2:JEANS       RS:2500");
			System.out.println("3:SKIRTS      RS:1800");
			System.out.println("4:KURTI       RS:1500");
			System.out.println("5:BACK");
			System.out.println("0:EXIT");
			int n=scn.nextInt();
			switch (n)
			{
				case 0 : EXIT();
				break;
				case 1 :TSHIRTS();
				break;
				case 2 : JEANS();
				break;
				case 3: SKIRTS();
				break;
				case 4: KURTI();
				break;
				case 5: WOMEN();
				break;
		
				default:System.out.println("PLEASE GIVE THE CORRECT INPUT");
				VANHEUSEN();
			}
		}
		private static void RAYMOND()
		{
			System.out.println();
			System.out.println("WHAT YOU WANT TO BUY");
			System.out.println();
			System.out.println("1:T-SHIRTS    RS:1500");
			System.out.println("2:JEANS       RS:2500");
			System.out.println("3:SKIRTS      RS:1800");
			System.out.println("4:KURTI       RS:1500");
			System.out.println("5:BACK");
			System.out.println("0:EXIT");
			int n=scn.nextInt();
			switch (n)
			{
				case 0 : EXIT();
				break;
				case 1 :TSHIRTS();
				break;
				case 2 : JEANS();
				break;
				case 3: SKIRTS();
				break;
				case 4: KURTI();
				break;
				case 5: WOMEN();
				break;
		
				default:System.out.println("PLEASE GIVE THE CORRECT INPUT");
				RAYMOND();
			}
		}
		private static void PUMA()
		{
			System.out.println();
			System.out.println("WHAT YOU WANT TO BUY");
			System.out.println();
			System.out.println("1:T-SHIRTS    RS:1500");
			System.out.println("2:JEANS       RS:2500");
			System.out.println("3:SKIRTS      RS:1800");
			System.out.println("4:KURTI       RS:1500");
			System.out.println("5:BACK");
			System.out.println("0:EXIT");
			int n=scn.nextInt();
			switch (n)
			{
				case 0 : EXIT();
				break;
				case 1 :TSHIRTS();
				break;
				case 2 : JEANS();
				break;
				case 3: SKIRTS();
				break;
				case 4: KURTI();
				break;
				case 5: WOMEN();
				break;
		
				default:System.out.println("PLEASE GIVE THE CORRECT INPUT");
				PUMA();
			}
		}
		private static void TSHIRTS()
		{
			sl.add("T-SHIRTS  ");
			il.add(1500);
			System.out.println();
			System.out.println("TOTAL No. OF TSHIRTS YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n3:CATEGORIES\n");
			int n=scn.nextInt();
			switch (n)
			{
			case 1 : WOMEN();
					 break;
			case 2 : cart();
				     break;
			case 3 : CATEGORIES();
				     break;
			default:System.out.println("ENTER VALID INPUT");
					TSHIRTS();
			}	
		}
		private static void JEANS()
		{
			sl.add("JEANS     ");
			il.add(3500);
			System.out.println();
			System.out.println("TOTAL No. OF JEANS YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n3:CATEGORIES\n");
			int n=scn.nextInt();
			switch (n)
			{
			case 1 : WOMEN();
					 break;
			case 2 : cart();
				     break;
			case 3 : CATEGORIES();
				     break;
			default:System.out.println("ENTER VALID INPUT");
						JEANS();
			}
		}
		private static void SKIRTS()
		{
			sl.add("SKIRTS    ");
			il.add(1800);
			System.out.println();
			System.out.println("TOTAL No. OF SKIRTS YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n3:CATEGORIES\n");
			int n=scn.nextInt();
			switch (n)
			{
			case 1 : WOMEN();
					 break;
			case 2 : cart();
				     break;
			case 3 : CATEGORIES();
				     break;
			default:System.out.println("ENTER VALID INPUT");
						SKIRTS();
			}
		}
		private static void KURTI()
		{
			sl.add("KURTI     ");
			il.add(1500);
			System.out.println();
			System.out.println("TOTAL No. OF KURTI YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n3:CATEGORIES\n");
			int n=scn.nextInt();
			switch (n)
			{
			case 1 : WOMEN();
					 break;
			case 2 : cart();
				     break;
			case 3 : CATEGORIES();
				     break;
			default:System.out.println("ENTER VALID INPUT");
					KURTI();
			}	
		}
 
			private static void MEN()
		{
			System.out.println();
			System.out.println("CHOOSE YOUR BRAND");
			System.out.println();
			System.out.println("1:PUMA");
			System.out.println("2:PETER ENGLAND");
			System.out.println("3:LEE COOPER");
			System.out.println("4:LAWMEN");
			System.out.println("5:BACK");
			System.out.println("6:CATEGORIES");
			System.out.println("0:EXIT");
			int n=scn.nextInt();
			switch (n)
			{
				case 0 : EXIT();
				break;
				case 1 : PUMA1();
				break;
				case 2 : PETERENGLAND();
				break;
				case 3: LEECOOPER();
				break;
				case 4: LAWMEN();
				break;
				case 5: CLOTHING();
				break;
				case 6: CATEGORIES();
				break;
				default:System.out.println("PLEASE GIVE THE CORRECT INPUT");
				MEN();
			}
		}
		private static void PUMA1()
		{
			System.out.println();
			System.out.println("WHAT YOU WANT TO BUY");
			System.out.println();
			System.out.println("1:SHIRTS     RS:3000");
			System.out.println("2:PANTS      RS:3000");
			System.out.println("3:SWEATERS   RS:5000");
			System.out.println("4:JACKETS    RS:8000");
			System.out.println("5:BACK");
			System.out.println("0:EXIT");
			int n=scn.nextInt();
			switch (n)
			{
				case 0 : EXIT();
				break;
				case 1 :SHIRTS();
				break;
				case 2 : PANTS();
				break;
				case 3: SWEATERS();
				break;
				case 4: JACKET();
				break;
				case 5: MEN();
				break;
		
				default:System.out.println("PLEASE GIVE THE CORRECT INPUT");
				PUMA1();
			}
		}
		private static void LAWMEN()
		{
			System.out.println();
			System.out.println("WHAT YOU WANT TO BUY");
			System.out.println();
			System.out.println("1:SHIRTS     RS:3000");
			System.out.println("2:PANTS      RS:3000");
			System.out.println("3:SWEATERS   RS:5000");
			System.out.println("4:JACKETS    RS:8000");
			System.out.println("5:BACK");
			System.out.println("0:EXIT");
			int n=scn.nextInt();
			switch (n)
			{
				case 0 : EXIT();
				break;
				case 1 :SHIRTS();
				break;
				case 2 : PANTS();
				break;
				case 3: SWEATERS();
				break;
				case 4: JACKET();
				break;
				case 5: MEN();
				break;
		
				default:System.out.println("PLEASE GIVE THE CORRECT INPUT");
				LAWMEN();
			}
		}
		private static void PETERENGLAND()
		{
			System.out.println();
			System.out.println("WHAT YOU WANT TO BUY");
			System.out.println();
			System.out.println("1:SHIRTS     RS:3000");
			System.out.println("2:PANTS      RS:3000");
			System.out.println("3:SWEATERS   RS:5000");
			System.out.println("4:JACKETS    RS:8000");
			System.out.println("5:BACK");
			System.out.println("0:EXIT");
			int n=scn.nextInt();
			switch (n)
			{
				case 0 : EXIT();
				break;
				case 1 :SHIRTS();
				break;
				case 2 : PANTS();
				break;
				case 3: SWEATERS();
				break;
				case 4: JACKET();
				break;
				case 5: MEN();
				break;
		
				default:System.out.println("PLEASE GIVE THE CORRECT INPUT");
				PETERENGLAND();
			}
		}
		private static void LEECOOPER()
		{
			System.out.println();
			System.out.println("WHAT YOU WANT TO BUY");
			System.out.println();
			System.out.println("1:SHIRTS     RS:3000");
			System.out.println("2:PANTS      RS:3000");
			System.out.println("3:SWEATERS   RS:5000");
			System.out.println("4:JACKETS    RS:8000");
			System.out.println("5:BACK");
			System.out.println("0:EXIT");
			int n=scn.nextInt();
			switch (n)
			{
				case 0 : EXIT();
				break;
				case 1 :SHIRTS();
				break;
				case 2 : PANTS();
				break;
				case 3: SWEATERS();
				break;
				case 4: JACKET();
				break;
				case 5: MEN();
				break;
		
				default:System.out.println("PLEASE GIVE THE CORRECT INPUT");
				LEECOOPER();
			}
		}
		private static void SHIRTS()
		{
			sl.add("SHIRTS    ");
			il.add(3000);
			System.out.println();
			System.out.println("TOTAL No. OF SHIRTS YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n3:CATEGORIES\n");
			int n=scn.nextInt();
			switch (n)
			{
			case 1 : MEN();
					 break;
			case 2 : cart();
				     break;
			case 3 : CATEGORIES();
				     break;
			default:System.out.println("ENTER VALID INPUT");
						SHIRTS();
			}	
		}
		private static void PANTS()
		{
			sl.add("PANTS     ");
			il.add(3000);
			System.out.println();
			System.out.println("TOTAL No. OF PANTS YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n3:CATEGORIES\n");
			int n=scn.nextInt();
			switch (n)
			{
			case 1 : MEN();
					 break;
			case 2 : cart();
				     break;
			case 3 : CATEGORIES();
				     break;
			default:System.out.println("ENTER VALID INPUT");
						PANTS();
			}	
		}
		private static void SWEATERS()
		{
			sl.add("SWEATERS  ");
			il.add(5000);
			System.out.println();
			System.out.println("TOTAL No. OF SWEATERS YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n3:CATEGORIES\n");
			int n=scn.nextInt();
			switch (n)
			{
			case 1 : MEN();
					 break;
			case 2 : cart();
				     break;
			case 3 : CATEGORIES();
				     break;
			default:System.out.println("ENTER VALID INPUT");
						SWEATERS();
			}
		}
		private static void JACKET()
		{
			
			sl.add("JACKET    ");
			il.add(8000);
			System.out.println();
			System.out.println("TOTAL No. OF JACKET YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n3:CATEGORIES\n");
			int n=scn.nextInt();
			switch (n)
			{
			case 1 : MEN();
					 break;
			case 2 : cart();
				     break;
			case 3 : CATEGORIES();
				     break;
			default:System.out.println("ENTER VALID INPUT");
						JACKET();
			}
		}
		private static void MOBILES()
		{
			System.out.println();
			System.out.println("PLEASE ENTER THE PRICE RANGE ");
			System.out.println();
			System.out.println("1:5K-10K");
			System.out.println("2:10K-30K");
			System.out.println("3:BACK");
			System.out.println("0:EXIT");
			int n=scn.nextInt();
			switch (n)
			{
				case 0 : EXIT();
				break;
				case 1 : TEN_K();
				break;
				case 2 : THIRTY_K();
				break;
				case 3: CATEGORIES();
				break;
				default:System.out.println("PLEASE GIVE THE CORRECT INPUT");
				MOBILES();
			}
		}
	
		private static void THIRTY_K()
		{
			System.out.println();
			System.out.println("CHOOSE YOUR BRAND");
			System.out.println();
			System.out.println("1:NOKIA");
			System.out.println("2:REDMI");
			System.out.println("3:VIVO");
			System.out.println("4:BACK");
			System.out.println("5:GO TO CART");
			System.out.println("0:EXIT");
			int n=scn.nextInt();
			switch (n)
			{
				case 0 : EXIT();
				break;
				case 1 : NOKIA1();
				break;
				case 2:  REDMI1();
				break;
				case 3: VIVO1();
				break;
				case 4: MOBILES();
				break;
				case 5: cart();
				break;
				default:System.out.println("PLEASE GIVE THE CORRECT INPUT");
				THIRTY_K();
			}
		}
		private static void NOKIA1()
		{
			System.out.println();
			System.out.println("WHICH SERIES WOULD YOU LIKE TO BUY??");
			System.out.println("1:NOKIA1 LUMIA     RS:17000");
			System.out.println("2:NOKIA1 N8        Rs:16500");
			System.out.println("3:NOKIA1 N-SERIES  Rs:18000");
			System.out.println("4:BACK");
			System.out.println("0:EXIT");
			int n=scn.nextInt();
			switch (n)
			{
				case 1 : sl.add("NOKIA1_L  ");
						 il.add(17000);
					     NOKIA1_L();
				break;
				case 2 : sl.add("NOKIA1_N8 ");
						 il.add(16500);
						 NOKIA1_N8();
				break;
				case 3: sl.add("NOKIA1_N  ");
						 il.add(18000);
						 NOKIA1_N();
				break;
				case 4: THIRTY_K();
				break;
				case 0:EXIT();
				break;
				default:System.out.println("PLEASE GIVE THE CORRECT INPUT");
				NOKIA1();
			}
		}
		private static void NOKIA1_L()
		{
			System.out.println();
			System.out.println("NUMBER OF MOBILES YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);  
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			switch (n)
			{
			case 1 : THIRTY_K();
					 break;
			case 2 : cart();
			         break;
			default:System.out.println("ENTER VALID INPUT");
						NOKIA1_L();
			}
				
		}
		private static void NOKIA1_N8()
		{
			System.out.println();
			System.out.println("TOTAL No. OF MOBILES YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			switch (n)
			{
			case 1 : THIRTY_K();
					 break;
			case 2 : cart();
				     break;
			default:System.out.println("ENTER VALID INPUT");
						NOKIA1_N8();
			}
		}
		private static void NOKIA1_N()
		{
			System.out.println();
			System.out.println("TOTAL No. OF MOBILES YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			System.out.println();
			switch (n)
			{
			case 1 : THIRTY_K();
					 break;
			case 2 : cart();
					 break;
			default:System.out.println("ENTER VALID INPUT");
						NOKIA1_N();
			}		
		}

//----------------------------VIVO1--------------------------------------------------------------
			private static void VIVO1()
		{
			System.out.println();
			System.out.println("WHICH SERIES WOULD YOU LIKE TO BUY??");
			System.out.println("1:SELFIEE EXPERT        RS:17000");
			System.out.println("2:V9                   Rs:16500");
			System.out.println("3:V6                    Rs:18000");
			System.out.println("4:BACK");
			System.out.println("0:EXIT");
			int n=scn.nextInt();
			switch (n)
			{
				case 1 : sl.add("SELFIEE   ");
						 il.add(17000);
					     SELFIEE1();
				break;
				case 2 : sl.add("V9        ");
						 il.add(16500);
						 V9();
				break;
				case 3: sl.add("V6        ");
						 il.add(18000);
						 V6();
				break;
				case 4: THIRTY_K();
				break;
				case 0:EXIT();
				break;
				default:System.out.println("PLEASE GIVE THE CORRECT INPUT");
				VIVO1();
			}
		}
		private static void SELFIEE1()
		{
			System.out.println();
			System.out.println("NUMBER OF MOBILES YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);  
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			switch (n)
			{
			case 1 : THIRTY_K();
					 break;
			case 2 : cart();
			         break;
			default:System.out.println("ENTER VALID INPUT");
						SELFIEE1();
			}
				
		}
		private static void V9()
		{
			System.out.println();
			System.out.println("TOTAL No. OF MOBILES YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			switch (n)
			{
			case 1 : THIRTY_K();
					 break;
			case 2 : cart();
				     break;
			default:System.out.println("ENTER VALID INPUT");
						V9();
			}
		}
		private static void V6()
		{
			System.out.println();
			System.out.println("TOTAL No. OF MOBILES YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			System.out.println();
			switch (n)
			{
			case 1 : THIRTY_K();
					 break;
			case 2 : cart();
					 break;
			default:System.out.println("ENTER VALID INPUT");
						V6();
			}
			
		}
//--------------------------------------REDMI1----------------------------------------------------------------------
		private static void REDMI1()
		{
			System.out.println();
			System.out.println("WHICH SERIES WOULD YOU LIKE TO BUY??");
			System.out.println("1:REDMI NOTE4           RS:27000");
			System.out.println("2:REDMI1NOTE3           Rs:26500");
			System.out.println("3:REDMI1Y1              Rs:28000");
			System.out.println("4:BACK");
			System.out.println("0:EXIT");
			int n=scn.nextInt();
			switch (n)
			{
				case 1 : sl.add("REDMI1NOTE4");
						 il.add(25000);
					     REDMI1NOTE4();
				break;
				case 2 : sl.add("REDMI1NOTE3");
						 il.add(26500);
						 REDMI1NOTE3();
				break;
				case 3: sl.add("REDMI1Y1  ");
						 il.add(28000);
						 REDMI1Y1();
				break;
				case 4: THIRTY_K();
				break;
				case 0:EXIT();
				break;
				default:System.out.println("PLEASE GIVE THE CORRECT INPUT");
				REDMI1();
			}
		}
		private static void REDMI1NOTE4()
		{
			System.out.println();
			System.out.println("NUMBER OF MOBILES YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);  
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			switch (n)
			{
			case 1 : THIRTY_K();
					 break;
			case 2 : cart();
			         break;
			default:System.out.println("ENTER VALID INPUT");
						REDMI1NOTE4();
			}
				
		}
		private static void REDMI1NOTE3()
		{
			System.out.println();
			System.out.println("TOTAL No. OF MOBILES YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			switch (n)
			{
			case 1 : THIRTY_K();
					 break;
			case 2 : cart();
				     break;
			default:System.out.println("ENTER VALID INPUT");
						REDMI1NOTE3();
			}
		}
		private static void REDMI1Y1()
		{
			System.out.println();
			System.out.println("TOTAL No. OF MOBILES YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			System.out.println();
			switch (n)
			{
			case 1 : THIRTY_K();
					 break;
			case 2 : cart();
					 break;
			default:System.out.println("ENTER VALID INPUT");
						REDMI1Y1();
			}
			
		}

//+++++++++++++++++++++++++++++++++++++++TEN K++++++++++++++++++++++++++++++++++++++++++++++++++
private static void TEN_K()
		{
			System.out.println();
			System.out.println("CHOOSE YOUR BRAND");
			System.out.println();
			System.out.println("1:NOKIA");
			System.out.println("2:SAMSUNG");
			System.out.println("3:REDMI");
			System.out.println("4:VIVO");
			System.out.println("5:BACK");
			System.out.println("6:GO TO CART");
			System.out.println("0:EXIT");
			int n=scn.nextInt();
			switch (n)
			{
				case 0 : EXIT();
				break;
				case 1 : NOKIA();
				break;
				case 2 : SAMSUNG();
				break;
				case 3:  REDMI();
				break;
				case 4: VIVO();
				break;
				case 5: MOBILES();
				break;
				case 6: cart();
				break;
				default:System.out.println("PLEASE GIVE THE CORRECT INPUT");
				TEN_K();
			}
		}
		private static void NOKIA()
		{
			System.out.println();
			System.out.println("WHICH SERIES WOULD YOU LIKE TO BUY??");
			System.out.println("1:NOKIA 1100     RS:7000");
			System.out.println("2:NOKIA 6        Rs:6500");
			System.out.println("3:NOKIA N-SERIES Rs:8000");
			System.out.println("4:BACK");
			System.out.println("0:EXIT");
			int n=scn.nextInt();
			switch (n)
			{
				case 1 : sl.add("NOKIA_1   ");
						 il.add(7000);
					     NOKIA1100();
				break;
				case 2 : sl.add("NOKIA_6   ");
						 il.add(7000);
						 NOKIA6();
				break;
				case 3: sl.add("NOKIA_N   ");
						 il.add(7000);
						 NOKIA_N();
				break;
				case 4: TEN_K();
				break;
				case 0:EXIT();
				break;
				default:System.out.println("PLEASE GIVE THE CORRECT INPUT");
				NOKIA();
			}
		}
		private static void NOKIA1100()
		{
			System.out.println();
			System.out.println("NUMBER OF MOBILES YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);  
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			switch (n)
			{
			case 1 : TEN_K();
					 break;
			case 2 : cart();
			         break;
			default:System.out.println("ENTER VALID INPUT");
						NOKIA1100();
			}
				
		}
		private static void NOKIA6()
		{
			System.out.println();
			System.out.println("TOTAL No. OF MOBILES YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			switch (n)
			{
			case 1 : TEN_K();
					 break;
			case 2 : cart();
				     break;
			default:System.out.println("ENTER VALID INPUT");
						NOKIA6();
			}
		}
		private static void NOKIA_N()
		{
			System.out.println();
			System.out.println("TOTAL No. OF MOBILES YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			System.out.println();
			switch (n)
			{
			case 1 : TEN_K();
					 break;
			case 2 : cart();
					 break;
			default:System.out.println("ENTER VALID INPUT");
						NOKIA_N();
			}
//---------------------------------------------SAMSUNG------------------------------------------------------------ 			
		}
			private static void SAMSUNG()
		{
			System.out.println();
			System.out.println("WHICH SERIES WOULD YOU LIKE TO BUY??");
			System.out.println("1:GURU        RS:7000");
			System.out.println("2:NEO         Rs:6500");
			System.out.println("3:Z1          Rs:8000");
			System.out.println("4:BACK");
			System.out.println("0:EXIT");
			int n=scn.nextInt();
			switch (n)
			{
				case 1 : sl.add("GURU      ");
						 il.add(4000);
					     GURU();
				break;
				case 2 : sl.add("NEO       ");
						 il.add(7500);
						 NEO();
				break;
				case 3: sl.add("Z1        ");
						 il.add(9000);
						 Z1();
				break;
				case 4: TEN_K();
				break;
				case 0:EXIT();
				break;
				default:System.out.println("PLEASE GIVE THE CORRECT INPUT");
				SAMSUNG();
			}
		}
		private static void GURU()
		{
			System.out.println();
			System.out.println("NUMBER OF MOBILES YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);  
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			switch (n)
			{
			case 1 : TEN_K();
					 break;
			case 2 : cart();
			         break;
			default:System.out.println("ENTER VALID INPUT");
						GURU();
			}
				
		}
		private static void NEO()
		{
			System.out.println();
			System.out.println("TOTAL No. OF MOBILES YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			switch (n)
			{
			case 1 : TEN_K();
					 break;
			case 2 : cart();
				     break;
			default:System.out.println("ENTER VALID INPUT");
						NEO();
			}
		}
		private static void Z1()
		{
			System.out.println();
			System.out.println("TOTAL No. OF MOBILES YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			System.out.println();
			switch (n)
			{
			case 1 : TEN_K();
					 break;
			case 2 : cart();
					 break;
			default:System.out.println("ENTER VALID INPUT");
						Z1();
			}
			
		}
//----------------------------VIVO--------------------------------------------------------------
			private static void VIVO()
		{
			System.out.println();
			System.out.println("WHICH SERIES WOULD YOU LIKE TO BUY??");
			System.out.println("1:SELFIEE EXPERT        RS:7000");
			System.out.println("2:V1                    Rs:6500");
			System.out.println("3:V3                    Rs:8000");
			System.out.println("4:BACK");
			System.out.println("0:EXIT");
			int n=scn.nextInt();
			switch (n)
			{
				case 1 : sl.add("SELFIEE   ");
						 il.add(8000);
					     SELFIEE();
				break;
				case 2 : sl.add("V1        ");
						 il.add(7500);
						 V1();
				break;
				case 3: sl.add("V3        ");
						 il.add(9000);
						 V3();
				break;
				case 4: TEN_K();
				break;
				case 0:EXIT();
				break;
				default:System.out.println("PLEASE GIVE THE CORRECT INPUT");
				VIVO();
			}
		}
		private static void SELFIEE()
		{
			System.out.println();
			System.out.println("NUMBER OF MOBILES YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);  
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			switch (n)
			{
			case 1 : TEN_K();
					 break;
			case 2 : cart();
			         break;
			default:System.out.println("ENTER VALID INPUT");
						SELFIEE();
			}
				
		}
		private static void V1()
		{
			System.out.println();
			System.out.println("TOTAL No. OF MOBILES YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			switch (n)
			{
			case 1 : TEN_K();
					 break;
			case 2 : cart();
				     break;
			default:System.out.println("ENTER VALID INPUT");
						V1();
			}
		}
		private static void V3()
		{
			System.out.println();
			System.out.println("TOTAL No. OF MOBILES YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			System.out.println();
			switch (n)
			{
			case 1 : TEN_K();
					 break;
			case 2 : cart();
					 break;
			default:System.out.println("ENTER VALID INPUT");
						V3();
			}
			
		}
//--------------------------------------REDMI----------------------------------------------------------------------
		private static void REDMI()
		{
			System.out.println();
			System.out.println("WHICH SERIES WOULD YOU LIKE TO BUY??");
			System.out.println("1:REDMINOTE4            RS:7000");
			System.out.println("2:REDMINOTE3            Rs:6500");
			System.out.println("3:REDMI Y1              Rs:8000");
			System.out.println("4:BACK");
			System.out.println("0:EXIT");
			int n=scn.nextInt();
			switch (n)
			{
				case 1 : sl.add("REDMINOTE4");
						 il.add(10000);
					     REDMINOTE4();
				break;
				case 2 : sl.add("REDMINOTE3");
						 il.add(7500);
						 REDMINOTE3();
				break;
				case 3: sl.add("REDMIY1   ");
						 il.add(8000);
						 REDMIY1();
				break;
				case 4: TEN_K();
				break;
				case 0:EXIT();
				break;
				default:System.out.println("PLEASE GIVE THE CORRECT INPUT");
				REDMI();
			}
		}
		private static void REDMINOTE4()
		{
			System.out.println();
			System.out.println("NUMBER OF MOBILES YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);  
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			switch (n)
			{
			case 1 : TEN_K();
					 break;
			case 2 : cart();
			         break;
			default:System.out.println("ENTER VALID INPUT");
						REDMINOTE4();
			}
				
		}
		private static void REDMINOTE3()
		{
			System.out.println();
			System.out.println("TOTAL No. OF MOBILES YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			switch (n)
			{
			case 1 : TEN_K();
					 break;
			case 2 : cart();
				     break;
			default:System.out.println("ENTER VALID INPUT");
						REDMINOTE3();
			}
		}
		private static void REDMIY1()
		{
			System.out.println();
			System.out.println("TOTAL No. OF MOBILES YOU WOULD LIKE TO BUY??");
			int m=scn.nextInt();
			tl.add(m);
			System.out.println("\n"+m+" ITEMS ARE ADDED TO THE CART SUCCESSFULLY");
			System.out.println("\n"+"1:SHOP MORE\n"+"2:GO TO CART\n");
			int n=scn.nextInt();
			System.out.println();
			switch (n)
			{
			case 1 : TEN_K();
					 break;
			case 2 : cart();
					 break;
			default:System.out.println("ENTER VALID INPUT");
						REDMIY1();
			}
			
		}
				private static void cart()
		{
			System.out.println();
			System.out.println("**********************************YOUR CART***************************************************\n");
			System.out.println("NAME                     PRICE                     No.of ITEMS\n");
			for(int i=0;i<il.size();i++)
			{

				System.out.println(sl.get(i)+"                     "+il.get(i)+"                     "+tl.get(i));	
			    System.out.println();
			}	
				//System.out.println("TOTAL                     "+count+"                     "+count1);
				System.out.println("***********************************************************************************************\n\n");
				System.out.println("1:SHOP MORE");
				System.out.println("2:GO TO BILLING");
				  System.out.println("3:REMOVE");
				System.out.println("4:REMOVE ALL");
				int n=scn.nextInt();
				 System.out.println();
				switch(n)
			    {
					case 1 : CATEGORIES();
					break;
					case 2: BILLING();
					break;
					case 3: REMOVE();
					break;
					case 4: REMOVEALL();
					break;
					default:System.out.println("ENTER VALID INPUT");
						    cart();
					        break;
				}
		}
		private static void REMOVE()
		{
			System.out.println();
			System.out.println("**********************************YOUR CART***************************************************\n");
			System.out.println("NAME                     PRICE                     No.of ITEMS\n");
			for(int i=0;i<il.size();i++)
			{
				count+=il.get(i);
				count1+=tl.get(i);
				System.out.println((i+1)+" "+sl.get(i)+"                     "+il.get(i)+"                     "+tl.get(i));	
			    System.out.println();
			}	
				//System.out.println("TOTAL                     "+count+"                     "+count1);
				System.out.println("***********************************************************************************************\n\n");
				if(il.size()==0)
				{
					System.out.println("CART IS EMPTY..!!!");
					CATEGORIES();
				}
				else
				{
			    System.out.println("Please enter the index of product to remove");
				int g=scn.nextInt();
				if (g==0)
				{
					il.remove(g);
				    sl.remove(g);
				    tl.remove(g);
				    cart();
				}
				il.remove(g-1);
				sl.remove(g-1);
				tl.remove(g-1);
				cart();
				}}

		private static void REMOVEALL()
		{
			System.out.println();
			il.removeAll(il);
			sl.removeAll(sl);
			tl.removeAll(tl);
			System.out.println("ITEMS REMOVED SUCCESSFULLY\n");
			System.out.println("1:CONTINUE SHOPPING");
			System.out.println("2:EXIT");
			int n = scn.nextInt();
			switch(n)
				{
				case 1 : CATEGORIES();
					break;
					case 2: EXIT();
					break;
					default : System.out.println("Enter valid input");
					REMOVEALL();
				}
		}
		private static void BILLING()
		{
			count=0;
			count1=0;
			System.out.println("**********************************BILLING**************************************************\n");
			System.out.println("NAME                     PRICE                     No.of ITEMS\n");
			for(int i=0;i<il.size();i++)
			{
				count+=il.get(i);
				count1+=tl.get(i);
				System.out.println(" "+sl.get(i)+"                     "+il.get(i)+"                     "+tl.get(i));	
			    System.out.println();
			}
			System.out.println("___________________________________________________________________________________________");
				System.out.println("TOTAL                     "+count+"                     "+count1+"\n");
				double sgst=count*0.03;
				double cgst=count*0.03;
				double total=cgst+sgst+count;
				System.out.println("AMOUNT                                                    "+count);
				System.out.println("cgst 3%                                                  +"+cgst);
				System.out.println("sgst 3%                                                  +"+sgst);
				System.out.println("TOTAL                                                    ="+total+"\n");
				System.out.println("1:CONTINUE SHOPPING\n2:PLACE YOUR ORDER\n");
				int n=scn.nextInt();
				if (count==0)
				{
					System.out.println("YOUR CART IS EMPTY ORDER SOMETHING!!!!!");
					CATEGORIES();
				}
				else{
				switch (n)
				{
				case 1 :CATEGORIES();
						break;
				case 2 : SUCCESSFULL();
						break;
				default:System.out.println("Enter valid input");
						BILLING();
						break;
				}
				}

		}
		private static void SUCCESSFULL()
		{
			System.out.println("YOUR ORDER WILL BE DISPATCHED SOON..");
			EXIT();
		}
		private static void EXIT()
		{
			System.out.println("Thank You!!...visit again");
		}
}
