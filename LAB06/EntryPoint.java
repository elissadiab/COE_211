import java.util.Scanner;

public class EntryPoint {
    public static void main (String[] args) {
        Scanner scan=new Scanner(System.in);
        boolean shouldContinue=true;
        while (shouldContinue){}
            System.out.println("Which service would you like to use?\n [1]: Basic week visualiser\n [2]: Advanced week visualizer\n [3]: Basic calculator\n [4]: Employee repertoire");
            int point=scan.nextInt();
            if (point==1||point==2||point==3||point==4);
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
                        Employee emp=new Employee();
                        break;
            }

            System.out.println("Would you like to perform another operation? (y/n) ");
            String choice=scan.nextLine();
            if(choice!="y"){
                shouldContinue=false;
            }
                    
            
            }            
          

    }