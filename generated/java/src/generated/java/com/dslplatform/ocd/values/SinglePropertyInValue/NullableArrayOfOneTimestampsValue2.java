package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneTimestampsValue2 implements
        java.io.Serializable {
    public NullableArrayOfOneTimestampsValue2(
            final org.joda.time.DateTime[] nullableArrayOfOneTimestamps) {
        setNullableArrayOfOneTimestamps(nullableArrayOfOneTimestamps);
    }

    public NullableArrayOfOneTimestampsValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1225429683;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneTimestampsValue2)) return false;
        final NullableArrayOfOneTimestampsValue2 other = (NullableArrayOfOneTimestampsValue2) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfOneTimestamps,
                other.nullableArrayOfOneTimestamps))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneTimestampsValue2("
                + nullableArrayOfOneTimestamps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.joda.time.DateTime[] nullableArrayOfOneTimestamps;

    @JsonProperty("nullableArrayOfOneTimestamps")
    public org.joda.time.DateTime[] getNullableArrayOfOneTimestamps() {
        return nullableArrayOfOneTimestamps;
    }

    public NullableArrayOfOneTimestampsValue2 setNullableArrayOfOneTimestamps(
            final org.joda.time.DateTime[] value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableArrayOfOneTimestamps = value;

        return this;
    }
}
