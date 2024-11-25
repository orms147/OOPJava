package AimsProject;

//import java.time.LocalDate;

public class DigitalVideoDisc {
  private String title;
  private String category;
  private String director;
  private int length;
  private double cost;
  // private LocalDate addDate;
  
  public String getTitle() {
    return title;
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

  public DigitalVideoDisc(String title, String category, double cost) {
    this.title = title;
    this.category = category;
    this.cost = cost;
    //this.addDate = LocalDate.now();
  }
  public DigitalVideoDisc(String title) {
    this.title = title;
    //this.addDate = LocalDate.now();
  }
  public DigitalVideoDisc(String title, String category, String director, double cost) {
    this.title = title;
    this.category = category;
    this.director = director;
    this.cost = cost;
    //this.addDate = LocalDate.now();
  }
  public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
    this.title = title;
    this.category = category;
    this.director = director;
    this.length = length;
    this.cost = cost;
    //this.addDate = LocalDate.now();
  }
  

}
