package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableLongsValue1 implements
        java.io.Serializable {
    public OneArrayOfNullableLongsValue1(
            final Long[] oneArrayOfNullableLongs) {
        setOneArrayOfNullableLongs(oneArrayOfNullableLongs);
    }

    public OneArrayOfNullableLongsValue1() {
        this.oneArrayOfNullableLongs = new Long[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1276310190;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableLongsValue1)) return false;
        final OneArrayOfNullableLongsValue1 other = (OneArrayOfNullableLongsValue1) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfNullableLongs,
                other.oneArrayOfNullableLongs))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableLongsValue1(" + oneArrayOfNullableLongs + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Long[] oneArrayOfNullableLongs;

    @JsonProperty("oneArrayOfNullableLongs")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Long[] getOneArrayOfNullableLongs() {
        return oneArrayOfNullableLongs;
    }

    public OneArrayOfNullableLongsValue1 setOneArrayOfNullableLongs(
            final Long[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableLongs\" cannot be null!");
        this.oneArrayOfNullableLongs = value;

        return this;
    }
}
