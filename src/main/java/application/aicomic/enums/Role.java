package application.aicomic.enums;

public enum Role {
    ADMIN((byte) 1),
    MANAGER((byte) 2),
    MODERATOR((byte) 3),
    STAFF((byte) 4),
    CUSTOMER_NORMAL((byte) 5),
    CUSTOMER_READER((byte) 6),
    CUSTOMER_AUTHOR((byte) 7),
    CUSTOMER_VIP((byte) 8);

    private final byte value;

    Role(byte value) {
        this.value = value;
    }

    public byte getValue() {
        return value;
    }

    public static Role fromValue(byte value) {
        for (Role role : Role.values()) {
            if (role.value == value) {
                return role;
            }
        }
        throw new IllegalArgumentException("Unknown role value: " + value);
    }
}
