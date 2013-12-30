package com.dslplatform.ocd.values.OptSetOptTimestampInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptSetOptTimestampValue implements java.io.Serializable {
    public OptSetOptTimestampValue(
            final java.util.Set<org.joda.time.DateTime> optSetOptTimestamp) {
        setOptSetOptTimestamp(optSetOptTimestamp);
    }

    public OptSetOptTimestampValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1491883211;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptSetOptTimestampValue)) return false;
        final OptSetOptTimestampValue other = (OptSetOptTimestampValue) obj;

        if (!(this.optSetOptTimestamp == other.optSetOptTimestamp || this.optSetOptTimestamp != null
                && this.optSetOptTimestamp.equals(other.optSetOptTimestamp)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptSetOptTimestampValue(" + optSetOptTimestamp + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<org.joda.time.DateTime> optSetOptTimestamp;

    @JsonProperty("optSetOptTimestamp")
    public java.util.Set<org.joda.time.DateTime> getOptSetOptTimestamp() {
        return optSetOptTimestamp;
    }

    public OptSetOptTimestampValue setOptSetOptTimestamp(
            final java.util.Set<org.joda.time.DateTime> value) {
        this.optSetOptTimestamp = value;

        return this;
    }
}
