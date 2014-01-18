package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneTimestamps_1 implements
        java.io.Serializable {
    public NullableArrayOfOneTimestamps_1(
            final org.joda.time.DateTime[] nullableArrayOfOneTimestamps) {
        setNullableArrayOfOneTimestamps(nullableArrayOfOneTimestamps);
    }

    public NullableArrayOfOneTimestamps_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 70280946;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneTimestamps_1)) return false;
        final NullableArrayOfOneTimestamps_1 other = (NullableArrayOfOneTimestamps_1) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfOneTimestamps,
                other.nullableArrayOfOneTimestamps))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneTimestamps_1(" + nullableArrayOfOneTimestamps
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.joda.time.DateTime[] nullableArrayOfOneTimestamps;

    @JsonProperty("nullableArrayOfOneTimestamps")
    public org.joda.time.DateTime[] getNullableArrayOfOneTimestamps() {
        return nullableArrayOfOneTimestamps;
    }

    public NullableArrayOfOneTimestamps_1 setNullableArrayOfOneTimestamps(
            final org.joda.time.DateTime[] value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableArrayOfOneTimestamps = value;

        return this;
    }
}
