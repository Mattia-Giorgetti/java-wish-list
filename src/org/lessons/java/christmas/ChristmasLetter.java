package org.lessons.java.christmas;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ChristmasLetter {

//    ATTRIBUTI
    private String senderName;
    private String senderAddress;
    private List<String> wishesList;

//COSTRUTTORE
    public ChristmasLetter(String senderName, String senderAddress, List<String> wishesList) {

        this.senderName = senderName;
        this.senderAddress = senderAddress;
        this.wishesList = wishesList;
    }
//    GETTER SETTER


    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public List<String> getWishesList() {
        return wishesList;
    }

    public void setWishesList(List<String> wishesList) {
        this.wishesList = wishesList;
    }

//    METODI

    public void send() throws WishListException {
        boolean isSenderGood = new Random().nextBoolean();
        if (!isSenderGood){
            throw new WishListException("Purtoppo non sei stato buono quest'anno.. niente regali");
        }
        else if (wishesList.size() > 5){
            throw new WishListException("La lista è troppo lunga! Puoi chiedere solo 5 regali");
        } else {
            System.out.println("Ecco la tua lettera: ");
            System.out.println("Mittende : " + getSenderName());
            System.out.println("Indirizzo : " + getSenderAddress());
            System.out.println("Desideri espressi: ");

            Iterator<String> iterator = wishesList.iterator();
            while (iterator.hasNext()){
                String wish = iterator.next();
                System.out.println(wish);
            }

        }

    }
}