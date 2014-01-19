package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableLongs_4 implements
        java.io.Serializable {
    public NullableListOfNullableLongs_4(
            final java.util.List<Long> nullableListOfNullableLongs,
            final java.util.List<Long> calculatedNullableListOfNullableLongs,
            final java.util.List<Long> persistedNullableListOfNullableLongs) {
        setNullableListOfNullableLongs(nullableListOfNullableLongs);
        this.calculatedNullableListOfNullableLongs = calculatedNullableListOfNullableLongs;
        this.persistedNullableListOfNullableLongs = persistedNullableListOfNullableLongs;
    }

    public NullableListOfNullableLongs_4() {
        this.calculatedNullableListOfNullableLongs = null;
        this.persistedNullableListOfNullableLongs = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 205630973;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableLongs_4)) return false;
        final NullableListOfNullableLongs_4 other = (NullableListOfNullableLongs_4) obj;

        if (!(this.nullableListOfNullableLongs == other.nullableListOfNullableLongs || this.nullableListOfNullableLongs != null
                && this.nullableListOfNullableLongs
                        .equals(other.nullableListOfNullableLongs)))
            return false;
        if (!(this.calculatedNullableListOfNullableLongs == other.calculatedNullableListOfNullableLongs || this.calculatedNullableListOfNullableLongs != null
                && this.calculatedNullableListOfNullableLongs
                        .equals(other.calculatedNullableListOfNullableLongs)))
            return false;
        if (!(this.persistedNullableListOfNullableLongs == other.persistedNullableListOfNullableLongs || this.persistedNullableListOfNullableLongs != null
                && this.persistedNullableListOfNullableLongs
                        .equals(other.persistedNullableListOfNullableLongs)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableLongs_4(" + nullableListOfNullableLongs
                + ',' + calculatedNullableListOfNullableLongs + ','
                + persistedNullableListOfNullableLongs + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Long> nullableListOfNullableLongs;

    @JsonProperty("nullableListOfNullableLongs")
    public java.util.List<Long> getNullableListOfNullableLongs() {
        return nullableListOfNullableLongs;
    }

    public NullableListOfNullableLongs_4 setNullableListOfNullableLongs(
            final java.util.List<Long> value) {
        this.nullableListOfNullableLongs = value;

        return this;
    }

    private final java.util.List<Long> calculatedNullableListOfNullableLongs;

    public java.util.List<Long> getCalculatedNullableListOfNullableLongs() {
        return this.calculatedNullableListOfNullableLongs;
    }

    private final java.util.List<Long> persistedNullableListOfNullableLongs;

    public java.util.List<Long> getPersistedNullableListOfNullableLongs() {
        return this.persistedNullableListOfNullableLongs;
    }
}
