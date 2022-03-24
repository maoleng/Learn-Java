public class student {
    public int id;
    public String firstName;
    public String lastName;

    public student ( int id,  String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setId (int id) {
        this.id = id;
    }
    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }
    public void setLastName (String lastName) {
        this.lastName = lastName;
    }

    public String getName () {
        return this.firstName + this.lastName;
    }
}
