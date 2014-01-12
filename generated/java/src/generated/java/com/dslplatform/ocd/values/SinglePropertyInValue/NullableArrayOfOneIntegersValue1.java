package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneIntegersValue1 implements
        java.io.Serializable {
    public NullableArrayOfOneIntegersValue1(
            final int[] nullableArrayOfOneIntegers) {
        setNullableArrayOfOneIntegers(nullableArrayOfOneIntegers);
    }

    public NullableArrayOfOneIntegersValue1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1683557768;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneIntegersValue1)) return false;
        final NullableArrayOfOneIntegersValue1 other = (NullableArrayOfOneIntegersValue1) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfOneIntegers,
                other.nullableArrayOfOneIntegers))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneIntegersValue1(" + nullableArrayOfOneIntegers
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private int[] nullableArrayOfOneIntegers;

    @JsonProperty("nullableArrayOfOneIntegers")
    public int[] getNullableArrayOfOneIntegers() {
        return nullableArrayOfOneIntegers;
    }

    public NullableArrayOfOneIntegersValue1 setNullableArrayOfOneIntegers(
            final int[] value) {
        this.nullableArrayOfOneIntegers = value;

        return this;
    }
}
