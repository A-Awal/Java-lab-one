package amalitech.Utils;

import java.util.Scanner;

public class NumberOfPayments extends Validator<Integer>{

    private byte years = 0;
    private byte monthInYear = 0;
    
    public NumberOfPayments( byte monthInYear){
        this.monthInYear = monthInYear;
    }
    
    private  boolean validate(){
        return true;
    }

    public Integer getValue() {
        return years*monthInYear;
    }

    @Override
    public void requestUserInput(String promptMessage){
            Scanner scanner=new Scanner(System.in);
          
            System.out.println(promptMessage);
            
            try{
                years = scanner.nextByte();
            }catch(Exception e){
                System.out.println(" Invalid input:");
                requestUserInput("Please Enter  your years Again:");
            }
            
            if(!validate()){
                requestUserInput("Please Enter  your years Again:");
            }

            System.out.println( "OK");
    
    }

    
}
