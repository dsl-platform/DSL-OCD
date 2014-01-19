package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableMaps_4 implements
        java.io.Serializable {
    public NullableArrayOfNullableMaps_4(
            final java.util.Map<String, String>[] nullableArrayOfNullableMaps,
            final java.util.Map<String, String>[] calculatedNullableArrayOfNullableMaps,
            final java.util.Map<String, String>[] persistedNullableArrayOfNullableMaps) {
        setNullableArrayOfNullableMaps(nullableArrayOfNullableMaps);
        this.calculatedNullableArrayOfNullableMaps = calculatedNullableArrayOfNullableMaps;
        this.persistedNullableArrayOfNullableMaps = persistedNullableArrayOfNullableMaps;
    }

    public NullableArrayOfNullableMaps_4() {
        this.calculatedNullableArrayOfNullableMaps = null;
        this.persistedNullableArrayOfNullableMaps = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 813675120;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableMaps_4)) return false;
        final NullableArrayOfNullableMaps_4 other = (NullableArrayOfNullableMaps_4) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableMaps,
                other.nullableArrayOfNullableMaps))) return false;
        if (!(this.calculatedNullableArrayOfNullableMaps == other.calculatedNullableArrayOfNullableMaps || this.calculatedNullableArrayOfNullableMaps != null
                && java.util.Arrays.equals(
                        this.calculatedNullableArrayOfNullableMaps,
                        other.calculatedNullableArrayOfNullableMaps)))
            return false;
        if (!(this.persistedNullableArrayOfNullableMaps == other.persistedNullableArrayOfNullableMaps || this.persistedNullableArrayOfNullableMaps != null
                && java.util.Arrays.equals(
                        this.persistedNullableArrayOfNullableMaps,
                        other.persistedNullableArrayOfNullableMaps)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableMaps_4(" + nullableArrayOfNullableMaps
                + ',' + calculatedNullableArrayOfNullableMaps + ','
                + persistedNullableArrayOfNullableMaps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Map<String, String>[] nullableArrayOfNullableMaps;

    @JsonProperty("nullableArrayOfNullableMaps")
    public java.util.Map<String, String>[] getNullableArrayOfNullableMaps() {
        return nullableArrayOfNullableMaps;
    }

    public NullableArrayOfNullableMaps_4 setNullableArrayOfNullableMaps(
            final java.util.Map<String, String>[] value) {
        this.nullableArrayOfNullableMaps = value;

        return this;
    }

    private final java.util.Map<String, String>[] calculatedNullableArrayOfNullableMaps;

    public java.util.Map<String, String>[] getCalculatedNullableArrayOfNullableMaps() {
        return this.calculatedNullableArrayOfNullableMaps;
    }

    private final java.util.Map<String, String>[] persistedNullableArrayOfNullableMaps;

    public java.util.Map<String, String>[] getPersistedNullableArrayOfNullableMaps() {
        return this.persistedNullableArrayOfNullableMaps;
    }
}
