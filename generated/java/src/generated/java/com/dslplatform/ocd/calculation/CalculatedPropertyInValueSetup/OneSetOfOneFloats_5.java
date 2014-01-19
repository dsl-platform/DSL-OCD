package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneFloats_5 implements java.io.Serializable {
    public OneSetOfOneFloats_5(
            final java.util.Set<Float> oneSetOfOneFloats,
            final java.util.Set<Float> calculatedOneSetOfOneFloats,
            final java.util.Set<Float> persistedOneSetOfOneFloats) {
        setOneSetOfOneFloats(oneSetOfOneFloats);
        this.calculatedOneSetOfOneFloats = calculatedOneSetOfOneFloats;
        this.persistedOneSetOfOneFloats = persistedOneSetOfOneFloats;
    }

    public OneSetOfOneFloats_5() {
        this.oneSetOfOneFloats = new java.util.HashSet<Float>();
        this.calculatedOneSetOfOneFloats = new java.util.HashSet<Float>();
        this.persistedOneSetOfOneFloats = new java.util.HashSet<Float>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1357560386;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneFloats_5)) return false;
        final OneSetOfOneFloats_5 other = (OneSetOfOneFloats_5) obj;

        if (!(this.oneSetOfOneFloats.equals(other.oneSetOfOneFloats)))
            return false;
        if (!(this.calculatedOneSetOfOneFloats
                .equals(other.calculatedOneSetOfOneFloats))) return false;
        if (!(this.persistedOneSetOfOneFloats
                .equals(other.persistedOneSetOfOneFloats))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneFloats_5(" + oneSetOfOneFloats + ','
                + calculatedOneSetOfOneFloats + ','
                + persistedOneSetOfOneFloats + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Float> oneSetOfOneFloats;

    @JsonProperty("oneSetOfOneFloats")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<Float> getOneSetOfOneFloats() {
        return oneSetOfOneFloats;
    }

    public OneSetOfOneFloats_5 setOneSetOfOneFloats(
            final java.util.Set<Float> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneFloats\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneSetOfOneFloats = value;

        return this;
    }

    private final java.util.Set<Float> calculatedOneSetOfOneFloats;

    public java.util.Set<Float> getCalculatedOneSetOfOneFloats() {
        return this.calculatedOneSetOfOneFloats;
    }

    private final java.util.Set<Float> persistedOneSetOfOneFloats;

    public java.util.Set<Float> getPersistedOneSetOfOneFloats() {
        return this.persistedOneSetOfOneFloats;
    }
}
