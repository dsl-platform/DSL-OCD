package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableFloats_1 implements
        java.io.Serializable {
    public NullableSetOfNullableFloats_1(
            final java.util.Set<Float> nullableSetOfNullableFloats) {
        setNullableSetOfNullableFloats(nullableSetOfNullableFloats);
    }

    public NullableSetOfNullableFloats_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 377400198;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableFloats_1)) return false;
        final NullableSetOfNullableFloats_1 other = (NullableSetOfNullableFloats_1) obj;

        if (!(this.nullableSetOfNullableFloats == other.nullableSetOfNullableFloats || this.nullableSetOfNullableFloats != null
                && this.nullableSetOfNullableFloats
                        .equals(other.nullableSetOfNullableFloats)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableFloats_1(" + nullableSetOfNullableFloats
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Float> nullableSetOfNullableFloats;

    @JsonProperty("nullableSetOfNullableFloats")
    public java.util.Set<Float> getNullableSetOfNullableFloats() {
        return nullableSetOfNullableFloats;
    }

    public NullableSetOfNullableFloats_1 setNullableSetOfNullableFloats(
            final java.util.Set<Float> value) {
        this.nullableSetOfNullableFloats = value;

        return this;
    }
}
