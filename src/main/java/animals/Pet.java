package animals;

import java.util.Date;
import java.util.List;

public abstract class Pet extends Animal{
    protected String eyeColour;

    public Pet(int number, String nickName, String breed, float weight, Date dateOfBirth, String colour, Boolean boosterShot, List<String> commands, String eyeColour) {
        super(number, nickName, breed, weight, dateOfBirth, colour, boosterShot, commands);
        this.eyeColour = eyeColour;
    }
}
