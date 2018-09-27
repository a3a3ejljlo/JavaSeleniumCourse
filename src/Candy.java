public class Candy extends Sweets {
    private String firm = "Nestle";

    @Override
    public String returnSpecialValues() {
        return "\nФирма производителя: " + firm;
    }

    public Candy() {
        super(2, "Candy", 200.10, 34.12);
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }
}
