package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneIntegers_5 implements java.io.Serializable {
    public OneArrayOfOneIntegers_5(
            final int[] oneArrayOfOneIntegers,
            final int[] calculatedOneArrayOfOneIntegers,
            final int[] persistedOneArrayOfOneIntegers) {
        setOneArrayOfOneIntegers(oneArrayOfOneIntegers);
        this.calculatedOneArrayOfOneIntegers = calculatedOneArrayOfOneIntegers;
        this.persistedOneArrayOfOneIntegers = persistedOneArrayOfOneIntegers;
    }

    public OneArrayOfOneIntegers_5() {
        this.oneArrayOfOneIntegers = new int[] {};
        this.calculatedOneArrayOfOneIntegers = new int[] {};
        this.persistedOneArrayOfOneIntegers = new int[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 127778937;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneIntegers_5)) return false;
        final OneArrayOfOneIntegers_5 other = (OneArrayOfOneIntegers_5) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfOneIntegers,
                other.oneArrayOfOneIntegers))) return false;
        if (!(java.util.Arrays.equals(this.calculatedOneArrayOfOneIntegers,
                other.calculatedOneArrayOfOneIntegers))) return false;
        if (!(java.util.Arrays.equals(this.persistedOneArrayOfOneIntegers,
                other.persistedOneArrayOfOneIntegers))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneIntegers_5(" + oneArrayOfOneIntegers + ','
                + calculatedOneArrayOfOneIntegers + ','
                + persistedOneArrayOfOneIntegers + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private int[] oneArrayOfOneIntegers;

    @JsonProperty("oneArrayOfOneIntegers")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int[] getOneArrayOfOneIntegers() {
        return oneArrayOfOneIntegers;
    }

    public OneArrayOfOneIntegers_5 setOneArrayOfOneIntegers(final int[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneIntegers\" cannot be null!");
        this.oneArrayOfOneIntegers = value;

        return this;
    }

    private final int[] calculatedOneArrayOfOneIntegers;

    public int[] getCalculatedOneArrayOfOneIntegers() {
        return this.calculatedOneArrayOfOneIntegers;
    }

    private final int[] persistedOneArrayOfOneIntegers;

    public int[] getPersistedOneArrayOfOneIntegers() {
        return this.persistedOneArrayOfOneIntegers;
    }
}
