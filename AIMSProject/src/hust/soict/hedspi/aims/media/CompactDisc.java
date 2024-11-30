package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc {
    private String artist;
    private List<Track> tracks = new ArrayList<Track>();
    
    public CompactDisc() {
        super();
    }
    
    public CompactDisc(int id, String title, String category, float cost, String director, String artist) {
        super(id, title, category, cost, 0, director);
        this.artist = artist;
    }
    
    public String getArtist() {
        return artist;
    }
    
    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("Track already exists in the CD!");
        } else {
            tracks.add(track);
            System.out.println("Track added successfully!");
        }
    }
    
    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track removed successfully!");
        } else {
            System.out.println("Track does not exist in the CD!");
        }
    }
    
    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }
} 