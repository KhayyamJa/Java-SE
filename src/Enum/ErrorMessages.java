package Enum;

public enum ErrorMessages {
    CARD_NOT_FOUND("Card not found with pan : {}");

    private final String value;

    ErrorMessages(String value) {
        this.value = value;
    }

    public String getValue(String pan) {
        return this.value.replace("{}", String.valueOf(pan));
    }
}
