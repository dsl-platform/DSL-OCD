package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableString_4 implements java.io.Serializable {
    public NullableString_4(
            final String nullableString,
            final String calculatedNullableString,
            final String persistedNullableString) {
        setNullableString(nullableString);
        this.calculatedNullableString = calculatedNullableString;
        this.persistedNullableString = persistedNullableString;
    }

    public NullableString_4() {
        this.calculatedNullableString = null;
        this.persistedNullableString = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 394946435;
        result = prime
                * result
                + (this.nullableString != null
                        ? this.nullableString.hashCode()
                        : 0);
        result = prime
                * result
                + (this.calculatedNullableString != null
                        ? this.calculatedNullableString.hashCode()
                        : 0);
        result = prime
                * result
                + (this.persistedNullableString != null
                        ? this.persistedNullableString.hashCode()
                        : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableString_4)) return false;
        final NullableString_4 other = (NullableString_4) obj;

        if (!(this.nullableString == other.nullableString || this.nullableString != null
                && this.nullableString.equals(other.nullableString)))
            return false;
        if (!(this.calculatedNullableString == other.calculatedNullableString || this.calculatedNullableString != null
                && this.calculatedNullableString
                        .equals(other.calculatedNullableString))) return false;
        if (!(this.persistedNullableString == other.persistedNullableString || this.persistedNullableString != null
                && this.persistedNullableString
                        .equals(other.persistedNullableString))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableString_4(" + nullableString + ','
                + calculatedNullableString + ',' + persistedNullableString
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private String nullableString;

    @JsonProperty("nullableString")
    public String getNullableString() {
        return nullableString;
    }

    public NullableString_4 setNullableString(final String value) {
        this.nullableString = value;

        return this;
    }

    private final String calculatedNullableString;

    public String getCalculatedNullableString() {
        return this.calculatedNullableString;
    }

    private final String persistedNullableString;

    public String getPersistedNullableString() {
        return this.persistedNullableString;
    }
}
