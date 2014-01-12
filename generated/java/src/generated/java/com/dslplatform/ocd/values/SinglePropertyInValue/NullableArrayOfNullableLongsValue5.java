package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableLongsValue5 implements
        java.io.Serializable {
    public NullableArrayOfNullableLongsValue5(
            final Long[] nullableArrayOfNullableLongs) {
        setNullableArrayOfNullableLongs(nullableArrayOfNullableLongs);
    }

    public NullableArrayOfNullableLongsValue5() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 378746137;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableLongsValue5)) return false;
        final NullableArrayOfNullableLongsValue5 other = (NullableArrayOfNullableLongsValue5) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableLongs,
                other.nullableArrayOfNullableLongs))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableLongsValue5("
                + nullableArrayOfNullableLongs + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Long[] nullableArrayOfNullableLongs;

    @JsonProperty("nullableArrayOfNullableLongs")
    public Long[] getNullableArrayOfNullableLongs() {
        return nullableArrayOfNullableLongs;
    }

    public NullableArrayOfNullableLongsValue5 setNullableArrayOfNullableLongs(
            final Long[] value) {
        this.nullableArrayOfNullableLongs = value;

        return this;
    }
}
