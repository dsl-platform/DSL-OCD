package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableLongs_5 implements java.io.Serializable {
    public OneArrayOfNullableLongs_5(
            final Long[] oneArrayOfNullableLongs,
            final Long[] calculatedOneArrayOfNullableLongs,
            final Long[] persistedOneArrayOfNullableLongs) {
        setOneArrayOfNullableLongs(oneArrayOfNullableLongs);
        this.calculatedOneArrayOfNullableLongs = calculatedOneArrayOfNullableLongs;
        this.persistedOneArrayOfNullableLongs = persistedOneArrayOfNullableLongs;
    }

    public OneArrayOfNullableLongs_5() {
        this.oneArrayOfNullableLongs = new Long[] {};
        this.calculatedOneArrayOfNullableLongs = new Long[] {};
        this.persistedOneArrayOfNullableLongs = new Long[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1829774686;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableLongs_5)) return false;
        final OneArrayOfNullableLongs_5 other = (OneArrayOfNullableLongs_5) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfNullableLongs,
                other.oneArrayOfNullableLongs))) return false;
        if (!(java.util.Arrays.equals(this.calculatedOneArrayOfNullableLongs,
                other.calculatedOneArrayOfNullableLongs))) return false;
        if (!(java.util.Arrays.equals(this.persistedOneArrayOfNullableLongs,
                other.persistedOneArrayOfNullableLongs))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableLongs_5(" + oneArrayOfNullableLongs + ','
                + calculatedOneArrayOfNullableLongs + ','
                + persistedOneArrayOfNullableLongs + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Long[] oneArrayOfNullableLongs;

    @JsonProperty("oneArrayOfNullableLongs")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Long[] getOneArrayOfNullableLongs() {
        return oneArrayOfNullableLongs;
    }

    public OneArrayOfNullableLongs_5 setOneArrayOfNullableLongs(
            final Long[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableLongs\" cannot be null!");
        this.oneArrayOfNullableLongs = value;

        return this;
    }

    private final Long[] calculatedOneArrayOfNullableLongs;

    public Long[] getCalculatedOneArrayOfNullableLongs() {
        return this.calculatedOneArrayOfNullableLongs;
    }

    private final Long[] persistedOneArrayOfNullableLongs;

    public Long[] getPersistedOneArrayOfNullableLongs() {
        return this.persistedOneArrayOfNullableLongs;
    }
}
