package abstraction.messagingapplication;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Khayyam", "Online");
        User user2 = new User("Orkhan", "Offline");

        user1.sendMessage("Hello Orkhan", user2.getUsername());
        user2.receiveMessage("Hello Orkhan", user1.getUsername());
        user2.sendMessage("Hi Khayyam", user1.getUsername());

    }
}
