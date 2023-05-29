package reester;

import animals.*;


import java.util.*;


public class CreateAnimal {
    protected int number;



    public Animal createAnimal(){
        int maxCarrying, numberOfHumps, speed;
        float weight;
        String nickName, breed, dateOfBirth, colour,  vaccination, skills, status, dateOfStatus;
        String eyeColour, typeOfFur, groupOfBreed, groupOfUsage, typeHamster, workingQualities;
        Boolean boosterShot;
        Animal animal = null;
        Scanner scan = new Scanner(System.in);
        Counter counter = new Counter();
        System.out.println("Введите название животного, котороое необходимо создать: ");
        String animalName = scan.nextLine().toLowerCase();
        if (animalName.equals("верблюд") || animalName.equals("кошка") ||  animalName.equals("собака") || animalName.equals("осел") || animalName.equals("лошадь") || animalName.equals("хомяк")) {
            counter.add();
            number = counter.getCount();
            System.out.println("Введите кличку животного: ");
            nickName = scan.nextLine();
            System.out.println("Введите породу животного: ");
            breed = scan.nextLine();
            System.out.println("Введите вес животного в кг: ");
            String weightLine = scan.nextLine();
            weight = Float.parseFloat(weightLine);
            System.out.println("Введите дату рождения животного в формате ДД.ММ.ГГГГ: ");
            dateOfBirth = scan.nextLine();
            System.out.println("Введите окрас животного: ");
            colour = scan.nextLine();
            System.out.println("Введите данные о вакцинации да\\нет: ");
            vaccination = scan.nextLine().toLowerCase();
            if (vaccination.equals("да")) {
                boosterShot = true;
            } else {
                boosterShot = false;
            }
            System.out.println("Введите через пробел команды, которые умеет выполнять животное: ");
            skills = scan.nextLine();
            List<String> commands = List.of(skills.split(" "));
            System.out.println("Введите статус животного в питомнике(свободен/зарезервирован/продан/перемещен): ");
            status = scan.nextLine();
            System.out.println("Введите дату изменения статуса в формате ДД.ММ.ГГГГ: ");
            dateOfStatus = scan.nextLine();
            switch (animalName) {
                case "верблюд":
                    System.out.println("Введите количество горбов у верблюда: ");
                    numberOfHumps = scan.nextInt();
                    System.out.println("Введите максимальную грузоподьемность верблюда в кг: ");
                    maxCarrying = scan.nextInt();
                    System.out.println("Введите скорость предвижения верблюда в км: ");
                    speed = scan.nextInt();
                    animal = new Camel(number, animalName, nickName, breed, weight, dateOfBirth, colour, boosterShot, commands, status, dateOfStatus, maxCarrying, speed, numberOfHumps);
                    break;
                case "кошка":
                    System.out.println("Введите тип шерсти у кошки(гладкошерстная, короткошерстная, дляииношерстная, лысая): ");
                    typeOfFur = scan.nextLine();
                    System.out.println("Введите цвет глаз кошки: ");
                    eyeColour = scan.nextLine();
                    animal = new Cat(number, animalName, nickName, breed, weight, dateOfBirth, colour, boosterShot, commands, status, dateOfStatus, eyeColour, typeOfFur);
                    break;
                case "собака":
                    System.out.println("Введите группу пород: ");
                    groupOfBreed = scan.nextLine();
                    System.out.println("Введите группу использования: ");
                    groupOfUsage = scan.nextLine();
                    System.out.println("Введите цвет глаз собаки: ");
                    eyeColour = scan.nextLine();
                    animal = new Dog(number, animalName, nickName, breed, weight, dateOfBirth, colour, boosterShot, commands, status, dateOfStatus, eyeColour, groupOfBreed, groupOfUsage);
                    break;
                case "осел":
                    System.out.println("Введите максимальную грузоподьемность осла в кг: ");
                    maxCarrying = scan.nextInt();
                    System.out.println("Введите скорость предвижения осла в км: ");
                    speed = scan.nextInt();
                    animal = new Dounkey(number, animalName, nickName, breed, weight, dateOfBirth, colour, boosterShot, commands, status, dateOfStatus, maxCarrying, speed);
                    break;
                case "хомяк":
                    System.out.println("Введите цвет глаз хомяка: ");
                    eyeColour = scan.nextLine();
                    System.out.println("Введите тип хомяка: ");
                    typeHamster = scan.nextLine();
                    animal = new Hamster(number, animalName, nickName, breed, weight, dateOfBirth, colour, boosterShot, commands, status, dateOfStatus, eyeColour, typeHamster);
                    break;
                case "лошадь":
                    System.out.println("Введите максимальную грузоподьемность лошади в кг: ");
                    String maxCarryingLine = scan.nextLine();
                    maxCarrying = Integer.parseInt(maxCarryingLine);
                    System.out.println("Введите скорость предвижения лошади в км: ");
                    String speedLine = scan.nextLine();
                    speed = Integer.parseInt(speedLine);
                    System.out.println("Введите рабочие качетсва лошади: ");
                    workingQualities = scan.nextLine();
                    animal = new Horse(number, animalName, nickName, breed, weight, dateOfBirth, colour, boosterShot, commands, status, dateOfStatus, maxCarrying, speed, workingQualities);
                    break;
                default:
                    System.out.println("Я не умею создавать таких животных. Я могу создать следующие типы животных: верблюд, кошка, собака, осел, лошадь, хомяк. Попробуйте снова. ");
                    break;
            }
        }else{
            System.out.println("Я не умею создавать таких животных. Я могу создать следующие типы животных: верблюд, кошка, собака, осел, лошадь, хомяк. Попробуйте снова. ");
        }
        return animal;
    }
}
