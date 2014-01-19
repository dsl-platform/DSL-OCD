package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneMaps_4 implements java.io.Serializable {
    public NullableSetOfOneMaps_4(
            final java.util.Set<java.util.Map<String, String>> nullableSetOfOneMaps,
            final java.util.Set<java.util.Map<String, String>> calculatedNullableSetOfOneMaps,
            final java.util.Set<java.util.Map<String, String>> persistedNullableSetOfOneMaps) {
        setNullableSetOfOneMaps(nullableSetOfOneMaps);
        this.calculatedNullableSetOfOneMaps = calculatedNullableSetOfOneMaps;
        this.persistedNullableSetOfOneMaps = persistedNullableSetOfOneMaps;
    }

    public NullableSetOfOneMaps_4() {
        this.calculatedNullableSetOfOneMaps = null;
        this.persistedNullableSetOfOneMaps = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1311559112;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneMaps_4)) return false;
        final NullableSetOfOneMaps_4 other = (NullableSetOfOneMaps_4) obj;

        if (!(this.nullableSetOfOneMaps == other.nullableSetOfOneMaps || this.nullableSetOfOneMaps != null
                && this.nullableSetOfOneMaps.equals(other.nullableSetOfOneMaps)))
            return false;
        if (!(this.calculatedNullableSetOfOneMaps == other.calculatedNullableSetOfOneMaps || this.calculatedNullableSetOfOneMaps != null
                && this.calculatedNullableSetOfOneMaps
                        .equals(other.calculatedNullableSetOfOneMaps)))
            return false;
        if (!(this.persistedNullableSetOfOneMaps == other.persistedNullableSetOfOneMaps || this.persistedNullableSetOfOneMaps != null
                && this.persistedNullableSetOfOneMaps
                        .equals(other.persistedNullableSetOfOneMaps)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneMaps_4(" + nullableSetOfOneMaps + ','
                + calculatedNullableSetOfOneMaps + ','
                + persistedNullableSetOfOneMaps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.util.Map<String, String>> nullableSetOfOneMaps;

    @JsonProperty("nullableSetOfOneMaps")
    public java.util.Set<java.util.Map<String, String>> getNullableSetOfOneMaps() {
        return nullableSetOfOneMaps;
    }

    public NullableSetOfOneMaps_4 setNullableSetOfOneMaps(
            final java.util.Set<java.util.Map<String, String>> value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableSetOfOneMaps = value;

        return this;
    }

    private final java.util.Set<java.util.Map<String, String>> calculatedNullableSetOfOneMaps;

    public java.util.Set<java.util.Map<String, String>> getCalculatedNullableSetOfOneMaps() {
        return this.calculatedNullableSetOfOneMaps;
    }

    private final java.util.Set<java.util.Map<String, String>> persistedNullableSetOfOneMaps;

    public java.util.Set<java.util.Map<String, String>> getPersistedNullableSetOfOneMaps() {
        return this.persistedNullableSetOfOneMaps;
    }
}
