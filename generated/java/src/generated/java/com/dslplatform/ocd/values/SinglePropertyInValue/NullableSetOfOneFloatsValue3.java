package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneFloatsValue3 implements java.io.Serializable {
    public NullableSetOfOneFloatsValue3(
            final java.util.Set<Float> nullableSetOfOneFloats) {
        setNullableSetOfOneFloats(nullableSetOfOneFloats);
    }

    public NullableSetOfOneFloatsValue3() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2106778353;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneFloatsValue3)) return false;
        final NullableSetOfOneFloatsValue3 other = (NullableSetOfOneFloatsValue3) obj;

        if (!(this.nullableSetOfOneFloats == other.nullableSetOfOneFloats || this.nullableSetOfOneFloats != null
                && this.nullableSetOfOneFloats
                        .equals(other.nullableSetOfOneFloats))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneFloatsValue3(" + nullableSetOfOneFloats + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Float> nullableSetOfOneFloats;

    @JsonProperty("nullableSetOfOneFloats")
    public java.util.Set<Float> getNullableSetOfOneFloats() {
        return nullableSetOfOneFloats;
    }

    public NullableSetOfOneFloatsValue3 setNullableSetOfOneFloats(
            final java.util.Set<Float> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableSetOfOneFloats = value;

        return this;
    }
}
