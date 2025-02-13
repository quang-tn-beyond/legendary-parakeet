package application.aicomic.enums;

public enum CommentsEnums {
    DELETED((byte) 1),
    EDITED((byte) 2),
    AVAILABLE((byte) 3);

    private final byte value;

    CommentsEnums(byte value) {
        this.value = value;
    }

    public byte getValue() {
        return value;
    }
    public static CommentsEnums fromValue(byte value) {
        for (CommentsEnums x : CommentsEnums.values()) {
            if (x.getValue() == value) {
                return x;
            }
        }
        throw new IllegalArgumentException("No CommentsEnums with value " + value);
    }
}
