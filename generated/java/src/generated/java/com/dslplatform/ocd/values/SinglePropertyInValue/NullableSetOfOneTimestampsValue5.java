package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneTimestampsValue5 implements
        java.io.Serializable {
    public NullableSetOfOneTimestampsValue5(
            final java.util.Set<org.joda.time.DateTime> nullableSetOfOneTimestamps) {
        setNullableSetOfOneTimestamps(nullableSetOfOneTimestamps);
    }

    public NullableSetOfOneTimestampsValue5() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 517689107;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneTimestampsValue5)) return false;
        final NullableSetOfOneTimestampsValue5 other = (NullableSetOfOneTimestampsValue5) obj;

        if (!(this.nullableSetOfOneTimestamps == other.nullableSetOfOneTimestamps || this.nullableSetOfOneTimestamps != null
                && this.nullableSetOfOneTimestamps
                        .equals(other.nullableSetOfOneTimestamps)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneTimestampsValue5(" + nullableSetOfOneTimestamps
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<org.joda.time.DateTime> nullableSetOfOneTimestamps;

    @JsonProperty("nullableSetOfOneTimestamps")
    public java.util.Set<org.joda.time.DateTime> getNullableSetOfOneTimestamps() {
        return nullableSetOfOneTimestamps;
    }

    public NullableSetOfOneTimestampsValue5 setNullableSetOfOneTimestamps(
            final java.util.Set<org.joda.time.DateTime> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableSetOfOneTimestamps = value;

        return this;
    }
}
