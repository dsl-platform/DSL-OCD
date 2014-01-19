package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneGuids_4 implements java.io.Serializable {
    public NullableListOfOneGuids_4(
            final java.util.List<java.util.UUID> nullableListOfOneGuids,
            final java.util.List<java.util.UUID> calculatedNullableListOfOneGuids,
            final java.util.List<java.util.UUID> persistedNullableListOfOneGuids) {
        setNullableListOfOneGuids(nullableListOfOneGuids);
        this.calculatedNullableListOfOneGuids = calculatedNullableListOfOneGuids;
        this.persistedNullableListOfOneGuids = persistedNullableListOfOneGuids;
    }

    public NullableListOfOneGuids_4() {
        this.calculatedNullableListOfOneGuids = null;
        this.persistedNullableListOfOneGuids = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 620681599;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneGuids_4)) return false;
        final NullableListOfOneGuids_4 other = (NullableListOfOneGuids_4) obj;

        if (!(this.nullableListOfOneGuids == other.nullableListOfOneGuids || this.nullableListOfOneGuids != null
                && this.nullableListOfOneGuids
                        .equals(other.nullableListOfOneGuids))) return false;
        if (!(this.calculatedNullableListOfOneGuids == other.calculatedNullableListOfOneGuids || this.calculatedNullableListOfOneGuids != null
                && this.calculatedNullableListOfOneGuids
                        .equals(other.calculatedNullableListOfOneGuids)))
            return false;
        if (!(this.persistedNullableListOfOneGuids == other.persistedNullableListOfOneGuids || this.persistedNullableListOfOneGuids != null
                && this.persistedNullableListOfOneGuids
                        .equals(other.persistedNullableListOfOneGuids)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneGuids_4(" + nullableListOfOneGuids + ','
                + calculatedNullableListOfOneGuids + ','
                + persistedNullableListOfOneGuids + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.util.UUID> nullableListOfOneGuids;

    @JsonProperty("nullableListOfOneGuids")
    public java.util.List<java.util.UUID> getNullableListOfOneGuids() {
        return nullableListOfOneGuids;
    }

    public NullableListOfOneGuids_4 setNullableListOfOneGuids(
            final java.util.List<java.util.UUID> value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableListOfOneGuids = value;

        return this;
    }

    private final java.util.List<java.util.UUID> calculatedNullableListOfOneGuids;

    public java.util.List<java.util.UUID> getCalculatedNullableListOfOneGuids() {
        return this.calculatedNullableListOfOneGuids;
    }

    private final java.util.List<java.util.UUID> persistedNullableListOfOneGuids;

    public java.util.List<java.util.UUID> getPersistedNullableListOfOneGuids() {
        return this.persistedNullableListOfOneGuids;
    }
}
