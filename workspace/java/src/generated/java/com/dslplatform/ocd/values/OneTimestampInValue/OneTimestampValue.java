package com.dslplatform.ocd.values.OneTimestampInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneTimestampValue implements java.io.Serializable {
    public OneTimestampValue(
            final org.joda.time.DateTime oneTimestamp) {
        setOneTimestamp(oneTimestamp);
    }

    public OneTimestampValue() {
        this.oneTimestamp = new org.joda.time.DateTime();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 297597575;
        result = prime
                * result
                + (this.oneTimestamp != null ? this.oneTimestamp.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneTimestampValue)) return false;
        final OneTimestampValue other = (OneTimestampValue) obj;

        if (!(this.oneTimestamp.equals(other.oneTimestamp))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneTimestampValue(" + oneTimestamp + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.joda.time.DateTime oneTimestamp;

    @JsonProperty("oneTimestamp")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public org.joda.time.DateTime getOneTimestamp() {
        return oneTimestamp;
    }

    public OneTimestampValue setOneTimestamp(final org.joda.time.DateTime value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneTimestamp\" cannot be null!");
        this.oneTimestamp = value;

        return this;
    }
}
