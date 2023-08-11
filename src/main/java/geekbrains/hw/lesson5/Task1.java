package geekbrains.hw.lesson5;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        String[] workers = new String[]{
                "Иван Иванов",
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыков",
                "Павел Чернов",
                "Петр Чернышов",
                "Мария Федорова",
                "Марина Светлова",
                "Мария Савина",
                "Мария Рыкова",
                "Марина Лугова",
                "Анна Владимирова",
                "Иван Мечников",
                "Петр Петин",
                "Иван Ежов"};
        System.out.println("Искомый список сотрудников: ");
        Arrays.stream(workers).forEach(System.out::println);
        ArrayList<String> workersNames = getNames(workers);
        Map<String, Integer> mapNames = getNamesMap(workersNames);
        printNamesWithRepeats(mapNames);
        printNamesWithRepeatsInDescOrder(mapNames);
    }

    /**
     * @param mapOfNames ассоциативный массив имен
     * @apiNote выводим на экран повторяющиеся элемены ассоциативного массива
     * имен с количеством повторений, отсортированные по убыванию популярности
     */

    private static void printNamesWithRepeatsInDescOrder(Map<String, Integer> mapOfNames) {
        System.out.println();
        System.out.println("Отсортированные имена по убыванию популярности: ");
        ArrayList<Integer> listOfNamesCount = new ArrayList<>();
        for (var item : mapOfNames.entrySet()) {
            if (!listOfNamesCount.contains(item.getValue()))
                listOfNamesCount.add(item.getValue());
        }
        listOfNamesCount.sort(null);
        for (int i = listOfNamesCount.size() - 1; i > -1; i--) {
            for (var item : mapOfNames.entrySet()) {
                if (Objects.equals(listOfNamesCount.get(i), item.getValue()))
                    System.out.printf("%s: %d раз(а) \n", item.getKey(), item.getValue());
            }
        }
    }

    /**
     * @param mapOfNames ассоциативный массив имен
     * @apiNote выводим на экран повторяющиеся элемены ассоциативного массива
     * имен с количеством повторений
     */

    private static void printNamesWithRepeats(Map<String, Integer> mapOfNames) {
        System.out.println();
        System.out.println("Повторяющиеся имена с количеством повторений: ");
        for (var item : mapOfNames.entrySet()) {
            if (item.getValue() > 1)
                System.out.printf("%s: %d раз(а) \n", item.getKey(), item.getValue());
        }
    }

    /**
     * @param listOfNames список имен
     * @return ассоциативный массив имен
     * @apiNote делаем из изначального списка имен ассоциативный массив имен
     */

    private static Map<String, Integer> getNamesMap(ArrayList<String> listOfNames) {
        Map<String, Integer> mapOfNames = new HashMap<>();
        for (int i = 0; i < listOfNames.size(); i++) {
            int count = 1;
            for (String listOfName : listOfNames) {
                if (listOfNames.get(i).equals(listOfName)) count += 1;
            }
            if (!mapOfNames.containsKey(listOfNames.get(i)))
                mapOfNames.put(listOfNames.get(i), count);
        }
        return mapOfNames;
    }

    /**
     * @param listOfNamesAndSurnames список имен и фамилий
     * @return список имен
     * @apiNote делаем из списка имен и фамилий список имен
     */

    private static ArrayList<String> getNames(String[] listOfNamesAndSurnames) {
        ArrayList<String> listOfNames = new ArrayList<>();
        for (String el : listOfNamesAndSurnames) {
            String[] elList = el.split(" ");
            listOfNames.add(elList[0]);
        }
        return listOfNames;
    }
}