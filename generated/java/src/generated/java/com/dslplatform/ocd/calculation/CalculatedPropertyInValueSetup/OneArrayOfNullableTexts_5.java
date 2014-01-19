package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableTexts_5 implements java.io.Serializable {
    public OneArrayOfNullableTexts_5(
            final String[] oneArrayOfNullableTexts,
            final String[] calculatedOneArrayOfNullableTexts,
            final String[] persistedOneArrayOfNullableTexts) {
        setOneArrayOfNullableTexts(oneArrayOfNullableTexts);
        this.calculatedOneArrayOfNullableTexts = calculatedOneArrayOfNullableTexts;
        this.persistedOneArrayOfNullableTexts = persistedOneArrayOfNullableTexts;
    }

    public OneArrayOfNullableTexts_5() {
        this.oneArrayOfNullableTexts = new String[] {};
        this.calculatedOneArrayOfNullableTexts = new String[] {};
        this.persistedOneArrayOfNullableTexts = new String[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 871772151;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableTexts_5)) return false;
        final OneArrayOfNullableTexts_5 other = (OneArrayOfNullableTexts_5) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfNullableTexts,
                other.oneArrayOfNullableTexts))) return false;
        if (!(java.util.Arrays.equals(this.calculatedOneArrayOfNullableTexts,
                other.calculatedOneArrayOfNullableTexts))) return false;
        if (!(java.util.Arrays.equals(this.persistedOneArrayOfNullableTexts,
                other.persistedOneArrayOfNullableTexts))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableTexts_5(" + oneArrayOfNullableTexts + ','
                + calculatedOneArrayOfNullableTexts + ','
                + persistedOneArrayOfNullableTexts + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private String[] oneArrayOfNullableTexts;

    @JsonProperty("oneArrayOfNullableTexts")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String[] getOneArrayOfNullableTexts() {
        return oneArrayOfNullableTexts;
    }

    public OneArrayOfNullableTexts_5 setOneArrayOfNullableTexts(
            final String[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableTexts\" cannot be null!");
        this.oneArrayOfNullableTexts = value;

        return this;
    }

    private final String[] calculatedOneArrayOfNullableTexts;

    public String[] getCalculatedOneArrayOfNullableTexts() {
        return this.calculatedOneArrayOfNullableTexts;
    }

    private final String[] persistedOneArrayOfNullableTexts;

    public String[] getPersistedOneArrayOfNullableTexts() {
        return this.persistedOneArrayOfNullableTexts;
    }
}
