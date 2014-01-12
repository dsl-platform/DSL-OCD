package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneLongsValue2 implements java.io.Serializable {
    public OneSetOfOneLongsValue2(
            final java.util.Set<Long> oneSetOfOneLongs) {
        setOneSetOfOneLongs(oneSetOfOneLongs);
    }

    public OneSetOfOneLongsValue2() {
        this.oneSetOfOneLongs = new java.util.HashSet<Long>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 258595273;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneLongsValue2)) return false;
        final OneSetOfOneLongsValue2 other = (OneSetOfOneLongsValue2) obj;

        if (!(this.oneSetOfOneLongs.equals(other.oneSetOfOneLongs)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneLongsValue2(" + oneSetOfOneLongs + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Long> oneSetOfOneLongs;

    @JsonProperty("oneSetOfOneLongs")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<Long> getOneSetOfOneLongs() {
        return oneSetOfOneLongs;
    }

    public OneSetOfOneLongsValue2 setOneSetOfOneLongs(
            final java.util.Set<Long> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneLongs\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneSetOfOneLongs = value;

        return this;
    }
}
