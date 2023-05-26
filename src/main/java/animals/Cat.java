package animals;

import java.util.Date;
import java.util.List;

public class Cat extends Pet{
    protected String typeOfFur;

    public Cat(int number, String nickName, String breed, float weight, Date dateOfBirth, String colour, Boolean boosterShot, List<String> commands, String eyeColour, String typeOfFur) {
        super(number, nickName, breed, weight, dateOfBirth, colour, boosterShot, commands, eyeColour);
        this.typeOfFur = typeOfFur;
    }
}
