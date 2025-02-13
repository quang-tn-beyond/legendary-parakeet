package application.aicomic.enums;

public enum CurrentChapterEnums {
    DELETED((byte) 1),
    AVAILABLE((byte) 2);

    private final byte value;

    CurrentChapterEnums(byte value) {
        this.value = value;
    }

    public byte getValue() {
        return value;
    }
    public static CurrentChapterEnums fromValue(byte value) {
        for (CurrentChapterEnums x : CurrentChapterEnums.values()) {
            if (x.getValue() == value) {
                return x;
            }
        }
        throw new IllegalArgumentException("No CurrentChapterEnums with value " + value);
    }
}
