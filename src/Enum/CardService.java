package Enum;

import static Enum.ErrorMessages.CARD_NOT_FOUND;

public class CardService {

    public Card getCardByPan(String pan) {
        for (int i = 0; i < CardConfig.cards.size(); i++) {
            if (CardConfig.cards.get(i).pan.equals(pan)) {
                return CardConfig.cards.get(i);
            }
        }
        throw new CardNotFoundException(CARD_NOT_FOUND.getValue(pan));
    }
}
