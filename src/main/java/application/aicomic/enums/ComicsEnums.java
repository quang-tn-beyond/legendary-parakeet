package application.aicomic.enums;

public enum ComicsEnums {
    DELETED((byte) 0),
    UPDATE((byte) 1),
    COMPLETED((byte) 2),
    STOPPED((byte) 3);

    private final byte value;

    ComicsEnums(byte value) {
        this.value = value;
    }

    public byte getValue() {
        return value;
    }

    public static ComicsEnums fromValue(byte value) {
        for (ComicsEnums x : ComicsEnums.values()) {
            if (x.getValue() == value) {
                return x;
            }
        }
        throw new IllegalArgumentException("No ComicsEnums with value" + value);
    }
}
