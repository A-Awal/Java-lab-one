package amalitech.Utils;

import java.util.Scanner;

public class Principal extends Validator<Integer> {
    
    private int principal;
    
    @Override
     public Integer getValue() {
        return principal;
    }

    private boolean validate(){
        if(principal<1000 ){
            System.out.println( "Principal must be greater than 1000");
            return false;
        }else if(principal>1_000_000){
            System.out.println( "Principal must be less than 1,000,000");
            return false;
        }
        
        return true;
    }

    @Override
    public void requestUserInput(String promptMessage){
            Scanner scanner=new Scanner(System.in);
    
            System.out.println(promptMessage);
            
            try{
                principal = scanner.nextInt();

            }catch(Exception e){
                System.out.println("Invalid input!!");
                requestUserInput("Please Enter  your principal Again:");
            }
            
            if(!validate()){
                requestUserInput("Please Enter  your principal Again:");
            }else{
                
            System.out.println( "OK");
            }

    }
}




