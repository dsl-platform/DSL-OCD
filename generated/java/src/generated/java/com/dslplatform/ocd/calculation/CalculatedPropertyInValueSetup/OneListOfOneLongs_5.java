package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneLongs_5 implements java.io.Serializable {
    public OneListOfOneLongs_5(
            final java.util.List<Long> oneListOfOneLongs,
            final java.util.List<Long> calculatedOneListOfOneLongs,
            final java.util.List<Long> persistedOneListOfOneLongs) {
        setOneListOfOneLongs(oneListOfOneLongs);
        this.calculatedOneListOfOneLongs = calculatedOneListOfOneLongs;
        this.persistedOneListOfOneLongs = persistedOneListOfOneLongs;
    }

    public OneListOfOneLongs_5() {
        this.oneListOfOneLongs = new java.util.ArrayList<Long>();
        this.calculatedOneListOfOneLongs = new java.util.ArrayList<Long>();
        this.persistedOneListOfOneLongs = new java.util.ArrayList<Long>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2033849468;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneLongs_5)) return false;
        final OneListOfOneLongs_5 other = (OneListOfOneLongs_5) obj;

        if (!(this.oneListOfOneLongs.equals(other.oneListOfOneLongs)))
            return false;
        if (!(this.calculatedOneListOfOneLongs
                .equals(other.calculatedOneListOfOneLongs))) return false;
        if (!(this.persistedOneListOfOneLongs
                .equals(other.persistedOneListOfOneLongs))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneLongs_5(" + oneListOfOneLongs + ','
                + calculatedOneListOfOneLongs + ','
                + persistedOneListOfOneLongs + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Long> oneListOfOneLongs;

    @JsonProperty("oneListOfOneLongs")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<Long> getOneListOfOneLongs() {
        return oneListOfOneLongs;
    }

    public OneListOfOneLongs_5 setOneListOfOneLongs(
            final java.util.List<Long> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneLongs\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneListOfOneLongs = value;

        return this;
    }

    private final java.util.List<Long> calculatedOneListOfOneLongs;

    public java.util.List<Long> getCalculatedOneListOfOneLongs() {
        return this.calculatedOneListOfOneLongs;
    }

    private final java.util.List<Long> persistedOneListOfOneLongs;

    public java.util.List<Long> getPersistedOneListOfOneLongs() {
        return this.persistedOneListOfOneLongs;
    }
}
