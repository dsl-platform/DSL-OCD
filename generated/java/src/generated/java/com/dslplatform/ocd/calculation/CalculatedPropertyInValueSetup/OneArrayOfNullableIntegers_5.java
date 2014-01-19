package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableIntegers_5 implements java.io.Serializable {
    public OneArrayOfNullableIntegers_5(
            final Integer[] oneArrayOfNullableIntegers,
            final Integer[] calculatedOneArrayOfNullableIntegers,
            final Integer[] persistedOneArrayOfNullableIntegers) {
        setOneArrayOfNullableIntegers(oneArrayOfNullableIntegers);
        this.calculatedOneArrayOfNullableIntegers = calculatedOneArrayOfNullableIntegers;
        this.persistedOneArrayOfNullableIntegers = persistedOneArrayOfNullableIntegers;
    }

    public OneArrayOfNullableIntegers_5() {
        this.oneArrayOfNullableIntegers = new Integer[] {};
        this.calculatedOneArrayOfNullableIntegers = new Integer[] {};
        this.persistedOneArrayOfNullableIntegers = new Integer[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 45012256;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableIntegers_5)) return false;
        final OneArrayOfNullableIntegers_5 other = (OneArrayOfNullableIntegers_5) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfNullableIntegers,
                other.oneArrayOfNullableIntegers))) return false;
        if (!(java.util.Arrays.equals(
                this.calculatedOneArrayOfNullableIntegers,
                other.calculatedOneArrayOfNullableIntegers))) return false;
        if (!(java.util.Arrays.equals(this.persistedOneArrayOfNullableIntegers,
                other.persistedOneArrayOfNullableIntegers))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableIntegers_5(" + oneArrayOfNullableIntegers
                + ',' + calculatedOneArrayOfNullableIntegers + ','
                + persistedOneArrayOfNullableIntegers + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Integer[] oneArrayOfNullableIntegers;

    @JsonProperty("oneArrayOfNullableIntegers")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Integer[] getOneArrayOfNullableIntegers() {
        return oneArrayOfNullableIntegers;
    }

    public OneArrayOfNullableIntegers_5 setOneArrayOfNullableIntegers(
            final Integer[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableIntegers\" cannot be null!");
        this.oneArrayOfNullableIntegers = value;

        return this;
    }

    private final Integer[] calculatedOneArrayOfNullableIntegers;

    public Integer[] getCalculatedOneArrayOfNullableIntegers() {
        return this.calculatedOneArrayOfNullableIntegers;
    }

    private final Integer[] persistedOneArrayOfNullableIntegers;

    public Integer[] getPersistedOneArrayOfNullableIntegers() {
        return this.persistedOneArrayOfNullableIntegers;
    }
}
