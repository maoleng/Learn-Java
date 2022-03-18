public abstract class person {
    public String name;
    public int age;
    public float height;

    public person (String name, int age, float height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

    public abstract void print_information ();

}
