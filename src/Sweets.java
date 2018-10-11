public abstract class Sweets {
    private int id;
    private String name;
    private double weight;
    private double price;



    public abstract String returnSpecialValues();

    public Sweets() {
    }

    public Sweets(int id, String name, double weight, double price) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String toString() {
        return "****************************"+
                "\nНазвание сладости: " + name +
                "\nВес сладости: " + weight +
                "\nЦена сладости: " + price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
