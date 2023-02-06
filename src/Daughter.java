public final class Daughter extends Mother {
    private int sweater;

    public Daughter(int age, String name, FavoriteColor favoriteColor,Home home ,int bag, int friends) {
        super(age, name, favoriteColor,home, bag);
        this.sweater = friends;
    }

    public int getFriends() {
        return sweater;
    }

    public String getInfo() {
        return super.getInfo() +
                "\nFriends:" + sweater;
    }

    public void FavoriteColor(){
    super.FavoriteColor();
        System.out.println("перезапись");
    }

}
