package animals;

import java.util.Date;
import java.util.List;

public class Dog extends Pet{
    protected String groupOfBreed;
    protected String groupOfUsage;

    public Dog(int number, String nickName, String breed, float weight, Date dateOfBirth, String colour, Boolean boosterShot, List<String> commands, String eyeColour, String groupOfBreed, String groupOfUsage) {
        super(number, nickName, breed, weight, dateOfBirth, colour, boosterShot, commands, eyeColour);
        this.groupOfBreed = groupOfBreed;
        this.groupOfUsage = groupOfUsage;
    }
}
