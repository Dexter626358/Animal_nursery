package animals;

import java.util.Date;
import java.util.List;

public abstract class PackAnimal extends Animal{
    protected int maxCarrying;
    protected int speed;

    public PackAnimal(int number, String typeOfAnimal, String nickName, String breed, float weight, String dateOfBirth, String colour, Boolean boosterShot, List<String> commands, String status, String dateOfStatus, int maxCarrying, int speed) {
        super(number, typeOfAnimal, nickName, breed, weight, dateOfBirth, colour, boosterShot, commands, status, dateOfStatus);
        this.maxCarrying = maxCarrying;
        this.speed = speed;
    }
}
