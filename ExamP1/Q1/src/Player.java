import java.util.Random;
import java.util.Scanner;

public class Player {
    private String name;
    private int birthYear;
    // it is better to stick to the naming convention
    // WinRatio -> winRatio
    // (it will also resolve some possible errors)
    private float winRatio;
    private boolean status;
    // it is better to create constant to better calculate the age of the player
    private final int CURRENT_YEAR = 2024;

    Random rand = new Random();

    // Scanner does not work without param
    // we do not need Scanner here
    // Scanner sc = new Scanner(System.in);

    // you get errors in main method due to confusion of params in Player constructor
    // for instance, name should go first
    public Player(String name, int birthYear, float winRatio, boolean status) {
        // you do not need to define return type of constructor
        // you should use setters in your constructor for better validation
        setName(name);
        setAge(birthYear);
        setWinRatio(winRatio);
        setStatus(status);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("It can't be empty, try again");
        } else {
            this.name = name;
        }
    }

    // you should return float value and not double
    // it can crash the logic of your app
    public float getWinRatio() {
        return winRatio;
    }

    public void setWinRatio(float winRatio) {
        // Make sure you properly define which params your method will take
        if (winRatio > 0.0 && winRatio < 1.0) {
            this.winRatio = winRatio;
        } else {
            // control messages to better convey the state of application
            System.out.println("Your Win Ratio is incorrect, try again");
        }
    }

    public int getBirthYear() {
        // no need to set birthYear in getter
        return birthYear;
    }

    // it is better to create setAge method as it is used in main method
    public void setAge(int birthYear) {
        // boundaries between 1940 and 2024 years are not very concise
        // player is not older than 120 years
        // player has positive age
        if ((CURRENT_YEAR - birthYear) >= 0 && (CURRENT_YEAR - birthYear) <= 120) {
            this.birthYear = birthYear;
        } else {
            // in your logic else is essential to prevent setting invalid age
            System.out.println("Invalid age!");
        }
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // you have not created the method for single-player game
    public boolean play(){
        double randomNumber = rand.nextDouble();
        return !(randomNumber > this.winRatio);
    }

    // you have not created the method for multiplayer game
    public boolean play(Player player){
        float firstRandomNumber = rand.nextFloat();
        float secondRandomNumber = rand.nextFloat();
        float firstPlayerScore = this.winRatio - firstRandomNumber;
        float secondPlayerScore = player.getWinRatio() - secondRandomNumber;
        return firstPlayerScore > secondPlayerScore;
    }
}
