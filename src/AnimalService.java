import java.util.*;

public class AnimalService {
    public static void main(String[] args) {
        try (Counter counter = new Counter()) {
            Scanner scanner = new Scanner(System.in);
            List<Animal> animals = new ArrayList<>();

            while (true) {
                System.out.println("-----------------Меню-----------------");
                System.out.println("1. Завести новое животное");
                System.out.println("2. Показать список команд для животного");
                System.out.println("3. Обучить животное новой команде");
                System.out.println("4. Выход");
                System.out.println("-------------Выберите пункт----------");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Считываем символ новой строки после ввода числа

                switch (choice) {
                    case 1:
                        System.out.println("Введите тип животного (кот, собака и т.д.):");
                        String type = scanner.nextLine();
                        System.out.println("Введите кличку животного:");
                        String name = scanner.nextLine();

                        Animal animal = new Animal(name, type);
                        animals.add(animal);
                        counter.add(); // Увеличиваем счетчик при создании нового животного
                        System.out.println(type + " " + name + " добавлен в реестр.");
                        break;
                    case 2:
                        System.out.println("Введите кличку животного для показа списка команд:");
                        String animalName = scanner.nextLine();
                        for (Animal a : animals) {
                            if (a.name.equalsIgnoreCase(animalName)) {
                                a.listCommands();
                                break;
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Введите кличку животного для обучения новой команде:");
                        String petName = scanner.nextLine();
                        for (Animal a : animals) {
                            if (a.name.equalsIgnoreCase(petName)) {
                                System.out.println("Введите новую команду:");
                                String newCommand = scanner.nextLine();
                                a.teachCommand(newCommand);
                                break;
                            }
                        }
                        break;
                    case 4:
                        System.out.println("Выход из программы.");
                        System.exit(0);
                    default:
                        System.out.println("Неверный ввод. Пожалуйста, выберите допустимый пункт из меню.");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
