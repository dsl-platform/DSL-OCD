package com.dslplatform.ocd.values.ArrayTimestampInValue;

import com.fasterxml.jackson.annotation.*;

public final class ArrayTimestampValue implements java.io.Serializable {
    public ArrayTimestampValue(
            final org.joda.time.DateTime[] arrayTimestamp) {
        setArrayTimestamp(arrayTimestamp);
    }

    public ArrayTimestampValue() {
        this.arrayTimestamp = new org.joda.time.DateTime[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 473510462;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ArrayTimestampValue)) return false;
        final ArrayTimestampValue other = (ArrayTimestampValue) obj;

        if (!(java.util.Arrays
                .equals(this.arrayTimestamp, other.arrayTimestamp)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "ArrayTimestampValue(" + arrayTimestamp + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.joda.time.DateTime[] arrayTimestamp;

    @JsonProperty("arrayTimestamp")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public org.joda.time.DateTime[] getArrayTimestamp() {
        return arrayTimestamp;
    }

    public ArrayTimestampValue setArrayTimestamp(
            final org.joda.time.DateTime[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"arrayTimestamp\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.arrayTimestamp = value;

        return this;
    }
}
