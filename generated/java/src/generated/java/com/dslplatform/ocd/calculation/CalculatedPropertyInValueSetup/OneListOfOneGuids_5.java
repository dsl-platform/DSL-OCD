package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneGuids_5 implements java.io.Serializable {
    public OneListOfOneGuids_5(
            final java.util.List<java.util.UUID> oneListOfOneGuids,
            final java.util.List<java.util.UUID> calculatedOneListOfOneGuids,
            final java.util.List<java.util.UUID> persistedOneListOfOneGuids) {
        setOneListOfOneGuids(oneListOfOneGuids);
        this.calculatedOneListOfOneGuids = calculatedOneListOfOneGuids;
        this.persistedOneListOfOneGuids = persistedOneListOfOneGuids;
    }

    public OneListOfOneGuids_5() {
        this.oneListOfOneGuids = new java.util.ArrayList<java.util.UUID>();
        this.calculatedOneListOfOneGuids = new java.util.ArrayList<java.util.UUID>();
        this.persistedOneListOfOneGuids = new java.util.ArrayList<java.util.UUID>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 18113805;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneGuids_5)) return false;
        final OneListOfOneGuids_5 other = (OneListOfOneGuids_5) obj;

        if (!(this.oneListOfOneGuids.equals(other.oneListOfOneGuids)))
            return false;
        if (!(this.calculatedOneListOfOneGuids
                .equals(other.calculatedOneListOfOneGuids))) return false;
        if (!(this.persistedOneListOfOneGuids
                .equals(other.persistedOneListOfOneGuids))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneGuids_5(" + oneListOfOneGuids + ','
                + calculatedOneListOfOneGuids + ','
                + persistedOneListOfOneGuids + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.util.UUID> oneListOfOneGuids;

    @JsonProperty("oneListOfOneGuids")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.util.UUID> getOneListOfOneGuids() {
        return oneListOfOneGuids;
    }

    public OneListOfOneGuids_5 setOneListOfOneGuids(
            final java.util.List<java.util.UUID> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneGuids\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneListOfOneGuids = value;

        return this;
    }

    private final java.util.List<java.util.UUID> calculatedOneListOfOneGuids;

    public java.util.List<java.util.UUID> getCalculatedOneListOfOneGuids() {
        return this.calculatedOneListOfOneGuids;
    }

    private final java.util.List<java.util.UUID> persistedOneListOfOneGuids;

    public java.util.List<java.util.UUID> getPersistedOneListOfOneGuids() {
        return this.persistedOneListOfOneGuids;
    }
}
