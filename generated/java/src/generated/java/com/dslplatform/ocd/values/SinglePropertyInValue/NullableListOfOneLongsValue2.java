package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneLongsValue2 implements java.io.Serializable {
    public NullableListOfOneLongsValue2(
            final java.util.List<Long> nullableListOfOneLongs) {
        setNullableListOfOneLongs(nullableListOfOneLongs);
    }

    public NullableListOfOneLongsValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 231103132;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneLongsValue2)) return false;
        final NullableListOfOneLongsValue2 other = (NullableListOfOneLongsValue2) obj;

        if (!(this.nullableListOfOneLongs == other.nullableListOfOneLongs || this.nullableListOfOneLongs != null
                && this.nullableListOfOneLongs
                        .equals(other.nullableListOfOneLongs))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneLongsValue2(" + nullableListOfOneLongs + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Long> nullableListOfOneLongs;

    @JsonProperty("nullableListOfOneLongs")
    public java.util.List<Long> getNullableListOfOneLongs() {
        return nullableListOfOneLongs;
    }

    public NullableListOfOneLongsValue2 setNullableListOfOneLongs(
            final java.util.List<Long> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableListOfOneLongs = value;

        return this;
    }
}
