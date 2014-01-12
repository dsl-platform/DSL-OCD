package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneDoublesValue6 implements java.io.Serializable {
    public OneArrayOfOneDoublesValue6(
            final double[] oneArrayOfOneDoubles) {
        setOneArrayOfOneDoubles(oneArrayOfOneDoubles);
    }

    public OneArrayOfOneDoublesValue6() {
        this.oneArrayOfOneDoubles = new double[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 847409031;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneDoublesValue6)) return false;
        final OneArrayOfOneDoublesValue6 other = (OneArrayOfOneDoublesValue6) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfOneDoubles,
                other.oneArrayOfOneDoubles))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneDoublesValue6(" + oneArrayOfOneDoubles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private double[] oneArrayOfOneDoubles;

    @JsonProperty("oneArrayOfOneDoubles")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public double[] getOneArrayOfOneDoubles() {
        return oneArrayOfOneDoubles;
    }

    public OneArrayOfOneDoublesValue6 setOneArrayOfOneDoubles(
            final double[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneDoubles\" cannot be null!");
        this.oneArrayOfOneDoubles = value;

        return this;
    }
}
