import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		 
    int option;
    Scanner sc=new Scanner(System.in);
    System.out.println("welcome to SBI ATM");
    System.out.println("enter your option is here:");
    option=sc.nextInt();
    switch(option)
    {
    case 1:System.out.println("you are selected withdrawl");
    break;
    
    case 2:System.out.println("you are selected balance enquiry");
    break;
    
    case 3:System.out.println("you are selected deposit");
    break;
    
    default :System.out.println("main menu");
    }
    sc.close();
    
	}

}
