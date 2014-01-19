package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableGuids_5 implements java.io.Serializable {
    public OneArrayOfNullableGuids_5(
            final java.util.UUID[] oneArrayOfNullableGuids,
            final java.util.UUID[] calculatedOneArrayOfNullableGuids,
            final java.util.UUID[] persistedOneArrayOfNullableGuids) {
        setOneArrayOfNullableGuids(oneArrayOfNullableGuids);
        this.calculatedOneArrayOfNullableGuids = calculatedOneArrayOfNullableGuids;
        this.persistedOneArrayOfNullableGuids = persistedOneArrayOfNullableGuids;
    }

    public OneArrayOfNullableGuids_5() {
        this.oneArrayOfNullableGuids = new java.util.UUID[] {};
        this.calculatedOneArrayOfNullableGuids = new java.util.UUID[] {};
        this.persistedOneArrayOfNullableGuids = new java.util.UUID[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 131792601;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableGuids_5)) return false;
        final OneArrayOfNullableGuids_5 other = (OneArrayOfNullableGuids_5) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfNullableGuids,
                other.oneArrayOfNullableGuids))) return false;
        if (!(java.util.Arrays.equals(this.calculatedOneArrayOfNullableGuids,
                other.calculatedOneArrayOfNullableGuids))) return false;
        if (!(java.util.Arrays.equals(this.persistedOneArrayOfNullableGuids,
                other.persistedOneArrayOfNullableGuids))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableGuids_5(" + oneArrayOfNullableGuids + ','
                + calculatedOneArrayOfNullableGuids + ','
                + persistedOneArrayOfNullableGuids + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.UUID[] oneArrayOfNullableGuids;

    @JsonProperty("oneArrayOfNullableGuids")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.UUID[] getOneArrayOfNullableGuids() {
        return oneArrayOfNullableGuids;
    }

    public OneArrayOfNullableGuids_5 setOneArrayOfNullableGuids(
            final java.util.UUID[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableGuids\" cannot be null!");
        this.oneArrayOfNullableGuids = value;

        return this;
    }

    private final java.util.UUID[] calculatedOneArrayOfNullableGuids;

    public java.util.UUID[] getCalculatedOneArrayOfNullableGuids() {
        return this.calculatedOneArrayOfNullableGuids;
    }

    private final java.util.UUID[] persistedOneArrayOfNullableGuids;

    public java.util.UUID[] getPersistedOneArrayOfNullableGuids() {
        return this.persistedOneArrayOfNullableGuids;
    }
}
