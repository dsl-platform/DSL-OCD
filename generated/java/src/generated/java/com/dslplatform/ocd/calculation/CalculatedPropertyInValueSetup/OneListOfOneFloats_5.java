package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneFloats_5 implements java.io.Serializable {
    public OneListOfOneFloats_5(
            final java.util.List<Float> oneListOfOneFloats,
            final java.util.List<Float> calculatedOneListOfOneFloats,
            final java.util.List<Float> persistedOneListOfOneFloats) {
        setOneListOfOneFloats(oneListOfOneFloats);
        this.calculatedOneListOfOneFloats = calculatedOneListOfOneFloats;
        this.persistedOneListOfOneFloats = persistedOneListOfOneFloats;
    }

    public OneListOfOneFloats_5() {
        this.oneListOfOneFloats = new java.util.ArrayList<Float>();
        this.calculatedOneListOfOneFloats = new java.util.ArrayList<Float>();
        this.persistedOneListOfOneFloats = new java.util.ArrayList<Float>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1452308742;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneFloats_5)) return false;
        final OneListOfOneFloats_5 other = (OneListOfOneFloats_5) obj;

        if (!(this.oneListOfOneFloats.equals(other.oneListOfOneFloats)))
            return false;
        if (!(this.calculatedOneListOfOneFloats
                .equals(other.calculatedOneListOfOneFloats))) return false;
        if (!(this.persistedOneListOfOneFloats
                .equals(other.persistedOneListOfOneFloats))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneFloats_5(" + oneListOfOneFloats + ','
                + calculatedOneListOfOneFloats + ','
                + persistedOneListOfOneFloats + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Float> oneListOfOneFloats;

    @JsonProperty("oneListOfOneFloats")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<Float> getOneListOfOneFloats() {
        return oneListOfOneFloats;
    }

    public OneListOfOneFloats_5 setOneListOfOneFloats(
            final java.util.List<Float> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneFloats\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneListOfOneFloats = value;

        return this;
    }

    private final java.util.List<Float> calculatedOneListOfOneFloats;

    public java.util.List<Float> getCalculatedOneListOfOneFloats() {
        return this.calculatedOneListOfOneFloats;
    }

    private final java.util.List<Float> persistedOneListOfOneFloats;

    public java.util.List<Float> getPersistedOneListOfOneFloats() {
        return this.persistedOneListOfOneFloats;
    }
}
