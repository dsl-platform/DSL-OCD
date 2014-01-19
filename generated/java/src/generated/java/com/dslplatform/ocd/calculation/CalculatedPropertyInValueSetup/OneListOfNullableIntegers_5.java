package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableIntegers_5 implements java.io.Serializable {
    public OneListOfNullableIntegers_5(
            final java.util.List<Integer> oneListOfNullableIntegers,
            final java.util.List<Integer> calculatedOneListOfNullableIntegers,
            final java.util.List<Integer> persistedOneListOfNullableIntegers) {
        setOneListOfNullableIntegers(oneListOfNullableIntegers);
        this.calculatedOneListOfNullableIntegers = calculatedOneListOfNullableIntegers;
        this.persistedOneListOfNullableIntegers = persistedOneListOfNullableIntegers;
    }

    public OneListOfNullableIntegers_5() {
        this.oneListOfNullableIntegers = new java.util.ArrayList<Integer>();
        this.calculatedOneListOfNullableIntegers = new java.util.ArrayList<Integer>();
        this.persistedOneListOfNullableIntegers = new java.util.ArrayList<Integer>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 19944433;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableIntegers_5)) return false;
        final OneListOfNullableIntegers_5 other = (OneListOfNullableIntegers_5) obj;

        if (!(this.oneListOfNullableIntegers
                .equals(other.oneListOfNullableIntegers))) return false;
        if (!(this.calculatedOneListOfNullableIntegers
                .equals(other.calculatedOneListOfNullableIntegers)))
            return false;
        if (!(this.persistedOneListOfNullableIntegers
                .equals(other.persistedOneListOfNullableIntegers)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableIntegers_5(" + oneListOfNullableIntegers + ','
                + calculatedOneListOfNullableIntegers + ','
                + persistedOneListOfNullableIntegers + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Integer> oneListOfNullableIntegers;

    @JsonProperty("oneListOfNullableIntegers")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<Integer> getOneListOfNullableIntegers() {
        return oneListOfNullableIntegers;
    }

    public OneListOfNullableIntegers_5 setOneListOfNullableIntegers(
            final java.util.List<Integer> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableIntegers\" cannot be null!");
        this.oneListOfNullableIntegers = value;

        return this;
    }

    private final java.util.List<Integer> calculatedOneListOfNullableIntegers;

    public java.util.List<Integer> getCalculatedOneListOfNullableIntegers() {
        return this.calculatedOneListOfNullableIntegers;
    }

    private final java.util.List<Integer> persistedOneListOfNullableIntegers;

    public java.util.List<Integer> getPersistedOneListOfNullableIntegers() {
        return this.persistedOneListOfNullableIntegers;
    }
}
