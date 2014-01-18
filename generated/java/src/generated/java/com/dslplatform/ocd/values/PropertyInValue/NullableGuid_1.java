package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableGuid_1 implements java.io.Serializable {
    public NullableGuid_1(
            final java.util.UUID nullableGuid) {
        setNullableGuid(nullableGuid);
    }

    public NullableGuid_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1116225378;
        result = prime
                * result
                + (this.nullableGuid != null ? this.nullableGuid.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableGuid_1)) return false;
        final NullableGuid_1 other = (NullableGuid_1) obj;

        if (!(this.nullableGuid == other.nullableGuid || this.nullableGuid != null
                && this.nullableGuid.equals(other.nullableGuid))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableGuid_1(" + nullableGuid + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.UUID nullableGuid;

    @JsonProperty("nullableGuid")
    public java.util.UUID getNullableGuid() {
        return nullableGuid;
    }

    public NullableGuid_1 setNullableGuid(final java.util.UUID value) {
        this.nullableGuid = value;

        return this;
    }
}
