package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableFloatsValue1 implements
        java.io.Serializable {
    public NullableListOfNullableFloatsValue1(
            final java.util.List<Float> nullableListOfNullableFloats) {
        setNullableListOfNullableFloats(nullableListOfNullableFloats);
    }

    public NullableListOfNullableFloatsValue1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2132204016;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableFloatsValue1)) return false;
        final NullableListOfNullableFloatsValue1 other = (NullableListOfNullableFloatsValue1) obj;

        if (!(this.nullableListOfNullableFloats == other.nullableListOfNullableFloats || this.nullableListOfNullableFloats != null
                && this.nullableListOfNullableFloats
                        .equals(other.nullableListOfNullableFloats)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableFloatsValue1("
                + nullableListOfNullableFloats + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Float> nullableListOfNullableFloats;

    @JsonProperty("nullableListOfNullableFloats")
    public java.util.List<Float> getNullableListOfNullableFloats() {
        return nullableListOfNullableFloats;
    }

    public NullableListOfNullableFloatsValue1 setNullableListOfNullableFloats(
            final java.util.List<Float> value) {
        this.nullableListOfNullableFloats = value;

        return this;
    }
}
