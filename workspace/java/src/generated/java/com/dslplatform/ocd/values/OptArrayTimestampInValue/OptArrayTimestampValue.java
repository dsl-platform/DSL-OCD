package com.dslplatform.ocd.values.OptArrayTimestampInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptArrayTimestampValue implements java.io.Serializable {
    public OptArrayTimestampValue(
            final org.joda.time.DateTime[] optArrayTimestamp) {
        setOptArrayTimestamp(optArrayTimestamp);
    }

    public OptArrayTimestampValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1281192885;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptArrayTimestampValue)) return false;
        final OptArrayTimestampValue other = (OptArrayTimestampValue) obj;

        if (!(java.util.Arrays.equals(this.optArrayTimestamp,
                other.optArrayTimestamp))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptArrayTimestampValue(" + optArrayTimestamp + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.joda.time.DateTime[] optArrayTimestamp;

    @JsonProperty("optArrayTimestamp")
    public org.joda.time.DateTime[] getOptArrayTimestamp() {
        return optArrayTimestamp;
    }

    public OptArrayTimestampValue setOptArrayTimestamp(
            final org.joda.time.DateTime[] value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.optArrayTimestamp = value;

        return this;
    }
}
