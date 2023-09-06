package Homework6;

import java.util.Scanner;

//        Создайте две переменные isEdekaOpen и isReweOpen, значения которых зависят от того, открыты магазины или нет.
//        Реализует логический метод canBuy,  возвращающий boolean
//        Значение этой переменной должно быть true, если хотя бы один магазин открыт, иначе false.
//        Отобразите строку «Я могу купить еду, это ……» и значение.

public class ShopIsOpen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Магазин EDEKA открыт? - ");
        boolean isEdekaOpen = scanner.nextBoolean();
        System.out.print("Магазин REWE открыт? -  ");
        boolean isReweOpen = scanner.nextBoolean();
        boolean canBuyFood = canBuy(isEdekaOpen, isReweOpen);
        if (canBuyFood) {
            if (isEdekaOpen && isReweOpen) {
                System.out.println("Я могу купить еду, это можно сделать и в магазине Edeka, и в магазине Rewe.");
            } else if (isEdekaOpen) {
                System.out.println("Я могу купить еду, это можно сделать в магазине Edeka.");
            } else {
                System.out.println("Я могу купить еду, это можно сделать в магазине Rewe.");
            }
        } else {
            System.out.println("Я не могу купить еду, так как оба магазина закрыты.");
        }
    }
    static boolean canBuy(boolean isEdekaOpen, boolean isReweOpen) {
        boolean result = isEdekaOpen == true || isReweOpen == true;
        return result;
    }
}
