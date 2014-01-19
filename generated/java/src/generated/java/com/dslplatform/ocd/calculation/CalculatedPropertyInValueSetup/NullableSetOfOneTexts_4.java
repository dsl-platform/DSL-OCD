package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneTexts_4 implements java.io.Serializable {
    public NullableSetOfOneTexts_4(
            final java.util.Set<String> nullableSetOfOneTexts,
            final java.util.Set<String> calculatedNullableSetOfOneTexts,
            final java.util.Set<String> persistedNullableSetOfOneTexts) {
        setNullableSetOfOneTexts(nullableSetOfOneTexts);
        this.calculatedNullableSetOfOneTexts = calculatedNullableSetOfOneTexts;
        this.persistedNullableSetOfOneTexts = persistedNullableSetOfOneTexts;
    }

    public NullableSetOfOneTexts_4() {
        this.calculatedNullableSetOfOneTexts = null;
        this.persistedNullableSetOfOneTexts = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 774221399;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneTexts_4)) return false;
        final NullableSetOfOneTexts_4 other = (NullableSetOfOneTexts_4) obj;

        if (!(this.nullableSetOfOneTexts == other.nullableSetOfOneTexts || this.nullableSetOfOneTexts != null
                && this.nullableSetOfOneTexts
                        .equals(other.nullableSetOfOneTexts))) return false;
        if (!(this.calculatedNullableSetOfOneTexts == other.calculatedNullableSetOfOneTexts || this.calculatedNullableSetOfOneTexts != null
                && this.calculatedNullableSetOfOneTexts
                        .equals(other.calculatedNullableSetOfOneTexts)))
            return false;
        if (!(this.persistedNullableSetOfOneTexts == other.persistedNullableSetOfOneTexts || this.persistedNullableSetOfOneTexts != null
                && this.persistedNullableSetOfOneTexts
                        .equals(other.persistedNullableSetOfOneTexts)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneTexts_4(" + nullableSetOfOneTexts + ','
                + calculatedNullableSetOfOneTexts + ','
                + persistedNullableSetOfOneTexts + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<String> nullableSetOfOneTexts;

    @JsonProperty("nullableSetOfOneTexts")
    public java.util.Set<String> getNullableSetOfOneTexts() {
        return nullableSetOfOneTexts;
    }

    public NullableSetOfOneTexts_4 setNullableSetOfOneTexts(
            final java.util.Set<String> value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableSetOfOneTexts = value;

        return this;
    }

    private final java.util.Set<String> calculatedNullableSetOfOneTexts;

    public java.util.Set<String> getCalculatedNullableSetOfOneTexts() {
        return this.calculatedNullableSetOfOneTexts;
    }

    private final java.util.Set<String> persistedNullableSetOfOneTexts;

    public java.util.Set<String> getPersistedNullableSetOfOneTexts() {
        return this.persistedNullableSetOfOneTexts;
    }
}
