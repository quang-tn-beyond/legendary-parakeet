package application.aicomic.Enums;

public enum Role {
    ADMIN((byte) 1),
    MANAGER((byte) 2),
    MODERATOR((byte) 3),
    STAFF((byte) 4),
    CUSTOMER_NORMAL((byte) 5),
    CUSTOMER_VIP1((byte) 6),
    CUSTOMER_VIP2((byte) 7),
    CUSTOMER_VIP3((byte) 8);

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
