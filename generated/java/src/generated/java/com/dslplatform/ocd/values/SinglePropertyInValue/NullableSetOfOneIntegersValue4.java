package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneIntegersValue4 implements
        java.io.Serializable {
    public NullableSetOfOneIntegersValue4(
            final java.util.Set<Integer> nullableSetOfOneIntegers) {
        setNullableSetOfOneIntegers(nullableSetOfOneIntegers);
    }

    public NullableSetOfOneIntegersValue4() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1858480240;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneIntegersValue4)) return false;
        final NullableSetOfOneIntegersValue4 other = (NullableSetOfOneIntegersValue4) obj;

        if (!(this.nullableSetOfOneIntegers == other.nullableSetOfOneIntegers || this.nullableSetOfOneIntegers != null
                && this.nullableSetOfOneIntegers
                        .equals(other.nullableSetOfOneIntegers))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneIntegersValue4(" + nullableSetOfOneIntegers
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Integer> nullableSetOfOneIntegers;

    @JsonProperty("nullableSetOfOneIntegers")
    public java.util.Set<Integer> getNullableSetOfOneIntegers() {
        return nullableSetOfOneIntegers;
    }

    public NullableSetOfOneIntegersValue4 setNullableSetOfOneIntegers(
            final java.util.Set<Integer> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableSetOfOneIntegers = value;

        return this;
    }
}
