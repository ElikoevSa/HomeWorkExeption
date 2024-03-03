package ru.elikoev;

import ru.elikoev.data.User.User;
import ru.elikoev.data.User.UserInput;
import ru.elikoev.writer.WriteToFile;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        User test = new UserInput().start();
        WriteToFile writed = new WriteToFile();
        writed.writeToFile(test);


    }
}