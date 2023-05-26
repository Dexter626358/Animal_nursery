package animals;

import java.util.Date;
import java.util.List;

public class Hamster extends Pet{
    protected String typeHamster;

    public Hamster(int number, String nickName, String breed, float weight, Date dateOfBirth, String colour, Boolean boosterShot, List<String> commands, String eyeColour, String typeHamster) {
        super(number, nickName, breed, weight, dateOfBirth, colour, boosterShot, commands, eyeColour);
        this.typeHamster = typeHamster;
    }
}
