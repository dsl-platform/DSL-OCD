package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableMapsValue3 implements
        java.io.Serializable {
    public NullableSetOfNullableMapsValue3(
            final java.util.Set<java.util.Map<String, String>> nullableSetOfNullableMaps) {
        setNullableSetOfNullableMaps(nullableSetOfNullableMaps);
    }

    public NullableSetOfNullableMapsValue3() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1947013996;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableMapsValue3)) return false;
        final NullableSetOfNullableMapsValue3 other = (NullableSetOfNullableMapsValue3) obj;

        if (!(this.nullableSetOfNullableMaps == other.nullableSetOfNullableMaps || this.nullableSetOfNullableMaps != null
                && this.nullableSetOfNullableMaps
                        .equals(other.nullableSetOfNullableMaps)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableMapsValue3(" + nullableSetOfNullableMaps
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.util.Map<String, String>> nullableSetOfNullableMaps;

    @JsonProperty("nullableSetOfNullableMaps")
    public java.util.Set<java.util.Map<String, String>> getNullableSetOfNullableMaps() {
        return nullableSetOfNullableMaps;
    }

    public NullableSetOfNullableMapsValue3 setNullableSetOfNullableMaps(
            final java.util.Set<java.util.Map<String, String>> value) {
        this.nullableSetOfNullableMaps = value;

        return this;
    }
}
