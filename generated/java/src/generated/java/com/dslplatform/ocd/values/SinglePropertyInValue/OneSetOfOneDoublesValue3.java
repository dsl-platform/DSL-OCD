package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneDoublesValue3 implements java.io.Serializable {
    public OneSetOfOneDoublesValue3(
            final java.util.Set<Double> oneSetOfOneDoubles) {
        setOneSetOfOneDoubles(oneSetOfOneDoubles);
    }

    public OneSetOfOneDoublesValue3() {
        this.oneSetOfOneDoubles = new java.util.HashSet<Double>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1697803705;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneDoublesValue3)) return false;
        final OneSetOfOneDoublesValue3 other = (OneSetOfOneDoublesValue3) obj;

        if (!(this.oneSetOfOneDoubles.equals(other.oneSetOfOneDoubles)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneDoublesValue3(" + oneSetOfOneDoubles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Double> oneSetOfOneDoubles;

    @JsonProperty("oneSetOfOneDoubles")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<Double> getOneSetOfOneDoubles() {
        return oneSetOfOneDoubles;
    }

    public OneSetOfOneDoublesValue3 setOneSetOfOneDoubles(
            final java.util.Set<Double> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneDoubles\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneSetOfOneDoubles = value;

        return this;
    }
}
