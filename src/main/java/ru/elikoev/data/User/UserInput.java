package ru.elikoev.data.User;

import ru.elikoev.exeptions.UserDataAoBException;
import ru.elikoev.parser.Parser;

import java.util.Scanner;

public class UserInput {
    public UserInput() {
    }

    public User start() {
        Scanner scanner = new Scanner(System.in);
        boolean findError = false;
        Parser parser = new Parser();

        System.out.println("Enter user data (Last Name First Name Patronymic Date of Birth Phone Gender) separated by a space as in the example below: \n" +
                "Albert Jakov Solar 01.01.1900 9995552277 m/f");

        String userInfo = scanner.nextLine();
        scanner.close();
        String[] userParsed = userInfo.split(" ");

        if (userParsed.length != 6) {
            throw new UserDataAoBException();
        }

        long userPhoneNumber = Long.parseLong(userParsed[4]);
        char userGender = userParsed[5].charAt(0);

        User enterUser = new User(userParsed[0] + " " + userParsed[1] + " " + userParsed[2],
                userParsed[3], userPhoneNumber, userGender);

        try {
            parser.userParse(enterUser);
        } catch (Exception e) {
            parser.userParse(enterUser);
        }


        return new User(userParsed[0] + " " + userParsed[1] + " " + userParsed[2],
                userParsed[3], userPhoneNumber, userGender);
    }
}
