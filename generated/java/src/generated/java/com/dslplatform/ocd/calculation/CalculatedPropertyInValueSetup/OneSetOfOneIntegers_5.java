package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneIntegers_5 implements java.io.Serializable {
    public OneSetOfOneIntegers_5(
            final java.util.Set<Integer> oneSetOfOneIntegers,
            final java.util.Set<Integer> calculatedOneSetOfOneIntegers,
            final java.util.Set<Integer> persistedOneSetOfOneIntegers) {
        setOneSetOfOneIntegers(oneSetOfOneIntegers);
        this.calculatedOneSetOfOneIntegers = calculatedOneSetOfOneIntegers;
        this.persistedOneSetOfOneIntegers = persistedOneSetOfOneIntegers;
    }

    public OneSetOfOneIntegers_5() {
        this.oneSetOfOneIntegers = new java.util.HashSet<Integer>();
        this.calculatedOneSetOfOneIntegers = new java.util.HashSet<Integer>();
        this.persistedOneSetOfOneIntegers = new java.util.HashSet<Integer>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1815526822;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneIntegers_5)) return false;
        final OneSetOfOneIntegers_5 other = (OneSetOfOneIntegers_5) obj;

        if (!(this.oneSetOfOneIntegers.equals(other.oneSetOfOneIntegers)))
            return false;
        if (!(this.calculatedOneSetOfOneIntegers
                .equals(other.calculatedOneSetOfOneIntegers))) return false;
        if (!(this.persistedOneSetOfOneIntegers
                .equals(other.persistedOneSetOfOneIntegers))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneIntegers_5(" + oneSetOfOneIntegers + ','
                + calculatedOneSetOfOneIntegers + ','
                + persistedOneSetOfOneIntegers + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Integer> oneSetOfOneIntegers;

    @JsonProperty("oneSetOfOneIntegers")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<Integer> getOneSetOfOneIntegers() {
        return oneSetOfOneIntegers;
    }

    public OneSetOfOneIntegers_5 setOneSetOfOneIntegers(
            final java.util.Set<Integer> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneIntegers\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneSetOfOneIntegers = value;

        return this;
    }

    private final java.util.Set<Integer> calculatedOneSetOfOneIntegers;

    public java.util.Set<Integer> getCalculatedOneSetOfOneIntegers() {
        return this.calculatedOneSetOfOneIntegers;
    }

    private final java.util.Set<Integer> persistedOneSetOfOneIntegers;

    public java.util.Set<Integer> getPersistedOneSetOfOneIntegers() {
        return this.persistedOneSetOfOneIntegers;
    }
}
