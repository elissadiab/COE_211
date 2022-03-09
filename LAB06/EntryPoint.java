import java.util.Scanner;

public class EntryPoint {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean shouldContinue = true;
        while(shouldContinue){
            System.out.print(
                "Which service would you like to use? \n"
                +"[1]: Basic week visualiser\n"
                +"[2]: Advanced week visualizer\n"
                +"[3]: Basic calculator\n"
                +"[4]: Employee repertoire\n"
                );
            int point=scan.nextInt();
            if(point < 1 || point > 4){
                System.out.println("Please make sure you pick a number between 1 and 4: ");
            }else{
                switch (point){
                    case 1:
                        BasicWeek base=new BasicWeek();
                        base.printDays();
                        break;
                    case 2:
                        AdvancedWeek advanced=new AdvancedWeek();
                        advanced.printDays();
                        break;
                    case 3:
                        Calculator calc=new Calculator();
                        break;
                    case 4:
                        Employee employee=new Employee();
                        System.out.println(employee);
                        break;
                    
                }  
                System.out.println("Would you like to perform another operation? (y/n) ");
                scan.nextLine();
                shouldContinue =scan.nextLine().trim().toLowerCase().equals("y");             
            }   
                        
            
        }      

    }
}
                
        
          

