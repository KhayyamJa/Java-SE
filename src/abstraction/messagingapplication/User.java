package abstraction.messagingapplication;

public class User implements MessageSender {
    private String username;

    private String status;

    public String getUsername() {
        return username;
    }

    public User(String username, String status) {
        this.username = username;
        this.status = status;
    }

    @Override
    public void sendMessage(String message, String recipient) {
        System.out.println(username + " sent message to " + recipient + " Text: " + message);

    }

    @Override
    public void receiveMessage(String message, String sender) {
        System.out.println(username + " received message from " + sender + " Text: " + message);
    }
}
