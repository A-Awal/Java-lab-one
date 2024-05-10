package amalitech;

import amalitech.Modification.FizzBuzz;

public class FizzBuzzChallenge {
    public static void main(String...args){

        /** Solve a fizzbuzz challenge */
        
        //Obviuos implementation
        FizzBuzz.lessSpecificImplementation(FizzBuzz.getUserImput());
       
        //Arrange code to fail fast - to avoid checking unecessary computation
        FizzBuzz.moreSpecificImplementation(FizzBuzz.getUserImput());

     //Can we apply DRY- don’t repeat yourself principle??
       FizzBuzz.repeatVoidImplementation(FizzBuzz.getUserImput());
        
}
}


