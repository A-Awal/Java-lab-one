package amalitech.Utils;

import java.text.NumberFormat;
import java.util.Scanner;

public final class MortGageEstimator {

    final byte MONTHS_IN_YEAR=12;
    final byte PERCENT=100;
    
    public double getUserInput(){
        Scanner scanner=new Scanner(System.in);
        var principal = new Principal();
        var interest = new InterestRate( PERCENT, MONTHS_IN_YEAR );
        var years = new NumberOfPayments(MONTHS_IN_YEAR);
        double mortgage = 0;

        principal.requestUserInput("Please Enter Your Principal:");
        interest.requestUserInput("Please Enter your interest rate in Percentages:");
        years.requestUserInput("Please Enter the number of years:");

        try {
            mortgage = estimate(principal.getValue(), interest.getValue(), years.getValue());
        } catch (Exception e) {
            var step = scanner.next();
            if(step.equals("yes")) getUserInput();
            else{
                return Double.NaN;
            }
        }

        return mortgage;
    }

    private  double estimate(Integer principal, Float monthlyInterest, Integer numberOfPayments){
        return principal*(monthlyInterest*Math.pow(1+monthlyInterest,numberOfPayments))/(Math.pow(1+monthlyInterest,numberOfPayments)-1);
    }

}
