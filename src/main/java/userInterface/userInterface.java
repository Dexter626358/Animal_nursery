package userInterface;

import animals.Animal;
import reester.Counter;
import reester.CreateAnimal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class userInterface {
    List<Animal> animals = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    public static void Menu(){
        System.out.println("1. Создать животное");
        System.out.println("2. Изменить данные животного");
        System.out.println("3. Прочитать список команд, которые выполняет животное");
        System.out.println("4. Редактировать список команд, которые выполняет животное");
        System.out.println("5. Выход");

    }

    public void userInput() {
        while (true) {
            Menu();
            System.out.println("Выберите желаемое действие: ");
            String userInput = scan.nextLine();
            if (userInput.equals("1")) {
                System.out.println("Создается животное");
                CreateAnimal createAnimal = new CreateAnimal();
                Animal animal = createAnimal.createAnimal();
                if (animal != null) {
                    animals.add(animal);
                    System.out.println(animal.getInfo());
                }
            } else if (userInput.equals("2")) {
                System.out.println("Редактирование животного");
            } else if (userInput.equals("3")) {
                System.out.println("Вывод списка команд животного");
            } else if (userInput.equals("4")) {
                System.out.println("Обучить животное новым командам");
            } else if (userInput.equals("5")) {
                System.out.println("Выход из программы");
                break;
            } else {
                System.out.println("Введено некорректное значение. Попробуйте снова.");
            }
        }
    }

}
