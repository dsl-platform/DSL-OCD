package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneLongs_5 implements java.io.Serializable {
    public OneArrayOfOneLongs_5(
            final long[] oneArrayOfOneLongs,
            final long[] calculatedOneArrayOfOneLongs,
            final long[] persistedOneArrayOfOneLongs) {
        setOneArrayOfOneLongs(oneArrayOfOneLongs);
        this.calculatedOneArrayOfOneLongs = calculatedOneArrayOfOneLongs;
        this.persistedOneArrayOfOneLongs = persistedOneArrayOfOneLongs;
    }

    public OneArrayOfOneLongs_5() {
        this.oneArrayOfOneLongs = new long[] {};
        this.calculatedOneArrayOfOneLongs = new long[] {};
        this.persistedOneArrayOfOneLongs = new long[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 6334479;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneLongs_5)) return false;
        final OneArrayOfOneLongs_5 other = (OneArrayOfOneLongs_5) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfOneLongs,
                other.oneArrayOfOneLongs))) return false;
        if (!(java.util.Arrays.equals(this.calculatedOneArrayOfOneLongs,
                other.calculatedOneArrayOfOneLongs))) return false;
        if (!(java.util.Arrays.equals(this.persistedOneArrayOfOneLongs,
                other.persistedOneArrayOfOneLongs))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneLongs_5(" + oneArrayOfOneLongs + ','
                + calculatedOneArrayOfOneLongs + ','
                + persistedOneArrayOfOneLongs + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private long[] oneArrayOfOneLongs;

    @JsonProperty("oneArrayOfOneLongs")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public long[] getOneArrayOfOneLongs() {
        return oneArrayOfOneLongs;
    }

    public OneArrayOfOneLongs_5 setOneArrayOfOneLongs(final long[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneLongs\" cannot be null!");
        this.oneArrayOfOneLongs = value;

        return this;
    }

    private final long[] calculatedOneArrayOfOneLongs;

    public long[] getCalculatedOneArrayOfOneLongs() {
        return this.calculatedOneArrayOfOneLongs;
    }

    private final long[] persistedOneArrayOfOneLongs;

    public long[] getPersistedOneArrayOfOneLongs() {
        return this.persistedOneArrayOfOneLongs;
    }
}
