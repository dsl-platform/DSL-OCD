package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableFloats_5 implements java.io.Serializable {
    public OneListOfNullableFloats_5(
            final java.util.List<Float> oneListOfNullableFloats,
            final java.util.List<Float> calculatedOneListOfNullableFloats,
            final java.util.List<Float> persistedOneListOfNullableFloats) {
        setOneListOfNullableFloats(oneListOfNullableFloats);
        this.calculatedOneListOfNullableFloats = calculatedOneListOfNullableFloats;
        this.persistedOneListOfNullableFloats = persistedOneListOfNullableFloats;
    }

    public OneListOfNullableFloats_5() {
        this.oneListOfNullableFloats = new java.util.ArrayList<Float>();
        this.calculatedOneListOfNullableFloats = new java.util.ArrayList<Float>();
        this.persistedOneListOfNullableFloats = new java.util.ArrayList<Float>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1115815601;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableFloats_5)) return false;
        final OneListOfNullableFloats_5 other = (OneListOfNullableFloats_5) obj;

        if (!(this.oneListOfNullableFloats
                .equals(other.oneListOfNullableFloats))) return false;
        if (!(this.calculatedOneListOfNullableFloats
                .equals(other.calculatedOneListOfNullableFloats)))
            return false;
        if (!(this.persistedOneListOfNullableFloats
                .equals(other.persistedOneListOfNullableFloats))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableFloats_5(" + oneListOfNullableFloats + ','
                + calculatedOneListOfNullableFloats + ','
                + persistedOneListOfNullableFloats + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Float> oneListOfNullableFloats;

    @JsonProperty("oneListOfNullableFloats")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<Float> getOneListOfNullableFloats() {
        return oneListOfNullableFloats;
    }

    public OneListOfNullableFloats_5 setOneListOfNullableFloats(
            final java.util.List<Float> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableFloats\" cannot be null!");
        this.oneListOfNullableFloats = value;

        return this;
    }

    private final java.util.List<Float> calculatedOneListOfNullableFloats;

    public java.util.List<Float> getCalculatedOneListOfNullableFloats() {
        return this.calculatedOneListOfNullableFloats;
    }

    private final java.util.List<Float> persistedOneListOfNullableFloats;

    public java.util.List<Float> getPersistedOneListOfNullableFloats() {
        return this.persistedOneListOfNullableFloats;
    }
}
