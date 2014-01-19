package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneTexts_4 implements java.io.Serializable {
    public NullableListOfOneTexts_4(
            final java.util.List<String> nullableListOfOneTexts,
            final java.util.List<String> calculatedNullableListOfOneTexts,
            final java.util.List<String> persistedNullableListOfOneTexts) {
        setNullableListOfOneTexts(nullableListOfOneTexts);
        this.calculatedNullableListOfOneTexts = calculatedNullableListOfOneTexts;
        this.persistedNullableListOfOneTexts = persistedNullableListOfOneTexts;
    }

    public NullableListOfOneTexts_4() {
        this.calculatedNullableListOfOneTexts = null;
        this.persistedNullableListOfOneTexts = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1177192041;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneTexts_4)) return false;
        final NullableListOfOneTexts_4 other = (NullableListOfOneTexts_4) obj;

        if (!(this.nullableListOfOneTexts == other.nullableListOfOneTexts || this.nullableListOfOneTexts != null
                && this.nullableListOfOneTexts
                        .equals(other.nullableListOfOneTexts))) return false;
        if (!(this.calculatedNullableListOfOneTexts == other.calculatedNullableListOfOneTexts || this.calculatedNullableListOfOneTexts != null
                && this.calculatedNullableListOfOneTexts
                        .equals(other.calculatedNullableListOfOneTexts)))
            return false;
        if (!(this.persistedNullableListOfOneTexts == other.persistedNullableListOfOneTexts || this.persistedNullableListOfOneTexts != null
                && this.persistedNullableListOfOneTexts
                        .equals(other.persistedNullableListOfOneTexts)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneTexts_4(" + nullableListOfOneTexts + ','
                + calculatedNullableListOfOneTexts + ','
                + persistedNullableListOfOneTexts + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<String> nullableListOfOneTexts;

    @JsonProperty("nullableListOfOneTexts")
    public java.util.List<String> getNullableListOfOneTexts() {
        return nullableListOfOneTexts;
    }

    public NullableListOfOneTexts_4 setNullableListOfOneTexts(
            final java.util.List<String> value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableListOfOneTexts = value;

        return this;
    }

    private final java.util.List<String> calculatedNullableListOfOneTexts;

    public java.util.List<String> getCalculatedNullableListOfOneTexts() {
        return this.calculatedNullableListOfOneTexts;
    }

    private final java.util.List<String> persistedNullableListOfOneTexts;

    public java.util.List<String> getPersistedNullableListOfOneTexts() {
        return this.persistedNullableListOfOneTexts;
    }
}
