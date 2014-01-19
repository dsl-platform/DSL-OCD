package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneTexts_5 implements java.io.Serializable {
    public OneListOfOneTexts_5(
            final java.util.List<String> oneListOfOneTexts,
            final java.util.List<String> calculatedOneListOfOneTexts,
            final java.util.List<String> persistedOneListOfOneTexts) {
        setOneListOfOneTexts(oneListOfOneTexts);
        this.calculatedOneListOfOneTexts = calculatedOneListOfOneTexts;
        this.persistedOneListOfOneTexts = persistedOneListOfOneTexts;
    }

    public OneListOfOneTexts_5() {
        this.oneListOfOneTexts = new java.util.ArrayList<String>();
        this.calculatedOneListOfOneTexts = new java.util.ArrayList<String>();
        this.persistedOneListOfOneTexts = new java.util.ArrayList<String>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 721722133;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneTexts_5)) return false;
        final OneListOfOneTexts_5 other = (OneListOfOneTexts_5) obj;

        if (!(this.oneListOfOneTexts.equals(other.oneListOfOneTexts)))
            return false;
        if (!(this.calculatedOneListOfOneTexts
                .equals(other.calculatedOneListOfOneTexts))) return false;
        if (!(this.persistedOneListOfOneTexts
                .equals(other.persistedOneListOfOneTexts))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneTexts_5(" + oneListOfOneTexts + ','
                + calculatedOneListOfOneTexts + ','
                + persistedOneListOfOneTexts + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<String> oneListOfOneTexts;

    @JsonProperty("oneListOfOneTexts")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<String> getOneListOfOneTexts() {
        return oneListOfOneTexts;
    }

    public OneListOfOneTexts_5 setOneListOfOneTexts(
            final java.util.List<String> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneTexts\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneListOfOneTexts = value;

        return this;
    }

    private final java.util.List<String> calculatedOneListOfOneTexts;

    public java.util.List<String> getCalculatedOneListOfOneTexts() {
        return this.calculatedOneListOfOneTexts;
    }

    private final java.util.List<String> persistedOneListOfOneTexts;

    public java.util.List<String> getPersistedOneListOfOneTexts() {
        return this.persistedOneListOfOneTexts;
    }
}
