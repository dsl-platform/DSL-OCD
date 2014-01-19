package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneLongs_5 implements java.io.Serializable {
    public OneSetOfOneLongs_5(
            final java.util.Set<Long> oneSetOfOneLongs,
            final java.util.Set<Long> calculatedOneSetOfOneLongs,
            final java.util.Set<Long> persistedOneSetOfOneLongs) {
        setOneSetOfOneLongs(oneSetOfOneLongs);
        this.calculatedOneSetOfOneLongs = calculatedOneSetOfOneLongs;
        this.persistedOneSetOfOneLongs = persistedOneSetOfOneLongs;
    }

    public OneSetOfOneLongs_5() {
        this.oneSetOfOneLongs = new java.util.HashSet<Long>();
        this.calculatedOneSetOfOneLongs = new java.util.HashSet<Long>();
        this.persistedOneSetOfOneLongs = new java.util.HashSet<Long>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 694529576;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneLongs_5)) return false;
        final OneSetOfOneLongs_5 other = (OneSetOfOneLongs_5) obj;

        if (!(this.oneSetOfOneLongs.equals(other.oneSetOfOneLongs)))
            return false;
        if (!(this.calculatedOneSetOfOneLongs
                .equals(other.calculatedOneSetOfOneLongs))) return false;
        if (!(this.persistedOneSetOfOneLongs
                .equals(other.persistedOneSetOfOneLongs))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneLongs_5(" + oneSetOfOneLongs + ','
                + calculatedOneSetOfOneLongs + ',' + persistedOneSetOfOneLongs
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Long> oneSetOfOneLongs;

    @JsonProperty("oneSetOfOneLongs")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<Long> getOneSetOfOneLongs() {
        return oneSetOfOneLongs;
    }

    public OneSetOfOneLongs_5 setOneSetOfOneLongs(
            final java.util.Set<Long> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneLongs\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneSetOfOneLongs = value;

        return this;
    }

    private final java.util.Set<Long> calculatedOneSetOfOneLongs;

    public java.util.Set<Long> getCalculatedOneSetOfOneLongs() {
        return this.calculatedOneSetOfOneLongs;
    }

    private final java.util.Set<Long> persistedOneSetOfOneLongs;

    public java.util.Set<Long> getPersistedOneSetOfOneLongs() {
        return this.persistedOneSetOfOneLongs;
    }
}
