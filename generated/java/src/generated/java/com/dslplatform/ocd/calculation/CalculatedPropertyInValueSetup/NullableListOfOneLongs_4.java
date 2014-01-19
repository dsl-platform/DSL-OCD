package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneLongs_4 implements java.io.Serializable {
    public NullableListOfOneLongs_4(
            final java.util.List<Long> nullableListOfOneLongs,
            final java.util.List<Long> calculatedNullableListOfOneLongs,
            final java.util.List<Long> persistedNullableListOfOneLongs) {
        setNullableListOfOneLongs(nullableListOfOneLongs);
        this.calculatedNullableListOfOneLongs = calculatedNullableListOfOneLongs;
        this.persistedNullableListOfOneLongs = persistedNullableListOfOneLongs;
    }

    public NullableListOfOneLongs_4() {
        this.calculatedNullableListOfOneLongs = null;
        this.persistedNullableListOfOneLongs = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1720918274;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneLongs_4)) return false;
        final NullableListOfOneLongs_4 other = (NullableListOfOneLongs_4) obj;

        if (!(this.nullableListOfOneLongs == other.nullableListOfOneLongs || this.nullableListOfOneLongs != null
                && this.nullableListOfOneLongs
                        .equals(other.nullableListOfOneLongs))) return false;
        if (!(this.calculatedNullableListOfOneLongs == other.calculatedNullableListOfOneLongs || this.calculatedNullableListOfOneLongs != null
                && this.calculatedNullableListOfOneLongs
                        .equals(other.calculatedNullableListOfOneLongs)))
            return false;
        if (!(this.persistedNullableListOfOneLongs == other.persistedNullableListOfOneLongs || this.persistedNullableListOfOneLongs != null
                && this.persistedNullableListOfOneLongs
                        .equals(other.persistedNullableListOfOneLongs)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneLongs_4(" + nullableListOfOneLongs + ','
                + calculatedNullableListOfOneLongs + ','
                + persistedNullableListOfOneLongs + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Long> nullableListOfOneLongs;

    @JsonProperty("nullableListOfOneLongs")
    public java.util.List<Long> getNullableListOfOneLongs() {
        return nullableListOfOneLongs;
    }

    public NullableListOfOneLongs_4 setNullableListOfOneLongs(
            final java.util.List<Long> value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableListOfOneLongs = value;

        return this;
    }

    private final java.util.List<Long> calculatedNullableListOfOneLongs;

    public java.util.List<Long> getCalculatedNullableListOfOneLongs() {
        return this.calculatedNullableListOfOneLongs;
    }

    private final java.util.List<Long> persistedNullableListOfOneLongs;

    public java.util.List<Long> getPersistedNullableListOfOneLongs() {
        return this.persistedNullableListOfOneLongs;
    }
}
