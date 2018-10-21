package myprogram;

import java.util.Random;

public class Chokolate extends Sweets {
    private String[] types = {"Горький", "Очень горький", "Молочный", "Настоящий (100%)"};

    String getRandomTypes() {
        Random random = new Random();
        int x = random.nextInt(4);
        return types[x];
    }

    String type = "Пористый";

    @Override
    @SweetAnnotation(unique = "Белый")
    public String returnSpecialValues() {
        return "Тип шоколада: " + getRandomTypes();
    }

    public Chokolate(String name, double weight, double price) {
        super(1, name, weight, price);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
