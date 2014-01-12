package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneFloatsValue1 implements java.io.Serializable {
    public OneSetOfOneFloatsValue1(
            final java.util.Set<Float> oneSetOfOneFloats) {
        setOneSetOfOneFloats(oneSetOfOneFloats);
    }

    public OneSetOfOneFloatsValue1() {
        this.oneSetOfOneFloats = new java.util.HashSet<Float>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2087522254;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneFloatsValue1)) return false;
        final OneSetOfOneFloatsValue1 other = (OneSetOfOneFloatsValue1) obj;

        if (!(this.oneSetOfOneFloats.equals(other.oneSetOfOneFloats)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneFloatsValue1(" + oneSetOfOneFloats + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Float> oneSetOfOneFloats;

    @JsonProperty("oneSetOfOneFloats")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<Float> getOneSetOfOneFloats() {
        return oneSetOfOneFloats;
    }

    public OneSetOfOneFloatsValue1 setOneSetOfOneFloats(
            final java.util.Set<Float> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneFloats\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneSetOfOneFloats = value;

        return this;
    }
}
