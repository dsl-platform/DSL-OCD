package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneLongsValue1 implements java.io.Serializable {
    public OneListOfOneLongsValue1(
            final java.util.List<Long> oneListOfOneLongs) {
        setOneListOfOneLongs(oneListOfOneLongs);
    }

    public OneListOfOneLongsValue1() {
        this.oneListOfOneLongs = new java.util.ArrayList<Long>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1564604084;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneLongsValue1)) return false;
        final OneListOfOneLongsValue1 other = (OneListOfOneLongsValue1) obj;

        if (!(this.oneListOfOneLongs.equals(other.oneListOfOneLongs)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneLongsValue1(" + oneListOfOneLongs + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Long> oneListOfOneLongs;

    @JsonProperty("oneListOfOneLongs")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<Long> getOneListOfOneLongs() {
        return oneListOfOneLongs;
    }

    public OneListOfOneLongsValue1 setOneListOfOneLongs(
            final java.util.List<Long> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneLongs\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneListOfOneLongs = value;

        return this;
    }
}
