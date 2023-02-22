
import java.util.Scanner;

public class inputData {
    
    public inputData(){}

    public String getString(String text )
    {
        Scanner scan = new Scanner( System.in );
        System.out.println(text);
        String inttext = scan.nextLine();

        return inttext;
    }

    public Integer getInteger(String text)
    {
        Scanner scan = new Scanner( System.in );
        System.out.println(text);
        String numberStr = scan.nextLine();

        int number = 0;

        while( !( numberStr.matches( "[0-9]+" ) ) ){
        
           System.out.println("hibás adat. ");
           System.out.println(text);
           numberStr = scan.nextLine();
        }
        number = Integer.parseInt(numberStr);
        return number; 
    }

    public double getDouble(String text)
    {
        Scanner scan = new Scanner( System.in );
        System.out.println(text);
        String numberDouble = scan.nextLine();

        double number = 0;

        while( !( numberDouble.matches( "[-0.-9.]+" ) ) ){
        
            System.out.println("hibás adat. ");
            System.out.println(text);
            numberDouble = scan.nextLine();
         }
         number = Double.parseDouble(numberDouble);
         return number; 
    }




}
