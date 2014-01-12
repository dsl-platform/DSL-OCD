package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableIntegersValue9 implements
        java.io.Serializable {
    public NullableArrayOfNullableIntegersValue9(
            final Integer[] nullableArrayOfNullableIntegers) {
        setNullableArrayOfNullableIntegers(nullableArrayOfNullableIntegers);
    }

    public NullableArrayOfNullableIntegersValue9() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2038773501;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableIntegersValue9))
            return false;
        final NullableArrayOfNullableIntegersValue9 other = (NullableArrayOfNullableIntegersValue9) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableIntegers,
                other.nullableArrayOfNullableIntegers))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableIntegersValue9("
                + nullableArrayOfNullableIntegers + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Integer[] nullableArrayOfNullableIntegers;

    @JsonProperty("nullableArrayOfNullableIntegers")
    public Integer[] getNullableArrayOfNullableIntegers() {
        return nullableArrayOfNullableIntegers;
    }

    public NullableArrayOfNullableIntegersValue9 setNullableArrayOfNullableIntegers(
            final Integer[] value) {
        this.nullableArrayOfNullableIntegers = value;

        return this;
    }
}
