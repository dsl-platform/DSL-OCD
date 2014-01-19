package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneStrings_5 implements java.io.Serializable {
    public OneListOfOneStrings_5(
            final java.util.List<String> oneListOfOneStrings,
            final java.util.List<String> calculatedOneListOfOneStrings,
            final java.util.List<String> persistedOneListOfOneStrings) {
        setOneListOfOneStrings(oneListOfOneStrings);
        this.calculatedOneListOfOneStrings = calculatedOneListOfOneStrings;
        this.persistedOneListOfOneStrings = persistedOneListOfOneStrings;
    }

    public OneListOfOneStrings_5() {
        this.oneListOfOneStrings = new java.util.ArrayList<String>();
        this.calculatedOneListOfOneStrings = new java.util.ArrayList<String>();
        this.persistedOneListOfOneStrings = new java.util.ArrayList<String>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1131649129;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneStrings_5)) return false;
        final OneListOfOneStrings_5 other = (OneListOfOneStrings_5) obj;

        if (!(this.oneListOfOneStrings.equals(other.oneListOfOneStrings)))
            return false;
        if (!(this.calculatedOneListOfOneStrings
                .equals(other.calculatedOneListOfOneStrings))) return false;
        if (!(this.persistedOneListOfOneStrings
                .equals(other.persistedOneListOfOneStrings))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneStrings_5(" + oneListOfOneStrings + ','
                + calculatedOneListOfOneStrings + ','
                + persistedOneListOfOneStrings + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<String> oneListOfOneStrings;

    @JsonProperty("oneListOfOneStrings")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<String> getOneListOfOneStrings() {
        return oneListOfOneStrings;
    }

    public OneListOfOneStrings_5 setOneListOfOneStrings(
            final java.util.List<String> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneStrings\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneListOfOneStrings = value;

        return this;
    }

    private final java.util.List<String> calculatedOneListOfOneStrings;

    public java.util.List<String> getCalculatedOneListOfOneStrings() {
        return this.calculatedOneListOfOneStrings;
    }

    private final java.util.List<String> persistedOneListOfOneStrings;

    public java.util.List<String> getPersistedOneListOfOneStrings() {
        return this.persistedOneListOfOneStrings;
    }
}
