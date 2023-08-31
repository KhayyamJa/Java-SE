package Enum;

public class Main {
    public static void main(String[] args) {
        CardService cardService = new CardService();
        var card = cardService.getCardByPan("987B");
        System.out.println(card);
    }
}
