package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneLongsValue1 implements java.io.Serializable {
    public NullableListOfOneLongsValue1(
            final java.util.List<Long> nullableListOfOneLongs) {
        setNullableListOfOneLongs(nullableListOfOneLongs);
    }

    public NullableListOfOneLongsValue1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1334980809;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneLongsValue1)) return false;
        final NullableListOfOneLongsValue1 other = (NullableListOfOneLongsValue1) obj;

        if (!(this.nullableListOfOneLongs == other.nullableListOfOneLongs || this.nullableListOfOneLongs != null
                && this.nullableListOfOneLongs
                        .equals(other.nullableListOfOneLongs))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneLongsValue1(" + nullableListOfOneLongs + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Long> nullableListOfOneLongs;

    @JsonProperty("nullableListOfOneLongs")
    public java.util.List<Long> getNullableListOfOneLongs() {
        return nullableListOfOneLongs;
    }

    public NullableListOfOneLongsValue1 setNullableListOfOneLongs(
            final java.util.List<Long> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableListOfOneLongs = value;

        return this;
    }
}
