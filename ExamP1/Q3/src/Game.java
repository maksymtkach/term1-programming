import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Board {
    private String name;
    private int numberOfPlayers;
    private Board board;
    private Piece piece;
    private float winRatio;
    private List<Player> players;
    private boolean retired;
    private String color;
    private boolean promotable;



    Scanner scanner = new Scanner();

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

    public void setNumberOfPlayers(int numberOfPlayers) {
        if (numberOfPlayers <= 1 ) {
            System.out.println("Error message");
        } else {
            this.numberOfPlayers = numberOfPlayers;
        }
    }

    public float getWinRatio() {
        return winRatio;
    }

    public void setWinRatio(float winRat) {
        if (winRat <= 1 && winRat > 0) {
            this.winRatio = winRatio;
        }
        System.out.println("Unsufficient Win Ratio");
    }
}

public String getColor() {
    return color;
}

public void setColor(String color) {
    this.color = color;
}

public boolean isPromotable() {
    return true;
}

public void setPromotable(boolean promotable) {
    this.promotable = promotable;

public void retired(float retired) {
    this.retired = retired;
}


    public void setBoard(Board board) {
        this.board = board;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public Piece(String name, String color, boolean promotable) {
        setName(name);
        setColor(color);
        setPromotable(promotable);

        }

    }


    public Player(String name, Board board, Chess chess) {
        setName(name);
        setWinRatio(winRatio);
        setBoard(board);
        setChess(chess);
        setRetired(retired);
    }





