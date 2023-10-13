package Java.final_project_java;

    import java.util.*;

public class LaptopStore {
    private Set<Laptop> laptops = new HashSet<>();

    public void addLaptop(Laptop laptop) {
        laptops.add(laptop);
    }

    public void filterAndPrint(Map<String, Object> criteria) {
        List<Laptop> filteredLaptops = new ArrayList<>();

        for (Laptop laptop : laptops) {
            if (meetsCriteria(laptop, criteria)) {
                filteredLaptops.add(laptop);
            }
        }

        if (filteredLaptops.isEmpty()) {
            System.out.println("Ноутбуки не найдены по заданным критериям.");
        } else {
            for (Laptop laptop : filteredLaptops) {
                System.out.println(laptop);
            }
        }
    }

    private boolean meetsCriteria(Laptop laptop, Map<String, Object> criteria) {
        for (Map.Entry<String, Object> entry : criteria.entrySet()) {
            String property = entry.getKey();
            Object value = entry.getValue();

            switch (property) {
                case "color":
                    if (!laptop.getColor().equals(value)) {
                        return false;
                    }
                    break;
                case "ram":
                    if (laptop.getRam() < (int) value) {
                        return false;
                    }
                    break;
                case "hddSize":
                    if (laptop.getHddSize() < (int) value) {
                        return false;
                    }
                    break;
                case "os":
                    if (!laptop.getOs().equals(value)) {
                        return false;
                    }
                    break;
                // Добавьте другие критерии по аналогии
            }
        }

        return true;
    }
}
