package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableLongs_1 implements java.io.Serializable {
    public OneSetOfNullableLongs_1(
            final java.util.Set<Long> oneSetOfNullableLongs) {
        setOneSetOfNullableLongs(oneSetOfNullableLongs);
    }

    public OneSetOfNullableLongs_1() {
        this.oneSetOfNullableLongs = new java.util.HashSet<Long>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1176212249;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableLongs_1)) return false;
        final OneSetOfNullableLongs_1 other = (OneSetOfNullableLongs_1) obj;

        if (!(this.oneSetOfNullableLongs.equals(other.oneSetOfNullableLongs)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableLongs_1(" + oneSetOfNullableLongs + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Long> oneSetOfNullableLongs;

    @JsonProperty("oneSetOfNullableLongs")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<Long> getOneSetOfNullableLongs() {
        return oneSetOfNullableLongs;
    }

    public OneSetOfNullableLongs_1 setOneSetOfNullableLongs(
            final java.util.Set<Long> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableLongs\" cannot be null!");
        this.oneSetOfNullableLongs = value;

        return this;
    }
}
