class Vote{

public static void main (String args[])
{
int a=Integer.parseInt(args[0]);
//int age=23;
if(a>=18)
	System.out.println("Eligible to Vote");
else
	System.out.println("Not Eligible to Vote");
}
}