package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableTexts_5 implements java.io.Serializable {
    public OneListOfNullableTexts_5(
            final java.util.List<String> oneListOfNullableTexts,
            final java.util.List<String> calculatedOneListOfNullableTexts,
            final java.util.List<String> persistedOneListOfNullableTexts) {
        setOneListOfNullableTexts(oneListOfNullableTexts);
        this.calculatedOneListOfNullableTexts = calculatedOneListOfNullableTexts;
        this.persistedOneListOfNullableTexts = persistedOneListOfNullableTexts;
    }

    public OneListOfNullableTexts_5() {
        this.oneListOfNullableTexts = new java.util.ArrayList<String>();
        this.calculatedOneListOfNullableTexts = new java.util.ArrayList<String>();
        this.persistedOneListOfNullableTexts = new java.util.ArrayList<String>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 782315482;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableTexts_5)) return false;
        final OneListOfNullableTexts_5 other = (OneListOfNullableTexts_5) obj;

        if (!(this.oneListOfNullableTexts.equals(other.oneListOfNullableTexts)))
            return false;
        if (!(this.calculatedOneListOfNullableTexts
                .equals(other.calculatedOneListOfNullableTexts))) return false;
        if (!(this.persistedOneListOfNullableTexts
                .equals(other.persistedOneListOfNullableTexts))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableTexts_5(" + oneListOfNullableTexts + ','
                + calculatedOneListOfNullableTexts + ','
                + persistedOneListOfNullableTexts + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<String> oneListOfNullableTexts;

    @JsonProperty("oneListOfNullableTexts")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<String> getOneListOfNullableTexts() {
        return oneListOfNullableTexts;
    }

    public OneListOfNullableTexts_5 setOneListOfNullableTexts(
            final java.util.List<String> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableTexts\" cannot be null!");
        this.oneListOfNullableTexts = value;

        return this;
    }

    private final java.util.List<String> calculatedOneListOfNullableTexts;

    public java.util.List<String> getCalculatedOneListOfNullableTexts() {
        return this.calculatedOneListOfNullableTexts;
    }

    private final java.util.List<String> persistedOneListOfNullableTexts;

    public java.util.List<String> getPersistedOneListOfNullableTexts() {
        return this.persistedOneListOfNullableTexts;
    }
}
