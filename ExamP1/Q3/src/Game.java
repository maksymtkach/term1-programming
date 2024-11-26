import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

class Board {
    // Board class does not need name, numberOfPlayers, board, piece, winRatio, players, retired, color, promotable attributes
    private Player whitePlayer;
    private Player blackPlayer;
    private Piece[] pieces;

    // Board class does not need Scanner

    // Board constructor is mandatory
    public Board(Player whitePlayer, Player blackPlayer, Piece[] pieces) {
        setWhitePlayer(whitePlayer);
        setBlackPlayer(blackPlayer);
        setPieces(pieces);
    }

    // generated by IDE getters and setters
    public Player getWhitePlayer() {
        return whitePlayer;
    }

    public void setWhitePlayer(Player whitePlayer) {
        this.whitePlayer = whitePlayer;
    }

    public Player getBlackPlayer() {
        return blackPlayer;
    }

    public void setBlackPlayer(Player blackPlayer) {
        this.blackPlayer = blackPlayer;
    }

    public Piece[] getPieces() {
        return pieces;
    }

    public void setPieces(Piece[] pieces) {
        this.pieces = pieces;
    }
}

class Piece {
    private String name;
    private String color;
    private boolean promotable;

    public Piece(String name, String color, boolean promotable) {
        setName(name);
        setColor(color);
        setPromotable(promotable);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isPromotable() {
        return promotable;
    }

    public void setPromotable(boolean promotable) {
        this.promotable = promotable;
    }
}

class Player {
    private String name;
    private int birthYear;
    private float winRatio;
    private boolean retired;

    public Player(String name, int birthYear, float winRatio, boolean isRetired) {
        setName(name);
        setBirthYear(birthYear);
        setWinRatio(winRatio);
        setRetired(isRetired);
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public float getWinRatio() {
        return winRatio;
    }

    public boolean getRetired() {
        return retired;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Players name can not be null or empty");
        }
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setWinRatio(float winRatio) {
        if (winRatio <= 0.0 || winRatio >= 1.0) {
            System.out.println("Invalid win ratio!");
        } else {
            this.winRatio = winRatio;
        }
    }

    public void setRetired(boolean retired) {
        this.retired = retired;
    }

    public boolean play(){
        /* game implementation */
        return true;
    }

    public boolean play(Player player){
        /* game implementation */
        return true;
    }
}





