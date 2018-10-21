package myprogram;

import java.util.Random;

public class Candy extends Sweets {
    private String[] firms = {"Nestle", "Ириска-пломбовая", "Мишка на севере", "Конфетка без фантика"};

    String getRandomFirm() {
        Random random = new Random();
        int x = random.nextInt(4);
        return firms[x];
    }

    private String firm = "Nestle";
    @Override
    @SweetAnnotation(unique = "Milka")
    public String returnSpecialValues() {
        return "Фирма производителя: " + getRandomFirm();
    }

    public Candy(String name, double weight, double price) {
        super(2,name,weight,price);
    }



    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }
}
