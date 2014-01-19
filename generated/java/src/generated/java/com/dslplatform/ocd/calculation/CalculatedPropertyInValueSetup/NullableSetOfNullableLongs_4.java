package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableLongs_4 implements java.io.Serializable {
    public NullableSetOfNullableLongs_4(
            final java.util.Set<Long> nullableSetOfNullableLongs,
            final java.util.Set<Long> calculatedNullableSetOfNullableLongs,
            final java.util.Set<Long> persistedNullableSetOfNullableLongs) {
        setNullableSetOfNullableLongs(nullableSetOfNullableLongs);
        this.calculatedNullableSetOfNullableLongs = calculatedNullableSetOfNullableLongs;
        this.persistedNullableSetOfNullableLongs = persistedNullableSetOfNullableLongs;
    }

    public NullableSetOfNullableLongs_4() {
        this.calculatedNullableSetOfNullableLongs = null;
        this.persistedNullableSetOfNullableLongs = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1402225769;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableLongs_4)) return false;
        final NullableSetOfNullableLongs_4 other = (NullableSetOfNullableLongs_4) obj;

        if (!(this.nullableSetOfNullableLongs == other.nullableSetOfNullableLongs || this.nullableSetOfNullableLongs != null
                && this.nullableSetOfNullableLongs
                        .equals(other.nullableSetOfNullableLongs)))
            return false;
        if (!(this.calculatedNullableSetOfNullableLongs == other.calculatedNullableSetOfNullableLongs || this.calculatedNullableSetOfNullableLongs != null
                && this.calculatedNullableSetOfNullableLongs
                        .equals(other.calculatedNullableSetOfNullableLongs)))
            return false;
        if (!(this.persistedNullableSetOfNullableLongs == other.persistedNullableSetOfNullableLongs || this.persistedNullableSetOfNullableLongs != null
                && this.persistedNullableSetOfNullableLongs
                        .equals(other.persistedNullableSetOfNullableLongs)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableLongs_4(" + nullableSetOfNullableLongs
                + ',' + calculatedNullableSetOfNullableLongs + ','
                + persistedNullableSetOfNullableLongs + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Long> nullableSetOfNullableLongs;

    @JsonProperty("nullableSetOfNullableLongs")
    public java.util.Set<Long> getNullableSetOfNullableLongs() {
        return nullableSetOfNullableLongs;
    }

    public NullableSetOfNullableLongs_4 setNullableSetOfNullableLongs(
            final java.util.Set<Long> value) {
        this.nullableSetOfNullableLongs = value;

        return this;
    }

    private final java.util.Set<Long> calculatedNullableSetOfNullableLongs;

    public java.util.Set<Long> getCalculatedNullableSetOfNullableLongs() {
        return this.calculatedNullableSetOfNullableLongs;
    }

    private final java.util.Set<Long> persistedNullableSetOfNullableLongs;

    public java.util.Set<Long> getPersistedNullableSetOfNullableLongs() {
        return this.persistedNullableSetOfNullableLongs;
    }
}
