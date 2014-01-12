package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableFloatsValue1 implements java.io.Serializable {
    public OneSetOfNullableFloatsValue1(
            final java.util.Set<Float> oneSetOfNullableFloats) {
        setOneSetOfNullableFloats(oneSetOfNullableFloats);
    }

    public OneSetOfNullableFloatsValue1() {
        this.oneSetOfNullableFloats = new java.util.HashSet<Float>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1352416371;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableFloatsValue1)) return false;
        final OneSetOfNullableFloatsValue1 other = (OneSetOfNullableFloatsValue1) obj;

        if (!(this.oneSetOfNullableFloats.equals(other.oneSetOfNullableFloats)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableFloatsValue1(" + oneSetOfNullableFloats + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Float> oneSetOfNullableFloats;

    @JsonProperty("oneSetOfNullableFloats")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<Float> getOneSetOfNullableFloats() {
        return oneSetOfNullableFloats;
    }

    public OneSetOfNullableFloatsValue1 setOneSetOfNullableFloats(
            final java.util.Set<Float> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableFloats\" cannot be null!");
        this.oneSetOfNullableFloats = value;

        return this;
    }
}
