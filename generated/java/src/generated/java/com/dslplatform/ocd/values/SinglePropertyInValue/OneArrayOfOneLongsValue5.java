package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneLongsValue5 implements java.io.Serializable {
    public OneArrayOfOneLongsValue5(
            final long[] oneArrayOfOneLongs) {
        setOneArrayOfOneLongs(oneArrayOfOneLongs);
    }

    public OneArrayOfOneLongsValue5() {
        this.oneArrayOfOneLongs = new long[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 702697237;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneLongsValue5)) return false;
        final OneArrayOfOneLongsValue5 other = (OneArrayOfOneLongsValue5) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfOneLongs,
                other.oneArrayOfOneLongs))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneLongsValue5(" + oneArrayOfOneLongs + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private long[] oneArrayOfOneLongs;

    @JsonProperty("oneArrayOfOneLongs")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public long[] getOneArrayOfOneLongs() {
        return oneArrayOfOneLongs;
    }

    public OneArrayOfOneLongsValue5 setOneArrayOfOneLongs(final long[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneLongs\" cannot be null!");
        this.oneArrayOfOneLongs = value;

        return this;
    }
}
