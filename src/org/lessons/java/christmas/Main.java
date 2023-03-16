package org.lessons.java.christmas;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> wishes = new ArrayList<>();
        boolean stop = false;
        String name;
        do {
            System.out.println("Ciao! come ti chiami?");
            name = scan.nextLine();
        } while (name.length() == 0);
        String address;
        do {
            System.out.println("Dove abiti?");
            address = scan.nextLine();
        } while (address.length() == 0);


        while (!stop) {
            System.out.println("Inserisci un desiderio ");
            String wish = scan.nextLine();
            if (wish.length() > 0){
                wishes.add(wish);
                System.out.println("Desideri espressi: " + wishes.size());
            } else {
                System.out.println("Campo vuoto.. riproviamo");
            }
            System.out.println("Vuoi aggiungere un altro desiderio? (s/n)");

            stop = scan.nextLine().equalsIgnoreCase("n");
        }
        System.out.println("Finito! Ecco i tuoi desideri");
        Collections.sort(wishes);
        System.out.println(wishes);
        try {
            ChristmasLetter christmasLetter = new ChristmasLetter(name, address, wishes);
            christmasLetter.send();
        } catch (WishListException e) {
            System.out.println(e.getMessage());
        }
        scan.close();
    }
}
