package reester;
import animals.*;
import java.util.*;

import static reester.Checker.*;


public class CreateAnimal {
    protected int number;

    Scanner scan = new Scanner(System.in);
    Counter counter = new Counter();


    public Animal createAnimal() throws closeCounterException {
        int maxCarrying, numberOfHumps, speed;
        float weight;
        String nickName, breed, dateOfBirth, colour, skills, status, dateOfStatus;
        String eyeColour, typeOfFur, groupOfBreed, groupOfUsage, typeHamster, workingQualities, boosterShot;
        Animal animal = null;

        System.out.println("Введите название животного, котороое необходимо создать: ");
        String animalName = scan.nextLine().toLowerCase();
        if (animalName.equals("верблюд") || animalName.equals("кошка") || animalName.equals("собака") || animalName.equals("осел") || animalName.equals("лошадь") || animalName.equals("хомяк")) {
            counter.add();
            number = counter.getCounter();
            System.out.println("Введите кличку животного: ");
            nickName = scan.nextLine();
            //nickName = "Мурка";
            System.out.println("Введите породу животного: ");
            breed = scan.nextLine();
            //breed = "Неизвестна";
            while (true) {
                System.out.println("Введите вес животного в кг: ");
                String weightLine = scan.nextLine();
                if (isFloat(weightLine)) {
                    weight = Float.parseFloat(weightLine);
                    break;
                } else {
                    System.out.println("Необходимо ввести число");
                }
                //weight = 45;
            }
            while (true){
                System.out.println("Введите дату рождения животного в формате ГГГГ-MM-ДД: ");
                String date = scan.nextLine();
                if(isValidData(date)){
                    dateOfBirth = date;
                    break;
                } else{
                    System.out.println("Неверный формат даты.");
                }
            }
            //dateOfBirth = "12.04.2023";
            System.out.println("Введите окрас животного: ");
            colour = scan.nextLine();
            //colour = "Серый";
            System.out.println("Введите данные о вакцинации да\\нет: ");
            boosterShot = scan.nextLine().toLowerCase();
            System.out.println("Введите через пробел команды, которые умеет выполнять животное: ");
            skills = scan.nextLine();
            //skills = "прыгать бегать скакать рысь галоп сидеть";
            List<String> commands = List.of(skills.split(" "));
            System.out.println("Введите статус животного в питомнике(свободен/зарезервирован/продан/перемещен): ");
            status = scan.nextLine();
            //status = "Свободен";
            while (true){
                System.out.println("Введите дату изменения статуса в формате ГГГГ-MM-ДД: ");
                String date = scan.nextLine();
                if(isValidData(date)){
                    dateOfStatus = date;
                    break;
                } else{
                    System.out.println("Неверный формат даты.");
                }
            }
            //dateOfStatus = "12.06.2022";
            switch (animalName) {
                case "верблюд" -> {
                    while (true){
                        System.out.println("Введите количество горбов у верблюда: ");
                        String humps = scan.nextLine();
                        if(isNumeric(humps)){
                            numberOfHumps = Integer.parseInt(humps);
                            break;
                        }else{
                            System.out.println("Необходимо ввести число");
                        }
                    }
                    while (true){
                        System.out.println("Введите максимальную грузоподьемность верблюда в кг: ");
                        String carrying = scan.nextLine();
                        if(isNumeric(carrying)){
                            maxCarrying = Integer.parseInt(carrying);
                            break;
                        }else {
                            System.out.println("Необходимо ввести целое число");
                        }
                    }

                    while (true){
                        System.out.println("Введите скорость предвижения верблюда в км: ");
                        String speedCamel = scan.nextLine();
                        if(isNumeric(speedCamel)){
                            speed = Integer.parseInt(speedCamel);
                            break;
                        }else {
                            System.out.println("Необходимо ввести целое число");
                        }
                    }
                    animal = new Camel(number, animalName, nickName, breed, weight, dateOfBirth, colour, boosterShot, commands, status, dateOfStatus, maxCarrying, speed, numberOfHumps);
                }
                case "кошка" -> {
                    System.out.println("Введите тип шерсти у кошки(гладкошерстная, короткошерстная, дляииношерстная, лысая): ");
                    typeOfFur = scan.nextLine();
                    //typeOfFur = "Рыжая";
                    System.out.println("Введите цвет глаз кошки: ");
                    eyeColour = scan.nextLine();
                    //eyeColour = "Зеленый";
                    animal = new Cat(number, animalName, nickName, breed, weight, dateOfBirth, colour, boosterShot, commands, status, dateOfStatus, eyeColour, typeOfFur);
                }
                case "собака" -> {
                    System.out.println("Введите группу пород: ");
                    groupOfBreed = scan.nextLine();
                    //groupOfBreed = "Терьеры";
                    System.out.println("Введите группу использования: ");
                    groupOfUsage = scan.nextLine();
                    //groupOfUsage = "Компаньоны";
                    System.out.println("Введите цвет глаз собаки: ");
                    eyeColour = scan.nextLine();
                    //eyeColour = "Зеленый";
                    animal = new Dog(number, animalName, nickName, breed, weight, dateOfBirth, colour, boosterShot, commands, status, dateOfStatus, eyeColour, groupOfBreed, groupOfUsage);
                }
                case "осел" -> {
                    while (true) {
                        System.out.println("Введите максимальную грузоподьемность осла в кг: ");
                        String carrying = scan.nextLine();
                        if (isNumeric(carrying)) {
                            maxCarrying = Integer.parseInt(carrying);
                            break;
                        } else {
                            System.out.println("Необходимо ввести целое число");
                        }
                    }

                    while (true) {
                        System.out.println("Введите скорость предвижения осла в км: ");
                        String speedCamel = scan.nextLine();
                        if (isNumeric(speedCamel)) {
                            speed = Integer.parseInt(speedCamel);
                            break;
                        } else {
                            System.out.println("Необходимо ввести целое число");
                        }
                    }
                    animal = new Dounkey(number, animalName, nickName, breed, weight, dateOfBirth, colour, boosterShot, commands, status, dateOfStatus, maxCarrying, speed);
                }

                case "хомяк" -> {
                    System.out.println("Введите цвет глаз хомяка: ");
                    eyeColour = scan.nextLine();
                    //eyeColour = "Серый";
                    System.out.println("Введите тип хомяка: ");
                    typeHamster = scan.nextLine();
                    //typeHamster = "Джунгарик";
                    animal = new Hamster(number, animalName, nickName, breed, weight, dateOfBirth, colour, boosterShot, commands, status, dateOfStatus, eyeColour, typeHamster);
                }
                case "лошадь" -> {
                    while (true) {
                        System.out.println("Введите максимальную грузоподьемность лошади в кг: ");
                        String carrying = scan.nextLine();
                        if (isNumeric(carrying)) {
                            maxCarrying = Integer.parseInt(carrying);
                            break;
                        } else {
                            System.out.println("Необходимо ввести целое число");
                        }
                    }

                    while (true) {
                        System.out.println("Введите скорость предвижения лошади в км: ");
                        String speedCamel = scan.nextLine();
                        if (isNumeric(speedCamel)) {
                            speed = Integer.parseInt(speedCamel);
                            break;
                        } else {
                            System.out.println("Необходимо ввести целое число");
                        }
                    }
                    System.out.println("Введите рабочие качетсва лошади: ");
                    workingQualities = scan.nextLine();
                    //workingQualities = "Скаковая";
                    animal = new Horse(number, animalName, nickName, breed, weight, dateOfBirth, colour, boosterShot, commands, status, dateOfStatus, maxCarrying, speed, workingQualities);
                }
                default ->
                        System.out.println("Я не умею создавать таких животных. Я могу создать следующие типы животных: верблюд, кошка, собака, осел, лошадь, хомяк. Попробуйте снова. ");
            }
        } else {
            System.out.println("Я не умею создавать таких животных. Я могу создать следующие типы животных: верблюд, кошка, собака, осел, лошадь, хомяк. Попробуйте снова. ");
        }
        return animal;
    }
}
