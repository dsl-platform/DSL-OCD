package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneTimestampValue3 implements java.io.Serializable {
    public OneTimestampValue3(
            final org.joda.time.DateTime oneTimestamp) {
        setOneTimestamp(oneTimestamp);
    }

    public OneTimestampValue3() {
        this.oneTimestamp = new org.joda.time.DateTime();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1355455768;
        result = prime
                * result
                + (this.oneTimestamp != null ? this.oneTimestamp.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneTimestampValue3)) return false;
        final OneTimestampValue3 other = (OneTimestampValue3) obj;

        if (!(this.oneTimestamp.equals(other.oneTimestamp))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneTimestampValue3(" + oneTimestamp + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.joda.time.DateTime oneTimestamp;

    @JsonProperty("oneTimestamp")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public org.joda.time.DateTime getOneTimestamp() {
        return oneTimestamp;
    }

    public OneTimestampValue3 setOneTimestamp(final org.joda.time.DateTime value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneTimestamp\" cannot be null!");
        this.oneTimestamp = value;

        return this;
    }
}
