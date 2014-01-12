package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneDoublesValue1 implements java.io.Serializable {
    public OneArrayOfOneDoublesValue1(
            final double[] oneArrayOfOneDoubles) {
        setOneArrayOfOneDoubles(oneArrayOfOneDoubles);
    }

    public OneArrayOfOneDoublesValue1() {
        this.oneArrayOfOneDoubles = new double[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 444124504;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneDoublesValue1)) return false;
        final OneArrayOfOneDoublesValue1 other = (OneArrayOfOneDoublesValue1) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfOneDoubles,
                other.oneArrayOfOneDoubles))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneDoublesValue1(" + oneArrayOfOneDoubles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private double[] oneArrayOfOneDoubles;

    @JsonProperty("oneArrayOfOneDoubles")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public double[] getOneArrayOfOneDoubles() {
        return oneArrayOfOneDoubles;
    }

    public OneArrayOfOneDoublesValue1 setOneArrayOfOneDoubles(
            final double[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneDoubles\" cannot be null!");
        this.oneArrayOfOneDoubles = value;

        return this;
    }
}
