import java.util.ArrayList;
import java.util.Scanner;
public class EntryPoint{
	private static int A;
	private static double S;

	public static void main(String[] args){
		String firstName,lastName;
		int age;
		double monthlySalary;
		
		ArrayList<String> ar = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		int counter=(int) (Math.random()*10 +1);
		int a=1;
		while(a<=counter){ 
			System.out.println("You have "+ (counter+1-a) +" insertions left.");

			System.out.println("Please input the employee's first name: ");
			firstName= scan.nextLine();

			System.out.println("Please input the employee's last name: ");
			lastName= scan.nextLine();

			System.out.println("Please input the employee's age: ");
			age=scan.nextInt();

			System.out.println("Please input the employee's monthly salary: ");
			monthlySalary=scan.nextDouble();
	
			Employee employe=new Employee(firstName,lastName,age,monthlySalary);
			String employ="Employee information: "+ employe.firstName +" "+employe.lastName+" ,"+employe.age+" ,"+employe.monthlySalary;
			ar.add(employ);
			a++;
			scan.nextLine();


		}
		for (int i=0 ;i< ar.size();i++){
		System.out.println(ar.get(i));
		}
	}
}