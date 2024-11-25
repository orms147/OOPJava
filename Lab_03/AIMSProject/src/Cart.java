package AIMSProject.src;

//import java.util.Arrays;
//import java.time.LocalDate;

public class Cart {
  public static final int MAX_NUMBERS_ORDERED = 20;
  private DigitalVideoDisc itemsOdered[] =  new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
  private int qtyOrdered = 0;

  // public void browseDVD() {
  //   Arrays.sort(itemsOdered, (a, b) -> {
  //       if (a == null) return 1;
  //       if (b == null) return -1; 
  //       return a.getDate().compareTo(b.getDate());
  //   });
  //   for(int i = 0 ; i < MAX_NUMBERS_ORDERED; i++) {
  //     if(itemsOdered[i] != null) System.out.println(itemsOdered[i].getDate());
  //   }
  // }

  public void addDigitalVideoDisc(DigitalVideoDisc disc) {
    for(int i = 0 ; i < MAX_NUMBERS_ORDERED; i++) {
      if(itemsOdered[i] == null) {
        itemsOdered[i] = disc;
        System.out.println("The disc has been added");
        return;
      }
    }
    System.out.println("The cart is almost full");
  }
  
  public void addDigitalVideoDisc(DigitalVideoDisc[] discList ) {
    for(DigitalVideoDisc disc : discList) {
      if(qtyOrdered < MAX_NUMBERS_ORDERED) {
        itemsOdered[qtyOrdered] = disc;
        qtyOrdered++;
        System.out.println("The disc has been added");
      }
      else {
        System.out.println("The cart is almost full");
      }
    }
  }

  public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2){
    if(qtyOrdered +2 <= MAX_NUMBERS_ORDERED){
      itemsOdered[qtyOrdered] = dvd1;
      qtyOrdered++;
      itemsOdered[qtyOrdered] = dvd2;
      qtyOrdered++;
      System.out.println("Both disc has been added");
    } else if (qtyOrdered +1 <= MAX_NUMBERS_ORDERED) {
      itemsOdered[qtyOrdered] = dvd1;
      qtyOrdered++;
      System.out.println("The first disc has been added");
    } else {
      System.out.println("The cart is almost full");
    }
  }

  public void removeDigitalVideoDisc (DigitalVideoDisc disc) {
    for(int i  = 0; i < MAX_NUMBERS_ORDERED; i++) {
      if(itemsOdered[i] == disc) {
        itemsOdered[i] = null;
        System.out.println("The disc has been removed");
        break;
      }
    }
  }

  public double totalCost() {
    double totalCost = 0;
    for(int i  = 0; i < MAX_NUMBERS_ORDERED; i++) {
        if (itemsOdered[i] != null) {
            totalCost += itemsOdered[i].getCost();
        }
    }
    return totalCost;
  }

  public void playDemo(DigitalVideoDisc disc) {
    if (disc.getLength() <= 0) {
      System.out.println("DVD cannot be played.");
    } else {
        System.out.println("Playing DVD: " + disc.getTitle());
    }
  }

  public void printCart() {
    System.out.println("***********************CART***********************");
    System.out.println("Ordered Items:");
    for (int i = 0; i < qtyOrdered; i++) {
      System.out.println((i + 1) + ". " + itemsOdered[i].toString());
    }
    System.out.println("Total cost: " + totalCost());
    System.out.println("***************************************************");
  }
  public void searchById(int id) {
    boolean found = false;
    for (int i = 0; i < qtyOrdered; i++) {
      if (itemsOdered[i].getId() == id) {
        System.out.println(itemsOdered[i].toString());
        found = true;
        break;
      }
    }
    if (!found) {
      System.out.println("No match found for ID: " + id);
    }
  }

  public void searchByTitle(String title) {
    boolean found = false;
    for (int i = 0; i < qtyOrdered; i++) {
      if (isMatch(itemsOdered[i], title)) {
        System.out.println(itemsOdered[i].toString());
        found = true;
      }
    }
    if (!found) {
      System.out.println("No match found for title: " + title);
    }
  }

  private boolean isMatch(DigitalVideoDisc disc, String title) {
    String[] discWords = disc.getTitle().toLowerCase().split("\\s+");
    String[] searchWords = title.toLowerCase().split("\\s+");
    
    for (String searchWord : searchWords) {
      boolean wordFound = false;
      for (String discWord : discWords) {
        if (discWord.equals(searchWord)) {
          wordFound = true;
          break;
        }
      }
      if (!wordFound) return false;
    }
    return true;
  }
}
