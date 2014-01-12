package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableBooleansValue11 implements
        java.io.Serializable {
    public NullableArrayOfNullableBooleansValue11(
            final Boolean[] nullableArrayOfNullableBooleans) {
        setNullableArrayOfNullableBooleans(nullableArrayOfNullableBooleans);
    }

    public NullableArrayOfNullableBooleansValue11() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1224262156;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableBooleansValue11))
            return false;
        final NullableArrayOfNullableBooleansValue11 other = (NullableArrayOfNullableBooleansValue11) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableBooleans,
                other.nullableArrayOfNullableBooleans))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableBooleansValue11("
                + nullableArrayOfNullableBooleans + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Boolean[] nullableArrayOfNullableBooleans;

    @JsonProperty("nullableArrayOfNullableBooleans")
    public Boolean[] getNullableArrayOfNullableBooleans() {
        return nullableArrayOfNullableBooleans;
    }

    public NullableArrayOfNullableBooleansValue11 setNullableArrayOfNullableBooleans(
            final Boolean[] value) {
        this.nullableArrayOfNullableBooleans = value;

        return this;
    }
}
