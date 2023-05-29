package animals;

import java.util.Date;
import java.util.List;

public class Dog extends Pet{
    protected String groupOfBreed;
    protected String groupOfUsage;

    public Dog(int number, String typeOfAnimal, String nickName, String breed, float weight, String dateOfBirth, String colour, Boolean boosterShot, List<String> commands, String status, String dateOfStatus, String eyeColour, String groupOfBreed, String groupOfUsage) {
        super(number, typeOfAnimal, nickName, breed, weight, dateOfBirth, colour, boosterShot, commands, status, dateOfStatus, eyeColour);
        this.groupOfBreed = groupOfBreed;
        this.groupOfUsage = groupOfUsage;
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Номер: \t").append(Dog.super.number)
                .append("\nТип: \t").append(Dog.super.typeOfAnimal)
                .append("\nКличка: \t").append(Dog.super.nickName)
                .append("\nПорода: \t").append(Dog.super.breed)
                .append("\nВес: \t").append(Dog.super.weight)
                .append("\nДата рождения: \t").append(Dog.super.dateOfBirth)
                .append("\nОкраска: \t").append(Dog.super.colour)
                .append("\nВакцинация: \t").append(Dog.super.boosterShot)
                .append("\nКоманды: \t").append(Dog.super.commands)
                .append("\nСтатус: \t").append(Dog.super.status)
                .append("\nДата изменения статуса: \t").append(Dog.super.dateOfStatus)
                .append("\nПорода: \t").append(Dog.this.groupOfBreed)
                .append("\nГруппа использования: \t").append(Dog.this.groupOfUsage);
        return stringBuilder;
    }
}
