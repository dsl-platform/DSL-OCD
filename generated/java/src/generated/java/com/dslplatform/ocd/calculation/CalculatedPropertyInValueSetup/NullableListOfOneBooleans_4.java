package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneBooleans_4 implements java.io.Serializable {
    public NullableListOfOneBooleans_4(
            final java.util.List<Boolean> nullableListOfOneBooleans,
            final java.util.List<Boolean> calculatedNullableListOfOneBooleans,
            final java.util.List<Boolean> persistedNullableListOfOneBooleans) {
        setNullableListOfOneBooleans(nullableListOfOneBooleans);
        this.calculatedNullableListOfOneBooleans = calculatedNullableListOfOneBooleans;
        this.persistedNullableListOfOneBooleans = persistedNullableListOfOneBooleans;
    }

    public NullableListOfOneBooleans_4() {
        this.calculatedNullableListOfOneBooleans = null;
        this.persistedNullableListOfOneBooleans = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1179400424;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneBooleans_4)) return false;
        final NullableListOfOneBooleans_4 other = (NullableListOfOneBooleans_4) obj;

        if (!(this.nullableListOfOneBooleans == other.nullableListOfOneBooleans || this.nullableListOfOneBooleans != null
                && this.nullableListOfOneBooleans
                        .equals(other.nullableListOfOneBooleans)))
            return false;
        if (!(this.calculatedNullableListOfOneBooleans == other.calculatedNullableListOfOneBooleans || this.calculatedNullableListOfOneBooleans != null
                && this.calculatedNullableListOfOneBooleans
                        .equals(other.calculatedNullableListOfOneBooleans)))
            return false;
        if (!(this.persistedNullableListOfOneBooleans == other.persistedNullableListOfOneBooleans || this.persistedNullableListOfOneBooleans != null
                && this.persistedNullableListOfOneBooleans
                        .equals(other.persistedNullableListOfOneBooleans)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneBooleans_4(" + nullableListOfOneBooleans + ','
                + calculatedNullableListOfOneBooleans + ','
                + persistedNullableListOfOneBooleans + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Boolean> nullableListOfOneBooleans;

    @JsonProperty("nullableListOfOneBooleans")
    public java.util.List<Boolean> getNullableListOfOneBooleans() {
        return nullableListOfOneBooleans;
    }

    public NullableListOfOneBooleans_4 setNullableListOfOneBooleans(
            final java.util.List<Boolean> value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableListOfOneBooleans = value;

        return this;
    }

    private final java.util.List<Boolean> calculatedNullableListOfOneBooleans;

    public java.util.List<Boolean> getCalculatedNullableListOfOneBooleans() {
        return this.calculatedNullableListOfOneBooleans;
    }

    private final java.util.List<Boolean> persistedNullableListOfOneBooleans;

    public java.util.List<Boolean> getPersistedNullableListOfOneBooleans() {
        return this.persistedNullableListOfOneBooleans;
    }
}
