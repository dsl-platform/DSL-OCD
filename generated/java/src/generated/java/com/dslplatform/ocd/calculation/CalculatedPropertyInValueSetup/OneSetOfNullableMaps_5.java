package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableMaps_5 implements java.io.Serializable {
    public OneSetOfNullableMaps_5(
            final java.util.Set<java.util.Map<String, String>> oneSetOfNullableMaps,
            final java.util.Set<java.util.Map<String, String>> calculatedOneSetOfNullableMaps,
            final java.util.Set<java.util.Map<String, String>> persistedOneSetOfNullableMaps) {
        setOneSetOfNullableMaps(oneSetOfNullableMaps);
        this.calculatedOneSetOfNullableMaps = calculatedOneSetOfNullableMaps;
        this.persistedOneSetOfNullableMaps = persistedOneSetOfNullableMaps;
    }

    public OneSetOfNullableMaps_5() {
        this.oneSetOfNullableMaps = new java.util.HashSet<java.util.Map<String, String>>();
        this.calculatedOneSetOfNullableMaps = new java.util.HashSet<java.util.Map<String, String>>();
        this.persistedOneSetOfNullableMaps = new java.util.HashSet<java.util.Map<String, String>>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 113439065;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableMaps_5)) return false;
        final OneSetOfNullableMaps_5 other = (OneSetOfNullableMaps_5) obj;

        if (!(this.oneSetOfNullableMaps.equals(other.oneSetOfNullableMaps)))
            return false;
        if (!(this.calculatedOneSetOfNullableMaps
                .equals(other.calculatedOneSetOfNullableMaps))) return false;
        if (!(this.persistedOneSetOfNullableMaps
                .equals(other.persistedOneSetOfNullableMaps))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableMaps_5(" + oneSetOfNullableMaps + ','
                + calculatedOneSetOfNullableMaps + ','
                + persistedOneSetOfNullableMaps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.util.Map<String, String>> oneSetOfNullableMaps;

    @JsonProperty("oneSetOfNullableMaps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.util.Map<String, String>> getOneSetOfNullableMaps() {
        return oneSetOfNullableMaps;
    }

    public OneSetOfNullableMaps_5 setOneSetOfNullableMaps(
            final java.util.Set<java.util.Map<String, String>> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableMaps\" cannot be null!");
        this.oneSetOfNullableMaps = value;

        return this;
    }

    private final java.util.Set<java.util.Map<String, String>> calculatedOneSetOfNullableMaps;

    public java.util.Set<java.util.Map<String, String>> getCalculatedOneSetOfNullableMaps() {
        return this.calculatedOneSetOfNullableMaps;
    }

    private final java.util.Set<java.util.Map<String, String>> persistedOneSetOfNullableMaps;

    public java.util.Set<java.util.Map<String, String>> getPersistedOneSetOfNullableMaps() {
        return this.persistedOneSetOfNullableMaps;
    }
}
