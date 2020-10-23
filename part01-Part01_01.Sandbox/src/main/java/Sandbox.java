
import java.util.ArrayList;

public class Sandbox {

    public static void main(String[] args) {
//        Message sms = new Message("SMS");
//        Message mms = new Message("MMS");
//
//        System.out.println(sms.equals(sms));
//        System.out.println(sms.equals(mms));
//
//        ArrayList<Message> messages = new ArrayList<>();
//
//        if (!messages.contains(sms)) {
//            messages.add(sms);
//        }
//
//        if (!messages.contains(sms)) {
//            messages.add(sms);
//        }
//
//        if (!messages.contains(new Message("SMS"))) {
//            messages.add(sms);
//        }
//        
//        System.out.println(messages.size());

        ArrayList<Book> books = new ArrayList<>();
        Book bookObject = new Book("Book Object", 2000, "...");
        books.add(bookObject);

        if (books.contains(bookObject)) {
            System.out.println("Book Object was found.");
        }

        bookObject = new Book("Book Object", 2000, "...");

        if (!books.contains(bookObject)) {
            System.out.println("Book Object was not found.");
        }

    }
}
