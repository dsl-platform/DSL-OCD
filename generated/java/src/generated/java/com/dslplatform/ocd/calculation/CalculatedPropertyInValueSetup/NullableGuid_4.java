package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableGuid_4 implements java.io.Serializable {
    public NullableGuid_4(
            final java.util.UUID nullableGuid,
            final java.util.UUID calculatedNullableGuid,
            final java.util.UUID persistedNullableGuid) {
        setNullableGuid(nullableGuid);
        this.calculatedNullableGuid = calculatedNullableGuid;
        this.persistedNullableGuid = persistedNullableGuid;
    }

    public NullableGuid_4() {
        this.calculatedNullableGuid = null;
        this.persistedNullableGuid = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1519509905;
        result = prime
                * result
                + (this.nullableGuid != null ? this.nullableGuid.hashCode() : 0);
        result = prime
                * result
                + (this.calculatedNullableGuid != null
                        ? this.calculatedNullableGuid.hashCode()
                        : 0);
        result = prime
                * result
                + (this.persistedNullableGuid != null
                        ? this.persistedNullableGuid.hashCode()
                        : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableGuid_4)) return false;
        final NullableGuid_4 other = (NullableGuid_4) obj;

        if (!(this.nullableGuid == other.nullableGuid || this.nullableGuid != null
                && this.nullableGuid.equals(other.nullableGuid))) return false;
        if (!(this.calculatedNullableGuid == other.calculatedNullableGuid || this.calculatedNullableGuid != null
                && this.calculatedNullableGuid
                        .equals(other.calculatedNullableGuid))) return false;
        if (!(this.persistedNullableGuid == other.persistedNullableGuid || this.persistedNullableGuid != null
                && this.persistedNullableGuid
                        .equals(other.persistedNullableGuid))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableGuid_4(" + nullableGuid + ',' + calculatedNullableGuid
                + ',' + persistedNullableGuid + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.UUID nullableGuid;

    @JsonProperty("nullableGuid")
    public java.util.UUID getNullableGuid() {
        return nullableGuid;
    }

    public NullableGuid_4 setNullableGuid(final java.util.UUID value) {
        this.nullableGuid = value;

        return this;
    }

    private final java.util.UUID calculatedNullableGuid;

    public java.util.UUID getCalculatedNullableGuid() {
        return this.calculatedNullableGuid;
    }

    private final java.util.UUID persistedNullableGuid;

    public java.util.UUID getPersistedNullableGuid() {
        return this.persistedNullableGuid;
    }
}
