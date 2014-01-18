package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneGuid_1 implements java.io.Serializable {
    public OneGuid_1(
            final java.util.UUID oneGuid) {
        setOneGuid(oneGuid);
    }

    public OneGuid_1() {
        this.oneGuid = java.util.UUID.randomUUID();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2127718479;
        result = prime * result
                + (this.oneGuid != null ? this.oneGuid.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneGuid_1)) return false;
        final OneGuid_1 other = (OneGuid_1) obj;

        if (!(this.oneGuid.equals(other.oneGuid))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneGuid_1(" + oneGuid + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.UUID oneGuid;

    @JsonProperty("oneGuid")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.UUID getOneGuid() {
        return oneGuid;
    }

    public OneGuid_1 setOneGuid(final java.util.UUID value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneGuid\" cannot be null!");
        this.oneGuid = value;

        return this;
    }
}
