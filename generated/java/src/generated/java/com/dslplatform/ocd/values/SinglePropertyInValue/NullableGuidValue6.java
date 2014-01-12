package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableGuidValue6 implements java.io.Serializable {
    public NullableGuidValue6(
            final java.util.UUID nullableGuid) {
        setNullableGuid(nullableGuid);
    }

    public NullableGuidValue6() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1471469315;
        result = prime
                * result
                + (this.nullableGuid != null ? this.nullableGuid.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableGuidValue6)) return false;
        final NullableGuidValue6 other = (NullableGuidValue6) obj;

        if (!(this.nullableGuid == other.nullableGuid || this.nullableGuid != null
                && this.nullableGuid.equals(other.nullableGuid))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableGuidValue6(" + nullableGuid + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.UUID nullableGuid;

    @JsonProperty("nullableGuid")
    public java.util.UUID getNullableGuid() {
        return nullableGuid;
    }

    public NullableGuidValue6 setNullableGuid(final java.util.UUID value) {
        this.nullableGuid = value;

        return this;
    }
}
