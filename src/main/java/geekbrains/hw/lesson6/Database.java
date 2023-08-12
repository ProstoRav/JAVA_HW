package geekbrains.hw.lesson6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Database {
    static Laptop laptop1 = new Laptop("Apple", "Macbook Air", 2022, "Laptop",
            13.6, 2560, 1664, 60, "macOS",
            "Apple", "M2", 8, 8,
            "LPDDR5", 6400, "Built-in", "Apple graphics 8-core",
            "-", "SMA", "SSD", 256, 0,
            "Silver", 130000);
    static Laptop laptop2 = new Laptop("HUAWEI", "MateBook D 14", 2021, "Laptop",
            14.0, 1920, 1080, 60, "Windows 11 Home",
            "Intel", "Intel Core i5 1135G7", 4, 8,
            "DDR4", 3200, "Built-in", "Intel Iris Xe Graphics",
            "-", "SMA", "SSD", 512, 0,
            "Black", 130000);
    static Laptop laptop3 = new Laptop("Acer", "Nitro 5", 2022, "Gaming laptop",
            15.6, 1920, 1080, 240,
            "Windows 11 Professional", "AMD", "Ryzen 9 5900HX", 8,
            32, "DDR5", 3600, "Discrete and Built-in", "AMD Radeon™ Graphics",
            "nVidia GeForce RTX 3080", "GDDR6", "SSD/HDD", 1000,
            4000, "Black", 262005);
    static Laptop laptop4 = new Laptop("Lenovo", "Thinkpad T495", 2018, "Laptop",
            14.0, 1920, 1080, 60, "Windows 10 Professional",
            "AMD", "Ryzen 5 PRO 3500U", 4, 8,
            "DDR4", 3200, "Built-in", "AMD Radeon RX Vega 8",
            "-", "SMA", "SSD/HDD", 256, 32,
            "Black", 49357);
    static Laptop laptop5 = new Laptop("Samsung", "Galaxy book 360 NP950", 2019, "Laptop/Tablet",
            15.6, 1920, 1080, 60, "Windows 10 Home",
            "Intel", "Intel Core i7 1165G7", 4, 8,
            "DDR4", 3200, "Built-in", "Intel Iris Xe Graphics",
            "-", "SMA", "SSD", 512, 0,
            "Black", 150000);

    public static List<Laptop> laptopList = new ArrayList<>(Arrays.asList(laptop1, laptop2, laptop3, laptop4, laptop5));
}