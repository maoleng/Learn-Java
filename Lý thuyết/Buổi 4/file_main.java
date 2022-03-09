import java.util.concurrent.ThreadPoolExecutor.AbortPolicy;

public class file_main {
    public static void main(String[] args) {
        Book aBook = new Book("Dac nhan tam", "Ly tuong", 50000, 22);
        String name_book = aBook.getAuthor();
        System.out.println(name_book);
        String detail = aBook.toString();
        System.out.println(detail);
        Author anAuthor = new Author("Ly tuong", "lytuong@mail.com", "f");
        System.out.println(anAuthor.toString());
    }
}
