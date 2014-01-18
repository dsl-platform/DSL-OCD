package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneIntegers_1 implements java.io.Serializable {
    public NullableArrayOfOneIntegers_1(
            final int[] nullableArrayOfOneIntegers) {
        setNullableArrayOfOneIntegers(nullableArrayOfOneIntegers);
    }

    public NullableArrayOfOneIntegers_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 933278844;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneIntegers_1)) return false;
        final NullableArrayOfOneIntegers_1 other = (NullableArrayOfOneIntegers_1) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfOneIntegers,
                other.nullableArrayOfOneIntegers))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneIntegers_1(" + nullableArrayOfOneIntegers
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private int[] nullableArrayOfOneIntegers;

    @JsonProperty("nullableArrayOfOneIntegers")
    public int[] getNullableArrayOfOneIntegers() {
        return nullableArrayOfOneIntegers;
    }

    public NullableArrayOfOneIntegers_1 setNullableArrayOfOneIntegers(
            final int[] value) {
        this.nullableArrayOfOneIntegers = value;

        return this;
    }
}
