package application.aicomic.enums;

public enum GenresEnums {
    DELETED((byte) 1),
    EDITED((byte) 2),
    AVAILABLE((byte) 3);

    private final byte value;

    GenresEnums(byte value) {
        this.value = value;
    }

    public byte getValue() {
        return value;
    }
    public static GenresEnums fromValue(byte value) {
        for (GenresEnums x : GenresEnums.values()) {
            if (x.getValue() == value) {
                return x;
            }
        }
        throw new IllegalArgumentException("No GenresEnums with value " + value);
    }
}
