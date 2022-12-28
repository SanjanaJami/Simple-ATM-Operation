import java.util.Scanner;
class AtmOperation 
{
	public int total;
	public int password;
	public AtmOperation(int total,int password)
		{
		this.total=total;
		this.password=password;
		}
	public void display()
	{
		Scanner scan=new Scanner(System.in);
	System.out.println("***Welcome to SBI***");
	System.out.println("***please swipe your card***");
	System.out.println("***hi, please dont remove your chip card.\nLeave your card inserted during the entire transaction***");
	System.out.println();
	System.out.println("***Thank you!! select the language***");
	System.out.println();
	System.out.println("1)click TELUGU\n2)click HINDI\n3)click ENGLISH");
	String language=scan.next();
	System.out.println();
	System.out.println("***Thank you!! Enter any number between 10 and 99***");
	int number=scan.nextInt();
	if(number>=10&&number<=99)
		{
System.out.println("**********************");
System.out.println();
System.out.println("1)click DEPOSIT\n2)click WITHDRAW\n3)click CHECK BALANCE");
String operation=scan.next();
System.out.println();
System.out.println("***please select account type***");
System.out.println();
System.out.println("1)click KCC\n2)click SAVINGS\n3)click CURRENT");
String account=scan.next();
System.out.println();
System.out.println("**please enter amount**");
int amount=scan.nextInt();
System.out.println();
System.out.println("**Your transaction is being Processed. Please Wait..**");
System.out.println();
System.out.println("***Collect your cash***");
System.out.println();
System.out.println("***Transaction complete***");
		}
		else
		{
			System.out.println("****enter valid number****");
		}
	}
}
class ATM
{
	public static void main(String[] args)
	{
		AtmOperation atmoperation=new AtmOperation(10000,1234);
		atmoperation.display();
	}
}


	
