package Java.final_project_java;

public class Laptop {
    private String color; // Цвет
    private int ram; // ОЗУ
    private int hddSize; // Объем жесткого диска
    private String os; // Операционная система

    public Laptop(String color, int ram, int hddSize, String os) {
        this.color = color;
        this.ram = ram;
        this.hddSize = hddSize;
        this.os = os;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHddSize() {
        return hddSize;
    }

    public void setHddSize(int hddSize) {
        this.hddSize = hddSize;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public String toString() {
        return "Цвет: " + color + ", ОЗУ: " + ram + " ГБ, Объем HDD: " + hddSize + " ГБ, Операционная система: " + os;
    }
}