package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneBooleans_4 implements java.io.Serializable {
    public NullableArrayOfOneBooleans_4(
            final boolean[] nullableArrayOfOneBooleans,
            final boolean[] calculatedNullableArrayOfOneBooleans,
            final boolean[] persistedNullableArrayOfOneBooleans) {
        setNullableArrayOfOneBooleans(nullableArrayOfOneBooleans);
        this.calculatedNullableArrayOfOneBooleans = calculatedNullableArrayOfOneBooleans;
        this.persistedNullableArrayOfOneBooleans = persistedNullableArrayOfOneBooleans;
    }

    public NullableArrayOfOneBooleans_4() {
        this.calculatedNullableArrayOfOneBooleans = null;
        this.persistedNullableArrayOfOneBooleans = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 15511943;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneBooleans_4)) return false;
        final NullableArrayOfOneBooleans_4 other = (NullableArrayOfOneBooleans_4) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfOneBooleans,
                other.nullableArrayOfOneBooleans))) return false;
        if (!(this.calculatedNullableArrayOfOneBooleans == other.calculatedNullableArrayOfOneBooleans || this.calculatedNullableArrayOfOneBooleans != null
                && java.util.Arrays.equals(
                        this.calculatedNullableArrayOfOneBooleans,
                        other.calculatedNullableArrayOfOneBooleans)))
            return false;
        if (!(this.persistedNullableArrayOfOneBooleans == other.persistedNullableArrayOfOneBooleans || this.persistedNullableArrayOfOneBooleans != null
                && java.util.Arrays.equals(
                        this.persistedNullableArrayOfOneBooleans,
                        other.persistedNullableArrayOfOneBooleans)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneBooleans_4(" + nullableArrayOfOneBooleans
                + ',' + calculatedNullableArrayOfOneBooleans + ','
                + persistedNullableArrayOfOneBooleans + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private boolean[] nullableArrayOfOneBooleans;

    @JsonProperty("nullableArrayOfOneBooleans")
    public boolean[] getNullableArrayOfOneBooleans() {
        return nullableArrayOfOneBooleans;
    }

    public NullableArrayOfOneBooleans_4 setNullableArrayOfOneBooleans(
            final boolean[] value) {
        this.nullableArrayOfOneBooleans = value;

        return this;
    }

    private final boolean[] calculatedNullableArrayOfOneBooleans;

    public boolean[] getCalculatedNullableArrayOfOneBooleans() {
        return this.calculatedNullableArrayOfOneBooleans;
    }

    private final boolean[] persistedNullableArrayOfOneBooleans;

    public boolean[] getPersistedNullableArrayOfOneBooleans() {
        return this.persistedNullableArrayOfOneBooleans;
    }
}
