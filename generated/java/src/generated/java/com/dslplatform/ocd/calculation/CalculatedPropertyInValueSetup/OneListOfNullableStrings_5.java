package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableStrings_5 implements java.io.Serializable {
    public OneListOfNullableStrings_5(
            final java.util.List<String> oneListOfNullableStrings,
            final java.util.List<String> calculatedOneListOfNullableStrings,
            final java.util.List<String> persistedOneListOfNullableStrings) {
        setOneListOfNullableStrings(oneListOfNullableStrings);
        this.calculatedOneListOfNullableStrings = calculatedOneListOfNullableStrings;
        this.persistedOneListOfNullableStrings = persistedOneListOfNullableStrings;
    }

    public OneListOfNullableStrings_5() {
        this.oneListOfNullableStrings = new java.util.ArrayList<String>();
        this.calculatedOneListOfNullableStrings = new java.util.ArrayList<String>();
        this.persistedOneListOfNullableStrings = new java.util.ArrayList<String>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 695806112;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableStrings_5)) return false;
        final OneListOfNullableStrings_5 other = (OneListOfNullableStrings_5) obj;

        if (!(this.oneListOfNullableStrings
                .equals(other.oneListOfNullableStrings))) return false;
        if (!(this.calculatedOneListOfNullableStrings
                .equals(other.calculatedOneListOfNullableStrings)))
            return false;
        if (!(this.persistedOneListOfNullableStrings
                .equals(other.persistedOneListOfNullableStrings)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableStrings_5(" + oneListOfNullableStrings + ','
                + calculatedOneListOfNullableStrings + ','
                + persistedOneListOfNullableStrings + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<String> oneListOfNullableStrings;

    @JsonProperty("oneListOfNullableStrings")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<String> getOneListOfNullableStrings() {
        return oneListOfNullableStrings;
    }

    public OneListOfNullableStrings_5 setOneListOfNullableStrings(
            final java.util.List<String> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableStrings\" cannot be null!");
        this.oneListOfNullableStrings = value;

        return this;
    }

    private final java.util.List<String> calculatedOneListOfNullableStrings;

    public java.util.List<String> getCalculatedOneListOfNullableStrings() {
        return this.calculatedOneListOfNullableStrings;
    }

    private final java.util.List<String> persistedOneListOfNullableStrings;

    public java.util.List<String> getPersistedOneListOfNullableStrings() {
        return this.persistedOneListOfNullableStrings;
    }
}
