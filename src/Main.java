public class Main {
    public static void main(String[] args) {
        Home home = new Home("Shopokova 12 ", "Jalal-Abad");
        Mother mother = new Mother(31,"Bema", FavoriteColor.YELLOW,home,4);
        Daughter daughter = new Daughter(14, "Samira", FavoriteColor.PINK,
                home, 13, 12);
        Daughter daughter2 = new Daughter(11, "Kanykei", FavoriteColor.BLUE,
                home, 3,7);
        System.out.println(mother.getInfo());

        System.out.println("+++++++");

        System.out.println(daughter.getInfo());

        System.out.println("+++++++");

        System.out.println(daughter2.getInfo());

        mother.FavoriteColor();
        mother.FavoriteColor2(FavoriteColor.PINK);
        mother.FavoriteColor3(3);

    }
}