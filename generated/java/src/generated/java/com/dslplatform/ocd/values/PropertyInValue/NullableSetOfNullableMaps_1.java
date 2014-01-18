package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableMaps_1 implements java.io.Serializable {
    public NullableSetOfNullableMaps_1(
            final java.util.Set<java.util.Map<String, String>> nullableSetOfNullableMaps) {
        setNullableSetOfNullableMaps(nullableSetOfNullableMaps);
    }

    public NullableSetOfNullableMaps_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2063583198;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableMaps_1)) return false;
        final NullableSetOfNullableMaps_1 other = (NullableSetOfNullableMaps_1) obj;

        if (!(this.nullableSetOfNullableMaps == other.nullableSetOfNullableMaps || this.nullableSetOfNullableMaps != null
                && this.nullableSetOfNullableMaps
                        .equals(other.nullableSetOfNullableMaps)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableMaps_1(" + nullableSetOfNullableMaps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.util.Map<String, String>> nullableSetOfNullableMaps;

    @JsonProperty("nullableSetOfNullableMaps")
    public java.util.Set<java.util.Map<String, String>> getNullableSetOfNullableMaps() {
        return nullableSetOfNullableMaps;
    }

    public NullableSetOfNullableMaps_1 setNullableSetOfNullableMaps(
            final java.util.Set<java.util.Map<String, String>> value) {
        this.nullableSetOfNullableMaps = value;

        return this;
    }
}
