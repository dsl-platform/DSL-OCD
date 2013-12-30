package com.dslplatform.ocd.values.ListTimestampInValue;

import com.fasterxml.jackson.annotation.*;

public final class ListTimestampValue implements java.io.Serializable {
    public ListTimestampValue(
            final java.util.List<org.joda.time.DateTime> listTimestamp) {
        setListTimestamp(listTimestamp);
    }

    public ListTimestampValue() {
        this.listTimestamp = new java.util.ArrayList<org.joda.time.DateTime>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 986604751;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ListTimestampValue)) return false;
        final ListTimestampValue other = (ListTimestampValue) obj;

        if (!(this.listTimestamp.equals(other.listTimestamp))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "ListTimestampValue(" + listTimestamp + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<org.joda.time.DateTime> listTimestamp;

    @JsonProperty("listTimestamp")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<org.joda.time.DateTime> getListTimestamp() {
        return listTimestamp;
    }

    public ListTimestampValue setListTimestamp(
            final java.util.List<org.joda.time.DateTime> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"listTimestamp\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.listTimestamp = value;

        return this;
    }
}
