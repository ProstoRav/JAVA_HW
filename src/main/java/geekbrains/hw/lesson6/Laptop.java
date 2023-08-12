package geekbrains.hw.lesson6;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Laptop {
    private String manufacturer;
    private String model;
    private Integer releaseYear;
    private String type;
    private Double screenDiagonal;
    private Integer screenResolutionWidth;
    private Integer screenResolutionHeight;
    private Integer screenRefreshRate;
    private String os;
    private String processorManufacturer;
    private String processorModel;
    private Integer numberOfProcessorCores;
    private Integer ram;
    private String memoryType;
    private Integer memoryFrequency;
    private String videoCardType;
    private String builtInVideoCardModel;
    private String discreteVideoCardModel;
    private String videoMemoryType;
    private String storageType;
    private Integer totalSSDCapacity;
    private Integer totalHDDCapacity;
    private String color;
    private Integer price;

    /**
     * @return готовое описание ноутбука с характеристиками
     * @apiNote получаем готовое описание ноутбука с указанием характеристик
     */

    @Override
    public String toString() {
        return "Производитель - " + manufacturer + "\n" +
                "Линейка - " + model + "\n" +
                "Год выпуска - " + releaseYear + "\n" +
                "Тип - " + type + "\n" +
                "Диагональ экрана - " + screenDiagonal + "\"" + "\n" +
                "Разрешение экрана - " + screenResolutionWidth + "x" + screenResolutionHeight + "\n" +
                "Частота обновления экрана - " + screenRefreshRate + "Гц" + "\n" +
                "ОС - " + os + "\n" +
                "Производитель процессора - " + processorManufacturer + "\n" +
                "Модель процессора - " + processorModel + "\n" +
                "Количество ядер процессора - " + numberOfProcessorCores + "\n" +
                "Оперативная память - " + ram + "Гб" + "\n" +
                "Тип памяти - " + memoryType + "\n" +
                "Частота памяти - " + memoryFrequency + "МГц" + "\n" +
                "Тип видеокарты - " + videoCardType + "\n" +
                "Встроенная видеокарта - " + builtInVideoCardModel + "\n" +
                "Дискретная видеокарта - " + discreteVideoCardModel + "\n" +
                "Тип видеопамяти - " + videoMemoryType + "\n" +
                "Хранение данных - " + storageType + "\n" +
                "Объем SSD - " + totalSSDCapacity + "Гб" + "\n" +
                "Объем HDD - " + totalHDDCapacity + "Гб" + "\n" +
                "Цвет - " + color + "\n" +
                "Цена - " + price + "руб." + "\n";
    }
}
