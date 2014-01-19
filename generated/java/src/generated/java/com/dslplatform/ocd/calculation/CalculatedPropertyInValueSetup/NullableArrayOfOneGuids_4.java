package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneGuids_4 implements java.io.Serializable {
    public NullableArrayOfOneGuids_4(
            final java.util.UUID[] nullableArrayOfOneGuids,
            final java.util.UUID[] calculatedNullableArrayOfOneGuids,
            final java.util.UUID[] persistedNullableArrayOfOneGuids) {
        setNullableArrayOfOneGuids(nullableArrayOfOneGuids);
        this.calculatedNullableArrayOfOneGuids = calculatedNullableArrayOfOneGuids;
        this.persistedNullableArrayOfOneGuids = persistedNullableArrayOfOneGuids;
    }

    public NullableArrayOfOneGuids_4() {
        this.calculatedNullableArrayOfOneGuids = null;
        this.persistedNullableArrayOfOneGuids = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1816775600;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneGuids_4)) return false;
        final NullableArrayOfOneGuids_4 other = (NullableArrayOfOneGuids_4) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfOneGuids,
                other.nullableArrayOfOneGuids))) return false;
        if (!(this.calculatedNullableArrayOfOneGuids == other.calculatedNullableArrayOfOneGuids || this.calculatedNullableArrayOfOneGuids != null
                && java.util.Arrays.equals(
                        this.calculatedNullableArrayOfOneGuids,
                        other.calculatedNullableArrayOfOneGuids)))
            return false;
        if (!(this.persistedNullableArrayOfOneGuids == other.persistedNullableArrayOfOneGuids || this.persistedNullableArrayOfOneGuids != null
                && java.util.Arrays.equals(
                        this.persistedNullableArrayOfOneGuids,
                        other.persistedNullableArrayOfOneGuids))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneGuids_4(" + nullableArrayOfOneGuids + ','
                + calculatedNullableArrayOfOneGuids + ','
                + persistedNullableArrayOfOneGuids + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.UUID[] nullableArrayOfOneGuids;

    @JsonProperty("nullableArrayOfOneGuids")
    public java.util.UUID[] getNullableArrayOfOneGuids() {
        return nullableArrayOfOneGuids;
    }

    public NullableArrayOfOneGuids_4 setNullableArrayOfOneGuids(
            final java.util.UUID[] value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableArrayOfOneGuids = value;

        return this;
    }

    private final java.util.UUID[] calculatedNullableArrayOfOneGuids;

    public java.util.UUID[] getCalculatedNullableArrayOfOneGuids() {
        return this.calculatedNullableArrayOfOneGuids;
    }

    private final java.util.UUID[] persistedNullableArrayOfOneGuids;

    public java.util.UUID[] getPersistedNullableArrayOfOneGuids() {
        return this.persistedNullableArrayOfOneGuids;
    }
}
