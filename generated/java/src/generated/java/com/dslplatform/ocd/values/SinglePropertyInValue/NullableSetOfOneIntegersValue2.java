package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneIntegersValue2 implements
        java.io.Serializable {
    public NullableSetOfOneIntegersValue2(
            final java.util.Set<Integer> nullableSetOfOneIntegers) {
        setNullableSetOfOneIntegers(nullableSetOfOneIntegers);
    }

    public NullableSetOfOneIntegersValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1051911186;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneIntegersValue2)) return false;
        final NullableSetOfOneIntegersValue2 other = (NullableSetOfOneIntegersValue2) obj;

        if (!(this.nullableSetOfOneIntegers == other.nullableSetOfOneIntegers || this.nullableSetOfOneIntegers != null
                && this.nullableSetOfOneIntegers
                        .equals(other.nullableSetOfOneIntegers))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneIntegersValue2(" + nullableSetOfOneIntegers
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Integer> nullableSetOfOneIntegers;

    @JsonProperty("nullableSetOfOneIntegers")
    public java.util.Set<Integer> getNullableSetOfOneIntegers() {
        return nullableSetOfOneIntegers;
    }

    public NullableSetOfOneIntegersValue2 setNullableSetOfOneIntegers(
            final java.util.Set<Integer> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableSetOfOneIntegers = value;

        return this;
    }
}
