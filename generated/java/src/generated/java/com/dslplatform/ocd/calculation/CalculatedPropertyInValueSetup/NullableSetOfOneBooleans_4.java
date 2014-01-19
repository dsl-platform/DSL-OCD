package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneBooleans_4 implements java.io.Serializable {
    public NullableSetOfOneBooleans_4(
            final java.util.Set<Boolean> nullableSetOfOneBooleans,
            final java.util.Set<Boolean> calculatedNullableSetOfOneBooleans,
            final java.util.Set<Boolean> persistedNullableSetOfOneBooleans) {
        setNullableSetOfOneBooleans(nullableSetOfOneBooleans);
        this.calculatedNullableSetOfOneBooleans = calculatedNullableSetOfOneBooleans;
        this.persistedNullableSetOfOneBooleans = persistedNullableSetOfOneBooleans;
    }

    public NullableSetOfOneBooleans_4() {
        this.calculatedNullableSetOfOneBooleans = null;
        this.persistedNullableSetOfOneBooleans = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1567375058;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneBooleans_4)) return false;
        final NullableSetOfOneBooleans_4 other = (NullableSetOfOneBooleans_4) obj;

        if (!(this.nullableSetOfOneBooleans == other.nullableSetOfOneBooleans || this.nullableSetOfOneBooleans != null
                && this.nullableSetOfOneBooleans
                        .equals(other.nullableSetOfOneBooleans))) return false;
        if (!(this.calculatedNullableSetOfOneBooleans == other.calculatedNullableSetOfOneBooleans || this.calculatedNullableSetOfOneBooleans != null
                && this.calculatedNullableSetOfOneBooleans
                        .equals(other.calculatedNullableSetOfOneBooleans)))
            return false;
        if (!(this.persistedNullableSetOfOneBooleans == other.persistedNullableSetOfOneBooleans || this.persistedNullableSetOfOneBooleans != null
                && this.persistedNullableSetOfOneBooleans
                        .equals(other.persistedNullableSetOfOneBooleans)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneBooleans_4(" + nullableSetOfOneBooleans + ','
                + calculatedNullableSetOfOneBooleans + ','
                + persistedNullableSetOfOneBooleans + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Boolean> nullableSetOfOneBooleans;

    @JsonProperty("nullableSetOfOneBooleans")
    public java.util.Set<Boolean> getNullableSetOfOneBooleans() {
        return nullableSetOfOneBooleans;
    }

    public NullableSetOfOneBooleans_4 setNullableSetOfOneBooleans(
            final java.util.Set<Boolean> value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableSetOfOneBooleans = value;

        return this;
    }

    private final java.util.Set<Boolean> calculatedNullableSetOfOneBooleans;

    public java.util.Set<Boolean> getCalculatedNullableSetOfOneBooleans() {
        return this.calculatedNullableSetOfOneBooleans;
    }

    private final java.util.Set<Boolean> persistedNullableSetOfOneBooleans;

    public java.util.Set<Boolean> getPersistedNullableSetOfOneBooleans() {
        return this.persistedNullableSetOfOneBooleans;
    }
}
