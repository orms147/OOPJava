package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private List<String> authors = new ArrayList<String>();
    
    public Book() {
        super();
    }
    
    public Book(int id, String title, String category, float cost) {
        super(id, title, category, cost);
    }

    public Book(String title, String category, float cost) {
        super();
        setTitle(title);
        setCategory(category);
        setCost(cost);
    }

    @Override
    public void play() {
        System.out.println("Reading book: " + this.getTitle());
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            authors.add(authorName);
        }
    }

    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + getTitle() + '\'' +
                ", category='" + getCategory() + '\'' +
                ", cost=" + getCost() +
                ", authors=" + authors +
                '}';
    }
} 