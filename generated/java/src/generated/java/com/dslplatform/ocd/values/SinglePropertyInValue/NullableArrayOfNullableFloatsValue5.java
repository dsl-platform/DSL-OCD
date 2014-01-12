package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableFloatsValue5 implements
        java.io.Serializable {
    public NullableArrayOfNullableFloatsValue5(
            final Float[] nullableArrayOfNullableFloats) {
        setNullableArrayOfNullableFloats(nullableArrayOfNullableFloats);
    }

    public NullableArrayOfNullableFloatsValue5() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 289185831;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableFloatsValue5))
            return false;
        final NullableArrayOfNullableFloatsValue5 other = (NullableArrayOfNullableFloatsValue5) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableFloats,
                other.nullableArrayOfNullableFloats))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableFloatsValue5("
                + nullableArrayOfNullableFloats + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Float[] nullableArrayOfNullableFloats;

    @JsonProperty("nullableArrayOfNullableFloats")
    public Float[] getNullableArrayOfNullableFloats() {
        return nullableArrayOfNullableFloats;
    }

    public NullableArrayOfNullableFloatsValue5 setNullableArrayOfNullableFloats(
            final Float[] value) {
        this.nullableArrayOfNullableFloats = value;

        return this;
    }
}
