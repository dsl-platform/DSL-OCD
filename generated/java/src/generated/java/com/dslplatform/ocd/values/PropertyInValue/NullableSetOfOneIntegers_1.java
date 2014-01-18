package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneIntegers_1 implements java.io.Serializable {
    public NullableSetOfOneIntegers_1(
            final java.util.Set<Integer> nullableSetOfOneIntegers) {
        setNullableSetOfOneIntegers(nullableSetOfOneIntegers);
    }

    public NullableSetOfOneIntegers_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1308977147;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneIntegers_1)) return false;
        final NullableSetOfOneIntegers_1 other = (NullableSetOfOneIntegers_1) obj;

        if (!(this.nullableSetOfOneIntegers == other.nullableSetOfOneIntegers || this.nullableSetOfOneIntegers != null
                && this.nullableSetOfOneIntegers
                        .equals(other.nullableSetOfOneIntegers))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneIntegers_1(" + nullableSetOfOneIntegers + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Integer> nullableSetOfOneIntegers;

    @JsonProperty("nullableSetOfOneIntegers")
    public java.util.Set<Integer> getNullableSetOfOneIntegers() {
        return nullableSetOfOneIntegers;
    }

    public NullableSetOfOneIntegers_1 setNullableSetOfOneIntegers(
            final java.util.Set<Integer> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableSetOfOneIntegers = value;

        return this;
    }
}
