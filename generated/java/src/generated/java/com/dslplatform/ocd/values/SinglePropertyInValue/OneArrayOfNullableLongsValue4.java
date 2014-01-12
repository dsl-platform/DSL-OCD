package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableLongsValue4 implements
        java.io.Serializable {
    public OneArrayOfNullableLongsValue4(
            final Long[] oneArrayOfNullableLongs) {
        setOneArrayOfNullableLongs(oneArrayOfNullableLongs);
    }

    public OneArrayOfNullableLongsValue4() {
        this.oneArrayOfNullableLongs = new Long[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1276310195;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableLongsValue4)) return false;
        final OneArrayOfNullableLongsValue4 other = (OneArrayOfNullableLongsValue4) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfNullableLongs,
                other.oneArrayOfNullableLongs))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableLongsValue4(" + oneArrayOfNullableLongs + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Long[] oneArrayOfNullableLongs;

    @JsonProperty("oneArrayOfNullableLongs")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Long[] getOneArrayOfNullableLongs() {
        return oneArrayOfNullableLongs;
    }

    public OneArrayOfNullableLongsValue4 setOneArrayOfNullableLongs(
            final Long[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableLongs\" cannot be null!");
        this.oneArrayOfNullableLongs = value;

        return this;
    }
}
