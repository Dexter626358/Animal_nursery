package org.example;


import reester.closeCounterException;
import userInterface.userInterface;


public class Main {
    public static void main(String[] args) throws closeCounterException {
        userInterface userInterface = new userInterface();
        userInterface.userInput();
    }
}