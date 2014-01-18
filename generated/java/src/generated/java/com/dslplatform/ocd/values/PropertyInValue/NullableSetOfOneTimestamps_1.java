package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneTimestamps_1 implements java.io.Serializable {
    public NullableSetOfOneTimestamps_1(
            final java.util.Set<org.joda.time.DateTime> nullableSetOfOneTimestamps) {
        setNullableSetOfOneTimestamps(nullableSetOfOneTimestamps);
    }

    public NullableSetOfOneTimestamps_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 529946819;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneTimestamps_1)) return false;
        final NullableSetOfOneTimestamps_1 other = (NullableSetOfOneTimestamps_1) obj;

        if (!(this.nullableSetOfOneTimestamps == other.nullableSetOfOneTimestamps || this.nullableSetOfOneTimestamps != null
                && this.nullableSetOfOneTimestamps
                        .equals(other.nullableSetOfOneTimestamps)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneTimestamps_1(" + nullableSetOfOneTimestamps
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<org.joda.time.DateTime> nullableSetOfOneTimestamps;

    @JsonProperty("nullableSetOfOneTimestamps")
    public java.util.Set<org.joda.time.DateTime> getNullableSetOfOneTimestamps() {
        return nullableSetOfOneTimestamps;
    }

    public NullableSetOfOneTimestamps_1 setNullableSetOfOneTimestamps(
            final java.util.Set<org.joda.time.DateTime> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableSetOfOneTimestamps = value;

        return this;
    }
}
