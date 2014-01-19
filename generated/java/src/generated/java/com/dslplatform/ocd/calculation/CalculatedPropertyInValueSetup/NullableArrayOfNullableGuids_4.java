package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableGuids_4 implements
        java.io.Serializable {
    public NullableArrayOfNullableGuids_4(
            final java.util.UUID[] nullableArrayOfNullableGuids,
            final java.util.UUID[] calculatedNullableArrayOfNullableGuids,
            final java.util.UUID[] persistedNullableArrayOfNullableGuids) {
        setNullableArrayOfNullableGuids(nullableArrayOfNullableGuids);
        this.calculatedNullableArrayOfNullableGuids = calculatedNullableArrayOfNullableGuids;
        this.persistedNullableArrayOfNullableGuids = persistedNullableArrayOfNullableGuids;
    }

    public NullableArrayOfNullableGuids_4() {
        this.calculatedNullableArrayOfNullableGuids = null;
        this.persistedNullableArrayOfNullableGuids = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 506985339;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableGuids_4)) return false;
        final NullableArrayOfNullableGuids_4 other = (NullableArrayOfNullableGuids_4) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableGuids,
                other.nullableArrayOfNullableGuids))) return false;
        if (!(this.calculatedNullableArrayOfNullableGuids == other.calculatedNullableArrayOfNullableGuids || this.calculatedNullableArrayOfNullableGuids != null
                && java.util.Arrays.equals(
                        this.calculatedNullableArrayOfNullableGuids,
                        other.calculatedNullableArrayOfNullableGuids)))
            return false;
        if (!(this.persistedNullableArrayOfNullableGuids == other.persistedNullableArrayOfNullableGuids || this.persistedNullableArrayOfNullableGuids != null
                && java.util.Arrays.equals(
                        this.persistedNullableArrayOfNullableGuids,
                        other.persistedNullableArrayOfNullableGuids)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableGuids_4(" + nullableArrayOfNullableGuids
                + ',' + calculatedNullableArrayOfNullableGuids + ','
                + persistedNullableArrayOfNullableGuids + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.UUID[] nullableArrayOfNullableGuids;

    @JsonProperty("nullableArrayOfNullableGuids")
    public java.util.UUID[] getNullableArrayOfNullableGuids() {
        return nullableArrayOfNullableGuids;
    }

    public NullableArrayOfNullableGuids_4 setNullableArrayOfNullableGuids(
            final java.util.UUID[] value) {
        this.nullableArrayOfNullableGuids = value;

        return this;
    }

    private final java.util.UUID[] calculatedNullableArrayOfNullableGuids;

    public java.util.UUID[] getCalculatedNullableArrayOfNullableGuids() {
        return this.calculatedNullableArrayOfNullableGuids;
    }

    private final java.util.UUID[] persistedNullableArrayOfNullableGuids;

    public java.util.UUID[] getPersistedNullableArrayOfNullableGuids() {
        return this.persistedNullableArrayOfNullableGuids;
    }
}
