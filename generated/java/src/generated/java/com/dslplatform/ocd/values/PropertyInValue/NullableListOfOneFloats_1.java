package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneFloats_1 implements java.io.Serializable {
    public NullableListOfOneFloats_1(
            final java.util.List<Float> nullableListOfOneFloats) {
        setNullableListOfOneFloats(nullableListOfOneFloats);
    }

    public NullableListOfOneFloats_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 881314309;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneFloats_1)) return false;
        final NullableListOfOneFloats_1 other = (NullableListOfOneFloats_1) obj;

        if (!(this.nullableListOfOneFloats == other.nullableListOfOneFloats || this.nullableListOfOneFloats != null
                && this.nullableListOfOneFloats
                        .equals(other.nullableListOfOneFloats))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneFloats_1(" + nullableListOfOneFloats + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Float> nullableListOfOneFloats;

    @JsonProperty("nullableListOfOneFloats")
    public java.util.List<Float> getNullableListOfOneFloats() {
        return nullableListOfOneFloats;
    }

    public NullableListOfOneFloats_1 setNullableListOfOneFloats(
            final java.util.List<Float> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableListOfOneFloats = value;

        return this;
    }
}
