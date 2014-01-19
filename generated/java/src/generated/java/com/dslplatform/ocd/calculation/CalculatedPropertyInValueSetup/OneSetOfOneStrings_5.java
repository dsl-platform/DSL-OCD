package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneStrings_5 implements java.io.Serializable {
    public OneSetOfOneStrings_5(
            final java.util.Set<String> oneSetOfOneStrings,
            final java.util.Set<String> calculatedOneSetOfOneStrings,
            final java.util.Set<String> persistedOneSetOfOneStrings) {
        setOneSetOfOneStrings(oneSetOfOneStrings);
        this.calculatedOneSetOfOneStrings = calculatedOneSetOfOneStrings;
        this.persistedOneSetOfOneStrings = persistedOneSetOfOneStrings;
    }

    public OneSetOfOneStrings_5() {
        this.oneSetOfOneStrings = new java.util.HashSet<String>();
        this.calculatedOneSetOfOneStrings = new java.util.HashSet<String>();
        this.persistedOneSetOfOneStrings = new java.util.HashSet<String>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 505048075;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneStrings_5)) return false;
        final OneSetOfOneStrings_5 other = (OneSetOfOneStrings_5) obj;

        if (!(this.oneSetOfOneStrings.equals(other.oneSetOfOneStrings)))
            return false;
        if (!(this.calculatedOneSetOfOneStrings
                .equals(other.calculatedOneSetOfOneStrings))) return false;
        if (!(this.persistedOneSetOfOneStrings
                .equals(other.persistedOneSetOfOneStrings))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneStrings_5(" + oneSetOfOneStrings + ','
                + calculatedOneSetOfOneStrings + ','
                + persistedOneSetOfOneStrings + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<String> oneSetOfOneStrings;

    @JsonProperty("oneSetOfOneStrings")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<String> getOneSetOfOneStrings() {
        return oneSetOfOneStrings;
    }

    public OneSetOfOneStrings_5 setOneSetOfOneStrings(
            final java.util.Set<String> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneStrings\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneSetOfOneStrings = value;

        return this;
    }

    private final java.util.Set<String> calculatedOneSetOfOneStrings;

    public java.util.Set<String> getCalculatedOneSetOfOneStrings() {
        return this.calculatedOneSetOfOneStrings;
    }

    private final java.util.Set<String> persistedOneSetOfOneStrings;

    public java.util.Set<String> getPersistedOneSetOfOneStrings() {
        return this.persistedOneSetOfOneStrings;
    }
}
