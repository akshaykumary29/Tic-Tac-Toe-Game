package com.bridgelabz.tictactoegame;

public class TicTacToeGame {
    public static void main(String[] args) {
        System.out.println("Welcome to Tic-Tac-Toe Game!!!");
        createBoard();
    }

    // Creating empty tic-tac-toe board
    public static void createBoard() {
        char[] board = new char[10];

        // initialize an array
        for (int i = 1; i < board.length; i++) {
            board[i] = ' ';
        }
    }
}
