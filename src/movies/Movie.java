package movies;

public class Movie {

    private String name;
    private String category;

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return this.name;
    }

    public String getCategory() {
        return this.category;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public void changeCategory(String category) {
        this.category = category;
    }

}
