package hust.soict.hedspi.aims.media;

import java.util.Comparator;

public abstract class Media {
    private int id;
    private String title;
    private String category;
    private float cost;

    public static final Comparator<Media> COMPARE_BY_TITLE_COST = 
        Comparator.comparing(Media::getTitle)
                  .thenComparing(Media::getCost, Comparator.reverseOrder());
                  
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = 
        Comparator.comparing(Media::getCost, Comparator.reverseOrder())
                  .thenComparing(Media::getTitle);

    public Media() {
    }

    public Media(int id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public float getCost() {
        return cost;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Media) {
            Media media = (Media) obj;
            return this.title.equals(media.getTitle());
        }
        return false;
    }
} 