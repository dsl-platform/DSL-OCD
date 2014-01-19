package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneMaps_4 implements java.io.Serializable {
    public NullableListOfOneMaps_4(
            final java.util.List<java.util.Map<String, String>> nullableListOfOneMaps,
            final java.util.List<java.util.Map<String, String>> calculatedNullableListOfOneMaps,
            final java.util.List<java.util.Map<String, String>> persistedNullableListOfOneMaps) {
        setNullableListOfOneMaps(nullableListOfOneMaps);
        this.calculatedNullableListOfOneMaps = calculatedNullableListOfOneMaps;
        this.persistedNullableListOfOneMaps = persistedNullableListOfOneMaps;
    }

    public NullableListOfOneMaps_4() {
        this.calculatedNullableListOfOneMaps = null;
        this.persistedNullableListOfOneMaps = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1314489806;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneMaps_4)) return false;
        final NullableListOfOneMaps_4 other = (NullableListOfOneMaps_4) obj;

        if (!(this.nullableListOfOneMaps == other.nullableListOfOneMaps || this.nullableListOfOneMaps != null
                && this.nullableListOfOneMaps
                        .equals(other.nullableListOfOneMaps))) return false;
        if (!(this.calculatedNullableListOfOneMaps == other.calculatedNullableListOfOneMaps || this.calculatedNullableListOfOneMaps != null
                && this.calculatedNullableListOfOneMaps
                        .equals(other.calculatedNullableListOfOneMaps)))
            return false;
        if (!(this.persistedNullableListOfOneMaps == other.persistedNullableListOfOneMaps || this.persistedNullableListOfOneMaps != null
                && this.persistedNullableListOfOneMaps
                        .equals(other.persistedNullableListOfOneMaps)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneMaps_4(" + nullableListOfOneMaps + ','
                + calculatedNullableListOfOneMaps + ','
                + persistedNullableListOfOneMaps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.util.Map<String, String>> nullableListOfOneMaps;

    @JsonProperty("nullableListOfOneMaps")
    public java.util.List<java.util.Map<String, String>> getNullableListOfOneMaps() {
        return nullableListOfOneMaps;
    }

    public NullableListOfOneMaps_4 setNullableListOfOneMaps(
            final java.util.List<java.util.Map<String, String>> value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableListOfOneMaps = value;

        return this;
    }

    private final java.util.List<java.util.Map<String, String>> calculatedNullableListOfOneMaps;

    public java.util.List<java.util.Map<String, String>> getCalculatedNullableListOfOneMaps() {
        return this.calculatedNullableListOfOneMaps;
    }

    private final java.util.List<java.util.Map<String, String>> persistedNullableListOfOneMaps;

    public java.util.List<java.util.Map<String, String>> getPersistedNullableListOfOneMaps() {
        return this.persistedNullableListOfOneMaps;
    }
}
