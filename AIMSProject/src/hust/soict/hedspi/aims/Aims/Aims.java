package hust.soict.hedspi.aims.Aims;

import hust.soict.hedspi.aims.cart.Cart.Cart;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;

public class Aims {
  public static void main(String[] args) {
    Cart anOrder = new Cart();
    DigitalVideoDisc dvd1 = new DigitalVideoDisc("One Piece", "Anime","Megumi Ishitani", 69, 69f);
    anOrder.addMedia(dvd1);
    DigitalVideoDisc dvd2 = new DigitalVideoDisc("Venom", "Troll", 55);
    anOrder.addMedia(dvd2);
    DigitalVideoDisc dvd3 = new DigitalVideoDisc("Alien", "Science Fiction", 14f);
    anOrder.addMedia(dvd3);

    System.out.print("Total of cost is: ");
    System.out.println(anOrder.totalCost());

    anOrder.removeMedia(dvd3);
    System.out.print("Now, total of cost is: ");
    System.out.println(anOrder.totalCost());
  }
}
