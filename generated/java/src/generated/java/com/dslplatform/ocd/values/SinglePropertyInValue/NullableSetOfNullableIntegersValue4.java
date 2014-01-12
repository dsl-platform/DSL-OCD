package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableIntegersValue4 implements
        java.io.Serializable {
    public NullableSetOfNullableIntegersValue4(
            final java.util.Set<Integer> nullableSetOfNullableIntegers) {
        setNullableSetOfNullableIntegers(nullableSetOfNullableIntegers);
    }

    public NullableSetOfNullableIntegersValue4() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2020502187;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableIntegersValue4))
            return false;
        final NullableSetOfNullableIntegersValue4 other = (NullableSetOfNullableIntegersValue4) obj;

        if (!(this.nullableSetOfNullableIntegers == other.nullableSetOfNullableIntegers || this.nullableSetOfNullableIntegers != null
                && this.nullableSetOfNullableIntegers
                        .equals(other.nullableSetOfNullableIntegers)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableIntegersValue4("
                + nullableSetOfNullableIntegers + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Integer> nullableSetOfNullableIntegers;

    @JsonProperty("nullableSetOfNullableIntegers")
    public java.util.Set<Integer> getNullableSetOfNullableIntegers() {
        return nullableSetOfNullableIntegers;
    }

    public NullableSetOfNullableIntegersValue4 setNullableSetOfNullableIntegers(
            final java.util.Set<Integer> value) {
        this.nullableSetOfNullableIntegers = value;

        return this;
    }
}
