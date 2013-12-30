package com.dslplatform.ocd.values.ListOptTimestampInValue;

import com.fasterxml.jackson.annotation.*;

public final class ListOptTimestampValue implements java.io.Serializable {
    public ListOptTimestampValue(
            final java.util.List<org.joda.time.DateTime> listOptTimestamp) {
        setListOptTimestamp(listOptTimestamp);
    }

    public ListOptTimestampValue() {
        this.listOptTimestamp = new java.util.ArrayList<org.joda.time.DateTime>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 950070638;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ListOptTimestampValue)) return false;
        final ListOptTimestampValue other = (ListOptTimestampValue) obj;

        if (!(this.listOptTimestamp.equals(other.listOptTimestamp)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "ListOptTimestampValue(" + listOptTimestamp + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<org.joda.time.DateTime> listOptTimestamp;

    @JsonProperty("listOptTimestamp")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<org.joda.time.DateTime> getListOptTimestamp() {
        return listOptTimestamp;
    }

    public ListOptTimestampValue setListOptTimestamp(
            final java.util.List<org.joda.time.DateTime> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"listOptTimestamp\" cannot be null!");
        this.listOptTimestamp = value;

        return this;
    }
}
