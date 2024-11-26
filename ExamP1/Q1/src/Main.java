import java.util.Random;
import java.util.Scanner;

public class Player {
    private String name;
    private int birthYear;
    private float WinRatio;
    private boolean status;

    Scanner scanner = new Scanner();

    public void Player(int birthYear, float winRatio, String name, boolean status) {
        this.name = name;
        this.birthYear = birthYear;
        this.winRatio = winRatio;

    public String getName() {
        return name;
    }

    public void setName(String name) {
            if (name.isEmpty() ) {
                System.out.println("It can't be empty, try again");
            } else {
                this.name = name;
            }
        }

    public double getWinRat() {
        return winRatio;
    }

    public void setWinRatio() {
        if (winRat <= 1 && winRat > 0) {
            this.winRatio = winRatio;
        }
            System.out.println("Your Win Ratio is incorrect, try again");
        }
    }

    public int getBirthYear() {
        if (birthYear > 1940 && birthYear < 2024 ) {
            this.birthYear = birthYear;

        }
        System.out.println("Input is incorrect");
            return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


public static void main(String[] args) {
        Player player1 = new Player("Sebastiaan", 2993, 0.5f, false);
        System.out.println(player1);
        Random random = new Random();



    if (player1.birthYear > 1940 && player1.birthYear < 2024  ) {
        System.out.println(player1.birthYear);
    } else {
        System.out.println("Incorrect Year of birth");
    }

    if (player1.name != null) {
        System.out.println(player1.name);
    } else {
        System.out.println("Incorrect input");
    }

    if (player1.WinRatio <= 1) {
      return WinRatio;
    } else {
        System.out.println("Win ratio is not correct, try again");
    }

    if (player1.status = true) {
        return true;
    } else {
        return false;
    }

    }

//        //TODO make the player class and make the code below function as instructed.
//        //TODO Uncomment the code below to test your solution. Do NOT change any code here beyond uncommenting it.
//
//        //Negative age should not be allowed!
//    Player player1 = new Player("Sebastiaan", 2993, 0.5f, false);
//    //Fixing negative age
//    player1.setAge(1993);
//    //Win ratio should not be higher than 1!
//    Player player2 = new Player("Wim", 1963, 75, false);
//    //Fixing win ratio
//    player2.setWinRatio(0.73f);
//
//    System.out.println(player1 + " win? " + player1.play());
//    System.out.println(player2 + " win? " + player2.play());
//
//    if(player1.play(player2)){
//        System.out.println(player1 + " wins!");
//    } else {
//        System.out.println(player2 + " wins!");
//    }


}
}

















