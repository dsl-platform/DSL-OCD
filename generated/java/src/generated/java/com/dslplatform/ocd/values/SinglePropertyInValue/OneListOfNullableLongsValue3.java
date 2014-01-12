package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableLongsValue3 implements java.io.Serializable {
    public OneListOfNullableLongsValue3(
            final java.util.List<Long> oneListOfNullableLongs) {
        setOneListOfNullableLongs(oneListOfNullableLongs);
    }

    public OneListOfNullableLongsValue3() {
        this.oneListOfNullableLongs = new java.util.ArrayList<Long>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2071317145;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableLongsValue3)) return false;
        final OneListOfNullableLongsValue3 other = (OneListOfNullableLongsValue3) obj;

        if (!(this.oneListOfNullableLongs.equals(other.oneListOfNullableLongs)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableLongsValue3(" + oneListOfNullableLongs + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Long> oneListOfNullableLongs;

    @JsonProperty("oneListOfNullableLongs")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<Long> getOneListOfNullableLongs() {
        return oneListOfNullableLongs;
    }

    public OneListOfNullableLongsValue3 setOneListOfNullableLongs(
            final java.util.List<Long> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableLongs\" cannot be null!");
        this.oneListOfNullableLongs = value;

        return this;
    }
}
