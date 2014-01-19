package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableBooleans_4 implements
        java.io.Serializable {
    public NullableArrayOfNullableBooleans_4(
            final Boolean[] nullableArrayOfNullableBooleans,
            final Boolean[] calculatedNullableArrayOfNullableBooleans,
            final Boolean[] persistedNullableArrayOfNullableBooleans) {
        setNullableArrayOfNullableBooleans(nullableArrayOfNullableBooleans);
        this.calculatedNullableArrayOfNullableBooleans = calculatedNullableArrayOfNullableBooleans;
        this.persistedNullableArrayOfNullableBooleans = persistedNullableArrayOfNullableBooleans;
    }

    public NullableArrayOfNullableBooleans_4() {
        this.calculatedNullableArrayOfNullableBooleans = null;
        this.persistedNullableArrayOfNullableBooleans = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 625585102;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableBooleans_4)) return false;
        final NullableArrayOfNullableBooleans_4 other = (NullableArrayOfNullableBooleans_4) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableBooleans,
                other.nullableArrayOfNullableBooleans))) return false;
        if (!(this.calculatedNullableArrayOfNullableBooleans == other.calculatedNullableArrayOfNullableBooleans || this.calculatedNullableArrayOfNullableBooleans != null
                && java.util.Arrays.equals(
                        this.calculatedNullableArrayOfNullableBooleans,
                        other.calculatedNullableArrayOfNullableBooleans)))
            return false;
        if (!(this.persistedNullableArrayOfNullableBooleans == other.persistedNullableArrayOfNullableBooleans || this.persistedNullableArrayOfNullableBooleans != null
                && java.util.Arrays.equals(
                        this.persistedNullableArrayOfNullableBooleans,
                        other.persistedNullableArrayOfNullableBooleans)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableBooleans_4("
                + nullableArrayOfNullableBooleans + ','
                + calculatedNullableArrayOfNullableBooleans + ','
                + persistedNullableArrayOfNullableBooleans + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Boolean[] nullableArrayOfNullableBooleans;

    @JsonProperty("nullableArrayOfNullableBooleans")
    public Boolean[] getNullableArrayOfNullableBooleans() {
        return nullableArrayOfNullableBooleans;
    }

    public NullableArrayOfNullableBooleans_4 setNullableArrayOfNullableBooleans(
            final Boolean[] value) {
        this.nullableArrayOfNullableBooleans = value;

        return this;
    }

    private final Boolean[] calculatedNullableArrayOfNullableBooleans;

    public Boolean[] getCalculatedNullableArrayOfNullableBooleans() {
        return this.calculatedNullableArrayOfNullableBooleans;
    }

    private final Boolean[] persistedNullableArrayOfNullableBooleans;

    public Boolean[] getPersistedNullableArrayOfNullableBooleans() {
        return this.persistedNullableArrayOfNullableBooleans;
    }
}
