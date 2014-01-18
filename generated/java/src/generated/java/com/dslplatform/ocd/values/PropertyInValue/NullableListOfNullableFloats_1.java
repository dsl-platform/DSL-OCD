package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableFloats_1 implements
        java.io.Serializable {
    public NullableListOfNullableFloats_1(
            final java.util.List<Float> nullableListOfNullableFloats) {
        setNullableListOfNullableFloats(nullableListOfNullableFloats);
    }

    public NullableListOfNullableFloats_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 161060524;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableFloats_1)) return false;
        final NullableListOfNullableFloats_1 other = (NullableListOfNullableFloats_1) obj;

        if (!(this.nullableListOfNullableFloats == other.nullableListOfNullableFloats || this.nullableListOfNullableFloats != null
                && this.nullableListOfNullableFloats
                        .equals(other.nullableListOfNullableFloats)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableFloats_1(" + nullableListOfNullableFloats
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Float> nullableListOfNullableFloats;

    @JsonProperty("nullableListOfNullableFloats")
    public java.util.List<Float> getNullableListOfNullableFloats() {
        return nullableListOfNullableFloats;
    }

    public NullableListOfNullableFloats_1 setNullableListOfNullableFloats(
            final java.util.List<Float> value) {
        this.nullableListOfNullableFloats = value;

        return this;
    }
}
