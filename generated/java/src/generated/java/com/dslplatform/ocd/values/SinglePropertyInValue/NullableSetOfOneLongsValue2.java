package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneLongsValue2 implements java.io.Serializable {
    public NullableSetOfOneLongsValue2(
            final java.util.Set<Long> nullableSetOfOneLongs) {
        setNullableSetOfOneLongs(nullableSetOfOneLongs);
    }

    public NullableSetOfOneLongsValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 245812942;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneLongsValue2)) return false;
        final NullableSetOfOneLongsValue2 other = (NullableSetOfOneLongsValue2) obj;

        if (!(this.nullableSetOfOneLongs == other.nullableSetOfOneLongs || this.nullableSetOfOneLongs != null
                && this.nullableSetOfOneLongs
                        .equals(other.nullableSetOfOneLongs))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneLongsValue2(" + nullableSetOfOneLongs + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Long> nullableSetOfOneLongs;

    @JsonProperty("nullableSetOfOneLongs")
    public java.util.Set<Long> getNullableSetOfOneLongs() {
        return nullableSetOfOneLongs;
    }

    public NullableSetOfOneLongsValue2 setNullableSetOfOneLongs(
            final java.util.Set<Long> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableSetOfOneLongs = value;

        return this;
    }
}
