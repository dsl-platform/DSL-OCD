package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableDoubles_5 implements java.io.Serializable {
    public OneListOfNullableDoubles_5(
            final java.util.List<Double> oneListOfNullableDoubles,
            final java.util.List<Double> calculatedOneListOfNullableDoubles,
            final java.util.List<Double> persistedOneListOfNullableDoubles) {
        setOneListOfNullableDoubles(oneListOfNullableDoubles);
        this.calculatedOneListOfNullableDoubles = calculatedOneListOfNullableDoubles;
        this.persistedOneListOfNullableDoubles = persistedOneListOfNullableDoubles;
    }

    public OneListOfNullableDoubles_5() {
        this.oneListOfNullableDoubles = new java.util.ArrayList<Double>();
        this.calculatedOneListOfNullableDoubles = new java.util.ArrayList<Double>();
        this.persistedOneListOfNullableDoubles = new java.util.ArrayList<Double>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 594196648;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableDoubles_5)) return false;
        final OneListOfNullableDoubles_5 other = (OneListOfNullableDoubles_5) obj;

        if (!(this.oneListOfNullableDoubles
                .equals(other.oneListOfNullableDoubles))) return false;
        if (!(this.calculatedOneListOfNullableDoubles
                .equals(other.calculatedOneListOfNullableDoubles)))
            return false;
        if (!(this.persistedOneListOfNullableDoubles
                .equals(other.persistedOneListOfNullableDoubles)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableDoubles_5(" + oneListOfNullableDoubles + ','
                + calculatedOneListOfNullableDoubles + ','
                + persistedOneListOfNullableDoubles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Double> oneListOfNullableDoubles;

    @JsonProperty("oneListOfNullableDoubles")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<Double> getOneListOfNullableDoubles() {
        return oneListOfNullableDoubles;
    }

    public OneListOfNullableDoubles_5 setOneListOfNullableDoubles(
            final java.util.List<Double> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableDoubles\" cannot be null!");
        this.oneListOfNullableDoubles = value;

        return this;
    }

    private final java.util.List<Double> calculatedOneListOfNullableDoubles;

    public java.util.List<Double> getCalculatedOneListOfNullableDoubles() {
        return this.calculatedOneListOfNullableDoubles;
    }

    private final java.util.List<Double> persistedOneListOfNullableDoubles;

    public java.util.List<Double> getPersistedOneListOfNullableDoubles() {
        return this.persistedOneListOfNullableDoubles;
    }
}
