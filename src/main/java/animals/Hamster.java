package animals;

import java.util.Date;
import java.util.List;

public class Hamster extends Pet{
    protected String typeHamster;

    public Hamster(int number, String typeOfAnimal, String nickName, String breed, float weight, String dateOfBirth, String colour, Boolean boosterShot, List<String> commands, String status, String dateOfStatus, String eyeColour, String typeHamster) {
        super(number, typeOfAnimal, nickName, breed, weight, dateOfBirth, colour, boosterShot, commands, status, dateOfStatus, eyeColour);
        this.typeHamster = typeHamster;
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Номер: \t").append(Hamster.super.number)
                .append("\nТип: \t").append(Hamster.super.typeOfAnimal)
                .append("\nКличка: \t").append(Hamster.super.nickName)
                .append("\nПорода: \t").append(Hamster.super.breed)
                .append("\nВес: \t").append(Hamster.super.weight)
                .append("\nДата рождения: \t").append(Hamster.super.dateOfBirth)
                .append("\nОкраска: \t").append(Hamster.super.colour)
                .append("\nВакцинация: \t").append(Hamster.super.boosterShot)
                .append("\nКоманды: \t").append(Hamster.super.commands)
                .append("\nСтатус: \t").append(Hamster.super.status)
                .append("\nДата изменения статуса: \t").append(Hamster.super.dateOfStatus)
                .append("\nЦвет глаз: \t").append(Hamster.super.eyeColour)
                .append("\nВид хомяка: \t").append(Hamster.this.typeHamster);
        return stringBuilder;
    }
}
