import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
	int age;
	Scanner dm=new Scanner(System.in);
	System.out.println("enter your age :");
	age=dm.nextInt();
	if(age>=18)
	{
		System.out.println("You are Eligible for vote");
		
	}
	else
	{
		System.out.println("you are not Eligible for vote");
	}
	dm.close();
	}

}
