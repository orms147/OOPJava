package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
    
    public DigitalVideoDisc() {
        super();
    }
    
    public DigitalVideoDisc(int id, String title, String category, float cost, int length, String director) {
        super(id, title, category, cost, length, director);
    }
    
    public DigitalVideoDisc(String title, String category, double cost) {
        super();
        setTitle(title);
        setCategory(category);
        setCost((float)cost);
        setId(++nbDigitalVideoDiscs);
    }
    
    public DigitalVideoDisc(String title) {
        super();
        setTitle(title);
        setId(++nbDigitalVideoDiscs);
    }
    
    public DigitalVideoDisc(String title, String category, String director, double cost) {
        super();
        setTitle(title);
        setCategory(category);
        setDirector(director);
        setCost((float)cost);
        setId(++nbDigitalVideoDiscs);
    }
    
    public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
        super();
        setTitle(title);
        setCategory(category);
        setDirector(director);
        setLength(length);
        setCost((float)cost);
        setId(++nbDigitalVideoDiscs);
    }
    
    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}
