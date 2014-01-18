package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneBooleans_1 implements java.io.Serializable {
    public NullableSetOfOneBooleans_1(
            final java.util.Set<Boolean> nullableSetOfOneBooleans) {
        setNullableSetOfOneBooleans(nullableSetOfOneBooleans);
    }

    public NullableSetOfOneBooleans_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1164090531;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneBooleans_1)) return false;
        final NullableSetOfOneBooleans_1 other = (NullableSetOfOneBooleans_1) obj;

        if (!(this.nullableSetOfOneBooleans == other.nullableSetOfOneBooleans || this.nullableSetOfOneBooleans != null
                && this.nullableSetOfOneBooleans
                        .equals(other.nullableSetOfOneBooleans))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneBooleans_1(" + nullableSetOfOneBooleans + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Boolean> nullableSetOfOneBooleans;

    @JsonProperty("nullableSetOfOneBooleans")
    public java.util.Set<Boolean> getNullableSetOfOneBooleans() {
        return nullableSetOfOneBooleans;
    }

    public NullableSetOfOneBooleans_1 setNullableSetOfOneBooleans(
            final java.util.Set<Boolean> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableSetOfOneBooleans = value;

        return this;
    }
}
