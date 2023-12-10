import java.util.Scanner;
public class Ladderif {
	public static void main(String[] args) {
		String empid,empname,designation;
		double salary,hra,da,ma,gs,pt,ns,spa,it,ctc,totalpt;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Id");
		empid = sc.next();
		System.out.println("Enter Employee Name");
		empname = sc.next();
		System.out.println("Enter Employee Designation");
		designation = sc.next(); // hr
		System.out.println("Enter Employee salary");
		salary = sc.nextDouble();
		hra = salary * 0.08; // 38500 * 0.08 = 3080
		if(hra>=2500) // 3080 >= 2500
		{
			hra=6200;
		}
		da = salary * 0.03; // 1155
		if(designation.equals("admin"))
		{
			ma = 1400;
		}
		else if(designation.equals("sales"))
		{
			ma=1500;
		}
		else if(designation.equals("exe"))
		{
			ma=1600;
		}
		else if(designation.equals("hr"))
		{
			ma=1700;
		}
		else 
		{
			ma=600;
		}
		gs = salary + hra + ma + da; // 47555
		pt = gs * 0.1; // 4755.5 * 12 = 57066
		totalpt = pt * 12;
		ns = gs - pt; // 42799.5
		spa = ns * 12; // 513594
		if(spa<=500000)
		{
			it = 0;
		}
		else if(spa>=500001 && spa<=800000)
		{
			it = totalpt * 0.03; //  1711.98
		}
		else if(spa>=800001 && spa<=1200000)
		{
			it = totalpt * 0.07;
		}
		else
		{
			it = totalpt * 0.12;
		}
		ctc = spa + totalpt - it; 
		System.out.println("***************************************");
		System.out.println("Employee Id " + empid);
		System.out.println("Employee Name " + empname);
		System.out.println("Designation " + designation);
		System.out.println("Basic salary " + salary);
		System.out.println("House Rent Allowance " + hra);
		System.out.println("Dearness Allowance " + da);
		System.out.println("Medical Allowance " + ma);
		System.out.println("Gross salary " + gs);
		System.out.println("Professional Tax" + pt);
		System.out.println("Net Salary " + ns);
		System.out.println("salary Per Annum " + spa);
		System.out.println("Income Tax " + it);
		System.out.println("Total Professional Tax "+ totalpt);
		System.out.println("Cost To Company " + ctc);
		System.out.println("***************************************");
		sc.close();
	}
}

