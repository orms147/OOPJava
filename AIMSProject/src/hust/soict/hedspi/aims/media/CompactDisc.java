package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private List<Track> tracks = new ArrayList<Track>();
    
    public CompactDisc(String title, String category, String artist, float cost) {
        super();
        setTitle(title);
        setCategory(category);
        this.artist = artist;
        setCost(cost);
    }
    
    public String getArtist() {
        return artist;
    }
    
    @Override
    public void play() {
        System.out.println("Playing CD: " + this.getTitle());
        System.out.println("CD artist: " + this.getArtist());
        for (Track track : tracks) {
            track.play();
        }
    }
    
    @Override
    public String toString() {
        return "CD - " + getTitle() + " - " + getCategory() + " - " + artist + ": " + getCost() + " $";
    }
} 