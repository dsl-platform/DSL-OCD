package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneLongs_4 implements java.io.Serializable {
    public NullableArrayOfOneLongs_4(
            final long[] nullableArrayOfOneLongs,
            final long[] calculatedNullableArrayOfOneLongs,
            final long[] persistedNullableArrayOfOneLongs) {
        setNullableArrayOfOneLongs(nullableArrayOfOneLongs);
        this.calculatedNullableArrayOfOneLongs = calculatedNullableArrayOfOneLongs;
        this.persistedNullableArrayOfOneLongs = persistedNullableArrayOfOneLongs;
    }

    public NullableArrayOfOneLongs_4() {
        this.calculatedNullableArrayOfOneLongs = null;
        this.persistedNullableArrayOfOneLongs = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 43799889;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneLongs_4)) return false;
        final NullableArrayOfOneLongs_4 other = (NullableArrayOfOneLongs_4) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfOneLongs,
                other.nullableArrayOfOneLongs))) return false;
        if (!(this.calculatedNullableArrayOfOneLongs == other.calculatedNullableArrayOfOneLongs || this.calculatedNullableArrayOfOneLongs != null
                && java.util.Arrays.equals(
                        this.calculatedNullableArrayOfOneLongs,
                        other.calculatedNullableArrayOfOneLongs)))
            return false;
        if (!(this.persistedNullableArrayOfOneLongs == other.persistedNullableArrayOfOneLongs || this.persistedNullableArrayOfOneLongs != null
                && java.util.Arrays.equals(
                        this.persistedNullableArrayOfOneLongs,
                        other.persistedNullableArrayOfOneLongs))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneLongs_4(" + nullableArrayOfOneLongs + ','
                + calculatedNullableArrayOfOneLongs + ','
                + persistedNullableArrayOfOneLongs + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private long[] nullableArrayOfOneLongs;

    @JsonProperty("nullableArrayOfOneLongs")
    public long[] getNullableArrayOfOneLongs() {
        return nullableArrayOfOneLongs;
    }

    public NullableArrayOfOneLongs_4 setNullableArrayOfOneLongs(
            final long[] value) {
        this.nullableArrayOfOneLongs = value;

        return this;
    }

    private final long[] calculatedNullableArrayOfOneLongs;

    public long[] getCalculatedNullableArrayOfOneLongs() {
        return this.calculatedNullableArrayOfOneLongs;
    }

    private final long[] persistedNullableArrayOfOneLongs;

    public long[] getPersistedNullableArrayOfOneLongs() {
        return this.persistedNullableArrayOfOneLongs;
    }
}
