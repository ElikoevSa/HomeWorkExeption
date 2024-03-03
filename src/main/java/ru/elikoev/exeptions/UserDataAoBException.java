package ru.elikoev.exeptions;

public class UserDataAoBException extends IllegalArgumentException{
    public UserDataAoBException(){
        super("User information must store 6 ratings entered separated by a space.\n" +
                "Last Name First Name Patronymic Date of Birth Phone Number Gender");
    }
}
