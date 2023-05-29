package animals;

import java.util.Date;
import java.util.List;

public class Horse extends PackAnimal{
    protected String workingQualities;

    public Horse(int number, String typeOfAnimal, String nickName, String breed, float weight, String dateOfBirth, String colour, Boolean boosterShot, List<String> commands, String status, String dateOfStatus, int maxCarrying, int speed, String workingQualities) {
        super(number, typeOfAnimal, nickName, breed, weight, dateOfBirth, colour, boosterShot, commands, status, dateOfStatus, maxCarrying, speed);
        this.workingQualities = workingQualities;
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Номер: \t").append(Horse.super.number)
                .append("\nТип: \t").append(Horse.super.typeOfAnimal)
                .append("\nКличка: \t").append(Horse.super.nickName)
                .append("\nПорода: \t").append(Horse.super.breed)
                .append("\nВес: \t").append(Horse.super.weight)
                .append("\nДата рождения: \t").append(Horse.super.dateOfBirth)
                .append("\nОкраска: \t").append(Horse.super.colour)
                .append("\nВакцинация: \t").append(Horse.super.boosterShot)
                .append("\nКоманды: \t").append(Horse.super.commands)
                .append("\nСтатус: \t").append(Horse.super.status)
                .append("\nДата изменения статуса: \t").append(Horse.super.dateOfStatus)
                .append("\nГрузоподъемность: \t").append(Horse.super.maxCarrying)
                .append("\nСкорость: \t").append(Horse.super.speed)
                .append("\nРабочие качества: \t").append(Horse.this.workingQualities);
        return stringBuilder;
    }
}
