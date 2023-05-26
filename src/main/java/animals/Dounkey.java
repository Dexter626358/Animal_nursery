package animals;

import java.util.Date;
import java.util.List;

public class Dounkey extends PackAnimal{
    public Dounkey(int number, String nickName, String breed, float weight, Date dateOfBirth, String colour, Boolean boosterShot, List<String> commands, int maxCarrying, int speed) {
        super(number, nickName, breed, weight, dateOfBirth, colour, boosterShot, commands, maxCarrying, speed);
    }
}
