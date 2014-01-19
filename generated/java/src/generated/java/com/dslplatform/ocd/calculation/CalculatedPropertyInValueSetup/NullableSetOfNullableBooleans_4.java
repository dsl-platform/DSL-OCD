package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableBooleans_4 implements
        java.io.Serializable {
    public NullableSetOfNullableBooleans_4(
            final java.util.Set<Boolean> nullableSetOfNullableBooleans,
            final java.util.Set<Boolean> calculatedNullableSetOfNullableBooleans,
            final java.util.Set<Boolean> persistedNullableSetOfNullableBooleans) {
        setNullableSetOfNullableBooleans(nullableSetOfNullableBooleans);
        this.calculatedNullableSetOfNullableBooleans = calculatedNullableSetOfNullableBooleans;
        this.persistedNullableSetOfNullableBooleans = persistedNullableSetOfNullableBooleans;
    }

    public NullableSetOfNullableBooleans_4() {
        this.calculatedNullableSetOfNullableBooleans = null;
        this.persistedNullableSetOfNullableBooleans = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 737472461;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableBooleans_4)) return false;
        final NullableSetOfNullableBooleans_4 other = (NullableSetOfNullableBooleans_4) obj;

        if (!(this.nullableSetOfNullableBooleans == other.nullableSetOfNullableBooleans || this.nullableSetOfNullableBooleans != null
                && this.nullableSetOfNullableBooleans
                        .equals(other.nullableSetOfNullableBooleans)))
            return false;
        if (!(this.calculatedNullableSetOfNullableBooleans == other.calculatedNullableSetOfNullableBooleans || this.calculatedNullableSetOfNullableBooleans != null
                && this.calculatedNullableSetOfNullableBooleans
                        .equals(other.calculatedNullableSetOfNullableBooleans)))
            return false;
        if (!(this.persistedNullableSetOfNullableBooleans == other.persistedNullableSetOfNullableBooleans || this.persistedNullableSetOfNullableBooleans != null
                && this.persistedNullableSetOfNullableBooleans
                        .equals(other.persistedNullableSetOfNullableBooleans)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableBooleans_4("
                + nullableSetOfNullableBooleans + ','
                + calculatedNullableSetOfNullableBooleans + ','
                + persistedNullableSetOfNullableBooleans + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Boolean> nullableSetOfNullableBooleans;

    @JsonProperty("nullableSetOfNullableBooleans")
    public java.util.Set<Boolean> getNullableSetOfNullableBooleans() {
        return nullableSetOfNullableBooleans;
    }

    public NullableSetOfNullableBooleans_4 setNullableSetOfNullableBooleans(
            final java.util.Set<Boolean> value) {
        this.nullableSetOfNullableBooleans = value;

        return this;
    }

    private final java.util.Set<Boolean> calculatedNullableSetOfNullableBooleans;

    public java.util.Set<Boolean> getCalculatedNullableSetOfNullableBooleans() {
        return this.calculatedNullableSetOfNullableBooleans;
    }

    private final java.util.Set<Boolean> persistedNullableSetOfNullableBooleans;

    public java.util.Set<Boolean> getPersistedNullableSetOfNullableBooleans() {
        return this.persistedNullableSetOfNullableBooleans;
    }
}
