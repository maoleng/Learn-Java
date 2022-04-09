class TestDrinks
{
    public static void main(String[] arg)
    {
        Drinks drinks = new Drinks ("02", "Pepsi", "lon", 50, 10);
        drinks.setDrinksPrice(7000);
        drinks.setDrinksQuan(100);
        System.out.println(drinks.calTotal());
        System.out.println(drinks.discount());
        //Test all of methods which you implemented
    }
}
