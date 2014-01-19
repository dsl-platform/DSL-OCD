package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneDoubles_5 implements java.io.Serializable {
    public OneArrayOfOneDoubles_5(
            final double[] oneArrayOfOneDoubles,
            final double[] calculatedOneArrayOfOneDoubles,
            final double[] persistedOneArrayOfOneDoubles) {
        setOneArrayOfOneDoubles(oneArrayOfOneDoubles);
        this.calculatedOneArrayOfOneDoubles = calculatedOneArrayOfOneDoubles;
        this.persistedOneArrayOfOneDoubles = persistedOneArrayOfOneDoubles;
    }

    public OneArrayOfOneDoubles_5() {
        this.oneArrayOfOneDoubles = new double[] {};
        this.calculatedOneArrayOfOneDoubles = new double[] {};
        this.persistedOneArrayOfOneDoubles = new double[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 18492104;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneDoubles_5)) return false;
        final OneArrayOfOneDoubles_5 other = (OneArrayOfOneDoubles_5) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfOneDoubles,
                other.oneArrayOfOneDoubles))) return false;
        if (!(java.util.Arrays.equals(this.calculatedOneArrayOfOneDoubles,
                other.calculatedOneArrayOfOneDoubles))) return false;
        if (!(java.util.Arrays.equals(this.persistedOneArrayOfOneDoubles,
                other.persistedOneArrayOfOneDoubles))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneDoubles_5(" + oneArrayOfOneDoubles + ','
                + calculatedOneArrayOfOneDoubles + ','
                + persistedOneArrayOfOneDoubles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private double[] oneArrayOfOneDoubles;

    @JsonProperty("oneArrayOfOneDoubles")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public double[] getOneArrayOfOneDoubles() {
        return oneArrayOfOneDoubles;
    }

    public OneArrayOfOneDoubles_5 setOneArrayOfOneDoubles(final double[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneDoubles\" cannot be null!");
        this.oneArrayOfOneDoubles = value;

        return this;
    }

    private final double[] calculatedOneArrayOfOneDoubles;

    public double[] getCalculatedOneArrayOfOneDoubles() {
        return this.calculatedOneArrayOfOneDoubles;
    }

    private final double[] persistedOneArrayOfOneDoubles;

    public double[] getPersistedOneArrayOfOneDoubles() {
        return this.persistedOneArrayOfOneDoubles;
    }
}
