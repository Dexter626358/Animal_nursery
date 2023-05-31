package animals;

import java.util.Date;
import java.util.List;

public abstract class Animal implements printAnimal {
    protected int number;
    protected String typeOfAnimal;
    protected String nickName;
    protected String breed;
    protected float weight;
    protected String dateOfBirth;
    protected String colour;
    protected String boosterShot;
    protected List<String> commands;
    protected String status;
    protected String dateOfStatus;

    public Animal(int number, String typeOfAnimal, String nickName, String breed, float weight, String dateOfBirth, String colour, String boosterShot, List<String> commands, String status, String dateOfStatus) {
        this.number = number;
        this.typeOfAnimal = typeOfAnimal;
        this.nickName = nickName;
        this.breed = breed;
        this.weight = weight;
        this.dateOfBirth = dateOfBirth;
        this.colour = colour;
        this.boosterShot = boosterShot;
        this.commands = commands;
        this.status = status;
        this.dateOfStatus = dateOfStatus;
    }

    public void setCommands(List<String> commands) {
        this.commands = commands;
    }

    public int getNumber() {
        return number;
    }
}
