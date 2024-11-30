package hust.soict.hedspi.aims.disc.DigitalVideoDisc;

//import java.time.LocalDate;

public class DigitalVideoDisc {
  private static int nbDigitalVideoDiscs = 0;
  private int id;
  private String title;
  private String category;
  private String director;
  private int length;
  private double cost;
  // private LocalDate addDate;
  
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  public String getCategory() {
    return category;
  }
  public String getDirector() {
    return director;
  }
  public int getLength() {
    return length;
  }
  public double getCost() {
    return cost;
  }
  // public LocalDate getDate() {
  //   return addDate;
  // }
  public int getId() {
    return id;
  }

  public DigitalVideoDisc(String title, String category, double cost) {
    this.title = title;
    this.category = category;
    this.cost = cost;
    this.id = ++nbDigitalVideoDiscs;
    //this.addDate = LocalDate.now();
  }
  public DigitalVideoDisc(String title) {
    this.title = title;
    this.id = ++nbDigitalVideoDiscs;
    //this.addDate = LocalDate.now();
  }
  public DigitalVideoDisc(String title, String category, String director, double cost) {
    this.title = title;
    this.category = category;
    this.director = director;
    this.cost = cost;
    this.id = ++nbDigitalVideoDiscs;
    //this.addDate = LocalDate.now();
  }
  public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
    this.title = title;
    this.category = category;
    this.director = director;
    this.length = length;
    this.cost = cost;
    this.id = ++nbDigitalVideoDiscs;
    //this.addDate = LocalDate.now();
  }

  public String toString() {
    return "DVD - " + this.getTitle() + " - " + 
                      this.getCategory() + " - " + 
                      this.getDirector() + " - " + 
                      this.getLength() + ": " + 
                      this.getCost() + " $";
  }
  
}
