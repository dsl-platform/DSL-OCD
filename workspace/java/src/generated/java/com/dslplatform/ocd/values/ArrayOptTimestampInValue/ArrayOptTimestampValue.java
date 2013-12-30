package com.dslplatform.ocd.values.ArrayOptTimestampInValue;

import com.fasterxml.jackson.annotation.*;

public final class ArrayOptTimestampValue implements java.io.Serializable {
    public ArrayOptTimestampValue(
            final org.joda.time.DateTime[] arrayOptTimestamp) {
        setArrayOptTimestamp(arrayOptTimestamp);
    }

    public ArrayOptTimestampValue() {
        this.arrayOptTimestamp = new org.joda.time.DateTime[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 969091501;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ArrayOptTimestampValue)) return false;
        final ArrayOptTimestampValue other = (ArrayOptTimestampValue) obj;

        if (!(java.util.Arrays.equals(this.arrayOptTimestamp,
                other.arrayOptTimestamp))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "ArrayOptTimestampValue(" + arrayOptTimestamp + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.joda.time.DateTime[] arrayOptTimestamp;

    @JsonProperty("arrayOptTimestamp")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public org.joda.time.DateTime[] getArrayOptTimestamp() {
        return arrayOptTimestamp;
    }

    public ArrayOptTimestampValue setArrayOptTimestamp(
            final org.joda.time.DateTime[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"arrayOptTimestamp\" cannot be null!");
        this.arrayOptTimestamp = value;

        return this;
    }
}
