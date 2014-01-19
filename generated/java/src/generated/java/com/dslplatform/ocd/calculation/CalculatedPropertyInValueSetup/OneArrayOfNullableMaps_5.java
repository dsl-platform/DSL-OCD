package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableMaps_5 implements java.io.Serializable {
    public OneArrayOfNullableMaps_5(
            final java.util.Map<String, String>[] oneArrayOfNullableMaps,
            final java.util.Map<String, String>[] calculatedOneArrayOfNullableMaps,
            final java.util.Map<String, String>[] persistedOneArrayOfNullableMaps) {
        setOneArrayOfNullableMaps(oneArrayOfNullableMaps);
        this.calculatedOneArrayOfNullableMaps = calculatedOneArrayOfNullableMaps;
        this.persistedOneArrayOfNullableMaps = persistedOneArrayOfNullableMaps;
    }

    public OneArrayOfNullableMaps_5() {
        this.oneArrayOfNullableMaps = (java.util.Map<String, String>[]) java.lang.reflect.Array
                .newInstance(
                        (new java.util.HashMap<String, String>()).getClass(), 0);
        this.calculatedOneArrayOfNullableMaps = (java.util.Map<String, String>[]) java.lang.reflect.Array
                .newInstance(
                        (new java.util.HashMap<String, String>()).getClass(), 0);
        this.persistedOneArrayOfNullableMaps = (java.util.Map<String, String>[]) java.lang.reflect.Array
                .newInstance(
                        (new java.util.HashMap<String, String>()).getClass(), 0);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 270280332;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableMaps_5)) return false;
        final OneArrayOfNullableMaps_5 other = (OneArrayOfNullableMaps_5) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfNullableMaps,
                other.oneArrayOfNullableMaps))) return false;
        if (!(java.util.Arrays.equals(this.calculatedOneArrayOfNullableMaps,
                other.calculatedOneArrayOfNullableMaps))) return false;
        if (!(java.util.Arrays.equals(this.persistedOneArrayOfNullableMaps,
                other.persistedOneArrayOfNullableMaps))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableMaps_5(" + oneArrayOfNullableMaps + ','
                + calculatedOneArrayOfNullableMaps + ','
                + persistedOneArrayOfNullableMaps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Map<String, String>[] oneArrayOfNullableMaps;

    @JsonProperty("oneArrayOfNullableMaps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Map<String, String>[] getOneArrayOfNullableMaps() {
        return oneArrayOfNullableMaps;
    }

    public OneArrayOfNullableMaps_5 setOneArrayOfNullableMaps(
            final java.util.Map<String, String>[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableMaps\" cannot be null!");
        this.oneArrayOfNullableMaps = value;

        return this;
    }

    private final java.util.Map<String, String>[] calculatedOneArrayOfNullableMaps;

    public java.util.Map<String, String>[] getCalculatedOneArrayOfNullableMaps() {
        return this.calculatedOneArrayOfNullableMaps;
    }

    private final java.util.Map<String, String>[] persistedOneArrayOfNullableMaps;

    public java.util.Map<String, String>[] getPersistedOneArrayOfNullableMaps() {
        return this.persistedOneArrayOfNullableMaps;
    }
}
