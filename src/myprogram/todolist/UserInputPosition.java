package myprogram.todolist;

import myprogram.Sweets;

import java.util.Scanner;

public class UserInputPosition extends Sweets {
    Scanner scanner = new Scanner(System.in);


    public String inputNameSweet() {
        System.out.println("Введите название позиции: ");
        return scanner.nextLine();
    }

    public String inputWeightSweet() {
        System.out.println("Введите вес позиции: ");
        return scanner.nextLine();
    }

    public String inputPriceSweet() {
        System.out.println("Введите цену позиции: ");
        return scanner.nextLine();
    }

    public String inputIdSweet() {
        System.out.println("Введите id позиции: ");
        return scanner.nextLine();
    }

    @Override
    public String returnSpecialValues() {
        return null;
    }
}
