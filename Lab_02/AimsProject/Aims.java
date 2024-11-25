package AimsProject;

public class Aims {
  public static void main(String[] args) {
    Cart anOrder = new Cart();
    DigitalVideoDisc dvd1 = new DigitalVideoDisc("One Piece", "Anime","Megumi Ishitani", 69, 69f);
    anOrder.addDigitalVideoDisc(dvd1);
    DigitalVideoDisc dvd2 = new DigitalVideoDisc("Venom", "Troll", 55);
    anOrder.addDigitalVideoDisc(dvd2);
    DigitalVideoDisc dvd3 = new DigitalVideoDisc("Alien", "Science Fiction", 14f);
    anOrder.addDigitalVideoDisc(dvd3);

    anOrder.playDemo(dvd1);

    //anOrder.browseDVD();

    System.out.print("Total of cost is: ");
    System.out.println(anOrder.totalCost());

    anOrder.removeDigitalVideoDisc(dvd3);
    System.out.print("Now, total of cost is: ");
    System.out.println(anOrder.totalCost());

    
  }
}
