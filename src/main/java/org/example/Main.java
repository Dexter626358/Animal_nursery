package org.example;

import animals.Animal;
import userInterface.userInterface;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //List<Animal> animals = new ArrayList<>();
        userInterface userInterface = new userInterface();
        userInterface.userInput();
    }
}