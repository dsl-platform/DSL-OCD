package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableMapsValue12 implements
        java.io.Serializable {
    public NullableArrayOfNullableMapsValue12(
            final java.util.Map<String, String>[] nullableArrayOfNullableMaps) {
        setNullableArrayOfNullableMaps(nullableArrayOfNullableMaps);
    }

    public NullableArrayOfNullableMapsValue12() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1795754745;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableMapsValue12)) return false;
        final NullableArrayOfNullableMapsValue12 other = (NullableArrayOfNullableMapsValue12) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableMaps,
                other.nullableArrayOfNullableMaps))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableMapsValue12("
                + nullableArrayOfNullableMaps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Map<String, String>[] nullableArrayOfNullableMaps;

    @JsonProperty("nullableArrayOfNullableMaps")
    public java.util.Map<String, String>[] getNullableArrayOfNullableMaps() {
        return nullableArrayOfNullableMaps;
    }

    public NullableArrayOfNullableMapsValue12 setNullableArrayOfNullableMaps(
            final java.util.Map<String, String>[] value) {
        this.nullableArrayOfNullableMaps = value;

        return this;
    }
}
