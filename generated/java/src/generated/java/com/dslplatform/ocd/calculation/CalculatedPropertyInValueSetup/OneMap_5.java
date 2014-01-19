package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneMap_5 implements java.io.Serializable {
    public OneMap_5(
            final java.util.Map<String, String> oneMap,
            final java.util.Map<String, String> calculatedOneMap,
            final java.util.Map<String, String> persistedOneMap) {
        setOneMap(oneMap);
        this.calculatedOneMap = calculatedOneMap;
        this.persistedOneMap = persistedOneMap;
    }

    public OneMap_5() {
        this.oneMap = new java.util.HashMap<String, String>();
        this.calculatedOneMap = new java.util.HashMap<String, String>();
        this.persistedOneMap = new java.util.HashMap<String, String>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 610318624;
        result = prime * result
                + (this.oneMap != null ? this.oneMap.hashCode() : 0);
        result = prime
                * result
                + (this.calculatedOneMap != null ? this.calculatedOneMap
                        .hashCode() : 0);
        result = prime
                * result
                + (this.persistedOneMap != null ? this.persistedOneMap
                        .hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneMap_5)) return false;
        final OneMap_5 other = (OneMap_5) obj;

        if (!(this.oneMap != null && this.oneMap.equals(other.oneMap) || this.oneMap == null
                && other.oneMap == null)) return false;
        if (!(this.calculatedOneMap != null
                && this.calculatedOneMap.equals(other.calculatedOneMap) || this.calculatedOneMap == null
                && other.calculatedOneMap == null)) return false;
        if (!(this.persistedOneMap != null
                && this.persistedOneMap.equals(other.persistedOneMap) || this.persistedOneMap == null
                && other.persistedOneMap == null)) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneMap_5(" + oneMap + ',' + calculatedOneMap + ','
                + persistedOneMap + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Map<String, String> oneMap;

    @JsonProperty("oneMap")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Map<String, String> getOneMap() {
        return oneMap;
    }

    public OneMap_5 setOneMap(final java.util.Map<String, String> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneMap\" cannot be null!");
        this.oneMap = value;

        return this;
    }

    private final java.util.Map<String, String> calculatedOneMap;

    public java.util.Map<String, String> getCalculatedOneMap() {
        return this.calculatedOneMap;
    }

    private final java.util.Map<String, String> persistedOneMap;

    public java.util.Map<String, String> getPersistedOneMap() {
        return this.persistedOneMap;
    }
}
