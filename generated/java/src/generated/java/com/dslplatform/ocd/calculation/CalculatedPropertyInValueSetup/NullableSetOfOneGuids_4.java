package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneGuids_4 implements java.io.Serializable {
    public NullableSetOfOneGuids_4(
            final java.util.Set<java.util.UUID> nullableSetOfOneGuids,
            final java.util.Set<java.util.UUID> calculatedNullableSetOfOneGuids,
            final java.util.Set<java.util.UUID> persistedNullableSetOfOneGuids) {
        setNullableSetOfOneGuids(nullableSetOfOneGuids);
        this.calculatedNullableSetOfOneGuids = calculatedNullableSetOfOneGuids;
        this.persistedNullableSetOfOneGuids = persistedNullableSetOfOneGuids;
    }

    public NullableSetOfOneGuids_4() {
        this.calculatedNullableSetOfOneGuids = null;
        this.persistedNullableSetOfOneGuids = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1512872501;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneGuids_4)) return false;
        final NullableSetOfOneGuids_4 other = (NullableSetOfOneGuids_4) obj;

        if (!(this.nullableSetOfOneGuids == other.nullableSetOfOneGuids || this.nullableSetOfOneGuids != null
                && this.nullableSetOfOneGuids
                        .equals(other.nullableSetOfOneGuids))) return false;
        if (!(this.calculatedNullableSetOfOneGuids == other.calculatedNullableSetOfOneGuids || this.calculatedNullableSetOfOneGuids != null
                && this.calculatedNullableSetOfOneGuids
                        .equals(other.calculatedNullableSetOfOneGuids)))
            return false;
        if (!(this.persistedNullableSetOfOneGuids == other.persistedNullableSetOfOneGuids || this.persistedNullableSetOfOneGuids != null
                && this.persistedNullableSetOfOneGuids
                        .equals(other.persistedNullableSetOfOneGuids)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneGuids_4(" + nullableSetOfOneGuids + ','
                + calculatedNullableSetOfOneGuids + ','
                + persistedNullableSetOfOneGuids + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.util.UUID> nullableSetOfOneGuids;

    @JsonProperty("nullableSetOfOneGuids")
    public java.util.Set<java.util.UUID> getNullableSetOfOneGuids() {
        return nullableSetOfOneGuids;
    }

    public NullableSetOfOneGuids_4 setNullableSetOfOneGuids(
            final java.util.Set<java.util.UUID> value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableSetOfOneGuids = value;

        return this;
    }

    private final java.util.Set<java.util.UUID> calculatedNullableSetOfOneGuids;

    public java.util.Set<java.util.UUID> getCalculatedNullableSetOfOneGuids() {
        return this.calculatedNullableSetOfOneGuids;
    }

    private final java.util.Set<java.util.UUID> persistedNullableSetOfOneGuids;

    public java.util.Set<java.util.UUID> getPersistedNullableSetOfOneGuids() {
        return this.persistedNullableSetOfOneGuids;
    }
}
