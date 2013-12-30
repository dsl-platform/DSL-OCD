package com.dslplatform.ocd.values.OptSetTimestampInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptSetTimestampValue implements java.io.Serializable {
    public OptSetTimestampValue(
            final java.util.Set<org.joda.time.DateTime> optSetTimestamp) {
        setOptSetTimestamp(optSetTimestamp);
    }

    public OptSetTimestampValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 582962260;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptSetTimestampValue)) return false;
        final OptSetTimestampValue other = (OptSetTimestampValue) obj;

        if (!(this.optSetTimestamp == other.optSetTimestamp || this.optSetTimestamp != null
                && this.optSetTimestamp.equals(other.optSetTimestamp)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptSetTimestampValue(" + optSetTimestamp + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<org.joda.time.DateTime> optSetTimestamp;

    @JsonProperty("optSetTimestamp")
    public java.util.Set<org.joda.time.DateTime> getOptSetTimestamp() {
        return optSetTimestamp;
    }

    public OptSetTimestampValue setOptSetTimestamp(
            final java.util.Set<org.joda.time.DateTime> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.optSetTimestamp = value;

        return this;
    }
}
