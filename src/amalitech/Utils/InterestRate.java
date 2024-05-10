package amalitech.Utils;

import java.util.Scanner;

public class InterestRate extends Validator<Float> {
    private float interest;
    private byte percent;
    private byte monthsInYear;
    public InterestRate(byte percent, byte monthsInYear){
        this.percent = percent;
        this.monthsInYear= monthsInYear;
    }

    private boolean validate(){
        return true;
    }
    
    @Override
    public Float getValue() {
        return interest/percent/monthsInYear;
    }

     @Override
    public void requestUserInput(String promptMessage){
        Scanner scanner=new Scanner(System.in);
        
        System.out.println(promptMessage);
        
        try{
            interest = scanner.nextFloat();
        }catch(Exception e){
            System.out.println("Please Enter Again:");
            requestUserInput(promptMessage);
        }
        
        if(!validate()){
            requestUserInput(promptMessage);
        }
    
        System.out.println( "OK");
    }

}
