import java.util.Scanner;

public class If {

	public static void main(String[] args) {
	int age;
	Scanner dm=new Scanner(System.in);
	System.out.println("enter your age :");
	age=dm.nextInt();
	if(age>=20)
	{
		System.out.println("Eligible for vote");
		
	}
	dm.close();
	}

}
