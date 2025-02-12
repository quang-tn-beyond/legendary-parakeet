package application.aicomic.enums;

public enum OrdersEnums {
    PENDING((byte) 0),
    COMPLETED((byte) 1),
    CANCEL((byte) 2);

    private final byte value;

    OrdersEnums(byte value) {
        this.value = value;
    }

    public byte getValue() {
        return value;
    }

    public static OrdersEnums fromValue(byte value) {
        for (OrdersEnums x : OrdersEnums.values()) {
            if (x.getValue() == value) {
                return x;
            }
        }
        throw new IllegalArgumentException("No OrdersEnums with value" + value);
    }
}
