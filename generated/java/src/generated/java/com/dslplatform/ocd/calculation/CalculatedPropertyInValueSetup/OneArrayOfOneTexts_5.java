package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneTexts_5 implements java.io.Serializable {
    public OneArrayOfOneTexts_5(
            final String[] oneArrayOfOneTexts,
            final String[] calculatedOneArrayOfOneTexts,
            final String[] persistedOneArrayOfOneTexts) {
        setOneArrayOfOneTexts(oneArrayOfOneTexts);
        this.calculatedOneArrayOfOneTexts = calculatedOneArrayOfOneTexts;
        this.persistedOneArrayOfOneTexts = persistedOneArrayOfOneTexts;
    }

    public OneArrayOfOneTexts_5() {
        this.oneArrayOfOneTexts = new String[] {};
        this.calculatedOneArrayOfOneTexts = new String[] {};
        this.persistedOneArrayOfOneTexts = new String[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 449556026;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneTexts_5)) return false;
        final OneArrayOfOneTexts_5 other = (OneArrayOfOneTexts_5) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfOneTexts,
                other.oneArrayOfOneTexts))) return false;
        if (!(java.util.Arrays.equals(this.calculatedOneArrayOfOneTexts,
                other.calculatedOneArrayOfOneTexts))) return false;
        if (!(java.util.Arrays.equals(this.persistedOneArrayOfOneTexts,
                other.persistedOneArrayOfOneTexts))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneTexts_5(" + oneArrayOfOneTexts + ','
                + calculatedOneArrayOfOneTexts + ','
                + persistedOneArrayOfOneTexts + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private String[] oneArrayOfOneTexts;

    @JsonProperty("oneArrayOfOneTexts")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String[] getOneArrayOfOneTexts() {
        return oneArrayOfOneTexts;
    }

    public OneArrayOfOneTexts_5 setOneArrayOfOneTexts(final String[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneTexts\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneArrayOfOneTexts = value;

        return this;
    }

    private final String[] calculatedOneArrayOfOneTexts;

    public String[] getCalculatedOneArrayOfOneTexts() {
        return this.calculatedOneArrayOfOneTexts;
    }

    private final String[] persistedOneArrayOfOneTexts;

    public String[] getPersistedOneArrayOfOneTexts() {
        return this.persistedOneArrayOfOneTexts;
    }
}
