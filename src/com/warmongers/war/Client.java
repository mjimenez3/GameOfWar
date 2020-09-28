package com.warmongers.war;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.stream.Stream;

public class Client{
    public static void main(String[] args) throws IOException {
        Game newGame = new Game();
        newGame.displayBanner();
        try {
            newGame.setupGame(newGame);
        }
        catch (IOException e){
            throw new IOException(e.getMessage());
        }
    }
}