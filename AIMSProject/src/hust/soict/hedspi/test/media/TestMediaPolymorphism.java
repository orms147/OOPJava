package hust.soict.hedspi.test.media;

import java.util.ArrayList;
import java.util.List;

import hust.soict.hedspi.aims.media.*;

public class TestMediaPolymorphism {
    public static void main(String[] args) {
        List<Media> mediae = new ArrayList<Media>();
        
        // Tạo các đối tượng media khác nhau
        CompactDisc cd = new CompactDisc("Music Album", "Music", "Artist", 29.95f);
        DigitalVideoDisc dvd = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        Book book = new Book(3, "The Hobbit", "Fantasy", 24.95f);
        
        // Thêm vào ArrayList
        mediae.add(cd);
        mediae.add(dvd);
        mediae.add(book);
        
        // In thông tin của từng media
        System.out.println("***********************MEDIA LIST***********************");
        for(Media m: mediae) {
            System.out.println(m.toString());  // Gọi phương thức toString() đa hình
        }
        System.out.println("******************************************************");
    }
} 