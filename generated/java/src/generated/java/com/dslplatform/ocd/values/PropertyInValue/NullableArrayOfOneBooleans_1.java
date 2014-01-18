package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneBooleans_1 implements java.io.Serializable {
    public NullableArrayOfOneBooleans_1(
            final boolean[] nullableArrayOfOneBooleans) {
        setNullableArrayOfOneBooleans(nullableArrayOfOneBooleans);
    }

    public NullableArrayOfOneBooleans_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 775026830;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneBooleans_1)) return false;
        final NullableArrayOfOneBooleans_1 other = (NullableArrayOfOneBooleans_1) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfOneBooleans,
                other.nullableArrayOfOneBooleans))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneBooleans_1(" + nullableArrayOfOneBooleans
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private boolean[] nullableArrayOfOneBooleans;

    @JsonProperty("nullableArrayOfOneBooleans")
    public boolean[] getNullableArrayOfOneBooleans() {
        return nullableArrayOfOneBooleans;
    }

    public NullableArrayOfOneBooleans_1 setNullableArrayOfOneBooleans(
            final boolean[] value) {
        this.nullableArrayOfOneBooleans = value;

        return this;
    }
}
