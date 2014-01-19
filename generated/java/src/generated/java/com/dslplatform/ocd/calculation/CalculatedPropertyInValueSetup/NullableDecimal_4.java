package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableDecimal_4 implements java.io.Serializable {
    public NullableDecimal_4(
            final java.math.BigDecimal nullableDecimal,
            final java.math.BigDecimal calculatedNullableDecimal,
            final java.math.BigDecimal persistedNullableDecimal) {
        setNullableDecimal(nullableDecimal);
        this.calculatedNullableDecimal = calculatedNullableDecimal;
        this.persistedNullableDecimal = persistedNullableDecimal;
    }

    public NullableDecimal_4() {
        this.calculatedNullableDecimal = null;
        this.persistedNullableDecimal = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2029315525;
        result = prime * result + (0);
        result = prime * result + (0);
        result = prime * result + (0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableDecimal_4)) return false;
        final NullableDecimal_4 other = (NullableDecimal_4) obj;

        if (!(this.nullableDecimal == other.nullableDecimal || this.nullableDecimal != null
                && this.nullableDecimal.compareTo(other.nullableDecimal) == 0))
            return false;
        if (!(this.calculatedNullableDecimal == other.calculatedNullableDecimal || this.calculatedNullableDecimal != null
                && this.calculatedNullableDecimal
                        .compareTo(other.calculatedNullableDecimal) == 0))
            return false;
        if (!(this.persistedNullableDecimal == other.persistedNullableDecimal || this.persistedNullableDecimal != null
                && this.persistedNullableDecimal
                        .compareTo(other.persistedNullableDecimal) == 0))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableDecimal_4(" + nullableDecimal + ','
                + calculatedNullableDecimal + ',' + persistedNullableDecimal
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.math.BigDecimal nullableDecimal;

    @JsonProperty("nullableDecimal")
    public java.math.BigDecimal getNullableDecimal() {
        return nullableDecimal;
    }

    public NullableDecimal_4 setNullableDecimal(final java.math.BigDecimal value) {
        this.nullableDecimal = value;

        return this;
    }

    private final java.math.BigDecimal calculatedNullableDecimal;

    public java.math.BigDecimal getCalculatedNullableDecimal() {
        return this.calculatedNullableDecimal;
    }

    private final java.math.BigDecimal persistedNullableDecimal;

    public java.math.BigDecimal getPersistedNullableDecimal() {
        return this.persistedNullableDecimal;
    }
}
