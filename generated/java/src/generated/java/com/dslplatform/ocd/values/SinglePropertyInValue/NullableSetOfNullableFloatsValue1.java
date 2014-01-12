package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableFloatsValue1 implements
        java.io.Serializable {
    public NullableSetOfNullableFloatsValue1(
            final java.util.Set<Float> nullableSetOfNullableFloats) {
        setNullableSetOfNullableFloats(nullableSetOfNullableFloats);
    }

    public NullableSetOfNullableFloatsValue1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2078047706;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableFloatsValue1)) return false;
        final NullableSetOfNullableFloatsValue1 other = (NullableSetOfNullableFloatsValue1) obj;

        if (!(this.nullableSetOfNullableFloats == other.nullableSetOfNullableFloats || this.nullableSetOfNullableFloats != null
                && this.nullableSetOfNullableFloats
                        .equals(other.nullableSetOfNullableFloats)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableFloatsValue1("
                + nullableSetOfNullableFloats + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Float> nullableSetOfNullableFloats;

    @JsonProperty("nullableSetOfNullableFloats")
    public java.util.Set<Float> getNullableSetOfNullableFloats() {
        return nullableSetOfNullableFloats;
    }

    public NullableSetOfNullableFloatsValue1 setNullableSetOfNullableFloats(
            final java.util.Set<Float> value) {
        this.nullableSetOfNullableFloats = value;

        return this;
    }
}
