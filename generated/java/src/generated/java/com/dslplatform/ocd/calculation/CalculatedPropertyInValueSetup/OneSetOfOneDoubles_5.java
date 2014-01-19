package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneDoubles_5 implements java.io.Serializable {
    public OneSetOfOneDoubles_5(
            final java.util.Set<Double> oneSetOfOneDoubles,
            final java.util.Set<Double> calculatedOneSetOfOneDoubles,
            final java.util.Set<Double> persistedOneSetOfOneDoubles) {
        setOneSetOfOneDoubles(oneSetOfOneDoubles);
        this.calculatedOneSetOfOneDoubles = calculatedOneSetOfOneDoubles;
        this.persistedOneSetOfOneDoubles = persistedOneSetOfOneDoubles;
    }

    public OneSetOfOneDoubles_5() {
        this.oneSetOfOneDoubles = new java.util.HashSet<Double>();
        this.calculatedOneSetOfOneDoubles = new java.util.HashSet<Double>();
        this.persistedOneSetOfOneDoubles = new java.util.HashSet<Double>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1540008909;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneDoubles_5)) return false;
        final OneSetOfOneDoubles_5 other = (OneSetOfOneDoubles_5) obj;

        if (!(this.oneSetOfOneDoubles.equals(other.oneSetOfOneDoubles)))
            return false;
        if (!(this.calculatedOneSetOfOneDoubles
                .equals(other.calculatedOneSetOfOneDoubles))) return false;
        if (!(this.persistedOneSetOfOneDoubles
                .equals(other.persistedOneSetOfOneDoubles))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneDoubles_5(" + oneSetOfOneDoubles + ','
                + calculatedOneSetOfOneDoubles + ','
                + persistedOneSetOfOneDoubles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Double> oneSetOfOneDoubles;

    @JsonProperty("oneSetOfOneDoubles")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<Double> getOneSetOfOneDoubles() {
        return oneSetOfOneDoubles;
    }

    public OneSetOfOneDoubles_5 setOneSetOfOneDoubles(
            final java.util.Set<Double> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneDoubles\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneSetOfOneDoubles = value;

        return this;
    }

    private final java.util.Set<Double> calculatedOneSetOfOneDoubles;

    public java.util.Set<Double> getCalculatedOneSetOfOneDoubles() {
        return this.calculatedOneSetOfOneDoubles;
    }

    private final java.util.Set<Double> persistedOneSetOfOneDoubles;

    public java.util.Set<Double> getPersistedOneSetOfOneDoubles() {
        return this.persistedOneSetOfOneDoubles;
    }
}
