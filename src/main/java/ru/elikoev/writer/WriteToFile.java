package ru.elikoev.writer;

import ru.elikoev.data.User.User;
import ru.elikoev.parser.Parser;
import ru.elikoev.writer.impl.WriteDataToFile;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile implements WriteDataToFile {
    private final Parser parser;
    private FileWriter fw;

    public WriteToFile(){
        this.parser=new Parser();
    }
    @Override
    public void writeToFile(User user) throws IOException {
        boolean findError = false;
        try {
            parser.userParse(user);
        } catch (Exception e) {
            System.err.println("User : " + user.getInfo());
            parser.userParse(user);
            findError = true;
        }

        if (!findError) {
            fw = new FileWriter("src/main/resources" + getUserSurname(user) + ".txt", true);
            fw.write(parser.userParse(user) + "\n");
            fw.close();
        }
    }

    private String getUserSurname(User user) {
        String userInfo = user.getInfo();
        String[] userParsed = userInfo.split(" ");
        return userParsed[0];
    }
}

