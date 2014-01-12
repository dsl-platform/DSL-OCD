package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableIntegersValue1 implements
        java.io.Serializable {
    public NullableArrayOfNullableIntegersValue1(
            final Integer[] nullableArrayOfNullableIntegers) {
        setNullableArrayOfNullableIntegers(nullableArrayOfNullableIntegers);
    }

    public NullableArrayOfNullableIntegersValue1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2038773509;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableIntegersValue1))
            return false;
        final NullableArrayOfNullableIntegersValue1 other = (NullableArrayOfNullableIntegersValue1) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableIntegers,
                other.nullableArrayOfNullableIntegers))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableIntegersValue1("
                + nullableArrayOfNullableIntegers + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Integer[] nullableArrayOfNullableIntegers;

    @JsonProperty("nullableArrayOfNullableIntegers")
    public Integer[] getNullableArrayOfNullableIntegers() {
        return nullableArrayOfNullableIntegers;
    }

    public NullableArrayOfNullableIntegersValue1 setNullableArrayOfNullableIntegers(
            final Integer[] value) {
        this.nullableArrayOfNullableIntegers = value;

        return this;
    }
}
