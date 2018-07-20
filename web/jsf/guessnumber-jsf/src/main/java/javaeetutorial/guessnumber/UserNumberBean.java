package javaeetutorial.guessnumber;


import java.io.Serializable;
import java.util.Random;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class UserNumberBean implements Serializable {

    private Integer randomNumber;
    private Integer userNumber;
    //private String response;
    private int max = 10;
    private int min = 0;

    public UserNumberBean() {
        Random randomGr = new Random(System.currentTimeMillis());
        randomNumber = randomGr.nextInt(max + 1 - min) + min;
        System.out.println("Duke's number: " + randomNumber);
    }

    public String getResponse() {
        if (userNumber == null || !userNumber.equals(randomNumber)) {
            return "Sorry, " + userNumber + " is incorrect.";
        } else {
            return "Yay! You got it!";
        }
    }

    public Integer getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(Integer userNum) {
        userNumber = userNum;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int maximum) {
        max = maximum;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int minimum) {
        min = minimum;
    }
}