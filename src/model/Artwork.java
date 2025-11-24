package model;

public class Artwork {
    private int id;
    private String title;
    private String description;
    private String imageUrl;
    private int artistId;
    private double price;
    private boolean approved;

    public Artwork() {}

    public Artwork(String title, String description, String imageUrl, int artistId, double price, boolean approved) {
        this.title = title;
        this.description = description;
        this.imageUrl = imageUrl;
        this.artistId = artistId;
        this.price = price;
        this.approved = approved;
    }

    // getters & setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }

    public int getArtistId() { return artistId; }
    public void setArtistId(int artistId) { this.artistId = artistId; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public boolean isApproved() { return approved; }
    public void setApproved(boolean approved) { this.approved = approved; }

    @Override
    public String toString() {
        return "Artwork{id=" + id + ", title='" + title + "', artistId=" + artistId + ", price=" + price + "}";
    }
}
