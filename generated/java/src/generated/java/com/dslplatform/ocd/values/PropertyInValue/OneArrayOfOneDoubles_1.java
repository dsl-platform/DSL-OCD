package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneDoubles_1 implements java.io.Serializable {
    public OneArrayOfOneDoubles_1(
            final double[] oneArrayOfOneDoubles) {
        setOneArrayOfOneDoubles(oneArrayOfOneDoubles);
    }

    public OneArrayOfOneDoubles_1() {
        this.oneArrayOfOneDoubles = new double[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1987860572;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneDoubles_1)) return false;
        final OneArrayOfOneDoubles_1 other = (OneArrayOfOneDoubles_1) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfOneDoubles,
                other.oneArrayOfOneDoubles))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneDoubles_1(" + oneArrayOfOneDoubles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private double[] oneArrayOfOneDoubles;

    @JsonProperty("oneArrayOfOneDoubles")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public double[] getOneArrayOfOneDoubles() {
        return oneArrayOfOneDoubles;
    }

    public OneArrayOfOneDoubles_1 setOneArrayOfOneDoubles(final double[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneDoubles\" cannot be null!");
        this.oneArrayOfOneDoubles = value;

        return this;
    }
}
