package ru.elikoev.exeptions;

public class UserEnteredGenderException  extends IllegalArgumentException{
    public UserEnteredGenderException(){
        super("Gender entered incorrectly.\n" +
                "Gender is indicated by the symbols f (female) or m (male).");
    }
}
