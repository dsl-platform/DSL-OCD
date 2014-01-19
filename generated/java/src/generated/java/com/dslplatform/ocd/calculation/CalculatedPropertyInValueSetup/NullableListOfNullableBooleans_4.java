package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableBooleans_4 implements
        java.io.Serializable {
    public NullableListOfNullableBooleans_4(
            final java.util.List<Boolean> nullableListOfNullableBooleans,
            final java.util.List<Boolean> calculatedNullableListOfNullableBooleans,
            final java.util.List<Boolean> persistedNullableListOfNullableBooleans) {
        setNullableListOfNullableBooleans(nullableListOfNullableBooleans);
        this.calculatedNullableListOfNullableBooleans = calculatedNullableListOfNullableBooleans;
        this.persistedNullableListOfNullableBooleans = persistedNullableListOfNullableBooleans;
    }

    public NullableListOfNullableBooleans_4() {
        this.calculatedNullableListOfNullableBooleans = null;
        this.persistedNullableListOfNullableBooleans = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 172971757;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableBooleans_4)) return false;
        final NullableListOfNullableBooleans_4 other = (NullableListOfNullableBooleans_4) obj;

        if (!(this.nullableListOfNullableBooleans == other.nullableListOfNullableBooleans || this.nullableListOfNullableBooleans != null
                && this.nullableListOfNullableBooleans
                        .equals(other.nullableListOfNullableBooleans)))
            return false;
        if (!(this.calculatedNullableListOfNullableBooleans == other.calculatedNullableListOfNullableBooleans || this.calculatedNullableListOfNullableBooleans != null
                && this.calculatedNullableListOfNullableBooleans
                        .equals(other.calculatedNullableListOfNullableBooleans)))
            return false;
        if (!(this.persistedNullableListOfNullableBooleans == other.persistedNullableListOfNullableBooleans || this.persistedNullableListOfNullableBooleans != null
                && this.persistedNullableListOfNullableBooleans
                        .equals(other.persistedNullableListOfNullableBooleans)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableBooleans_4("
                + nullableListOfNullableBooleans + ','
                + calculatedNullableListOfNullableBooleans + ','
                + persistedNullableListOfNullableBooleans + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Boolean> nullableListOfNullableBooleans;

    @JsonProperty("nullableListOfNullableBooleans")
    public java.util.List<Boolean> getNullableListOfNullableBooleans() {
        return nullableListOfNullableBooleans;
    }

    public NullableListOfNullableBooleans_4 setNullableListOfNullableBooleans(
            final java.util.List<Boolean> value) {
        this.nullableListOfNullableBooleans = value;

        return this;
    }

    private final java.util.List<Boolean> calculatedNullableListOfNullableBooleans;

    public java.util.List<Boolean> getCalculatedNullableListOfNullableBooleans() {
        return this.calculatedNullableListOfNullableBooleans;
    }

    private final java.util.List<Boolean> persistedNullableListOfNullableBooleans;

    public java.util.List<Boolean> getPersistedNullableListOfNullableBooleans() {
        return this.persistedNullableListOfNullableBooleans;
    }
}
