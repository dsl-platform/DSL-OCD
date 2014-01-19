package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableStringWithMaxLengthOf9_4 implements
        java.io.Serializable {
    public NullableStringWithMaxLengthOf9_4(
            final String nullableStringWithMaxLengthOf9,
            final String calculatedNullableStringWithMaxLengthOf9,
            final String persistedNullableStringWithMaxLengthOf9) {
        setNullableStringWithMaxLengthOf9(nullableStringWithMaxLengthOf9);
        this.calculatedNullableStringWithMaxLengthOf9 = calculatedNullableStringWithMaxLengthOf9;
        this.persistedNullableStringWithMaxLengthOf9 = persistedNullableStringWithMaxLengthOf9;
    }

    public NullableStringWithMaxLengthOf9_4() {
        this.calculatedNullableStringWithMaxLengthOf9 = null;
        this.persistedNullableStringWithMaxLengthOf9 = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 65717015;
        result = prime
                * result
                + (this.nullableStringWithMaxLengthOf9 != null
                        ? this.nullableStringWithMaxLengthOf9.hashCode()
                        : 0);
        result = prime
                * result
                + (this.calculatedNullableStringWithMaxLengthOf9 != null
                        ? this.calculatedNullableStringWithMaxLengthOf9
                                .hashCode() : 0);
        result = prime
                * result
                + (this.persistedNullableStringWithMaxLengthOf9 != null
                        ? this.persistedNullableStringWithMaxLengthOf9
                                .hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableStringWithMaxLengthOf9_4)) return false;
        final NullableStringWithMaxLengthOf9_4 other = (NullableStringWithMaxLengthOf9_4) obj;

        if (!(this.nullableStringWithMaxLengthOf9 == other.nullableStringWithMaxLengthOf9 || this.nullableStringWithMaxLengthOf9 != null
                && this.nullableStringWithMaxLengthOf9
                        .equals(other.nullableStringWithMaxLengthOf9)))
            return false;
        if (!(this.calculatedNullableStringWithMaxLengthOf9 == other.calculatedNullableStringWithMaxLengthOf9 || this.calculatedNullableStringWithMaxLengthOf9 != null
                && this.calculatedNullableStringWithMaxLengthOf9
                        .equals(other.calculatedNullableStringWithMaxLengthOf9)))
            return false;
        if (!(this.persistedNullableStringWithMaxLengthOf9 == other.persistedNullableStringWithMaxLengthOf9 || this.persistedNullableStringWithMaxLengthOf9 != null
                && this.persistedNullableStringWithMaxLengthOf9
                        .equals(other.persistedNullableStringWithMaxLengthOf9)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableStringWithMaxLengthOf9_4("
                + nullableStringWithMaxLengthOf9 + ','
                + calculatedNullableStringWithMaxLengthOf9 + ','
                + persistedNullableStringWithMaxLengthOf9 + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private String nullableStringWithMaxLengthOf9;

    @JsonProperty("nullableStringWithMaxLengthOf9")
    public String getNullableStringWithMaxLengthOf9() {
        return nullableStringWithMaxLengthOf9;
    }

    public NullableStringWithMaxLengthOf9_4 setNullableStringWithMaxLengthOf9(
            final String value) {
        if (value != null)
            com.dslplatform.ocd.calculation.Guards.checkLength(value, 9);
        this.nullableStringWithMaxLengthOf9 = value;

        return this;
    }

    private final String calculatedNullableStringWithMaxLengthOf9;

    public String getCalculatedNullableStringWithMaxLengthOf9() {
        return this.calculatedNullableStringWithMaxLengthOf9;
    }

    private final String persistedNullableStringWithMaxLengthOf9;

    public String getPersistedNullableStringWithMaxLengthOf9() {
        return this.persistedNullableStringWithMaxLengthOf9;
    }
}
