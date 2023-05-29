package animals;

import java.util.List;

public class Camel extends PackAnimal{
    protected int numberOfHumps;

    public Camel(int number, String typeOfAnimal, String nickName, String breed, float weight, String dateOfBirth, String colour, Boolean boosterShot, List<String> commands, String status, String dateOfStatus, int maxCarrying, int speed, int numberOfHumps) {
        super(number, typeOfAnimal, nickName, breed, weight, dateOfBirth, colour, boosterShot, commands, status, dateOfStatus, maxCarrying, speed);
        this.numberOfHumps = numberOfHumps;
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Номер: \t").append(Camel.super.number)
                .append("\nТип: \t").append(Camel.super.typeOfAnimal)
                .append("\nКличка: \t").append(Camel.super.nickName)
                .append("\nПорода: \t").append(Camel.super.breed)
                .append("\nВес: \t").append(Camel.super.weight)
                .append("\nДата рождения: \t").append(Camel.super.dateOfBirth)
                .append("\nОкраска: \t").append(Camel.super.colour)
                .append("\nВакцинация: \t").append(Camel.super.boosterShot)
                .append("\nКоманды: \t").append(Camel.super.commands)
                .append("\nСтатус: \t").append(Camel.super.status)
                .append("\nДата изменения статуса: \t").append(Camel.super.dateOfStatus)
                .append("\nГрузоподъемность: \t").append(Camel.super.maxCarrying)
                .append("\nСкорость: \t").append(Camel.super.speed)
                .append("\nКоличество горбов: \t").append(Camel.this.numberOfHumps);
        return stringBuilder;
    }
}
