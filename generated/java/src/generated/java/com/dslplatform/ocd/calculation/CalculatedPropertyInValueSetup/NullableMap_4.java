package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableMap_4 implements java.io.Serializable {
    public NullableMap_4(
            final java.util.Map<String, String> nullableMap,
            final java.util.Map<String, String> calculatedNullableMap,
            final java.util.Map<String, String> persistedNullableMap) {
        setNullableMap(nullableMap);
        this.calculatedNullableMap = calculatedNullableMap;
        this.persistedNullableMap = persistedNullableMap;
    }

    public NullableMap_4() {
        this.calculatedNullableMap = null;
        this.persistedNullableMap = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1988106140;
        result = prime * result
                + (this.nullableMap != null ? this.nullableMap.hashCode() : 0);
        result = prime
                * result
                + (this.calculatedNullableMap != null
                        ? this.calculatedNullableMap.hashCode()
                        : 0);
        result = prime
                * result
                + (this.persistedNullableMap != null
                        ? this.persistedNullableMap.hashCode()
                        : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableMap_4)) return false;
        final NullableMap_4 other = (NullableMap_4) obj;

        if (!(this.nullableMap != null
                && this.nullableMap.equals(other.nullableMap) || this.nullableMap == null
                && other.nullableMap == null)) return false;
        if (!(this.calculatedNullableMap != null
                && this.calculatedNullableMap
                        .equals(other.calculatedNullableMap) || this.calculatedNullableMap == null
                && other.calculatedNullableMap == null)) return false;
        if (!(this.persistedNullableMap != null
                && this.persistedNullableMap.equals(other.persistedNullableMap) || this.persistedNullableMap == null
                && other.persistedNullableMap == null)) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableMap_4(" + nullableMap + ',' + calculatedNullableMap
                + ',' + persistedNullableMap + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Map<String, String> nullableMap;

    @JsonProperty("nullableMap")
    public java.util.Map<String, String> getNullableMap() {
        return nullableMap;
    }

    public NullableMap_4 setNullableMap(
            final java.util.Map<String, String> value) {
        this.nullableMap = value;

        return this;
    }

    private final java.util.Map<String, String> calculatedNullableMap;

    public java.util.Map<String, String> getCalculatedNullableMap() {
        return this.calculatedNullableMap;
    }

    private final java.util.Map<String, String> persistedNullableMap;

    public java.util.Map<String, String> getPersistedNullableMap() {
        return this.persistedNullableMap;
    }
}
