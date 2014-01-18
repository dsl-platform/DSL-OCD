package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableBooleans_1 implements
        java.io.Serializable {
    public NullableArrayOfNullableBooleans_1(
            final Boolean[] nullableArrayOfNullableBooleans) {
        setNullableArrayOfNullableBooleans(nullableArrayOfNullableBooleans);
    }

    public NullableArrayOfNullableBooleans_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 625585107;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableBooleans_1)) return false;
        final NullableArrayOfNullableBooleans_1 other = (NullableArrayOfNullableBooleans_1) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableBooleans,
                other.nullableArrayOfNullableBooleans))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableBooleans_1("
                + nullableArrayOfNullableBooleans + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Boolean[] nullableArrayOfNullableBooleans;

    @JsonProperty("nullableArrayOfNullableBooleans")
    public Boolean[] getNullableArrayOfNullableBooleans() {
        return nullableArrayOfNullableBooleans;
    }

    public NullableArrayOfNullableBooleans_1 setNullableArrayOfNullableBooleans(
            final Boolean[] value) {
        this.nullableArrayOfNullableBooleans = value;

        return this;
    }
}
