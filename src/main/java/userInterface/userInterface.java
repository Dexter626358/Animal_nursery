package userInterface;

import animals.Animal;
import reester.CreateAnimal;
import reester.closeCounterException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static reester.Checker.isNumeric;

public class userInterface {
    List<Animal> animals = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    CreateAnimal createAnimal = new CreateAnimal();
    public static void Menu(){
        System.out.println("1. Создать животное");
        System.out.println("2. Показать весь список животных");
        System.out.println("3. Показать, список команд, которые умеет выполнять животное");
        System.out.println("4. Тренировать животное");
        System.out.println("5. Выход");

    }

    public void userInput() throws closeCounterException {
        while (true) {
            Menu();
            System.out.println("Выберите желаемое действие: ");
            String userInput = scan.nextLine();
            if (userInput.equals("1")) {
                System.out.println("Создается животное");
                Animal animal = createAnimal.createAnimal();
                if (animal != null) {
                    animals.add(animal);
                    System.out.println(animal.getInfo());
                }
            } else if (userInput.equals("2")) {
                if(!animals.isEmpty()){
                    System.out.println("Вывожу список животных: ");
                    for (Animal item: animals) {
                        System.out.println(item.getInfo());
                    }
                }else {
                    System.out.println("В реестре еще нет животных. Необходимо их завнести");
                }
            } else if (userInput.equals("3")) {
                if(!animals.isEmpty()){
                    System.out.println("Введите id животного: ");
                    String id = scan.nextLine();
                    if(isNumeric(id)){
                        int index = Integer.parseInt(id) - 1;
                        if(index <= animals.size()){
                            System.out.println(animals.get(index).getCommands());
                        }else{
                            System.out.println("Такого id не найдено. Пропробуйте еще раз.");
                        }
                    }else {
                        System.out.println("Необходимо ввести число.");
                    }
                }else {
                    System.out.println("В реестре еще нет животных. Необходимо их завнести");
                }
            } else if (userInput.equals("4")) {
                if(!animals.isEmpty()){
                    System.out.println("Введите id животного: ");
                    String id = scan.nextLine();
                    if(isNumeric(id)){
                        int index = Integer.parseInt(id) - 1;
                        if(index <= animals.size()){
                            System.out.println("Введите команду, которой Вы хотели бы научить животное");
                            String learnCommand = scan.nextLine();
                            List<String> commands = new ArrayList<>(List.of(animals.get(index).getCommands().toString().split(", ")));
                            commands.remove(commands.size()-1);
                            commands.add(learnCommand);
                            animals.get(Integer.parseInt(id) - 1).setCommands(commands);
                            System.out.println("Животное натренированно");
                        }else{
                            System.out.println("Такого id не найдено. Пропробуйте еще раз.");
                        }
                    }else {
                        System.out.println("Необходимо ввести число.");
                    }
                }else {
                    System.out.println("В реестре еще нет животных. Необходимо их завнести");
                }

            } else if (userInput.equals("5")) {
                System.out.println("Выход из программы");
                break;
            } else {
                System.out.println("Введено некорректное значение. Попробуйте снова.");
            }
        }
    }

}
