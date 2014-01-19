package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableStrings_5 implements java.io.Serializable {
    public OneArrayOfNullableStrings_5(
            final String[] oneArrayOfNullableStrings,
            final String[] calculatedOneArrayOfNullableStrings,
            final String[] persistedOneArrayOfNullableStrings) {
        setOneArrayOfNullableStrings(oneArrayOfNullableStrings);
        this.calculatedOneArrayOfNullableStrings = calculatedOneArrayOfNullableStrings;
        this.persistedOneArrayOfNullableStrings = persistedOneArrayOfNullableStrings;
    }

    public OneArrayOfNullableStrings_5() {
        this.oneArrayOfNullableStrings = new String[] {};
        this.calculatedOneArrayOfNullableStrings = new String[] {};
        this.persistedOneArrayOfNullableStrings = new String[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1045741889;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableStrings_5)) return false;
        final OneArrayOfNullableStrings_5 other = (OneArrayOfNullableStrings_5) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfNullableStrings,
                other.oneArrayOfNullableStrings))) return false;
        if (!(java.util.Arrays.equals(this.calculatedOneArrayOfNullableStrings,
                other.calculatedOneArrayOfNullableStrings))) return false;
        if (!(java.util.Arrays.equals(this.persistedOneArrayOfNullableStrings,
                other.persistedOneArrayOfNullableStrings))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableStrings_5(" + oneArrayOfNullableStrings + ','
                + calculatedOneArrayOfNullableStrings + ','
                + persistedOneArrayOfNullableStrings + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private String[] oneArrayOfNullableStrings;

    @JsonProperty("oneArrayOfNullableStrings")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String[] getOneArrayOfNullableStrings() {
        return oneArrayOfNullableStrings;
    }

    public OneArrayOfNullableStrings_5 setOneArrayOfNullableStrings(
            final String[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableStrings\" cannot be null!");
        this.oneArrayOfNullableStrings = value;

        return this;
    }

    private final String[] calculatedOneArrayOfNullableStrings;

    public String[] getCalculatedOneArrayOfNullableStrings() {
        return this.calculatedOneArrayOfNullableStrings;
    }

    private final String[] persistedOneArrayOfNullableStrings;

    public String[] getPersistedOneArrayOfNullableStrings() {
        return this.persistedOneArrayOfNullableStrings;
    }
}
