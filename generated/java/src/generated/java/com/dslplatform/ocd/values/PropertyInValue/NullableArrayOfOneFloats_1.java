package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneFloats_1 implements java.io.Serializable {
    public NullableArrayOfOneFloats_1(
            final float[] nullableArrayOfOneFloats) {
        setNullableArrayOfOneFloats(nullableArrayOfOneFloats);
    }

    public NullableArrayOfOneFloats_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1755950060;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneFloats_1)) return false;
        final NullableArrayOfOneFloats_1 other = (NullableArrayOfOneFloats_1) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfOneFloats,
                other.nullableArrayOfOneFloats))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneFloats_1(" + nullableArrayOfOneFloats + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private float[] nullableArrayOfOneFloats;

    @JsonProperty("nullableArrayOfOneFloats")
    public float[] getNullableArrayOfOneFloats() {
        return nullableArrayOfOneFloats;
    }

    public NullableArrayOfOneFloats_1 setNullableArrayOfOneFloats(
            final float[] value) {
        this.nullableArrayOfOneFloats = value;

        return this;
    }
}
