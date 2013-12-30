package com.dslplatform.ocd.values.SetOptTimestampInValue;

import com.fasterxml.jackson.annotation.*;

public final class SetOptTimestampValue implements java.io.Serializable {
    public SetOptTimestampValue(
            final java.util.Set<org.joda.time.DateTime> setOptTimestamp) {
        setSetOptTimestamp(setOptTimestamp);
    }

    public SetOptTimestampValue() {
        this.setOptTimestamp = new java.util.HashSet<org.joda.time.DateTime>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 909337906;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof SetOptTimestampValue)) return false;
        final SetOptTimestampValue other = (SetOptTimestampValue) obj;

        if (!(this.setOptTimestamp.equals(other.setOptTimestamp)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "SetOptTimestampValue(" + setOptTimestamp + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<org.joda.time.DateTime> setOptTimestamp;

    @JsonProperty("setOptTimestamp")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<org.joda.time.DateTime> getSetOptTimestamp() {
        return setOptTimestamp;
    }

    public SetOptTimestampValue setSetOptTimestamp(
            final java.util.Set<org.joda.time.DateTime> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"setOptTimestamp\" cannot be null!");
        this.setOptTimestamp = value;

        return this;
    }
}
