package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneGuidValue2 implements java.io.Serializable {
    public OneGuidValue2(
            final java.util.UUID oneGuid) {
        setOneGuid(oneGuid);
    }

    public OneGuidValue2() {
        this.oneGuid = java.util.UUID.randomUUID();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1904672218;
        result = prime * result
                + (this.oneGuid != null ? this.oneGuid.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneGuidValue2)) return false;
        final OneGuidValue2 other = (OneGuidValue2) obj;

        if (!(this.oneGuid.equals(other.oneGuid))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneGuidValue2(" + oneGuid + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.UUID oneGuid;

    @JsonProperty("oneGuid")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.UUID getOneGuid() {
        return oneGuid;
    }

    public OneGuidValue2 setOneGuid(final java.util.UUID value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneGuid\" cannot be null!");
        this.oneGuid = value;

        return this;
    }
}
