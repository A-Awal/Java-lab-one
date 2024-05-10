package amalitech.Utils;

import java.util.Scanner;

public abstract class Validator<T> {
   
    public abstract T getValue();
    public abstract void requestUserInput( String promptMessage);
    
}
