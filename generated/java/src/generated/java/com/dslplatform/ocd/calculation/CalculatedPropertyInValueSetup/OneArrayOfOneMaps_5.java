package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneMaps_5 implements java.io.Serializable {
    public OneArrayOfOneMaps_5(
            final java.util.Map<String, String>[] oneArrayOfOneMaps,
            final java.util.Map<String, String>[] calculatedOneArrayOfOneMaps,
            final java.util.Map<String, String>[] persistedOneArrayOfOneMaps) {
        setOneArrayOfOneMaps(oneArrayOfOneMaps);
        this.calculatedOneArrayOfOneMaps = calculatedOneArrayOfOneMaps;
        this.persistedOneArrayOfOneMaps = persistedOneArrayOfOneMaps;
    }

    public OneArrayOfOneMaps_5() {
        this.oneArrayOfOneMaps = (java.util.Map<String, String>[]) java.lang.reflect.Array
                .newInstance(
                        (new java.util.HashMap<String, String>()).getClass(), 0);
        this.calculatedOneArrayOfOneMaps = (java.util.Map<String, String>[]) java.lang.reflect.Array
                .newInstance(
                        (new java.util.HashMap<String, String>()).getClass(), 0);
        this.persistedOneArrayOfOneMaps = (java.util.Map<String, String>[]) java.lang.reflect.Array
                .newInstance(
                        (new java.util.HashMap<String, String>()).getClass(), 0);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 188100085;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneMaps_5)) return false;
        final OneArrayOfOneMaps_5 other = (OneArrayOfOneMaps_5) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfOneMaps,
                other.oneArrayOfOneMaps))) return false;
        if (!(java.util.Arrays.equals(this.calculatedOneArrayOfOneMaps,
                other.calculatedOneArrayOfOneMaps))) return false;
        if (!(java.util.Arrays.equals(this.persistedOneArrayOfOneMaps,
                other.persistedOneArrayOfOneMaps))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneMaps_5(" + oneArrayOfOneMaps + ','
                + calculatedOneArrayOfOneMaps + ','
                + persistedOneArrayOfOneMaps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Map<String, String>[] oneArrayOfOneMaps;

    @JsonProperty("oneArrayOfOneMaps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Map<String, String>[] getOneArrayOfOneMaps() {
        return oneArrayOfOneMaps;
    }

    public OneArrayOfOneMaps_5 setOneArrayOfOneMaps(
            final java.util.Map<String, String>[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneMaps\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneArrayOfOneMaps = value;

        return this;
    }

    private final java.util.Map<String, String>[] calculatedOneArrayOfOneMaps;

    public java.util.Map<String, String>[] getCalculatedOneArrayOfOneMaps() {
        return this.calculatedOneArrayOfOneMaps;
    }

    private final java.util.Map<String, String>[] persistedOneArrayOfOneMaps;

    public java.util.Map<String, String>[] getPersistedOneArrayOfOneMaps() {
        return this.persistedOneArrayOfOneMaps;
    }
}
