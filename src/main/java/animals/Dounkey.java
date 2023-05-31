package animals;

import java.util.Date;
import java.util.List;

public class Dounkey extends PackAnimal{
    public Dounkey(int number, String typeOfAnimal, String nickName, String breed, float weight, String dateOfBirth, String colour, String  boosterShot, List<String> commands, String status, String dateOfStatus, int maxCarrying, int speed) {
        super(number, typeOfAnimal, nickName, breed, weight, dateOfBirth, colour, boosterShot, commands, status, dateOfStatus, maxCarrying, speed);
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Номер: \t").append(Dounkey.super.number)
                .append("\nТип: \t").append(Dounkey.super.typeOfAnimal)
                .append("\nКличка: \t").append(Dounkey.super.nickName)
                .append("\nПорода: \t").append(Dounkey.super.breed)
                .append("\nВес: \t").append(Dounkey.super.weight)
                .append("\nДата рождения: \t").append(Dounkey.super.dateOfBirth)
                .append("\nОкраска: \t").append(Dounkey.super.colour)
                .append("\nВакцинация: \t").append(Dounkey.super.boosterShot)
                .append("\nСтатус: \t").append(Dounkey.super.status)
                .append("\nДата изменения статуса: \t").append(Dounkey.super.dateOfStatus)
                .append("\nГрузоподъемность: \t").append(Dounkey.super.maxCarrying)
                .append("\nСкорость: \t").append(Dounkey.super.speed)
                .append("\n");
        return stringBuilder;
    }

    @Override
    public StringBuilder getCommands() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n").append(Dounkey.super.typeOfAnimal)
                .append(" ").append(Dounkey.super.nickName)
                .append(" умеет выполнять следующие команды:\n")
                .append(Dounkey.super.commands.toString(), 1, Dounkey.super.commands.toString().length()-1)
                .append("\n");
        return stringBuilder;
    }
}
