package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableBooleans_5 implements java.io.Serializable {
    public OneArrayOfNullableBooleans_5(
            final Boolean[] oneArrayOfNullableBooleans,
            final Boolean[] calculatedOneArrayOfNullableBooleans,
            final Boolean[] persistedOneArrayOfNullableBooleans) {
        setOneArrayOfNullableBooleans(oneArrayOfNullableBooleans);
        this.calculatedOneArrayOfNullableBooleans = calculatedOneArrayOfNullableBooleans;
        this.persistedOneArrayOfNullableBooleans = persistedOneArrayOfNullableBooleans;
    }

    public OneArrayOfNullableBooleans_5() {
        this.oneArrayOfNullableBooleans = new Boolean[] {};
        this.calculatedOneArrayOfNullableBooleans = new Boolean[] {};
        this.persistedOneArrayOfNullableBooleans = new Boolean[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1210536278;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableBooleans_5)) return false;
        final OneArrayOfNullableBooleans_5 other = (OneArrayOfNullableBooleans_5) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfNullableBooleans,
                other.oneArrayOfNullableBooleans))) return false;
        if (!(java.util.Arrays.equals(
                this.calculatedOneArrayOfNullableBooleans,
                other.calculatedOneArrayOfNullableBooleans))) return false;
        if (!(java.util.Arrays.equals(this.persistedOneArrayOfNullableBooleans,
                other.persistedOneArrayOfNullableBooleans))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableBooleans_5(" + oneArrayOfNullableBooleans
                + ',' + calculatedOneArrayOfNullableBooleans + ','
                + persistedOneArrayOfNullableBooleans + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Boolean[] oneArrayOfNullableBooleans;

    @JsonProperty("oneArrayOfNullableBooleans")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Boolean[] getOneArrayOfNullableBooleans() {
        return oneArrayOfNullableBooleans;
    }

    public OneArrayOfNullableBooleans_5 setOneArrayOfNullableBooleans(
            final Boolean[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableBooleans\" cannot be null!");
        this.oneArrayOfNullableBooleans = value;

        return this;
    }

    private final Boolean[] calculatedOneArrayOfNullableBooleans;

    public Boolean[] getCalculatedOneArrayOfNullableBooleans() {
        return this.calculatedOneArrayOfNullableBooleans;
    }

    private final Boolean[] persistedOneArrayOfNullableBooleans;

    public Boolean[] getPersistedOneArrayOfNullableBooleans() {
        return this.persistedOneArrayOfNullableBooleans;
    }
}
