package Enum;

public class Card {
    public String holder;
    public String pan;
    CardType cardType;

    public Card(String holder, String pan, CardType cardType) {
        this.holder = holder;
        this.pan = pan;
        this.cardType = cardType;
    }

    @Override
    public String toString() {
        return "Card{" +
                "holder='" + holder + '\'' +
                ", pan='" + pan + '\'' +
                ", cardType=" + cardType +
                '}';
    }
}
