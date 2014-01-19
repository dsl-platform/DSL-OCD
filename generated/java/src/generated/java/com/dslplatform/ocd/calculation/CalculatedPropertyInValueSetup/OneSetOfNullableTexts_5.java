package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableTexts_5 implements java.io.Serializable {
    public OneSetOfNullableTexts_5(
            final java.util.Set<String> oneSetOfNullableTexts,
            final java.util.Set<String> calculatedOneSetOfNullableTexts,
            final java.util.Set<String> persistedOneSetOfNullableTexts) {
        setOneSetOfNullableTexts(oneSetOfNullableTexts);
        this.calculatedOneSetOfNullableTexts = calculatedOneSetOfNullableTexts;
        this.persistedOneSetOfNullableTexts = persistedOneSetOfNullableTexts;
    }

    public OneSetOfNullableTexts_5() {
        this.oneSetOfNullableTexts = new java.util.HashSet<String>();
        this.calculatedOneSetOfNullableTexts = new java.util.HashSet<String>();
        this.persistedOneSetOfNullableTexts = new java.util.HashSet<String>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 82707326;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableTexts_5)) return false;
        final OneSetOfNullableTexts_5 other = (OneSetOfNullableTexts_5) obj;

        if (!(this.oneSetOfNullableTexts.equals(other.oneSetOfNullableTexts)))
            return false;
        if (!(this.calculatedOneSetOfNullableTexts
                .equals(other.calculatedOneSetOfNullableTexts))) return false;
        if (!(this.persistedOneSetOfNullableTexts
                .equals(other.persistedOneSetOfNullableTexts))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableTexts_5(" + oneSetOfNullableTexts + ','
                + calculatedOneSetOfNullableTexts + ','
                + persistedOneSetOfNullableTexts + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<String> oneSetOfNullableTexts;

    @JsonProperty("oneSetOfNullableTexts")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<String> getOneSetOfNullableTexts() {
        return oneSetOfNullableTexts;
    }

    public OneSetOfNullableTexts_5 setOneSetOfNullableTexts(
            final java.util.Set<String> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableTexts\" cannot be null!");
        this.oneSetOfNullableTexts = value;

        return this;
    }

    private final java.util.Set<String> calculatedOneSetOfNullableTexts;

    public java.util.Set<String> getCalculatedOneSetOfNullableTexts() {
        return this.calculatedOneSetOfNullableTexts;
    }

    private final java.util.Set<String> persistedOneSetOfNullableTexts;

    public java.util.Set<String> getPersistedOneSetOfNullableTexts() {
        return this.persistedOneSetOfNullableTexts;
    }
}
