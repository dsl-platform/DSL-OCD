package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneDoubles_1 implements java.io.Serializable {
    public OneListOfOneDoubles_1(
            final java.util.List<Double> oneListOfOneDoubles) {
        setOneListOfOneDoubles(oneListOfOneDoubles);
    }

    public OneListOfOneDoubles_1() {
        this.oneListOfOneDoubles = new java.util.ArrayList<Double>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 841154947;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneDoubles_1)) return false;
        final OneListOfOneDoubles_1 other = (OneListOfOneDoubles_1) obj;

        if (!(this.oneListOfOneDoubles.equals(other.oneListOfOneDoubles)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneDoubles_1(" + oneListOfOneDoubles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Double> oneListOfOneDoubles;

    @JsonProperty("oneListOfOneDoubles")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<Double> getOneListOfOneDoubles() {
        return oneListOfOneDoubles;
    }

    public OneListOfOneDoubles_1 setOneListOfOneDoubles(
            final java.util.List<Double> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneDoubles\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneListOfOneDoubles = value;

        return this;
    }
}
