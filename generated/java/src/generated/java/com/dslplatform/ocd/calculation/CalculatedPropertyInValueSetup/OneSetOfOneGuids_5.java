package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneGuids_5 implements java.io.Serializable {
    public OneSetOfOneGuids_5(
            final java.util.Set<java.util.UUID> oneSetOfOneGuids,
            final java.util.Set<java.util.UUID> calculatedOneSetOfOneGuids,
            final java.util.Set<java.util.UUID> persistedOneSetOfOneGuids) {
        setOneSetOfOneGuids(oneSetOfOneGuids);
        this.calculatedOneSetOfOneGuids = calculatedOneSetOfOneGuids;
        this.persistedOneSetOfOneGuids = persistedOneSetOfOneGuids;
    }

    public OneSetOfOneGuids_5() {
        this.oneSetOfOneGuids = new java.util.HashSet<java.util.UUID>();
        this.calculatedOneSetOfOneGuids = new java.util.HashSet<java.util.UUID>();
        this.persistedOneSetOfOneGuids = new java.util.HashSet<java.util.UUID>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1957567939;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneGuids_5)) return false;
        final OneSetOfOneGuids_5 other = (OneSetOfOneGuids_5) obj;

        if (!(this.oneSetOfOneGuids.equals(other.oneSetOfOneGuids)))
            return false;
        if (!(this.calculatedOneSetOfOneGuids
                .equals(other.calculatedOneSetOfOneGuids))) return false;
        if (!(this.persistedOneSetOfOneGuids
                .equals(other.persistedOneSetOfOneGuids))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneGuids_5(" + oneSetOfOneGuids + ','
                + calculatedOneSetOfOneGuids + ',' + persistedOneSetOfOneGuids
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.util.UUID> oneSetOfOneGuids;

    @JsonProperty("oneSetOfOneGuids")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.util.UUID> getOneSetOfOneGuids() {
        return oneSetOfOneGuids;
    }

    public OneSetOfOneGuids_5 setOneSetOfOneGuids(
            final java.util.Set<java.util.UUID> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneGuids\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneSetOfOneGuids = value;

        return this;
    }

    private final java.util.Set<java.util.UUID> calculatedOneSetOfOneGuids;

    public java.util.Set<java.util.UUID> getCalculatedOneSetOfOneGuids() {
        return this.calculatedOneSetOfOneGuids;
    }

    private final java.util.Set<java.util.UUID> persistedOneSetOfOneGuids;

    public java.util.Set<java.util.UUID> getPersistedOneSetOfOneGuids() {
        return this.persistedOneSetOfOneGuids;
    }
}
