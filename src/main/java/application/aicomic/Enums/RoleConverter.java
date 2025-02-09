package application.aicomic.Enums;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class RoleConverter implements AttributeConverter<Role, Byte> {

    @Override
    public Byte convertToDatabaseColumn(Role role) {
        if (role == null) {
            return null;
        }
        return role.getValue();
    }

    @Override
    public Role convertToEntityAttribute(Byte value) {
        if (value == null) {
            return null;
        }
        return Role.fromValue(value);
    }
}

