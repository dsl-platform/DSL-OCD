package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneTimestampsValue6 implements
        java.io.Serializable {
    public NullableListOfOneTimestampsValue6(
            final java.util.List<org.joda.time.DateTime> nullableListOfOneTimestamps) {
        setNullableListOfOneTimestamps(nullableListOfOneTimestamps);
    }

    public NullableListOfOneTimestampsValue6() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1032046714;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneTimestampsValue6)) return false;
        final NullableListOfOneTimestampsValue6 other = (NullableListOfOneTimestampsValue6) obj;

        if (!(this.nullableListOfOneTimestamps == other.nullableListOfOneTimestamps || this.nullableListOfOneTimestamps != null
                && this.nullableListOfOneTimestamps
                        .equals(other.nullableListOfOneTimestamps)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneTimestampsValue6("
                + nullableListOfOneTimestamps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<org.joda.time.DateTime> nullableListOfOneTimestamps;

    @JsonProperty("nullableListOfOneTimestamps")
    public java.util.List<org.joda.time.DateTime> getNullableListOfOneTimestamps() {
        return nullableListOfOneTimestamps;
    }

    public NullableListOfOneTimestampsValue6 setNullableListOfOneTimestamps(
            final java.util.List<org.joda.time.DateTime> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableListOfOneTimestamps = value;

        return this;
    }
}
