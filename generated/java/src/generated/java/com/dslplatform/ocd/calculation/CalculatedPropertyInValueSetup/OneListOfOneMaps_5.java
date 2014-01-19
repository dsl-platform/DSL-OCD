package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneMaps_5 implements java.io.Serializable {
    public OneListOfOneMaps_5(
            final java.util.List<java.util.Map<String, String>> oneListOfOneMaps,
            final java.util.List<java.util.Map<String, String>> calculatedOneListOfOneMaps,
            final java.util.List<java.util.Map<String, String>> persistedOneListOfOneMaps) {
        setOneListOfOneMaps(oneListOfOneMaps);
        this.calculatedOneListOfOneMaps = calculatedOneListOfOneMaps;
        this.persistedOneListOfOneMaps = persistedOneListOfOneMaps;
    }

    public OneListOfOneMaps_5() {
        this.oneListOfOneMaps = new java.util.ArrayList<java.util.Map<String, String>>();
        this.calculatedOneListOfOneMaps = new java.util.ArrayList<java.util.Map<String, String>>();
        this.persistedOneListOfOneMaps = new java.util.ArrayList<java.util.Map<String, String>>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1702825210;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneMaps_5)) return false;
        final OneListOfOneMaps_5 other = (OneListOfOneMaps_5) obj;

        if (!(this.oneListOfOneMaps.equals(other.oneListOfOneMaps)))
            return false;
        if (!(this.calculatedOneListOfOneMaps
                .equals(other.calculatedOneListOfOneMaps))) return false;
        if (!(this.persistedOneListOfOneMaps
                .equals(other.persistedOneListOfOneMaps))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneMaps_5(" + oneListOfOneMaps + ','
                + calculatedOneListOfOneMaps + ',' + persistedOneListOfOneMaps
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.util.Map<String, String>> oneListOfOneMaps;

    @JsonProperty("oneListOfOneMaps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.util.Map<String, String>> getOneListOfOneMaps() {
        return oneListOfOneMaps;
    }

    public OneListOfOneMaps_5 setOneListOfOneMaps(
            final java.util.List<java.util.Map<String, String>> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneMaps\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneListOfOneMaps = value;

        return this;
    }

    private final java.util.List<java.util.Map<String, String>> calculatedOneListOfOneMaps;

    public java.util.List<java.util.Map<String, String>> getCalculatedOneListOfOneMaps() {
        return this.calculatedOneListOfOneMaps;
    }

    private final java.util.List<java.util.Map<String, String>> persistedOneListOfOneMaps;

    public java.util.List<java.util.Map<String, String>> getPersistedOneListOfOneMaps() {
        return this.persistedOneListOfOneMaps;
    }
}
