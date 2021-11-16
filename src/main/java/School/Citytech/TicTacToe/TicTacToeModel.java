package School.Citytech.TicTacToe;

import java.util.Arrays;

public class TicTacToeModel {
    private int[] position;
    private String whoWon;
    private boolean isWinner;

    public int[] getPosition() {
        return position;
    }

    public void setPosition(int[] position) {
        this.position = position;
    }

    public String getWhoWon() {
        return whoWon;
    }

    public void setWhoWon(String whoWon) {
        this.whoWon = whoWon;
    }

    public boolean isWinner() {
        return isWinner;
    }

    public void setWinner(boolean winner) {
        isWinner = winner;
    }

    @Override
    public String toString() {
        return "TicTacToeModel{" +
                "position=" + Arrays.toString(position) +
                ", whoWon='" + whoWon + '\'' +
                ", isWinner=" + isWinner +
                '}';
    }
}
