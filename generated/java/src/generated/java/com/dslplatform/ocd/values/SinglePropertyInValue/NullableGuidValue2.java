package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableGuidValue2 implements java.io.Serializable {
    public NullableGuidValue2(
            final java.util.UUID nullableGuid) {
        setNullableGuid(nullableGuid);
    }

    public NullableGuidValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 854129513;
        result = prime
                * result
                + (this.nullableGuid != null ? this.nullableGuid.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableGuidValue2)) return false;
        final NullableGuidValue2 other = (NullableGuidValue2) obj;

        if (!(this.nullableGuid == other.nullableGuid || this.nullableGuid != null
                && this.nullableGuid.equals(other.nullableGuid))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableGuidValue2(" + nullableGuid + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.UUID nullableGuid;

    @JsonProperty("nullableGuid")
    public java.util.UUID getNullableGuid() {
        return nullableGuid;
    }

    public NullableGuidValue2 setNullableGuid(final java.util.UUID value) {
        this.nullableGuid = value;

        return this;
    }
}
