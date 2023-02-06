public class GrandMother {
    private int age;
    private String name;
    private FavoriteColor favoriteColor;

    private Home home;

    public GrandMother(int age, String name, FavoriteColor favoriteColor,Home home) {
        this.age = age;
        this.name = name;
        this.favoriteColor = favoriteColor;
        this.home = home;

    }

    public int getAge() {
        return age;
    }
    public String getName(){
        return name;

    }

    public FavoriteColor getFavoriteColor() {
        return favoriteColor;
    }

    public Home getHome() {
        return home;
    }

    public String getInfo(){
        return "Age: " + age +
                "\nName: " + name +
                "\nFavorite Color: " + favoriteColor ;
    }
}
