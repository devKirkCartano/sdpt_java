package main;

public class User {

    private int userID;
    private String userName;
    private String firstName, lastName;

    User(int userID, String userName, String firstName, String lastName) {
        this.userID = userID;
        this.userName = userName;
        this.firstName = firstName;
    }

    void setUserID(int userID) {
        this.userID = 456;
    }

    int getUserID(){
        return userID;
    }

    void setUserName(String userName) {
        this.userName = userName;
    }

    String getUserName(){
        return userName;
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    String getFirstName(){
        return firstName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    String getLastName(){
        return lastName;
    }
}
