package com.dslplatform.ocd.values.OptListTimestampInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptListTimestampValue implements java.io.Serializable {
    public OptListTimestampValue(
            final java.util.List<org.joda.time.DateTime> optListTimestamp) {
        setOptListTimestamp(optListTimestamp);
    }

    public OptListTimestampValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 848936898;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptListTimestampValue)) return false;
        final OptListTimestampValue other = (OptListTimestampValue) obj;

        if (!(this.optListTimestamp == other.optListTimestamp || this.optListTimestamp != null
                && this.optListTimestamp.equals(other.optListTimestamp)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptListTimestampValue(" + optListTimestamp + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<org.joda.time.DateTime> optListTimestamp;

    @JsonProperty("optListTimestamp")
    public java.util.List<org.joda.time.DateTime> getOptListTimestamp() {
        return optListTimestamp;
    }

    public OptListTimestampValue setOptListTimestamp(
            final java.util.List<org.joda.time.DateTime> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.optListTimestamp = value;

        return this;
    }
}
