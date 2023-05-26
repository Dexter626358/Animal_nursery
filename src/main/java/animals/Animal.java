package animals;

import java.util.Date;
import java.util.List;

public abstract class Animal {
    protected int number;
    protected String nickName;
    protected String breed;
    protected float weight;
    protected Date dateOfBirth;
    protected String colour;
    protected Boolean boosterShot;
    protected List<String> commands;
    protected String status;
    protected Date dateOfStatus;

    public Animal(int number, String nickName, String breed, float weight, Date dateOfBirth, String colour, Boolean boosterShot, List<String> commands) {
        this.number = number;
        this.nickName = nickName;
        this.breed = breed;
        this.weight = weight;
        this.dateOfBirth = dateOfBirth;
        this.colour = colour;
        this.boosterShot = boosterShot;
        this.commands = commands;
    }
}
