
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        MessagingService m = new MessagingService();
        System.out.println(m.getMessages());
        m.add(new Message("Todd", "hi"));
        System.out.println(m.getMessages());
        m.add(new Message("Barb", "bye"));
        System.out.println(m.getMessages());
    }
}
