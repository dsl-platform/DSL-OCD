package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneIntegers_5 implements java.io.Serializable {
    public OneListOfOneIntegers_5(
            final java.util.List<Integer> oneListOfOneIntegers,
            final java.util.List<Integer> calculatedOneListOfOneIntegers,
            final java.util.List<Integer> persistedOneListOfOneIntegers) {
        setOneListOfOneIntegers(oneListOfOneIntegers);
        this.calculatedOneListOfOneIntegers = calculatedOneListOfOneIntegers;
        this.persistedOneListOfOneIntegers = persistedOneListOfOneIntegers;
    }

    public OneListOfOneIntegers_5() {
        this.oneListOfOneIntegers = new java.util.ArrayList<Integer>();
        this.calculatedOneListOfOneIntegers = new java.util.ArrayList<Integer>();
        this.persistedOneListOfOneIntegers = new java.util.ArrayList<Integer>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1725136074;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneIntegers_5)) return false;
        final OneListOfOneIntegers_5 other = (OneListOfOneIntegers_5) obj;

        if (!(this.oneListOfOneIntegers.equals(other.oneListOfOneIntegers)))
            return false;
        if (!(this.calculatedOneListOfOneIntegers
                .equals(other.calculatedOneListOfOneIntegers))) return false;
        if (!(this.persistedOneListOfOneIntegers
                .equals(other.persistedOneListOfOneIntegers))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneIntegers_5(" + oneListOfOneIntegers + ','
                + calculatedOneListOfOneIntegers + ','
                + persistedOneListOfOneIntegers + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Integer> oneListOfOneIntegers;

    @JsonProperty("oneListOfOneIntegers")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<Integer> getOneListOfOneIntegers() {
        return oneListOfOneIntegers;
    }

    public OneListOfOneIntegers_5 setOneListOfOneIntegers(
            final java.util.List<Integer> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneIntegers\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneListOfOneIntegers = value;

        return this;
    }

    private final java.util.List<Integer> calculatedOneListOfOneIntegers;

    public java.util.List<Integer> getCalculatedOneListOfOneIntegers() {
        return this.calculatedOneListOfOneIntegers;
    }

    private final java.util.List<Integer> persistedOneListOfOneIntegers;

    public java.util.List<Integer> getPersistedOneListOfOneIntegers() {
        return this.persistedOneListOfOneIntegers;
    }
}
