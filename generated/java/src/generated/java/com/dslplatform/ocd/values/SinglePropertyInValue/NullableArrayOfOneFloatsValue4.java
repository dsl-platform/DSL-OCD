package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneFloatsValue4 implements
        java.io.Serializable {
    public NullableArrayOfOneFloatsValue4(
            final float[] nullableArrayOfOneFloats) {
        setNullableArrayOfOneFloats(nullableArrayOfOneFloats);
    }

    public NullableArrayOfOneFloatsValue4() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1475882409;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneFloatsValue4)) return false;
        final NullableArrayOfOneFloatsValue4 other = (NullableArrayOfOneFloatsValue4) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfOneFloats,
                other.nullableArrayOfOneFloats))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneFloatsValue4(" + nullableArrayOfOneFloats
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private float[] nullableArrayOfOneFloats;

    @JsonProperty("nullableArrayOfOneFloats")
    public float[] getNullableArrayOfOneFloats() {
        return nullableArrayOfOneFloats;
    }

    public NullableArrayOfOneFloatsValue4 setNullableArrayOfOneFloats(
            final float[] value) {
        this.nullableArrayOfOneFloats = value;

        return this;
    }
}
