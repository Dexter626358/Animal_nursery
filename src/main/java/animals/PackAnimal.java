package animals;

import java.util.Date;
import java.util.List;

public abstract class PackAnimal extends Animal{
    protected int maxCarrying;
    protected int speed;

    public PackAnimal(int number, String nickName, String breed, float weight, Date dateOfBirth, String colour, Boolean boosterShot, List<String> commands, int maxCarrying, int speed) {
        super(number, nickName, breed, weight, dateOfBirth, colour, boosterShot, commands);
        this.maxCarrying = maxCarrying;
        this.speed = speed;
    }
}
