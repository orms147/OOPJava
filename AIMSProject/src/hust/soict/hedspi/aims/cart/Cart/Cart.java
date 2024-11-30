package hust.soict.hedspi.aims.cart.Cart;

//import java.util.Arrays;
//import java.time.LocalDate;
import java.util.ArrayList;
import hust.soict.hedspi.aims.media.Media;

public class Cart {
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    
    public void addMedia(Media media) {
        if (itemsOrdered.size() < 20) {
            itemsOrdered.add(media);
            System.out.println("The media has been added");
        } else {
            System.out.println("The cart is almost full");
        }
    }
    
    public void removeMedia(Media media) {
        if (itemsOrdered.remove(media)) {
            System.out.println("The media has been removed");
        } else {
            System.out.println("The media was not found");
        }
    }

    public float totalCost() {
      float total = 0;
      for (Media media : itemsOrdered) {
          total += media.getCost();
      }
      return total;
  }

    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < itemsOrdered.size(); i++) {
            System.out.println((i + 1) + ". " + itemsOrdered.get(i).toString());
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");
    }

    public void searchById(int id) {
        boolean found = false;
        for (Media media : itemsOrdered) {
            if (media.getId() == id) {
                System.out.println(media.toString());
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
        for (Media media : itemsOrdered) {
            if (isMatch(media, title)) {
                System.out.println(media.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No match found for title: " + title);
        }
    }

    private boolean isMatch(Media media, String title) {
        String[] mediaWords = media.getTitle().toLowerCase().split("\\s+");
        String[] searchWords = title.toLowerCase().split("\\s+");
        
        for (String searchWord : searchWords) {
            boolean wordFound = false;
            for (String mediaWord : mediaWords) {
                if (mediaWord.equals(searchWord)) {
                    wordFound = true;
                    break;
                }
            }
            if (!wordFound) return false;
        }
        return true;
    }
}
