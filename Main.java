package Java.final_project_java;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        LaptopStore store = new LaptopStore();

        // Добавьте ноутбуки в магазин
        store.addLaptop(new Laptop("серый", 8, 512, "Windows 10"));
        store.addLaptop(new Laptop("белый", 16, 1000, "Windows 10"));
        store.addLaptop(new Laptop("черный", 8, 256, "Linux"));
        store.addLaptop(new Laptop("красный", 32, 1000, "Windows 10"));
        store.addLaptop(new Laptop("серый", 16, 512, "macOS"));

        Scanner scanner = new Scanner(System.in);
        Map<String, Object> filterCriteria = new HashMap<>();

        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Чтобы считать символ новой строки

        switch (choice) {
            case 1:
                System.out.println("Введите минимальное количество ОЗУ:");
                int ram = scanner.nextInt();
                filterCriteria.put("ram", ram);
            case 2:
                System.out.println("Введите минимальный объем жесткого диска:");
                int hddSize = scanner.nextInt();
                filterCriteria.put("hddSize", hddSize);
            case 3:
                System.out.println("Введите операционную систему:");
                String os = scanner.nextLine();
                filterCriteria.put("os", os);
            case 4:
                System.out.println("Введите цвет:");
                String color = scanner.nextLine();
                filterCriteria.put("color", color);
            default:
                break;
        }

        store.filterAndPrint(filterCriteria);

        scanner.close();
    }
}
