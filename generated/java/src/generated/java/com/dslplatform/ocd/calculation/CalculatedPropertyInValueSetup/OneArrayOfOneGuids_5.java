package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneGuids_5 implements java.io.Serializable {
    public OneArrayOfOneGuids_5(
            final java.util.UUID[] oneArrayOfOneGuids,
            final java.util.UUID[] calculatedOneArrayOfOneGuids,
            final java.util.UUID[] persistedOneArrayOfOneGuids) {
        setOneArrayOfOneGuids(oneArrayOfOneGuids);
        this.calculatedOneArrayOfOneGuids = calculatedOneArrayOfOneGuids;
        this.persistedOneArrayOfOneGuids = persistedOneArrayOfOneGuids;
    }

    public OneArrayOfOneGuids_5() {
        this.oneArrayOfOneGuids = new java.util.UUID[] {};
        this.calculatedOneArrayOfOneGuids = new java.util.UUID[] {};
        this.persistedOneArrayOfOneGuids = new java.util.UUID[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 539331804;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneGuids_5)) return false;
        final OneArrayOfOneGuids_5 other = (OneArrayOfOneGuids_5) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfOneGuids,
                other.oneArrayOfOneGuids))) return false;
        if (!(java.util.Arrays.equals(this.calculatedOneArrayOfOneGuids,
                other.calculatedOneArrayOfOneGuids))) return false;
        if (!(java.util.Arrays.equals(this.persistedOneArrayOfOneGuids,
                other.persistedOneArrayOfOneGuids))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneGuids_5(" + oneArrayOfOneGuids + ','
                + calculatedOneArrayOfOneGuids + ','
                + persistedOneArrayOfOneGuids + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.UUID[] oneArrayOfOneGuids;

    @JsonProperty("oneArrayOfOneGuids")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.UUID[] getOneArrayOfOneGuids() {
        return oneArrayOfOneGuids;
    }

    public OneArrayOfOneGuids_5 setOneArrayOfOneGuids(
            final java.util.UUID[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneGuids\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneArrayOfOneGuids = value;

        return this;
    }

    private final java.util.UUID[] calculatedOneArrayOfOneGuids;

    public java.util.UUID[] getCalculatedOneArrayOfOneGuids() {
        return this.calculatedOneArrayOfOneGuids;
    }

    private final java.util.UUID[] persistedOneArrayOfOneGuids;

    public java.util.UUID[] getPersistedOneArrayOfOneGuids() {
        return this.persistedOneArrayOfOneGuids;
    }
}
