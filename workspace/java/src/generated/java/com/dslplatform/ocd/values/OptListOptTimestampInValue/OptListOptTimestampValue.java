package com.dslplatform.ocd.values.OptListOptTimestampInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptListOptTimestampValue implements java.io.Serializable {
    public OptListOptTimestampValue(
            final java.util.List<org.joda.time.DateTime> optListOptTimestamp) {
        setOptListOptTimestamp(optListOptTimestamp);
    }

    public OptListOptTimestampValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 499933597;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptListOptTimestampValue)) return false;
        final OptListOptTimestampValue other = (OptListOptTimestampValue) obj;

        if (!(this.optListOptTimestamp == other.optListOptTimestamp || this.optListOptTimestamp != null
                && this.optListOptTimestamp.equals(other.optListOptTimestamp)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptListOptTimestampValue(" + optListOptTimestamp + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<org.joda.time.DateTime> optListOptTimestamp;

    @JsonProperty("optListOptTimestamp")
    public java.util.List<org.joda.time.DateTime> getOptListOptTimestamp() {
        return optListOptTimestamp;
    }

    public OptListOptTimestampValue setOptListOptTimestamp(
            final java.util.List<org.joda.time.DateTime> value) {
        this.optListOptTimestamp = value;

        return this;
    }
}
