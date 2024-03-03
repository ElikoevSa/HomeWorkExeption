package ru.elikoev.parser;

import ru.elikoev.data.User.User;
import ru.elikoev.exeptions.UserDataAoBException;
import ru.elikoev.exeptions.UserEnteredDateException;
import ru.elikoev.exeptions.UserEnteredGenderException;
import ru.elikoev.exeptions.UserEnteredNumberException;
import ru.elikoev.parser.impl.Parseable;

public class Parser implements Parseable {
    public String userParse(User user) {
        String userInfo = user.getInfo();
        String[] userParsed = userInfo.split(" ");

        if (userParsed.length != 6) {
            throw new UserDataAoBException();
        }

        if (userParsed[3].charAt(2) != '.' || userParsed[3].charAt(5) != '.') {
            throw new UserEnteredDateException();
        }

        if (!checkPhoneNumber(Long.parseLong(userParsed[4]))) {
            throw new UserEnteredNumberException();
        }

        if (userParsed[5].charAt(0) != 'm') {
            if (userParsed[5].charAt(0) != 'f') {
                throw new UserEnteredGenderException();
            }
        }

        return String.format("<%s> <%s> <%s> <%s> <%s> <%s>",
                userParsed[0],
                userParsed[1],
                userParsed[2],
                userParsed[3],
                userParsed[4],
                userParsed[5]);
    }

    private boolean checkPhoneNumber(long number) {
        int countNumbers = 0;

        while (number != 0) {
            number /= 10;
            countNumbers++;
        }

        return countNumbers == 10;
    }
}
