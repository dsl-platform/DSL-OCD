package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableDouble_4 implements java.io.Serializable {
    public NullableDouble_4(
            final Double nullableDouble,
            final Double calculatedNullableDouble,
            final Double persistedNullableDouble) {
        setNullableDouble(nullableDouble);
        this.calculatedNullableDouble = calculatedNullableDouble;
        this.persistedNullableDouble = persistedNullableDouble;
    }

    public NullableDouble_4() {
        this.calculatedNullableDouble = null;
        this.persistedNullableDouble = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1742221675;
        result = prime
                * result
                + (this.nullableDouble != null
                        ? this.nullableDouble.hashCode()
                        : 0);
        result = prime
                * result
                + (this.calculatedNullableDouble != null
                        ? this.calculatedNullableDouble.hashCode()
                        : 0);
        result = prime
                * result
                + (this.persistedNullableDouble != null
                        ? this.persistedNullableDouble.hashCode()
                        : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableDouble_4)) return false;
        final NullableDouble_4 other = (NullableDouble_4) obj;

        if (!(this.nullableDouble == other.nullableDouble || this.nullableDouble != null
                && this.nullableDouble.equals(other.nullableDouble)))
            return false;
        if (!(this.calculatedNullableDouble == other.calculatedNullableDouble || this.calculatedNullableDouble != null
                && this.calculatedNullableDouble
                        .equals(other.calculatedNullableDouble))) return false;
        if (!(this.persistedNullableDouble == other.persistedNullableDouble || this.persistedNullableDouble != null
                && this.persistedNullableDouble
                        .equals(other.persistedNullableDouble))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableDouble_4(" + nullableDouble + ','
                + calculatedNullableDouble + ',' + persistedNullableDouble
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Double nullableDouble;

    @JsonProperty("nullableDouble")
    public Double getNullableDouble() {
        return nullableDouble;
    }

    public NullableDouble_4 setNullableDouble(final Double value) {
        this.nullableDouble = value;

        return this;
    }

    private final Double calculatedNullableDouble;

    public Double getCalculatedNullableDouble() {
        return this.calculatedNullableDouble;
    }

    private final Double persistedNullableDouble;

    public Double getPersistedNullableDouble() {
        return this.persistedNullableDouble;
    }
}
