package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableLongs_1 implements java.io.Serializable {
    public OneListOfNullableLongs_1(
            final java.util.List<Long> oneListOfNullableLongs) {
        setOneListOfNullableLongs(oneListOfNullableLongs);
    }

    public OneListOfNullableLongs_1() {
        this.oneListOfNullableLongs = new java.util.ArrayList<Long>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1674910431;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableLongs_1)) return false;
        final OneListOfNullableLongs_1 other = (OneListOfNullableLongs_1) obj;

        if (!(this.oneListOfNullableLongs.equals(other.oneListOfNullableLongs)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableLongs_1(" + oneListOfNullableLongs + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Long> oneListOfNullableLongs;

    @JsonProperty("oneListOfNullableLongs")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<Long> getOneListOfNullableLongs() {
        return oneListOfNullableLongs;
    }

    public OneListOfNullableLongs_1 setOneListOfNullableLongs(
            final java.util.List<Long> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableLongs\" cannot be null!");
        this.oneListOfNullableLongs = value;

        return this;
    }
}
