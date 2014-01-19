package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableLongs_5 implements java.io.Serializable {
    public OneSetOfNullableLongs_5(
            final java.util.Set<Long> oneSetOfNullableLongs,
            final java.util.Set<Long> calculatedOneSetOfNullableLongs,
            final java.util.Set<Long> persistedOneSetOfNullableLongs) {
        setOneSetOfNullableLongs(oneSetOfNullableLongs);
        this.calculatedOneSetOfNullableLongs = calculatedOneSetOfNullableLongs;
        this.persistedOneSetOfNullableLongs = persistedOneSetOfNullableLongs;
    }

    public OneSetOfNullableLongs_5() {
        this.oneSetOfNullableLongs = new java.util.HashSet<Long>();
        this.calculatedOneSetOfNullableLongs = new java.util.HashSet<Long>();
        this.persistedOneSetOfNullableLongs = new java.util.HashSet<Long>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1176212253;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableLongs_5)) return false;
        final OneSetOfNullableLongs_5 other = (OneSetOfNullableLongs_5) obj;

        if (!(this.oneSetOfNullableLongs.equals(other.oneSetOfNullableLongs)))
            return false;
        if (!(this.calculatedOneSetOfNullableLongs
                .equals(other.calculatedOneSetOfNullableLongs))) return false;
        if (!(this.persistedOneSetOfNullableLongs
                .equals(other.persistedOneSetOfNullableLongs))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableLongs_5(" + oneSetOfNullableLongs + ','
                + calculatedOneSetOfNullableLongs + ','
                + persistedOneSetOfNullableLongs + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Long> oneSetOfNullableLongs;

    @JsonProperty("oneSetOfNullableLongs")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<Long> getOneSetOfNullableLongs() {
        return oneSetOfNullableLongs;
    }

    public OneSetOfNullableLongs_5 setOneSetOfNullableLongs(
            final java.util.Set<Long> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableLongs\" cannot be null!");
        this.oneSetOfNullableLongs = value;

        return this;
    }

    private final java.util.Set<Long> calculatedOneSetOfNullableLongs;

    public java.util.Set<Long> getCalculatedOneSetOfNullableLongs() {
        return this.calculatedOneSetOfNullableLongs;
    }

    private final java.util.Set<Long> persistedOneSetOfNullableLongs;

    public java.util.Set<Long> getPersistedOneSetOfNullableLongs() {
        return this.persistedOneSetOfNullableLongs;
    }
}
