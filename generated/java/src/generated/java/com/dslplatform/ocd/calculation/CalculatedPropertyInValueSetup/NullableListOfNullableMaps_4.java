package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableMaps_4 implements java.io.Serializable {
    public NullableListOfNullableMaps_4(
            final java.util.List<java.util.Map<String, String>> nullableListOfNullableMaps,
            final java.util.List<java.util.Map<String, String>> calculatedNullableListOfNullableMaps,
            final java.util.List<java.util.Map<String, String>> persistedNullableListOfNullableMaps) {
        setNullableListOfNullableMaps(nullableListOfNullableMaps);
        this.calculatedNullableListOfNullableMaps = calculatedNullableListOfNullableMaps;
        this.persistedNullableListOfNullableMaps = persistedNullableListOfNullableMaps;
    }

    public NullableListOfNullableMaps_4() {
        this.calculatedNullableListOfNullableMaps = null;
        this.persistedNullableListOfNullableMaps = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1525856177;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableMaps_4)) return false;
        final NullableListOfNullableMaps_4 other = (NullableListOfNullableMaps_4) obj;

        if (!(this.nullableListOfNullableMaps == other.nullableListOfNullableMaps || this.nullableListOfNullableMaps != null
                && this.nullableListOfNullableMaps
                        .equals(other.nullableListOfNullableMaps)))
            return false;
        if (!(this.calculatedNullableListOfNullableMaps == other.calculatedNullableListOfNullableMaps || this.calculatedNullableListOfNullableMaps != null
                && this.calculatedNullableListOfNullableMaps
                        .equals(other.calculatedNullableListOfNullableMaps)))
            return false;
        if (!(this.persistedNullableListOfNullableMaps == other.persistedNullableListOfNullableMaps || this.persistedNullableListOfNullableMaps != null
                && this.persistedNullableListOfNullableMaps
                        .equals(other.persistedNullableListOfNullableMaps)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableMaps_4(" + nullableListOfNullableMaps
                + ',' + calculatedNullableListOfNullableMaps + ','
                + persistedNullableListOfNullableMaps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.util.Map<String, String>> nullableListOfNullableMaps;

    @JsonProperty("nullableListOfNullableMaps")
    public java.util.List<java.util.Map<String, String>> getNullableListOfNullableMaps() {
        return nullableListOfNullableMaps;
    }

    public NullableListOfNullableMaps_4 setNullableListOfNullableMaps(
            final java.util.List<java.util.Map<String, String>> value) {
        this.nullableListOfNullableMaps = value;

        return this;
    }

    private final java.util.List<java.util.Map<String, String>> calculatedNullableListOfNullableMaps;

    public java.util.List<java.util.Map<String, String>> getCalculatedNullableListOfNullableMaps() {
        return this.calculatedNullableListOfNullableMaps;
    }

    private final java.util.List<java.util.Map<String, String>> persistedNullableListOfNullableMaps;

    public java.util.List<java.util.Map<String, String>> getPersistedNullableListOfNullableMaps() {
        return this.persistedNullableListOfNullableMaps;
    }
}
