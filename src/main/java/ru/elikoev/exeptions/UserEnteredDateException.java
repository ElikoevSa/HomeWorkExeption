package ru.elikoev.exeptions;

public class UserEnteredDateException extends IllegalArgumentException{
    public UserEnteredDateException(){
        super("The date of birth was entered incorrectly.\n" +
                "Correct format: DD.MM.YYYY");
    }
}
