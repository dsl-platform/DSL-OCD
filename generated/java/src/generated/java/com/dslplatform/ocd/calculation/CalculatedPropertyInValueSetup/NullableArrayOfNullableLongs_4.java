package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableLongs_4 implements
        java.io.Serializable {
    public NullableArrayOfNullableLongs_4(
            final Long[] nullableArrayOfNullableLongs,
            final Long[] calculatedNullableArrayOfNullableLongs,
            final Long[] persistedNullableArrayOfNullableLongs) {
        setNullableArrayOfNullableLongs(nullableArrayOfNullableLongs);
        this.calculatedNullableArrayOfNullableLongs = calculatedNullableArrayOfNullableLongs;
        this.persistedNullableArrayOfNullableLongs = persistedNullableArrayOfNullableLongs;
    }

    public NullableArrayOfNullableLongs_4() {
        this.calculatedNullableArrayOfNullableLongs = null;
        this.persistedNullableArrayOfNullableLongs = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1649598160;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableLongs_4)) return false;
        final NullableArrayOfNullableLongs_4 other = (NullableArrayOfNullableLongs_4) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableLongs,
                other.nullableArrayOfNullableLongs))) return false;
        if (!(this.calculatedNullableArrayOfNullableLongs == other.calculatedNullableArrayOfNullableLongs || this.calculatedNullableArrayOfNullableLongs != null
                && java.util.Arrays.equals(
                        this.calculatedNullableArrayOfNullableLongs,
                        other.calculatedNullableArrayOfNullableLongs)))
            return false;
        if (!(this.persistedNullableArrayOfNullableLongs == other.persistedNullableArrayOfNullableLongs || this.persistedNullableArrayOfNullableLongs != null
                && java.util.Arrays.equals(
                        this.persistedNullableArrayOfNullableLongs,
                        other.persistedNullableArrayOfNullableLongs)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableLongs_4(" + nullableArrayOfNullableLongs
                + ',' + calculatedNullableArrayOfNullableLongs + ','
                + persistedNullableArrayOfNullableLongs + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Long[] nullableArrayOfNullableLongs;

    @JsonProperty("nullableArrayOfNullableLongs")
    public Long[] getNullableArrayOfNullableLongs() {
        return nullableArrayOfNullableLongs;
    }

    public NullableArrayOfNullableLongs_4 setNullableArrayOfNullableLongs(
            final Long[] value) {
        this.nullableArrayOfNullableLongs = value;

        return this;
    }

    private final Long[] calculatedNullableArrayOfNullableLongs;

    public Long[] getCalculatedNullableArrayOfNullableLongs() {
        return this.calculatedNullableArrayOfNullableLongs;
    }

    private final Long[] persistedNullableArrayOfNullableLongs;

    public Long[] getPersistedNullableArrayOfNullableLongs() {
        return this.persistedNullableArrayOfNullableLongs;
    }
}
