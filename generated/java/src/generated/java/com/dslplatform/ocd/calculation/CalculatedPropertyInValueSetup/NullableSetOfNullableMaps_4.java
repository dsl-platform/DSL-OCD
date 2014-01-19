package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableMaps_4 implements java.io.Serializable {
    public NullableSetOfNullableMaps_4(
            final java.util.Set<java.util.Map<String, String>> nullableSetOfNullableMaps,
            final java.util.Set<java.util.Map<String, String>> calculatedNullableSetOfNullableMaps,
            final java.util.Set<java.util.Map<String, String>> persistedNullableSetOfNullableMaps) {
        setNullableSetOfNullableMaps(nullableSetOfNullableMaps);
        this.calculatedNullableSetOfNullableMaps = calculatedNullableSetOfNullableMaps;
        this.persistedNullableSetOfNullableMaps = persistedNullableSetOfNullableMaps;
    }

    public NullableSetOfNullableMaps_4() {
        this.calculatedNullableSetOfNullableMaps = null;
        this.persistedNullableSetOfNullableMaps = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2063583201;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableMaps_4)) return false;
        final NullableSetOfNullableMaps_4 other = (NullableSetOfNullableMaps_4) obj;

        if (!(this.nullableSetOfNullableMaps == other.nullableSetOfNullableMaps || this.nullableSetOfNullableMaps != null
                && this.nullableSetOfNullableMaps
                        .equals(other.nullableSetOfNullableMaps)))
            return false;
        if (!(this.calculatedNullableSetOfNullableMaps == other.calculatedNullableSetOfNullableMaps || this.calculatedNullableSetOfNullableMaps != null
                && this.calculatedNullableSetOfNullableMaps
                        .equals(other.calculatedNullableSetOfNullableMaps)))
            return false;
        if (!(this.persistedNullableSetOfNullableMaps == other.persistedNullableSetOfNullableMaps || this.persistedNullableSetOfNullableMaps != null
                && this.persistedNullableSetOfNullableMaps
                        .equals(other.persistedNullableSetOfNullableMaps)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableMaps_4(" + nullableSetOfNullableMaps + ','
                + calculatedNullableSetOfNullableMaps + ','
                + persistedNullableSetOfNullableMaps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.util.Map<String, String>> nullableSetOfNullableMaps;

    @JsonProperty("nullableSetOfNullableMaps")
    public java.util.Set<java.util.Map<String, String>> getNullableSetOfNullableMaps() {
        return nullableSetOfNullableMaps;
    }

    public NullableSetOfNullableMaps_4 setNullableSetOfNullableMaps(
            final java.util.Set<java.util.Map<String, String>> value) {
        this.nullableSetOfNullableMaps = value;

        return this;
    }

    private final java.util.Set<java.util.Map<String, String>> calculatedNullableSetOfNullableMaps;

    public java.util.Set<java.util.Map<String, String>> getCalculatedNullableSetOfNullableMaps() {
        return this.calculatedNullableSetOfNullableMaps;
    }

    private final java.util.Set<java.util.Map<String, String>> persistedNullableSetOfNullableMaps;

    public java.util.Set<java.util.Map<String, String>> getPersistedNullableSetOfNullableMaps() {
        return this.persistedNullableSetOfNullableMaps;
    }
}
