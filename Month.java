class Month
{
   public static void main (String[] args)
   {		
	int n=11;
   
   switch(n)
   {
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12:
	       System.out.print("Month have 31 days \n");
	       break;
	case 2:
	       System.out.print("2nd month is a february and have 28 days \n");
	       System.out.print("in leap year The Feb Have 29 days\n");
	       break;
	case 4:
	case 6:
	case 9:
	case 11:
	       System.out.print("Month have 30 days \n");
	       break;
	default:
	       System.out.print("invalid Month number\nPlease try again ....\n");
	       break;
   }
   }   
}