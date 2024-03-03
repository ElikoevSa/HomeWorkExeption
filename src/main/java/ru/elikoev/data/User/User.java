package ru.elikoev.data.User;

public class User {
    private final String fio;
    private final String birthday;
    private final long phoneNumber;
    private final char gender;

    public User(String fio, String birthday, long phoneNumber, char gender) {
        this.fio = fio;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String getInfo() {
        return String.format("%s %s %d %c", fio, birthday, phoneNumber, gender);
    }

    public String getFio() {
        return fio;
    }

    public String getBirthday() {
        return birthday;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public char getGender() {
        return gender;
    }

}
