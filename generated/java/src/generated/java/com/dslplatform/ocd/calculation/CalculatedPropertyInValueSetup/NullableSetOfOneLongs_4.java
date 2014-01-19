package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneLongs_4 implements java.io.Serializable {
    public NullableSetOfOneLongs_4(
            final java.util.Set<Long> nullableSetOfOneLongs,
            final java.util.Set<Long> calculatedNullableSetOfOneLongs,
            final java.util.Set<Long> persistedNullableSetOfOneLongs) {
        setNullableSetOfOneLongs(nullableSetOfOneLongs);
        this.calculatedNullableSetOfOneLongs = calculatedNullableSetOfOneLongs;
        this.persistedNullableSetOfOneLongs = persistedNullableSetOfOneLongs;
    }

    public NullableSetOfOneLongs_4() {
        this.calculatedNullableSetOfOneLongs = null;
        this.persistedNullableSetOfOneLongs = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2081839972;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneLongs_4)) return false;
        final NullableSetOfOneLongs_4 other = (NullableSetOfOneLongs_4) obj;

        if (!(this.nullableSetOfOneLongs == other.nullableSetOfOneLongs || this.nullableSetOfOneLongs != null
                && this.nullableSetOfOneLongs
                        .equals(other.nullableSetOfOneLongs))) return false;
        if (!(this.calculatedNullableSetOfOneLongs == other.calculatedNullableSetOfOneLongs || this.calculatedNullableSetOfOneLongs != null
                && this.calculatedNullableSetOfOneLongs
                        .equals(other.calculatedNullableSetOfOneLongs)))
            return false;
        if (!(this.persistedNullableSetOfOneLongs == other.persistedNullableSetOfOneLongs || this.persistedNullableSetOfOneLongs != null
                && this.persistedNullableSetOfOneLongs
                        .equals(other.persistedNullableSetOfOneLongs)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneLongs_4(" + nullableSetOfOneLongs + ','
                + calculatedNullableSetOfOneLongs + ','
                + persistedNullableSetOfOneLongs + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Long> nullableSetOfOneLongs;

    @JsonProperty("nullableSetOfOneLongs")
    public java.util.Set<Long> getNullableSetOfOneLongs() {
        return nullableSetOfOneLongs;
    }

    public NullableSetOfOneLongs_4 setNullableSetOfOneLongs(
            final java.util.Set<Long> value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableSetOfOneLongs = value;

        return this;
    }

    private final java.util.Set<Long> calculatedNullableSetOfOneLongs;

    public java.util.Set<Long> getCalculatedNullableSetOfOneLongs() {
        return this.calculatedNullableSetOfOneLongs;
    }

    private final java.util.Set<Long> persistedNullableSetOfOneLongs;

    public java.util.Set<Long> getPersistedNullableSetOfOneLongs() {
        return this.persistedNullableSetOfOneLongs;
    }
}
