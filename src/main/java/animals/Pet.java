package animals;

import java.util.Date;
import java.util.List;

public abstract class Pet extends Animal{
    protected String eyeColour;

    public Pet(int number, String typeOfAnimal, String nickName, String breed, float weight, String dateOfBirth, String colour, String boosterShot, List<String> commands, String status, String dateOfStatus, String eyeColour) {
        super(number, typeOfAnimal, nickName, breed, weight, dateOfBirth, colour, boosterShot, commands, status, dateOfStatus);
        this.eyeColour = eyeColour;
    }
}
