package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneLongs_1 implements java.io.Serializable {
    public OneListOfOneLongs_1(
            final java.util.List<Long> oneListOfOneLongs) {
        setOneListOfOneLongs(oneListOfOneLongs);
    }

    public OneListOfOneLongs_1() {
        this.oneListOfOneLongs = new java.util.ArrayList<Long>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2033849464;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneLongs_1)) return false;
        final OneListOfOneLongs_1 other = (OneListOfOneLongs_1) obj;

        if (!(this.oneListOfOneLongs.equals(other.oneListOfOneLongs)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneLongs_1(" + oneListOfOneLongs + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Long> oneListOfOneLongs;

    @JsonProperty("oneListOfOneLongs")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<Long> getOneListOfOneLongs() {
        return oneListOfOneLongs;
    }

    public OneListOfOneLongs_1 setOneListOfOneLongs(
            final java.util.List<Long> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneLongs\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneListOfOneLongs = value;

        return this;
    }
}
