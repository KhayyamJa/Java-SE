package Enum;

import java.util.List;

public class CardConfig {
    public static final List<Card> cards = List.of(
            new Card("Orkhan Mm",
                    "123A",
                    CardType.VISA),

            new Card("Khayyam Ja",
                    "987B",
                    CardType.MASTERCARD)

    );
}
