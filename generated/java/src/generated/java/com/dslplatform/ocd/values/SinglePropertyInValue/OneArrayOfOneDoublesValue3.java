package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneDoublesValue3 implements java.io.Serializable {
    public OneArrayOfOneDoublesValue3(
            final double[] oneArrayOfOneDoubles) {
        setOneArrayOfOneDoubles(oneArrayOfOneDoubles);
    }

    public OneArrayOfOneDoublesValue3() {
        this.oneArrayOfOneDoubles = new double[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1606923918;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneDoublesValue3)) return false;
        final OneArrayOfOneDoublesValue3 other = (OneArrayOfOneDoublesValue3) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfOneDoubles,
                other.oneArrayOfOneDoubles))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneDoublesValue3(" + oneArrayOfOneDoubles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private double[] oneArrayOfOneDoubles;

    @JsonProperty("oneArrayOfOneDoubles")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public double[] getOneArrayOfOneDoubles() {
        return oneArrayOfOneDoubles;
    }

    public OneArrayOfOneDoublesValue3 setOneArrayOfOneDoubles(
            final double[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneDoubles\" cannot be null!");
        this.oneArrayOfOneDoubles = value;

        return this;
    }
}
