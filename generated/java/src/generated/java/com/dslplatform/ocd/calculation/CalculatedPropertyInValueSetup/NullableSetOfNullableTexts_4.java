package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableTexts_4 implements java.io.Serializable {
    public NullableSetOfNullableTexts_4(
            final java.util.Set<String> nullableSetOfNullableTexts,
            final java.util.Set<String> calculatedNullableSetOfNullableTexts,
            final java.util.Set<String> persistedNullableSetOfNullableTexts) {
        setNullableSetOfNullableTexts(nullableSetOfNullableTexts);
        this.calculatedNullableSetOfNullableTexts = calculatedNullableSetOfNullableTexts;
        this.persistedNullableSetOfNullableTexts = persistedNullableSetOfNullableTexts;
    }

    public NullableSetOfNullableTexts_4() {
        this.calculatedNullableSetOfNullableTexts = null;
        this.persistedNullableSetOfNullableTexts = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1713521988;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableTexts_4)) return false;
        final NullableSetOfNullableTexts_4 other = (NullableSetOfNullableTexts_4) obj;

        if (!(this.nullableSetOfNullableTexts == other.nullableSetOfNullableTexts || this.nullableSetOfNullableTexts != null
                && this.nullableSetOfNullableTexts
                        .equals(other.nullableSetOfNullableTexts)))
            return false;
        if (!(this.calculatedNullableSetOfNullableTexts == other.calculatedNullableSetOfNullableTexts || this.calculatedNullableSetOfNullableTexts != null
                && this.calculatedNullableSetOfNullableTexts
                        .equals(other.calculatedNullableSetOfNullableTexts)))
            return false;
        if (!(this.persistedNullableSetOfNullableTexts == other.persistedNullableSetOfNullableTexts || this.persistedNullableSetOfNullableTexts != null
                && this.persistedNullableSetOfNullableTexts
                        .equals(other.persistedNullableSetOfNullableTexts)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableTexts_4(" + nullableSetOfNullableTexts
                + ',' + calculatedNullableSetOfNullableTexts + ','
                + persistedNullableSetOfNullableTexts + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<String> nullableSetOfNullableTexts;

    @JsonProperty("nullableSetOfNullableTexts")
    public java.util.Set<String> getNullableSetOfNullableTexts() {
        return nullableSetOfNullableTexts;
    }

    public NullableSetOfNullableTexts_4 setNullableSetOfNullableTexts(
            final java.util.Set<String> value) {
        this.nullableSetOfNullableTexts = value;

        return this;
    }

    private final java.util.Set<String> calculatedNullableSetOfNullableTexts;

    public java.util.Set<String> getCalculatedNullableSetOfNullableTexts() {
        return this.calculatedNullableSetOfNullableTexts;
    }

    private final java.util.Set<String> persistedNullableSetOfNullableTexts;

    public java.util.Set<String> getPersistedNullableSetOfNullableTexts() {
        return this.persistedNullableSetOfNullableTexts;
    }
}
