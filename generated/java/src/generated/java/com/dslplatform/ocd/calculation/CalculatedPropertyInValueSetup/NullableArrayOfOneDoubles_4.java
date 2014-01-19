package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneDoubles_4 implements java.io.Serializable {
    public NullableArrayOfOneDoubles_4(
            final double[] nullableArrayOfOneDoubles,
            final double[] calculatedNullableArrayOfOneDoubles,
            final double[] persistedNullableArrayOfOneDoubles) {
        setNullableArrayOfOneDoubles(nullableArrayOfOneDoubles);
        this.calculatedNullableArrayOfOneDoubles = calculatedNullableArrayOfOneDoubles;
        this.persistedNullableArrayOfOneDoubles = persistedNullableArrayOfOneDoubles;
    }

    public NullableArrayOfOneDoubles_4() {
        this.calculatedNullableArrayOfOneDoubles = null;
        this.persistedNullableArrayOfOneDoubles = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 383886804;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneDoubles_4)) return false;
        final NullableArrayOfOneDoubles_4 other = (NullableArrayOfOneDoubles_4) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfOneDoubles,
                other.nullableArrayOfOneDoubles))) return false;
        if (!(this.calculatedNullableArrayOfOneDoubles == other.calculatedNullableArrayOfOneDoubles || this.calculatedNullableArrayOfOneDoubles != null
                && java.util.Arrays.equals(
                        this.calculatedNullableArrayOfOneDoubles,
                        other.calculatedNullableArrayOfOneDoubles)))
            return false;
        if (!(this.persistedNullableArrayOfOneDoubles == other.persistedNullableArrayOfOneDoubles || this.persistedNullableArrayOfOneDoubles != null
                && java.util.Arrays.equals(
                        this.persistedNullableArrayOfOneDoubles,
                        other.persistedNullableArrayOfOneDoubles)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneDoubles_4(" + nullableArrayOfOneDoubles + ','
                + calculatedNullableArrayOfOneDoubles + ','
                + persistedNullableArrayOfOneDoubles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private double[] nullableArrayOfOneDoubles;

    @JsonProperty("nullableArrayOfOneDoubles")
    public double[] getNullableArrayOfOneDoubles() {
        return nullableArrayOfOneDoubles;
    }

    public NullableArrayOfOneDoubles_4 setNullableArrayOfOneDoubles(
            final double[] value) {
        this.nullableArrayOfOneDoubles = value;

        return this;
    }

    private final double[] calculatedNullableArrayOfOneDoubles;

    public double[] getCalculatedNullableArrayOfOneDoubles() {
        return this.calculatedNullableArrayOfOneDoubles;
    }

    private final double[] persistedNullableArrayOfOneDoubles;

    public double[] getPersistedNullableArrayOfOneDoubles() {
        return this.persistedNullableArrayOfOneDoubles;
    }
}
