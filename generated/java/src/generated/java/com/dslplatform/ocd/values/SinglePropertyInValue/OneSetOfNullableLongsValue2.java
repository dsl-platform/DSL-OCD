package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableLongsValue2 implements java.io.Serializable {
    public OneSetOfNullableLongsValue2(
            final java.util.Set<Long> oneSetOfNullableLongs) {
        setOneSetOfNullableLongs(oneSetOfNullableLongs);
    }

    public OneSetOfNullableLongsValue2() {
        this.oneSetOfNullableLongs = new java.util.HashSet<Long>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1481724532;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableLongsValue2)) return false;
        final OneSetOfNullableLongsValue2 other = (OneSetOfNullableLongsValue2) obj;

        if (!(this.oneSetOfNullableLongs.equals(other.oneSetOfNullableLongs)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableLongsValue2(" + oneSetOfNullableLongs + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Long> oneSetOfNullableLongs;

    @JsonProperty("oneSetOfNullableLongs")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<Long> getOneSetOfNullableLongs() {
        return oneSetOfNullableLongs;
    }

    public OneSetOfNullableLongsValue2 setOneSetOfNullableLongs(
            final java.util.Set<Long> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableLongs\" cannot be null!");
        this.oneSetOfNullableLongs = value;

        return this;
    }
}
