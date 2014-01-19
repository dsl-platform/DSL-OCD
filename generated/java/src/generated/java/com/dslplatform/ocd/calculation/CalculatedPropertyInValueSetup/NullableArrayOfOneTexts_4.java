package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneTexts_4 implements java.io.Serializable {
    public NullableArrayOfOneTexts_4(
            final String[] nullableArrayOfOneTexts,
            final String[] calculatedNullableArrayOfOneTexts,
            final String[] persistedNullableArrayOfOneTexts) {
        setNullableArrayOfOneTexts(nullableArrayOfOneTexts);
        this.calculatedNullableArrayOfOneTexts = calculatedNullableArrayOfOneTexts;
        this.persistedNullableArrayOfOneTexts = persistedNullableArrayOfOneTexts;
    }

    public NullableArrayOfOneTexts_4() {
        this.calculatedNullableArrayOfOneTexts = null;
        this.persistedNullableArrayOfOneTexts = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1076874190;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneTexts_4)) return false;
        final NullableArrayOfOneTexts_4 other = (NullableArrayOfOneTexts_4) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfOneTexts,
                other.nullableArrayOfOneTexts))) return false;
        if (!(this.calculatedNullableArrayOfOneTexts == other.calculatedNullableArrayOfOneTexts || this.calculatedNullableArrayOfOneTexts != null
                && java.util.Arrays.equals(
                        this.calculatedNullableArrayOfOneTexts,
                        other.calculatedNullableArrayOfOneTexts)))
            return false;
        if (!(this.persistedNullableArrayOfOneTexts == other.persistedNullableArrayOfOneTexts || this.persistedNullableArrayOfOneTexts != null
                && java.util.Arrays.equals(
                        this.persistedNullableArrayOfOneTexts,
                        other.persistedNullableArrayOfOneTexts))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneTexts_4(" + nullableArrayOfOneTexts + ','
                + calculatedNullableArrayOfOneTexts + ','
                + persistedNullableArrayOfOneTexts + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private String[] nullableArrayOfOneTexts;

    @JsonProperty("nullableArrayOfOneTexts")
    public String[] getNullableArrayOfOneTexts() {
        return nullableArrayOfOneTexts;
    }

    public NullableArrayOfOneTexts_4 setNullableArrayOfOneTexts(
            final String[] value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableArrayOfOneTexts = value;

        return this;
    }

    private final String[] calculatedNullableArrayOfOneTexts;

    public String[] getCalculatedNullableArrayOfOneTexts() {
        return this.calculatedNullableArrayOfOneTexts;
    }

    private final String[] persistedNullableArrayOfOneTexts;

    public String[] getPersistedNullableArrayOfOneTexts() {
        return this.persistedNullableArrayOfOneTexts;
    }
}
