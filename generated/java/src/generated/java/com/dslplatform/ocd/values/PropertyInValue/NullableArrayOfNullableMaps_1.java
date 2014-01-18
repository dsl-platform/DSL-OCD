package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableMaps_1 implements
        java.io.Serializable {
    public NullableArrayOfNullableMaps_1(
            final java.util.Map<String, String>[] nullableArrayOfNullableMaps) {
        setNullableArrayOfNullableMaps(nullableArrayOfNullableMaps);
    }

    public NullableArrayOfNullableMaps_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 813675123;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableMaps_1)) return false;
        final NullableArrayOfNullableMaps_1 other = (NullableArrayOfNullableMaps_1) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableMaps,
                other.nullableArrayOfNullableMaps))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableMaps_1(" + nullableArrayOfNullableMaps
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Map<String, String>[] nullableArrayOfNullableMaps;

    @JsonProperty("nullableArrayOfNullableMaps")
    public java.util.Map<String, String>[] getNullableArrayOfNullableMaps() {
        return nullableArrayOfNullableMaps;
    }

    public NullableArrayOfNullableMaps_1 setNullableArrayOfNullableMaps(
            final java.util.Map<String, String>[] value) {
        this.nullableArrayOfNullableMaps = value;

        return this;
    }
}
