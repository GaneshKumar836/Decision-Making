import java.util.Scanner;

public class Nestedif {

	public static void main(String[] args) {
		int age;
		String name;
		String voterid1="9546";
		String voterid2="9999";
		
		Scanner vi=new Scanner(System.in);
		System.out.println("Check your voterid is available are not");
		System.out.println("Enter your age:");
		age=vi.nextInt();
		if(age>=20)
		{
			System.out.println("Your age is valid for verification ");
			System.out.println("Please enter your name:");
			name=vi.next();
			if(name.equalsIgnoreCase("ganesh") || name.equalsIgnoreCase("satish"))
			{
					System.out.println("Your name is matched in our data");
					if(name=="ganesh")
					{
							System.out.println("your id is"+voterid1);
					
					}
					else
					{
							System.out.println("your id is"+voterid2);
					}
				
			}
			else
			{
					System.out.println("your name is not matched");
			}
		}
		else
		{
			System.out.println("Yor age is not valid for verication");
		}
	vi.close();	
	}

}
