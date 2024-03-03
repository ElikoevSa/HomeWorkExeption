package ru.elikoev.writer.impl;

import ru.elikoev.data.User.User;

import java.io.IOException;

public interface WriteDataToFile {
    void writeToFile(User user)throws IOException;
}
