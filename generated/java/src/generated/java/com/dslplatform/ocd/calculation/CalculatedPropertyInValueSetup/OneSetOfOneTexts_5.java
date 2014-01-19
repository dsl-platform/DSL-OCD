package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneTexts_5 implements java.io.Serializable {
    public OneSetOfOneTexts_5(
            final java.util.Set<String> oneSetOfOneTexts,
            final java.util.Set<String> calculatedOneSetOfOneTexts,
            final java.util.Set<String> persistedOneSetOfOneTexts) {
        setOneSetOfOneTexts(oneSetOfOneTexts);
        this.calculatedOneSetOfOneTexts = calculatedOneSetOfOneTexts;
        this.persistedOneSetOfOneTexts = persistedOneSetOfOneTexts;
    }

    public OneSetOfOneTexts_5() {
        this.oneSetOfOneTexts = new java.util.HashSet<String>();
        this.calculatedOneSetOfOneTexts = new java.util.HashSet<String>();
        this.persistedOneSetOfOneTexts = new java.util.HashSet<String>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2108343193;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneTexts_5)) return false;
        final OneSetOfOneTexts_5 other = (OneSetOfOneTexts_5) obj;

        if (!(this.oneSetOfOneTexts.equals(other.oneSetOfOneTexts)))
            return false;
        if (!(this.calculatedOneSetOfOneTexts
                .equals(other.calculatedOneSetOfOneTexts))) return false;
        if (!(this.persistedOneSetOfOneTexts
                .equals(other.persistedOneSetOfOneTexts))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneTexts_5(" + oneSetOfOneTexts + ','
                + calculatedOneSetOfOneTexts + ',' + persistedOneSetOfOneTexts
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<String> oneSetOfOneTexts;

    @JsonProperty("oneSetOfOneTexts")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<String> getOneSetOfOneTexts() {
        return oneSetOfOneTexts;
    }

    public OneSetOfOneTexts_5 setOneSetOfOneTexts(
            final java.util.Set<String> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneTexts\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneSetOfOneTexts = value;

        return this;
    }

    private final java.util.Set<String> calculatedOneSetOfOneTexts;

    public java.util.Set<String> getCalculatedOneSetOfOneTexts() {
        return this.calculatedOneSetOfOneTexts;
    }

    private final java.util.Set<String> persistedOneSetOfOneTexts;

    public java.util.Set<String> getPersistedOneSetOfOneTexts() {
        return this.persistedOneSetOfOneTexts;
    }
}
