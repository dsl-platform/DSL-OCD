package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableLongs_5 implements java.io.Serializable {
    public OneListOfNullableLongs_5(
            final java.util.List<Long> oneListOfNullableLongs,
            final java.util.List<Long> calculatedOneListOfNullableLongs,
            final java.util.List<Long> persistedOneListOfNullableLongs) {
        setOneListOfNullableLongs(oneListOfNullableLongs);
        this.calculatedOneListOfNullableLongs = calculatedOneListOfNullableLongs;
        this.persistedOneListOfNullableLongs = persistedOneListOfNullableLongs;
    }

    public OneListOfNullableLongs_5() {
        this.oneListOfNullableLongs = new java.util.ArrayList<Long>();
        this.calculatedOneListOfNullableLongs = new java.util.ArrayList<Long>();
        this.persistedOneListOfNullableLongs = new java.util.ArrayList<Long>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 650688397;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableLongs_5)) return false;
        final OneListOfNullableLongs_5 other = (OneListOfNullableLongs_5) obj;

        if (!(this.oneListOfNullableLongs.equals(other.oneListOfNullableLongs)))
            return false;
        if (!(this.calculatedOneListOfNullableLongs
                .equals(other.calculatedOneListOfNullableLongs))) return false;
        if (!(this.persistedOneListOfNullableLongs
                .equals(other.persistedOneListOfNullableLongs))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableLongs_5(" + oneListOfNullableLongs + ','
                + calculatedOneListOfNullableLongs + ','
                + persistedOneListOfNullableLongs + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Long> oneListOfNullableLongs;

    @JsonProperty("oneListOfNullableLongs")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<Long> getOneListOfNullableLongs() {
        return oneListOfNullableLongs;
    }

    public OneListOfNullableLongs_5 setOneListOfNullableLongs(
            final java.util.List<Long> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableLongs\" cannot be null!");
        this.oneListOfNullableLongs = value;

        return this;
    }

    private final java.util.List<Long> calculatedOneListOfNullableLongs;

    public java.util.List<Long> getCalculatedOneListOfNullableLongs() {
        return this.calculatedOneListOfNullableLongs;
    }

    private final java.util.List<Long> persistedOneListOfNullableLongs;

    public java.util.List<Long> getPersistedOneListOfNullableLongs() {
        return this.persistedOneListOfNullableLongs;
    }
}
