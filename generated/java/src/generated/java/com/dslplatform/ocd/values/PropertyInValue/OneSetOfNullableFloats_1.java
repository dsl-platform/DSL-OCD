package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableFloats_1 implements java.io.Serializable {
    public OneSetOfNullableFloats_1(
            final java.util.Set<Float> oneSetOfNullableFloats) {
        setOneSetOfNullableFloats(oneSetOfNullableFloats);
    }

    public OneSetOfNullableFloats_1() {
        this.oneSetOfNullableFloats = new java.util.HashSet<Float>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1444202993;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableFloats_1)) return false;
        final OneSetOfNullableFloats_1 other = (OneSetOfNullableFloats_1) obj;

        if (!(this.oneSetOfNullableFloats.equals(other.oneSetOfNullableFloats)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableFloats_1(" + oneSetOfNullableFloats + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Float> oneSetOfNullableFloats;

    @JsonProperty("oneSetOfNullableFloats")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<Float> getOneSetOfNullableFloats() {
        return oneSetOfNullableFloats;
    }

    public OneSetOfNullableFloats_1 setOneSetOfNullableFloats(
            final java.util.Set<Float> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableFloats\" cannot be null!");
        this.oneSetOfNullableFloats = value;

        return this;
    }
}
