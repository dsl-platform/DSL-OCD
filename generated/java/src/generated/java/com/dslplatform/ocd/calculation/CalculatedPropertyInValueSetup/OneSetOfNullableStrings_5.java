package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableStrings_5 implements java.io.Serializable {
    public OneSetOfNullableStrings_5(
            final java.util.Set<String> oneSetOfNullableStrings,
            final java.util.Set<String> calculatedOneSetOfNullableStrings,
            final java.util.Set<String> persistedOneSetOfNullableStrings) {
        setOneSetOfNullableStrings(oneSetOfNullableStrings);
        this.calculatedOneSetOfNullableStrings = calculatedOneSetOfNullableStrings;
        this.persistedOneSetOfNullableStrings = persistedOneSetOfNullableStrings;
    }

    public OneSetOfNullableStrings_5() {
        this.oneSetOfNullableStrings = new java.util.HashSet<String>();
        this.calculatedOneSetOfNullableStrings = new java.util.HashSet<String>();
        this.persistedOneSetOfNullableStrings = new java.util.HashSet<String>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1212706008;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableStrings_5)) return false;
        final OneSetOfNullableStrings_5 other = (OneSetOfNullableStrings_5) obj;

        if (!(this.oneSetOfNullableStrings
                .equals(other.oneSetOfNullableStrings))) return false;
        if (!(this.calculatedOneSetOfNullableStrings
                .equals(other.calculatedOneSetOfNullableStrings)))
            return false;
        if (!(this.persistedOneSetOfNullableStrings
                .equals(other.persistedOneSetOfNullableStrings))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableStrings_5(" + oneSetOfNullableStrings + ','
                + calculatedOneSetOfNullableStrings + ','
                + persistedOneSetOfNullableStrings + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<String> oneSetOfNullableStrings;

    @JsonProperty("oneSetOfNullableStrings")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<String> getOneSetOfNullableStrings() {
        return oneSetOfNullableStrings;
    }

    public OneSetOfNullableStrings_5 setOneSetOfNullableStrings(
            final java.util.Set<String> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableStrings\" cannot be null!");
        this.oneSetOfNullableStrings = value;

        return this;
    }

    private final java.util.Set<String> calculatedOneSetOfNullableStrings;

    public java.util.Set<String> getCalculatedOneSetOfNullableStrings() {
        return this.calculatedOneSetOfNullableStrings;
    }

    private final java.util.Set<String> persistedOneSetOfNullableStrings;

    public java.util.Set<String> getPersistedOneSetOfNullableStrings() {
        return this.persistedOneSetOfNullableStrings;
    }
}
