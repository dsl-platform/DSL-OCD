package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneMaps_5 implements java.io.Serializable {
    public OneSetOfOneMaps_5(
            final java.util.Set<java.util.Map<String, String>> oneSetOfOneMaps,
            final java.util.Set<java.util.Map<String, String>> calculatedOneSetOfOneMaps,
            final java.util.Set<java.util.Map<String, String>> persistedOneSetOfOneMaps) {
        setOneSetOfOneMaps(oneSetOfOneMaps);
        this.calculatedOneSetOfOneMaps = calculatedOneSetOfOneMaps;
        this.persistedOneSetOfOneMaps = persistedOneSetOfOneMaps;
    }

    public OneSetOfOneMaps_5() {
        this.oneSetOfOneMaps = new java.util.HashSet<java.util.Map<String, String>>();
        this.calculatedOneSetOfOneMaps = new java.util.HashSet<java.util.Map<String, String>>();
        this.persistedOneSetOfOneMaps = new java.util.HashSet<java.util.Map<String, String>>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 794839194;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneMaps_5)) return false;
        final OneSetOfOneMaps_5 other = (OneSetOfOneMaps_5) obj;

        if (!(this.oneSetOfOneMaps.equals(other.oneSetOfOneMaps)))
            return false;
        if (!(this.calculatedOneSetOfOneMaps
                .equals(other.calculatedOneSetOfOneMaps))) return false;
        if (!(this.persistedOneSetOfOneMaps
                .equals(other.persistedOneSetOfOneMaps))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneMaps_5(" + oneSetOfOneMaps + ','
                + calculatedOneSetOfOneMaps + ',' + persistedOneSetOfOneMaps
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.util.Map<String, String>> oneSetOfOneMaps;

    @JsonProperty("oneSetOfOneMaps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.util.Map<String, String>> getOneSetOfOneMaps() {
        return oneSetOfOneMaps;
    }

    public OneSetOfOneMaps_5 setOneSetOfOneMaps(
            final java.util.Set<java.util.Map<String, String>> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneMaps\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneSetOfOneMaps = value;

        return this;
    }

    private final java.util.Set<java.util.Map<String, String>> calculatedOneSetOfOneMaps;

    public java.util.Set<java.util.Map<String, String>> getCalculatedOneSetOfOneMaps() {
        return this.calculatedOneSetOfOneMaps;
    }

    private final java.util.Set<java.util.Map<String, String>> persistedOneSetOfOneMaps;

    public java.util.Set<java.util.Map<String, String>> getPersistedOneSetOfOneMaps() {
        return this.persistedOneSetOfOneMaps;
    }
}
