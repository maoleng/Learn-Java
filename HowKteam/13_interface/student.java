public class student extends person implements Ispeak, Ieat {
    public student ( String name, int age, float height ) {
        super(name, age, height);
    }

    public void print_information() {
        System.out.println("Ten la:" + name + ", tuoi la: "+ age + ", chieu cao la: " + height);
    }



    // Do implement interface nen buoc phai khai bao cac phuong thuc cua interface do
    public void speak() {
        System.out.println(name + " dang noi oke oke");
    }

    public void eat () {
        // Khi implement interface thi co the dung duoc cac bien da tao trong interface do
        System.out.println(name + " dang an " + food);
    }
}
