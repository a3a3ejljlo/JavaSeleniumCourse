import java.util.Random;

public class Chokolate extends Sweets {
    private String[] types = {"Горький", "Очень горький", "Молочный", "Настоящий (100%)"};

    public String getRandomTypes() {
        Random random = new Random();
        int x = random.nextInt(4);
        return types[x];
    }

    String type = "Пористый";

    String quality = "HMMMM";

    @SweetAnnotation()
    public String getQuality() {
        return quality;
    }

    @SweetAnnotation()
    public void setQuality(String quality) {
        this.quality = quality;
    }

    @Override
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
