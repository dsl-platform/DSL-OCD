package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableMaps_5 implements java.io.Serializable {
    public OneListOfNullableMaps_5(
            final java.util.List<java.util.Map<String, String>> oneListOfNullableMaps,
            final java.util.List<java.util.Map<String, String>> calculatedOneListOfNullableMaps,
            final java.util.List<java.util.Map<String, String>> persistedOneListOfNullableMaps) {
        setOneListOfNullableMaps(oneListOfNullableMaps);
        this.calculatedOneListOfNullableMaps = calculatedOneListOfNullableMaps;
        this.persistedOneListOfNullableMaps = persistedOneListOfNullableMaps;
    }

    public OneListOfNullableMaps_5() {
        this.oneListOfNullableMaps = new java.util.ArrayList<java.util.Map<String, String>>();
        this.calculatedOneListOfNullableMaps = new java.util.ArrayList<java.util.Map<String, String>>();
        this.persistedOneListOfNullableMaps = new java.util.ArrayList<java.util.Map<String, String>>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1944607899;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableMaps_5)) return false;
        final OneListOfNullableMaps_5 other = (OneListOfNullableMaps_5) obj;

        if (!(this.oneListOfNullableMaps.equals(other.oneListOfNullableMaps)))
            return false;
        if (!(this.calculatedOneListOfNullableMaps
                .equals(other.calculatedOneListOfNullableMaps))) return false;
        if (!(this.persistedOneListOfNullableMaps
                .equals(other.persistedOneListOfNullableMaps))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableMaps_5(" + oneListOfNullableMaps + ','
                + calculatedOneListOfNullableMaps + ','
                + persistedOneListOfNullableMaps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.util.Map<String, String>> oneListOfNullableMaps;

    @JsonProperty("oneListOfNullableMaps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.util.Map<String, String>> getOneListOfNullableMaps() {
        return oneListOfNullableMaps;
    }

    public OneListOfNullableMaps_5 setOneListOfNullableMaps(
            final java.util.List<java.util.Map<String, String>> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableMaps\" cannot be null!");
        this.oneListOfNullableMaps = value;

        return this;
    }

    private final java.util.List<java.util.Map<String, String>> calculatedOneListOfNullableMaps;

    public java.util.List<java.util.Map<String, String>> getCalculatedOneListOfNullableMaps() {
        return this.calculatedOneListOfNullableMaps;
    }

    private final java.util.List<java.util.Map<String, String>> persistedOneListOfNullableMaps;

    public java.util.List<java.util.Map<String, String>> getPersistedOneListOfNullableMaps() {
        return this.persistedOneListOfNullableMaps;
    }
}
