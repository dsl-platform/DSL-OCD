package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableGuids_5 implements java.io.Serializable {
    public OneSetOfNullableGuids_5(
            final java.util.Set<java.util.UUID> oneSetOfNullableGuids,
            final java.util.Set<java.util.UUID> calculatedOneSetOfNullableGuids,
            final java.util.Set<java.util.UUID> persistedOneSetOfNullableGuids) {
        setOneSetOfNullableGuids(oneSetOfNullableGuids);
        this.calculatedOneSetOfNullableGuids = calculatedOneSetOfNullableGuids;
        this.persistedOneSetOfNullableGuids = persistedOneSetOfNullableGuids;
    }

    public OneSetOfNullableGuids_5() {
        this.oneSetOfNullableGuids = new java.util.HashSet<java.util.UUID>();
        this.calculatedOneSetOfNullableGuids = new java.util.HashSet<java.util.UUID>();
        this.persistedOneSetOfNullableGuids = new java.util.HashSet<java.util.UUID>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 656013604;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableGuids_5)) return false;
        final OneSetOfNullableGuids_5 other = (OneSetOfNullableGuids_5) obj;

        if (!(this.oneSetOfNullableGuids.equals(other.oneSetOfNullableGuids)))
            return false;
        if (!(this.calculatedOneSetOfNullableGuids
                .equals(other.calculatedOneSetOfNullableGuids))) return false;
        if (!(this.persistedOneSetOfNullableGuids
                .equals(other.persistedOneSetOfNullableGuids))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableGuids_5(" + oneSetOfNullableGuids + ','
                + calculatedOneSetOfNullableGuids + ','
                + persistedOneSetOfNullableGuids + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.util.UUID> oneSetOfNullableGuids;

    @JsonProperty("oneSetOfNullableGuids")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.util.UUID> getOneSetOfNullableGuids() {
        return oneSetOfNullableGuids;
    }

    public OneSetOfNullableGuids_5 setOneSetOfNullableGuids(
            final java.util.Set<java.util.UUID> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableGuids\" cannot be null!");
        this.oneSetOfNullableGuids = value;

        return this;
    }

    private final java.util.Set<java.util.UUID> calculatedOneSetOfNullableGuids;

    public java.util.Set<java.util.UUID> getCalculatedOneSetOfNullableGuids() {
        return this.calculatedOneSetOfNullableGuids;
    }

    private final java.util.Set<java.util.UUID> persistedOneSetOfNullableGuids;

    public java.util.Set<java.util.UUID> getPersistedOneSetOfNullableGuids() {
        return this.persistedOneSetOfNullableGuids;
    }
}
