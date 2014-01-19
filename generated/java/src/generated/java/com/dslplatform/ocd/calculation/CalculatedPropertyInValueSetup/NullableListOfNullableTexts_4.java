package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableTexts_4 implements
        java.io.Serializable {
    public NullableListOfNullableTexts_4(
            final java.util.List<String> nullableListOfNullableTexts,
            final java.util.List<String> calculatedNullableListOfNullableTexts,
            final java.util.List<String> persistedNullableListOfNullableTexts) {
        setNullableListOfNullableTexts(nullableListOfNullableTexts);
        this.calculatedNullableListOfNullableTexts = calculatedNullableListOfNullableTexts;
        this.persistedNullableListOfNullableTexts = persistedNullableListOfNullableTexts;
    }

    public NullableListOfNullableTexts_4() {
        this.calculatedNullableListOfNullableTexts = null;
        this.persistedNullableListOfNullableTexts = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1000398766;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableTexts_4)) return false;
        final NullableListOfNullableTexts_4 other = (NullableListOfNullableTexts_4) obj;

        if (!(this.nullableListOfNullableTexts == other.nullableListOfNullableTexts || this.nullableListOfNullableTexts != null
                && this.nullableListOfNullableTexts
                        .equals(other.nullableListOfNullableTexts)))
            return false;
        if (!(this.calculatedNullableListOfNullableTexts == other.calculatedNullableListOfNullableTexts || this.calculatedNullableListOfNullableTexts != null
                && this.calculatedNullableListOfNullableTexts
                        .equals(other.calculatedNullableListOfNullableTexts)))
            return false;
        if (!(this.persistedNullableListOfNullableTexts == other.persistedNullableListOfNullableTexts || this.persistedNullableListOfNullableTexts != null
                && this.persistedNullableListOfNullableTexts
                        .equals(other.persistedNullableListOfNullableTexts)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableTexts_4(" + nullableListOfNullableTexts
                + ',' + calculatedNullableListOfNullableTexts + ','
                + persistedNullableListOfNullableTexts + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<String> nullableListOfNullableTexts;

    @JsonProperty("nullableListOfNullableTexts")
    public java.util.List<String> getNullableListOfNullableTexts() {
        return nullableListOfNullableTexts;
    }

    public NullableListOfNullableTexts_4 setNullableListOfNullableTexts(
            final java.util.List<String> value) {
        this.nullableListOfNullableTexts = value;

        return this;
    }

    private final java.util.List<String> calculatedNullableListOfNullableTexts;

    public java.util.List<String> getCalculatedNullableListOfNullableTexts() {
        return this.calculatedNullableListOfNullableTexts;
    }

    private final java.util.List<String> persistedNullableListOfNullableTexts;

    public java.util.List<String> getPersistedNullableListOfNullableTexts() {
        return this.persistedNullableListOfNullableTexts;
    }
}
