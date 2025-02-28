import java.util.Scanner;

class bank
{		
	Scanner sc=new Scanner(System.in);

	void deposite(double amount )
	{
		double depo;
		System.out.println("Enter Amount for deposite:");
		depo = sc.nextDouble();
		amount=amount+depo;
		System.out.println();
		System.out.println("Balance is :"+amount);

		
	}
	void withdraw(double amount)
	{
		double with;
		System.out.println("Enter Amount for withdrawww:");
		with = sc.nextDouble();
		if(amount>with) {
			amount=amount-with;
			System.out.println();
			System.out.println("Balance is :"+amount);
		}
		else
		{
			System.out.println("Transition Failed....... \n  plz enter valid amount....! ");
		}
	}
}


public class Bank_deposit_withdrawMiniProject {

	public static void main(String[] args) {
		
		bank B1=new bank();
		
		double amount;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Bank Balance:");
		amount = sc.nextDouble();
		System.out.println("1.Deposite\n2.Withdraw");
		int ch;
		ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:
			B1.deposite(amount);
			break;
		case 2:
			B1.withdraw(amount);
			break;
		}
	}

}
