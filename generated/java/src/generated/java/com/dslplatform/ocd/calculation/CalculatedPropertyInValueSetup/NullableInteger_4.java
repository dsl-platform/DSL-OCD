package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableInteger_4 implements java.io.Serializable {
    public NullableInteger_4(
            final Integer nullableInteger,
            final Integer calculatedNullableInteger,
            final Integer persistedNullableInteger) {
        setNullableInteger(nullableInteger);
        this.calculatedNullableInteger = calculatedNullableInteger;
        this.persistedNullableInteger = persistedNullableInteger;
    }

    public NullableInteger_4() {
        this.calculatedNullableInteger = null;
        this.persistedNullableInteger = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 247848552;
        result = prime
                * result
                + (this.nullableInteger != null ? this.nullableInteger
                        .hashCode() : 0);
        result = prime
                * result
                + (this.calculatedNullableInteger != null
                        ? this.calculatedNullableInteger.hashCode()
                        : 0);
        result = prime
                * result
                + (this.persistedNullableInteger != null
                        ? this.persistedNullableInteger.hashCode()
                        : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableInteger_4)) return false;
        final NullableInteger_4 other = (NullableInteger_4) obj;

        if (!(this.nullableInteger == other.nullableInteger || this.nullableInteger != null
                && this.nullableInteger.equals(other.nullableInteger)))
            return false;
        if (!(this.calculatedNullableInteger == other.calculatedNullableInteger || this.calculatedNullableInteger != null
                && this.calculatedNullableInteger
                        .equals(other.calculatedNullableInteger)))
            return false;
        if (!(this.persistedNullableInteger == other.persistedNullableInteger || this.persistedNullableInteger != null
                && this.persistedNullableInteger
                        .equals(other.persistedNullableInteger))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableInteger_4(" + nullableInteger + ','
                + calculatedNullableInteger + ',' + persistedNullableInteger
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Integer nullableInteger;

    @JsonProperty("nullableInteger")
    public Integer getNullableInteger() {
        return nullableInteger;
    }

    public NullableInteger_4 setNullableInteger(final Integer value) {
        this.nullableInteger = value;

        return this;
    }

    private final Integer calculatedNullableInteger;

    public Integer getCalculatedNullableInteger() {
        return this.calculatedNullableInteger;
    }

    private final Integer persistedNullableInteger;

    public Integer getPersistedNullableInteger() {
        return this.persistedNullableInteger;
    }
}
