package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableBooleansValue2 implements
        java.io.Serializable {
    public NullableArrayOfNullableBooleansValue2(
            final Boolean[] nullableArrayOfNullableBooleans) {
        setNullableArrayOfNullableBooleans(nullableArrayOfNullableBooleans);
    }

    public NullableArrayOfNullableBooleansValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 565554308;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableBooleansValue2))
            return false;
        final NullableArrayOfNullableBooleansValue2 other = (NullableArrayOfNullableBooleansValue2) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableBooleans,
                other.nullableArrayOfNullableBooleans))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableBooleansValue2("
                + nullableArrayOfNullableBooleans + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Boolean[] nullableArrayOfNullableBooleans;

    @JsonProperty("nullableArrayOfNullableBooleans")
    public Boolean[] getNullableArrayOfNullableBooleans() {
        return nullableArrayOfNullableBooleans;
    }

    public NullableArrayOfNullableBooleansValue2 setNullableArrayOfNullableBooleans(
            final Boolean[] value) {
        this.nullableArrayOfNullableBooleans = value;

        return this;
    }
}
