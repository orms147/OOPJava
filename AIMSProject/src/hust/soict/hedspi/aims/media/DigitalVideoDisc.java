package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
    
    public DigitalVideoDisc() {
        super();
    }
    
    public DigitalVideoDisc(int id, String title, String category, float cost, int length, String director) {
        super(id, title, category, cost, length, director);
    }
    
    public DigitalVideoDisc(String title, String category, float cost) {
        this(0, title, category, cost, 0, null);
    }
    
    public DigitalVideoDisc(String title) {
        this(0, title, null, 0, 0, null);
    }
    
    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}
