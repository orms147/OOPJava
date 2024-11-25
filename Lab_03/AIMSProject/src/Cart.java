package AIMSProject.src;

//import java.util.Arrays;
//import java.time.LocalDate;

public class Cart {
  public static final int MAX_NUMBERS_ORDERED = 20;
  private DigitalVideoDisc itemsOdered[] =  new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
  

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

  

}
