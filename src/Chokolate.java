public class Chokolate extends Sweets {
    String type = "Пористый";

    @Override
    public String returnSpecialValues() {
        return "\nЦвет шоколада: " + type;
    }

    public Chokolate() {
        super(1, "Chokolate", 10.10, 50.35);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
