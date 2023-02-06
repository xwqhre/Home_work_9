public class Mother extends GrandMother {
    private int bag; //количество сумок

    public String getInfo() {
        return super.getInfo() +
                "\nBag:" + bag;
    }

    public Mother(int age, String name, FavoriteColor favoriteColor,Home home, int bag) {
        super(age, name, favoriteColor, home);
        this.bag = bag;
    }

    public int getBag() {
        return bag;
    }

    public void FavoriteColor() {
        System.out.println("Yellow");
    }

    public void FavoriteColor2(FavoriteColor favoriteColor) {
        System.out.println(FavoriteColor.YELLOW);
    }

    public final void FavoriteColor3(int bag) {
        System.out.println("количество сумок " + " Yellow " +  bag);
    }
}


