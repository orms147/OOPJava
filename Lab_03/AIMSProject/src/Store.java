package AIMSProject.src;

public class Store {
    private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[100]; // Khai báo mảng chứa DVD

    public void addDVD(DigitalVideoDisc disc) {
        for (int i = 0; i < itemsInStore.length; i++) {
            if (itemsInStore[i] == null) {
                itemsInStore[i] = disc;
                System.out.println("DVD has been added to the store.");
                return;
            }
        }
        System.out.println("The store is full, cannot add more DVDs.");
    }

    public void removeDVD(DigitalVideoDisc disc) {
        for (int i = 0; i < itemsInStore.length; i++) {
            if (itemsInStore[i] == disc) {
                itemsInStore[i] = null;
                System.out.println("DVD has been removed from the store.");
                return;
            }
        }
        System.out.println("DVD not found in the store.");
    }
} 