package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableGuids_4 implements
        java.io.Serializable {
    public NullableListOfNullableGuids_4(
            final java.util.List<java.util.UUID> nullableListOfNullableGuids,
            final java.util.List<java.util.UUID> calculatedNullableListOfNullableGuids,
            final java.util.List<java.util.UUID> persistedNullableListOfNullableGuids) {
        setNullableListOfNullableGuids(nullableListOfNullableGuids);
        this.calculatedNullableListOfNullableGuids = calculatedNullableListOfNullableGuids;
        this.persistedNullableListOfNullableGuids = persistedNullableListOfNullableGuids;
    }

    public NullableListOfNullableGuids_4() {
        this.calculatedNullableListOfNullableGuids = null;
        this.persistedNullableListOfNullableGuids = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1740165004;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableGuids_4)) return false;
        final NullableListOfNullableGuids_4 other = (NullableListOfNullableGuids_4) obj;

        if (!(this.nullableListOfNullableGuids == other.nullableListOfNullableGuids || this.nullableListOfNullableGuids != null
                && this.nullableListOfNullableGuids
                        .equals(other.nullableListOfNullableGuids)))
            return false;
        if (!(this.calculatedNullableListOfNullableGuids == other.calculatedNullableListOfNullableGuids || this.calculatedNullableListOfNullableGuids != null
                && this.calculatedNullableListOfNullableGuids
                        .equals(other.calculatedNullableListOfNullableGuids)))
            return false;
        if (!(this.persistedNullableListOfNullableGuids == other.persistedNullableListOfNullableGuids || this.persistedNullableListOfNullableGuids != null
                && this.persistedNullableListOfNullableGuids
                        .equals(other.persistedNullableListOfNullableGuids)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableGuids_4(" + nullableListOfNullableGuids
                + ',' + calculatedNullableListOfNullableGuids + ','
                + persistedNullableListOfNullableGuids + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.util.UUID> nullableListOfNullableGuids;

    @JsonProperty("nullableListOfNullableGuids")
    public java.util.List<java.util.UUID> getNullableListOfNullableGuids() {
        return nullableListOfNullableGuids;
    }

    public NullableListOfNullableGuids_4 setNullableListOfNullableGuids(
            final java.util.List<java.util.UUID> value) {
        this.nullableListOfNullableGuids = value;

        return this;
    }

    private final java.util.List<java.util.UUID> calculatedNullableListOfNullableGuids;

    public java.util.List<java.util.UUID> getCalculatedNullableListOfNullableGuids() {
        return this.calculatedNullableListOfNullableGuids;
    }

    private final java.util.List<java.util.UUID> persistedNullableListOfNullableGuids;

    public java.util.List<java.util.UUID> getPersistedNullableListOfNullableGuids() {
        return this.persistedNullableListOfNullableGuids;
    }
}
