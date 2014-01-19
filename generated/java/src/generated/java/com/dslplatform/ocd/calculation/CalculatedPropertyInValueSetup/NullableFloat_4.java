package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableFloat_4 implements java.io.Serializable {
    public NullableFloat_4(
            final Float nullableFloat,
            final Float calculatedNullableFloat,
            final Float persistedNullableFloat) {
        setNullableFloat(nullableFloat);
        this.calculatedNullableFloat = calculatedNullableFloat;
        this.persistedNullableFloat = persistedNullableFloat;
    }

    public NullableFloat_4() {
        this.calculatedNullableFloat = null;
        this.persistedNullableFloat = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2001755440;
        result = prime
                * result
                + (this.nullableFloat != null
                        ? this.nullableFloat.hashCode()
                        : 0);
        result = prime
                * result
                + (this.calculatedNullableFloat != null
                        ? this.calculatedNullableFloat.hashCode()
                        : 0);
        result = prime
                * result
                + (this.persistedNullableFloat != null
                        ? this.persistedNullableFloat.hashCode()
                        : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableFloat_4)) return false;
        final NullableFloat_4 other = (NullableFloat_4) obj;

        if (!(this.nullableFloat == other.nullableFloat || this.nullableFloat != null
                && this.nullableFloat.equals(other.nullableFloat)))
            return false;
        if (!(this.calculatedNullableFloat == other.calculatedNullableFloat || this.calculatedNullableFloat != null
                && this.calculatedNullableFloat
                        .equals(other.calculatedNullableFloat))) return false;
        if (!(this.persistedNullableFloat == other.persistedNullableFloat || this.persistedNullableFloat != null
                && this.persistedNullableFloat
                        .equals(other.persistedNullableFloat))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableFloat_4(" + nullableFloat + ','
                + calculatedNullableFloat + ',' + persistedNullableFloat + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Float nullableFloat;

    @JsonProperty("nullableFloat")
    public Float getNullableFloat() {
        return nullableFloat;
    }

    public NullableFloat_4 setNullableFloat(final Float value) {
        this.nullableFloat = value;

        return this;
    }

    private final Float calculatedNullableFloat;

    public Float getCalculatedNullableFloat() {
        return this.calculatedNullableFloat;
    }

    private final Float persistedNullableFloat;

    public Float getPersistedNullableFloat() {
        return this.persistedNullableFloat;
    }
}
