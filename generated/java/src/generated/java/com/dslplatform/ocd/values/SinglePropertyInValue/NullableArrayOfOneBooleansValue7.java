package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneBooleansValue7 implements
        java.io.Serializable {
    public NullableArrayOfOneBooleansValue7(
            final boolean[] nullableArrayOfOneBooleans) {
        setNullableArrayOfOneBooleans(nullableArrayOfOneBooleans);
    }

    public NullableArrayOfOneBooleansValue7() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2010321196;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneBooleansValue7)) return false;
        final NullableArrayOfOneBooleansValue7 other = (NullableArrayOfOneBooleansValue7) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfOneBooleans,
                other.nullableArrayOfOneBooleans))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneBooleansValue7(" + nullableArrayOfOneBooleans
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private boolean[] nullableArrayOfOneBooleans;

    @JsonProperty("nullableArrayOfOneBooleans")
    public boolean[] getNullableArrayOfOneBooleans() {
        return nullableArrayOfOneBooleans;
    }

    public NullableArrayOfOneBooleansValue7 setNullableArrayOfOneBooleans(
            final boolean[] value) {
        this.nullableArrayOfOneBooleans = value;

        return this;
    }
}
