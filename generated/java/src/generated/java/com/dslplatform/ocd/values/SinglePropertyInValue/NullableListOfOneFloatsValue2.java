package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneFloatsValue2 implements
        java.io.Serializable {
    public NullableListOfOneFloatsValue2(
            final java.util.List<Float> nullableListOfOneFloats) {
        setNullableListOfOneFloats(nullableListOfOneFloats);
    }

    public NullableListOfOneFloatsValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 947640964;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneFloatsValue2)) return false;
        final NullableListOfOneFloatsValue2 other = (NullableListOfOneFloatsValue2) obj;

        if (!(this.nullableListOfOneFloats == other.nullableListOfOneFloats || this.nullableListOfOneFloats != null
                && this.nullableListOfOneFloats
                        .equals(other.nullableListOfOneFloats))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneFloatsValue2(" + nullableListOfOneFloats + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Float> nullableListOfOneFloats;

    @JsonProperty("nullableListOfOneFloats")
    public java.util.List<Float> getNullableListOfOneFloats() {
        return nullableListOfOneFloats;
    }

    public NullableListOfOneFloatsValue2 setNullableListOfOneFloats(
            final java.util.List<Float> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableListOfOneFloats = value;

        return this;
    }
}
