package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableMapsValue2 implements
        java.io.Serializable {
    public NullableSetOfNullableMapsValue2(
            final java.util.Set<java.util.Map<String, String>> nullableSetOfNullableMaps) {
        setNullableSetOfNullableMaps(nullableSetOfNullableMaps);
    }

    public NullableSetOfNullableMapsValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1947013997;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableMapsValue2)) return false;
        final NullableSetOfNullableMapsValue2 other = (NullableSetOfNullableMapsValue2) obj;

        if (!(this.nullableSetOfNullableMaps == other.nullableSetOfNullableMaps || this.nullableSetOfNullableMaps != null
                && this.nullableSetOfNullableMaps
                        .equals(other.nullableSetOfNullableMaps)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableMapsValue2(" + nullableSetOfNullableMaps
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.util.Map<String, String>> nullableSetOfNullableMaps;

    @JsonProperty("nullableSetOfNullableMaps")
    public java.util.Set<java.util.Map<String, String>> getNullableSetOfNullableMaps() {
        return nullableSetOfNullableMaps;
    }

    public NullableSetOfNullableMapsValue2 setNullableSetOfNullableMaps(
            final java.util.Set<java.util.Map<String, String>> value) {
        this.nullableSetOfNullableMaps = value;

        return this;
    }
}
