package animals;

import java.util.Date;
import java.util.List;

public class Horse extends PackAnimal{
    protected String workingQualities;

    public Horse(int number, String nickName, String breed, float weight, Date dateOfBirth, String colour, Boolean boosterShot, List<String> commands, int maxCarrying, int speed, String workingQualities) {
        super(number, nickName, breed, weight, dateOfBirth, colour, boosterShot, commands, maxCarrying, speed);
        this.workingQualities = workingQualities;
    }
}
