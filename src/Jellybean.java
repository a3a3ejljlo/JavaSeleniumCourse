public class Jellybean extends Sweets{
    String form = "Квадрат";

    @Override
    public String returnSpecialValues() {
        return "\nФорма желе: " + form;
    }

    public Jellybean() {
        super(3, "Jellybean", 0.12, 2.4);
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }
}
