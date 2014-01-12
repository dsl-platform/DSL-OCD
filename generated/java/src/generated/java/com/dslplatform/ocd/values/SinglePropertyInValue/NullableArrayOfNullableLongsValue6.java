package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableLongsValue6 implements
        java.io.Serializable {
    public NullableArrayOfNullableLongsValue6(
            final Long[] nullableArrayOfNullableLongs) {
        setNullableArrayOfNullableLongs(nullableArrayOfNullableLongs);
    }

    public NullableArrayOfNullableLongsValue6() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 24538390;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableLongsValue6)) return false;
        final NullableArrayOfNullableLongsValue6 other = (NullableArrayOfNullableLongsValue6) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableLongs,
                other.nullableArrayOfNullableLongs))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableLongsValue6("
                + nullableArrayOfNullableLongs + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Long[] nullableArrayOfNullableLongs;

    @JsonProperty("nullableArrayOfNullableLongs")
    public Long[] getNullableArrayOfNullableLongs() {
        return nullableArrayOfNullableLongs;
    }

    public NullableArrayOfNullableLongsValue6 setNullableArrayOfNullableLongs(
            final Long[] value) {
        this.nullableArrayOfNullableLongs = value;

        return this;
    }
}
