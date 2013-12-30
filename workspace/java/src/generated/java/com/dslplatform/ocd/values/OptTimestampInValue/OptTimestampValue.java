package com.dslplatform.ocd.values.OptTimestampInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptTimestampValue implements java.io.Serializable {
    public OptTimestampValue(
            final org.joda.time.DateTime optTimestamp) {
        setOptTimestamp(optTimestamp);
    }

    public OptTimestampValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1021348054;
        result = prime
                * result
                + (this.optTimestamp != null ? this.optTimestamp.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptTimestampValue)) return false;
        final OptTimestampValue other = (OptTimestampValue) obj;

        if (!(this.optTimestamp == other.optTimestamp || this.optTimestamp != null
                && this.optTimestamp.equals(other.optTimestamp))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptTimestampValue(" + optTimestamp + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.joda.time.DateTime optTimestamp;

    @JsonProperty("optTimestamp")
    public org.joda.time.DateTime getOptTimestamp() {
        return optTimestamp;
    }

    public OptTimestampValue setOptTimestamp(final org.joda.time.DateTime value) {
        this.optTimestamp = value;

        return this;
    }
}
