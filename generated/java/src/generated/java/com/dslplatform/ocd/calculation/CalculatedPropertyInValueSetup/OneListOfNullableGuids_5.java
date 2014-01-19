package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableGuids_5 implements java.io.Serializable {
    public OneListOfNullableGuids_5(
            final java.util.List<java.util.UUID> oneListOfNullableGuids,
            final java.util.List<java.util.UUID> calculatedOneListOfNullableGuids,
            final java.util.List<java.util.UUID> persistedOneListOfNullableGuids) {
        setOneListOfNullableGuids(oneListOfNullableGuids);
        this.calculatedOneListOfNullableGuids = calculatedOneListOfNullableGuids;
        this.persistedOneListOfNullableGuids = persistedOneListOfNullableGuids;
    }

    public OneListOfNullableGuids_5() {
        this.oneListOfNullableGuids = new java.util.ArrayList<java.util.UUID>();
        this.calculatedOneListOfNullableGuids = new java.util.ArrayList<java.util.UUID>();
        this.persistedOneListOfNullableGuids = new java.util.ArrayList<java.util.UUID>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 667722704;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableGuids_5)) return false;
        final OneListOfNullableGuids_5 other = (OneListOfNullableGuids_5) obj;

        if (!(this.oneListOfNullableGuids.equals(other.oneListOfNullableGuids)))
            return false;
        if (!(this.calculatedOneListOfNullableGuids
                .equals(other.calculatedOneListOfNullableGuids))) return false;
        if (!(this.persistedOneListOfNullableGuids
                .equals(other.persistedOneListOfNullableGuids))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableGuids_5(" + oneListOfNullableGuids + ','
                + calculatedOneListOfNullableGuids + ','
                + persistedOneListOfNullableGuids + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.util.UUID> oneListOfNullableGuids;

    @JsonProperty("oneListOfNullableGuids")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.util.UUID> getOneListOfNullableGuids() {
        return oneListOfNullableGuids;
    }

    public OneListOfNullableGuids_5 setOneListOfNullableGuids(
            final java.util.List<java.util.UUID> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableGuids\" cannot be null!");
        this.oneListOfNullableGuids = value;

        return this;
    }

    private final java.util.List<java.util.UUID> calculatedOneListOfNullableGuids;

    public java.util.List<java.util.UUID> getCalculatedOneListOfNullableGuids() {
        return this.calculatedOneListOfNullableGuids;
    }

    private final java.util.List<java.util.UUID> persistedOneListOfNullableGuids;

    public java.util.List<java.util.UUID> getPersistedOneListOfNullableGuids() {
        return this.persistedOneListOfNullableGuids;
    }
}
