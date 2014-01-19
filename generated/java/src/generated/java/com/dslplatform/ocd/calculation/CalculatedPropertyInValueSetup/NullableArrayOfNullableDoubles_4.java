package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableDoubles_4 implements
        java.io.Serializable {
    public NullableArrayOfNullableDoubles_4(
            final Double[] nullableArrayOfNullableDoubles,
            final Double[] calculatedNullableArrayOfNullableDoubles,
            final Double[] persistedNullableArrayOfNullableDoubles) {
        setNullableArrayOfNullableDoubles(nullableArrayOfNullableDoubles);
        this.calculatedNullableArrayOfNullableDoubles = calculatedNullableArrayOfNullableDoubles;
        this.persistedNullableArrayOfNullableDoubles = persistedNullableArrayOfNullableDoubles;
    }

    public NullableArrayOfNullableDoubles_4() {
        this.calculatedNullableArrayOfNullableDoubles = null;
        this.persistedNullableArrayOfNullableDoubles = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 348944681;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableDoubles_4)) return false;
        final NullableArrayOfNullableDoubles_4 other = (NullableArrayOfNullableDoubles_4) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableDoubles,
                other.nullableArrayOfNullableDoubles))) return false;
        if (!(this.calculatedNullableArrayOfNullableDoubles == other.calculatedNullableArrayOfNullableDoubles || this.calculatedNullableArrayOfNullableDoubles != null
                && java.util.Arrays.equals(
                        this.calculatedNullableArrayOfNullableDoubles,
                        other.calculatedNullableArrayOfNullableDoubles)))
            return false;
        if (!(this.persistedNullableArrayOfNullableDoubles == other.persistedNullableArrayOfNullableDoubles || this.persistedNullableArrayOfNullableDoubles != null
                && java.util.Arrays.equals(
                        this.persistedNullableArrayOfNullableDoubles,
                        other.persistedNullableArrayOfNullableDoubles)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableDoubles_4("
                + nullableArrayOfNullableDoubles + ','
                + calculatedNullableArrayOfNullableDoubles + ','
                + persistedNullableArrayOfNullableDoubles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Double[] nullableArrayOfNullableDoubles;

    @JsonProperty("nullableArrayOfNullableDoubles")
    public Double[] getNullableArrayOfNullableDoubles() {
        return nullableArrayOfNullableDoubles;
    }

    public NullableArrayOfNullableDoubles_4 setNullableArrayOfNullableDoubles(
            final Double[] value) {
        this.nullableArrayOfNullableDoubles = value;

        return this;
    }

    private final Double[] calculatedNullableArrayOfNullableDoubles;

    public Double[] getCalculatedNullableArrayOfNullableDoubles() {
        return this.calculatedNullableArrayOfNullableDoubles;
    }

    private final Double[] persistedNullableArrayOfNullableDoubles;

    public Double[] getPersistedNullableArrayOfNullableDoubles() {
        return this.persistedNullableArrayOfNullableDoubles;
    }
}
