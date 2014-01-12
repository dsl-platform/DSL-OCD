package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneDoublesValue1 implements java.io.Serializable {
    public OneListOfOneDoublesValue1(
            final java.util.List<Double> oneListOfOneDoubles) {
        setOneListOfOneDoubles(oneListOfOneDoubles);
    }

    public OneListOfOneDoublesValue1() {
        this.oneListOfOneDoubles = new java.util.ArrayList<Double>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1812184017;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneDoublesValue1)) return false;
        final OneListOfOneDoublesValue1 other = (OneListOfOneDoublesValue1) obj;

        if (!(this.oneListOfOneDoubles.equals(other.oneListOfOneDoubles)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneDoublesValue1(" + oneListOfOneDoubles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Double> oneListOfOneDoubles;

    @JsonProperty("oneListOfOneDoubles")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<Double> getOneListOfOneDoubles() {
        return oneListOfOneDoubles;
    }

    public OneListOfOneDoublesValue1 setOneListOfOneDoubles(
            final java.util.List<Double> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneDoubles\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneListOfOneDoubles = value;

        return this;
    }
}
