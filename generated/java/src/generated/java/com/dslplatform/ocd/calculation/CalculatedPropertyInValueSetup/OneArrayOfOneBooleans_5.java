package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneBooleans_5 implements java.io.Serializable {
    public OneArrayOfOneBooleans_5(
            final boolean[] oneArrayOfOneBooleans,
            final boolean[] calculatedOneArrayOfOneBooleans,
            final boolean[] persistedOneArrayOfOneBooleans) {
        setOneArrayOfOneBooleans(oneArrayOfOneBooleans);
        this.calculatedOneArrayOfOneBooleans = calculatedOneArrayOfOneBooleans;
        this.persistedOneArrayOfOneBooleans = persistedOneArrayOfOneBooleans;
    }

    public OneArrayOfOneBooleans_5() {
        this.oneArrayOfOneBooleans = new boolean[] {};
        this.calculatedOneArrayOfOneBooleans = new boolean[] {};
        this.persistedOneArrayOfOneBooleans = new boolean[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1529665011;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneBooleans_5)) return false;
        final OneArrayOfOneBooleans_5 other = (OneArrayOfOneBooleans_5) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfOneBooleans,
                other.oneArrayOfOneBooleans))) return false;
        if (!(java.util.Arrays.equals(this.calculatedOneArrayOfOneBooleans,
                other.calculatedOneArrayOfOneBooleans))) return false;
        if (!(java.util.Arrays.equals(this.persistedOneArrayOfOneBooleans,
                other.persistedOneArrayOfOneBooleans))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneBooleans_5(" + oneArrayOfOneBooleans + ','
                + calculatedOneArrayOfOneBooleans + ','
                + persistedOneArrayOfOneBooleans + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private boolean[] oneArrayOfOneBooleans;

    @JsonProperty("oneArrayOfOneBooleans")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public boolean[] getOneArrayOfOneBooleans() {
        return oneArrayOfOneBooleans;
    }

    public OneArrayOfOneBooleans_5 setOneArrayOfOneBooleans(
            final boolean[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneBooleans\" cannot be null!");
        this.oneArrayOfOneBooleans = value;

        return this;
    }

    private final boolean[] calculatedOneArrayOfOneBooleans;

    public boolean[] getCalculatedOneArrayOfOneBooleans() {
        return this.calculatedOneArrayOfOneBooleans;
    }

    private final boolean[] persistedOneArrayOfOneBooleans;

    public boolean[] getPersistedOneArrayOfOneBooleans() {
        return this.persistedOneArrayOfOneBooleans;
    }
}
