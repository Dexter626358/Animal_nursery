package animals;

import java.util.Date;
import java.util.List;

public class Cat extends Pet{
    protected String typeOfFur;

    public Cat(int number, String typeOfAnimal, String nickName, String breed, float weight, String dateOfBirth, String colour, String boosterShot, List<String> commands, String status, String dateOfStatus, String eyeColour, String typeOfFur) {
        super(number, typeOfAnimal, nickName, breed, weight, dateOfBirth, colour, boosterShot, commands, status, dateOfStatus, eyeColour);
        this.typeOfFur = typeOfFur;
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Номер: \t").append(Cat.super.number)
                .append("\nТип: \t").append(Cat.super.typeOfAnimal)
                .append("\nКличка: \t").append(Cat.super.nickName)
                .append("\nПорода: \t").append(Cat.super.breed)
                .append("\nВес: \t").append(Cat.super.weight)
                .append("\nДата рождения: \t").append(Cat.super.dateOfBirth)
                .append("\nОкраска: \t").append(Cat.super.colour)
                .append("\nВакцинация: \t").append(Cat.super.boosterShot)
                .append("\nСтатус: \t").append(Cat.super.status)
                .append("\nДата изменения статуса: \t").append(Cat.super.dateOfStatus)
                .append("\nЦвет глаз: \t").append(Cat.super.eyeColour)
                .append("\nТип шерсти: \t").append(Cat.this.typeOfFur)
                .append("\n");
        return stringBuilder;
    }

    @Override
    public StringBuilder getCommands() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n").append(Cat.super.typeOfAnimal)
                .append(" ").append(Cat.super.nickName)
                .append(" умеет выполнять следующие команды:\n")
                .append(Cat.super.commands.toString(), 1, Cat.super.commands.toString().length()-1)
                .append("\n");
        return stringBuilder;
    }
}
