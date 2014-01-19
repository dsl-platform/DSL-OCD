package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneStrings_5 implements java.io.Serializable {
    public OneArrayOfOneStrings_5(
            final String[] oneArrayOfOneStrings,
            final String[] calculatedOneArrayOfOneStrings,
            final String[] persistedOneArrayOfOneStrings) {
        setOneArrayOfOneStrings(oneArrayOfOneStrings);
        this.calculatedOneArrayOfOneStrings = calculatedOneArrayOfOneStrings;
        this.persistedOneArrayOfOneStrings = persistedOneArrayOfOneStrings;
    }

    public OneArrayOfOneStrings_5() {
        this.oneArrayOfOneStrings = new String[] {};
        this.calculatedOneArrayOfOneStrings = new String[] {};
        this.persistedOneArrayOfOneStrings = new String[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1922123524;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneStrings_5)) return false;
        final OneArrayOfOneStrings_5 other = (OneArrayOfOneStrings_5) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfOneStrings,
                other.oneArrayOfOneStrings))) return false;
        if (!(java.util.Arrays.equals(this.calculatedOneArrayOfOneStrings,
                other.calculatedOneArrayOfOneStrings))) return false;
        if (!(java.util.Arrays.equals(this.persistedOneArrayOfOneStrings,
                other.persistedOneArrayOfOneStrings))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneStrings_5(" + oneArrayOfOneStrings + ','
                + calculatedOneArrayOfOneStrings + ','
                + persistedOneArrayOfOneStrings + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private String[] oneArrayOfOneStrings;

    @JsonProperty("oneArrayOfOneStrings")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String[] getOneArrayOfOneStrings() {
        return oneArrayOfOneStrings;
    }

    public OneArrayOfOneStrings_5 setOneArrayOfOneStrings(final String[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneStrings\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneArrayOfOneStrings = value;

        return this;
    }

    private final String[] calculatedOneArrayOfOneStrings;

    public String[] getCalculatedOneArrayOfOneStrings() {
        return this.calculatedOneArrayOfOneStrings;
    }

    private final String[] persistedOneArrayOfOneStrings;

    public String[] getPersistedOneArrayOfOneStrings() {
        return this.persistedOneArrayOfOneStrings;
    }
}
