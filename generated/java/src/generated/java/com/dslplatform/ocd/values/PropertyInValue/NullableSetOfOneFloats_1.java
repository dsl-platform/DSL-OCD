package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneFloats_1 implements java.io.Serializable {
    public NullableSetOfOneFloats_1(
            final java.util.Set<Float> nullableSetOfOneFloats) {
        setNullableSetOfOneFloats(nullableSetOfOneFloats);
    }

    public NullableSetOfOneFloats_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 142554325;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneFloats_1)) return false;
        final NullableSetOfOneFloats_1 other = (NullableSetOfOneFloats_1) obj;

        if (!(this.nullableSetOfOneFloats == other.nullableSetOfOneFloats || this.nullableSetOfOneFloats != null
                && this.nullableSetOfOneFloats
                        .equals(other.nullableSetOfOneFloats))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneFloats_1(" + nullableSetOfOneFloats + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Float> nullableSetOfOneFloats;

    @JsonProperty("nullableSetOfOneFloats")
    public java.util.Set<Float> getNullableSetOfOneFloats() {
        return nullableSetOfOneFloats;
    }

    public NullableSetOfOneFloats_1 setNullableSetOfOneFloats(
            final java.util.Set<Float> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableSetOfOneFloats = value;

        return this;
    }
}
