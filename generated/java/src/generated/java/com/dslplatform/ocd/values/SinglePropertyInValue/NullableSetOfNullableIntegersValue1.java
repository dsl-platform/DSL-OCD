package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableIntegersValue1 implements
        java.io.Serializable {
    public NullableSetOfNullableIntegersValue1(
            final java.util.Set<Integer> nullableSetOfNullableIntegers) {
        setNullableSetOfNullableIntegers(nullableSetOfNullableIntegers);
    }

    public NullableSetOfNullableIntegersValue1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2020502182;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableIntegersValue1))
            return false;
        final NullableSetOfNullableIntegersValue1 other = (NullableSetOfNullableIntegersValue1) obj;

        if (!(this.nullableSetOfNullableIntegers == other.nullableSetOfNullableIntegers || this.nullableSetOfNullableIntegers != null
                && this.nullableSetOfNullableIntegers
                        .equals(other.nullableSetOfNullableIntegers)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableIntegersValue1("
                + nullableSetOfNullableIntegers + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Integer> nullableSetOfNullableIntegers;

    @JsonProperty("nullableSetOfNullableIntegers")
    public java.util.Set<Integer> getNullableSetOfNullableIntegers() {
        return nullableSetOfNullableIntegers;
    }

    public NullableSetOfNullableIntegersValue1 setNullableSetOfNullableIntegers(
            final java.util.Set<Integer> value) {
        this.nullableSetOfNullableIntegers = value;

        return this;
    }
}
