package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableTexts_4 implements
        java.io.Serializable {
    public NullableArrayOfNullableTexts_4(
            final String[] nullableArrayOfNullableTexts,
            final String[] calculatedNullableArrayOfNullableTexts,
            final String[] persistedNullableArrayOfNullableTexts) {
        setNullableArrayOfNullableTexts(nullableArrayOfNullableTexts);
        this.calculatedNullableArrayOfNullableTexts = calculatedNullableArrayOfNullableTexts;
        this.persistedNullableArrayOfNullableTexts = persistedNullableArrayOfNullableTexts;
    }

    public NullableArrayOfNullableTexts_4() {
        this.calculatedNullableArrayOfNullableTexts = null;
        this.persistedNullableArrayOfNullableTexts = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 411625253;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableTexts_4)) return false;
        final NullableArrayOfNullableTexts_4 other = (NullableArrayOfNullableTexts_4) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableTexts,
                other.nullableArrayOfNullableTexts))) return false;
        if (!(this.calculatedNullableArrayOfNullableTexts == other.calculatedNullableArrayOfNullableTexts || this.calculatedNullableArrayOfNullableTexts != null
                && java.util.Arrays.equals(
                        this.calculatedNullableArrayOfNullableTexts,
                        other.calculatedNullableArrayOfNullableTexts)))
            return false;
        if (!(this.persistedNullableArrayOfNullableTexts == other.persistedNullableArrayOfNullableTexts || this.persistedNullableArrayOfNullableTexts != null
                && java.util.Arrays.equals(
                        this.persistedNullableArrayOfNullableTexts,
                        other.persistedNullableArrayOfNullableTexts)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableTexts_4(" + nullableArrayOfNullableTexts
                + ',' + calculatedNullableArrayOfNullableTexts + ','
                + persistedNullableArrayOfNullableTexts + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private String[] nullableArrayOfNullableTexts;

    @JsonProperty("nullableArrayOfNullableTexts")
    public String[] getNullableArrayOfNullableTexts() {
        return nullableArrayOfNullableTexts;
    }

    public NullableArrayOfNullableTexts_4 setNullableArrayOfNullableTexts(
            final String[] value) {
        this.nullableArrayOfNullableTexts = value;

        return this;
    }

    private final String[] calculatedNullableArrayOfNullableTexts;

    public String[] getCalculatedNullableArrayOfNullableTexts() {
        return this.calculatedNullableArrayOfNullableTexts;
    }

    private final String[] persistedNullableArrayOfNullableTexts;

    public String[] getPersistedNullableArrayOfNullableTexts() {
        return this.persistedNullableArrayOfNullableTexts;
    }
}
