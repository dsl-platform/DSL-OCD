package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableGuids_4 implements java.io.Serializable {
    public NullableSetOfNullableGuids_4(
            final java.util.Set<java.util.UUID> nullableSetOfNullableGuids,
            final java.util.Set<java.util.UUID> calculatedNullableSetOfNullableGuids,
            final java.util.Set<java.util.UUID> persistedNullableSetOfNullableGuids) {
        setNullableSetOfNullableGuids(nullableSetOfNullableGuids);
        this.calculatedNullableSetOfNullableGuids = calculatedNullableSetOfNullableGuids;
        this.persistedNullableSetOfNullableGuids = persistedNullableSetOfNullableGuids;
    }

    public NullableSetOfNullableGuids_4() {
        this.calculatedNullableSetOfNullableGuids = null;
        this.persistedNullableSetOfNullableGuids = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 669218990;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableGuids_4)) return false;
        final NullableSetOfNullableGuids_4 other = (NullableSetOfNullableGuids_4) obj;

        if (!(this.nullableSetOfNullableGuids == other.nullableSetOfNullableGuids || this.nullableSetOfNullableGuids != null
                && this.nullableSetOfNullableGuids
                        .equals(other.nullableSetOfNullableGuids)))
            return false;
        if (!(this.calculatedNullableSetOfNullableGuids == other.calculatedNullableSetOfNullableGuids || this.calculatedNullableSetOfNullableGuids != null
                && this.calculatedNullableSetOfNullableGuids
                        .equals(other.calculatedNullableSetOfNullableGuids)))
            return false;
        if (!(this.persistedNullableSetOfNullableGuids == other.persistedNullableSetOfNullableGuids || this.persistedNullableSetOfNullableGuids != null
                && this.persistedNullableSetOfNullableGuids
                        .equals(other.persistedNullableSetOfNullableGuids)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableGuids_4(" + nullableSetOfNullableGuids
                + ',' + calculatedNullableSetOfNullableGuids + ','
                + persistedNullableSetOfNullableGuids + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.util.UUID> nullableSetOfNullableGuids;

    @JsonProperty("nullableSetOfNullableGuids")
    public java.util.Set<java.util.UUID> getNullableSetOfNullableGuids() {
        return nullableSetOfNullableGuids;
    }

    public NullableSetOfNullableGuids_4 setNullableSetOfNullableGuids(
            final java.util.Set<java.util.UUID> value) {
        this.nullableSetOfNullableGuids = value;

        return this;
    }

    private final java.util.Set<java.util.UUID> calculatedNullableSetOfNullableGuids;

    public java.util.Set<java.util.UUID> getCalculatedNullableSetOfNullableGuids() {
        return this.calculatedNullableSetOfNullableGuids;
    }

    private final java.util.Set<java.util.UUID> persistedNullableSetOfNullableGuids;

    public java.util.Set<java.util.UUID> getPersistedNullableSetOfNullableGuids() {
        return this.persistedNullableSetOfNullableGuids;
    }
}
