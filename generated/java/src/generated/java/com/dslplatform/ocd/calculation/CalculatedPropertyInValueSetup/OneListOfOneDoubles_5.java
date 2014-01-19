package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneDoubles_5 implements java.io.Serializable {
    public OneListOfOneDoubles_5(
            final java.util.List<Double> oneListOfOneDoubles,
            final java.util.List<Double> calculatedOneListOfOneDoubles,
            final java.util.List<Double> persistedOneListOfOneDoubles) {
        setOneListOfOneDoubles(oneListOfOneDoubles);
        this.calculatedOneListOfOneDoubles = calculatedOneListOfOneDoubles;
        this.persistedOneListOfOneDoubles = persistedOneListOfOneDoubles;
    }

    public OneListOfOneDoubles_5() {
        this.oneListOfOneDoubles = new java.util.ArrayList<Double>();
        this.calculatedOneListOfOneDoubles = new java.util.ArrayList<Double>();
        this.persistedOneListOfOneDoubles = new java.util.ArrayList<Double>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 841154943;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneDoubles_5)) return false;
        final OneListOfOneDoubles_5 other = (OneListOfOneDoubles_5) obj;

        if (!(this.oneListOfOneDoubles.equals(other.oneListOfOneDoubles)))
            return false;
        if (!(this.calculatedOneListOfOneDoubles
                .equals(other.calculatedOneListOfOneDoubles))) return false;
        if (!(this.persistedOneListOfOneDoubles
                .equals(other.persistedOneListOfOneDoubles))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneDoubles_5(" + oneListOfOneDoubles + ','
                + calculatedOneListOfOneDoubles + ','
                + persistedOneListOfOneDoubles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Double> oneListOfOneDoubles;

    @JsonProperty("oneListOfOneDoubles")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<Double> getOneListOfOneDoubles() {
        return oneListOfOneDoubles;
    }

    public OneListOfOneDoubles_5 setOneListOfOneDoubles(
            final java.util.List<Double> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneDoubles\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneListOfOneDoubles = value;

        return this;
    }

    private final java.util.List<Double> calculatedOneListOfOneDoubles;

    public java.util.List<Double> getCalculatedOneListOfOneDoubles() {
        return this.calculatedOneListOfOneDoubles;
    }

    private final java.util.List<Double> persistedOneListOfOneDoubles;

    public java.util.List<Double> getPersistedOneListOfOneDoubles() {
        return this.persistedOneListOfOneDoubles;
    }
}
