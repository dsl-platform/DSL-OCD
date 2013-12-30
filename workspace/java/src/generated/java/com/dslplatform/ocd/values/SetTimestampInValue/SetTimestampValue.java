package com.dslplatform.ocd.values.SetTimestampInValue;

import com.fasterxml.jackson.annotation.*;

public final class SetTimestampValue implements java.io.Serializable {
    public SetTimestampValue(
            final java.util.Set<org.joda.time.DateTime> setTimestamp) {
        setSetTimestamp(setTimestamp);
    }

    public SetTimestampValue() {
        this.setTimestamp = new java.util.HashSet<org.joda.time.DateTime>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 297596947;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof SetTimestampValue)) return false;
        final SetTimestampValue other = (SetTimestampValue) obj;

        if (!(this.setTimestamp.equals(other.setTimestamp))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "SetTimestampValue(" + setTimestamp + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<org.joda.time.DateTime> setTimestamp;

    @JsonProperty("setTimestamp")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<org.joda.time.DateTime> getSetTimestamp() {
        return setTimestamp;
    }

    public SetTimestampValue setSetTimestamp(
            final java.util.Set<org.joda.time.DateTime> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"setTimestamp\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.setTimestamp = value;

        return this;
    }
}
