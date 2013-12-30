package com.dslplatform.ocd.values.OptArrayOptTimestampInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptArrayOptTimestampValue implements java.io.Serializable {
    public OptArrayOptTimestampValue(
            final org.joda.time.DateTime[] optArrayOptTimestamp) {
        setOptArrayOptTimestamp(optArrayOptTimestamp);
    }

    public OptArrayOptTimestampValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 299333948;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptArrayOptTimestampValue)) return false;
        final OptArrayOptTimestampValue other = (OptArrayOptTimestampValue) obj;

        if (!(java.util.Arrays.equals(this.optArrayOptTimestamp,
                other.optArrayOptTimestamp))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptArrayOptTimestampValue(" + optArrayOptTimestamp + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.joda.time.DateTime[] optArrayOptTimestamp;

    @JsonProperty("optArrayOptTimestamp")
    public org.joda.time.DateTime[] getOptArrayOptTimestamp() {
        return optArrayOptTimestamp;
    }

    public OptArrayOptTimestampValue setOptArrayOptTimestamp(
            final org.joda.time.DateTime[] value) {
        this.optArrayOptTimestamp = value;

        return this;
    }
}
