package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableDoubles_5 implements java.io.Serializable {
    public OneArrayOfNullableDoubles_5(
            final Double[] oneArrayOfNullableDoubles,
            final Double[] calculatedOneArrayOfNullableDoubles,
            final Double[] persistedOneArrayOfNullableDoubles) {
        setOneArrayOfNullableDoubles(oneArrayOfNullableDoubles);
        this.calculatedOneArrayOfNullableDoubles = calculatedOneArrayOfNullableDoubles;
        this.persistedOneArrayOfNullableDoubles = persistedOneArrayOfNullableDoubles;
    }

    public OneArrayOfNullableDoubles_5() {
        this.oneArrayOfNullableDoubles = new Double[] {};
        this.calculatedOneArrayOfNullableDoubles = new Double[] {};
        this.persistedOneArrayOfNullableDoubles = new Double[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1282548653;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableDoubles_5)) return false;
        final OneArrayOfNullableDoubles_5 other = (OneArrayOfNullableDoubles_5) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfNullableDoubles,
                other.oneArrayOfNullableDoubles))) return false;
        if (!(java.util.Arrays.equals(this.calculatedOneArrayOfNullableDoubles,
                other.calculatedOneArrayOfNullableDoubles))) return false;
        if (!(java.util.Arrays.equals(this.persistedOneArrayOfNullableDoubles,
                other.persistedOneArrayOfNullableDoubles))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableDoubles_5(" + oneArrayOfNullableDoubles + ','
                + calculatedOneArrayOfNullableDoubles + ','
                + persistedOneArrayOfNullableDoubles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Double[] oneArrayOfNullableDoubles;

    @JsonProperty("oneArrayOfNullableDoubles")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Double[] getOneArrayOfNullableDoubles() {
        return oneArrayOfNullableDoubles;
    }

    public OneArrayOfNullableDoubles_5 setOneArrayOfNullableDoubles(
            final Double[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableDoubles\" cannot be null!");
        this.oneArrayOfNullableDoubles = value;

        return this;
    }

    private final Double[] calculatedOneArrayOfNullableDoubles;

    public Double[] getCalculatedOneArrayOfNullableDoubles() {
        return this.calculatedOneArrayOfNullableDoubles;
    }

    private final Double[] persistedOneArrayOfNullableDoubles;

    public Double[] getPersistedOneArrayOfNullableDoubles() {
        return this.persistedOneArrayOfNullableDoubles;
    }
}
