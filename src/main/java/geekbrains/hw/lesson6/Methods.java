package geekbrains.hw.lesson6;

import java.util.*;

public class Methods {

    /**
     * @apiNote выводим главное меню на экран
     */

    public static void mainMenu() {
        int choice = 0;
        Map<Integer, String> findList = new HashMap<>();
        findList.put(1, "Производитель");
        findList.put(2, "Тип ноутбука");
        findList.put(3, "Диагональ экрана");
        findList.put(4, "Операционная система");
        findList.put(5, "Производитель процессора");
        findList.put(6, "Тип видеокарты");
        findList.put(7, "Тип жесткого диска");
        findList.put(8, "Цвет");
        findList.put(9, "Цена");
        findList.put(10, "Выход");
        System.out.println("Выберите параметр для поиска ноутбука:");
        System.out.println();
        while (choice != 10) {
            choice = findChoice(findList);
            filterList(choice);
        }
        System.out.println("До свидания!");
    }

    private static final Scanner scanner = new Scanner(System.in);

    /**
     * @param mapList ассоциативный массив вариантов выбора для пользователя
     * @apiNote выводим на экран ассоциативный массив
     */

    public static void printMapList(Map<Integer, String> mapList) {
        for (Map.Entry<Integer, String> item : mapList.entrySet()) {
            System.out.printf("%d - %s;%n", item.getKey(), item.getValue());
        }
    }

    /**
     * @param mapList ассоциативный массив вариантов выбора для пользователя
     * @return результат выбора пользователя согласно логике
     * @apiNote выводим на экран элементы ассоциативного массива, пользователь выбирает из указанных элементов,
     * возвращаем результат выбора
     */

    private static int findChoice(Map<Integer, String> mapList) {
        int choice = -1;
        printMapList(mapList);
        System.out.println();
        System.out.print("Введите цифру: ");
        while (choice < 1 || choice > mapList.size()) {
            if (scanner.hasNextInt()) choice = scanner.nextInt();
            if (!(choice > 0 && choice < mapList.size() + 1)) {
                System.out.println("Некорректный ввод");
                System.out.print("Введите цифру: ");
                scanner.nextLine();
            }
        }
        System.out.println();
        return choice;
    }

    /**
     * @apiNote выводим выбор перехода в главное меню или завершения программы
     */

    private static void exitOrContinue() {
        Map<Integer, String> findList = new HashMap<>();
        findList.put(1, "Продолжить");
        findList.put(2, "Выход");
        System.out.println("Вы хотите продолжить?");
        int choice = findChoice(findList);
        if (choice == 1) {
            mainMenu();
        }
        if (choice == 2) {
            System.out.println("До свидания!");
            System.exit(0);
        }
    }

    /**
     * @param choice изначальный выбор меню пользователя
     * @apiNote возвращаем
     */

    private static void filterList(Integer choice) {
        int count = 1;
        Map<Integer, String> findList = new HashMap<>();
        switch (choice) {
            case (1) -> {
                for (Laptop el : Database.laptopList) {
                    if (!findList.containsValue(el.getManufacturer())) {
                        findList.put(count, el.getManufacturer());
                        count++;
                    }
                }
                choice = findChoice(findList);
                for (Laptop el : Database.laptopList) {
                    if (el.getManufacturer().equals(findList.get(choice))) {
                        System.out.println(el);
                    }
                }
                exitOrContinue();
            }
            case (2) -> {
                for (Laptop el : Database.laptopList) {
                    if (!findList.containsValue(el.getType())) {
                        findList.put(count, el.getType());
                        count++;
                    }
                }
                choice = findChoice(findList);
                for (Laptop el : Database.laptopList) {
                    if (el.getType().equals(findList.get(choice))) {
                        System.out.println(el);
                    }
                }
                exitOrContinue();
            }
            case (3) -> {
                for (Laptop el : Database.laptopList) {
                    if (!findList.containsValue(el.getScreenDiagonal().toString())) {
                        findList.put(count, el.getScreenDiagonal().toString());
                        count++;
                    }
                }
                choice = findChoice(findList);
                for (Laptop el : Database.laptopList) {
                    if (el.getScreenDiagonal().toString().equals(findList.get(choice))) {
                        System.out.println(el);
                    }
                }
                exitOrContinue();
            }
            case (4) -> {
                for (Laptop el : Database.laptopList) {
                    if (!findList.containsValue(el.getOs())) {
                        findList.put(count, el.getOs());
                        count++;
                    }
                }
                choice = findChoice(findList);
                for (Laptop el : Database.laptopList) {
                    if (el.getOs().equals(findList.get(choice))) {
                        System.out.println(el);
                    }
                }
                exitOrContinue();
            }
            case (5) -> {
                for (Laptop el : Database.laptopList) {
                    if (!findList.containsValue(el.getProcessorManufacturer())) {
                        findList.put(count, el.getProcessorManufacturer());
                        count++;
                    }
                }
                choice = findChoice(findList);
                for (Laptop el : Database.laptopList) {
                    if (el.getProcessorManufacturer().equals(findList.get(choice))) {
                        System.out.println(el);
                    }
                }
                exitOrContinue();
            }
            case (6) -> {
                for (Laptop el : Database.laptopList) {
                    if (!findList.containsValue(el.getVideoCardType())) {
                        findList.put(count, el.getVideoCardType());
                        count++;
                    }
                }
                choice = findChoice(findList);
                for (Laptop el : Database.laptopList) {
                    if (el.getVideoCardType().equals(findList.get(choice))) {
                        System.out.println(el);
                    }
                }
                exitOrContinue();
            }
            case (7) -> {
                for (Laptop el : Database.laptopList) {
                    if (!findList.containsValue(el.getStorageType())) {
                        findList.put(count, el.getStorageType());
                        count++;
                    }
                }
                choice = findChoice(findList);
                for (Laptop el : Database.laptopList) {
                    if (el.getStorageType().equals(findList.get(choice))) {
                        System.out.println(el);
                    }
                }
                exitOrContinue();
            }
            case (8) -> {
                for (Laptop el : Database.laptopList) {
                    if (!findList.containsValue(el.getColor())) {
                        findList.put(count, el.getColor());
                        count++;
                    }
                }
                choice = findChoice(findList);
                for (Laptop el : Database.laptopList) {
                    if (el.getColor().equals(findList.get(choice))) {
                        System.out.println(el);
                    }
                }
                exitOrContinue();
            }
            case (9) -> {
                for (Laptop el : Database.laptopList) {
                    if (!findList.containsValue(el.getPrice().toString())) {
                        findList.put(count, el.getPrice().toString());
                        count++;
                    }
                }
                choice = findChoice(findList);
                for (Laptop el : Database.laptopList) {
                    if (el.getPrice().toString().equals(findList.get(choice))) {
                        System.out.println(el);
                    }
                }
                exitOrContinue();
            }
        }
    }
}
