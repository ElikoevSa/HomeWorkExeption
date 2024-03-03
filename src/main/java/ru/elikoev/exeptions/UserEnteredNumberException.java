package ru.elikoev.exeptions;

public class UserEnteredNumberException extends NumberFormatException{
    public UserEnteredNumberException(){
        super("The phone number must store 10 characters.\\n\" +\n" +
                "                \"Example: 9993337755");
    }
}
