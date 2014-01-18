package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneLongs_1 implements java.io.Serializable {
    public OneSetOfOneLongs_1(
            final java.util.Set<Long> oneSetOfOneLongs) {
        setOneSetOfOneLongs(oneSetOfOneLongs);
    }

    public OneSetOfOneLongs_1() {
        this.oneSetOfOneLongs = new java.util.HashSet<Long>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1274838892;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneLongs_1)) return false;
        final OneSetOfOneLongs_1 other = (OneSetOfOneLongs_1) obj;

        if (!(this.oneSetOfOneLongs.equals(other.oneSetOfOneLongs)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneLongs_1(" + oneSetOfOneLongs + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Long> oneSetOfOneLongs;

    @JsonProperty("oneSetOfOneLongs")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<Long> getOneSetOfOneLongs() {
        return oneSetOfOneLongs;
    }

    public OneSetOfOneLongs_1 setOneSetOfOneLongs(
            final java.util.Set<Long> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneLongs\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneSetOfOneLongs = value;

        return this;
    }
}
