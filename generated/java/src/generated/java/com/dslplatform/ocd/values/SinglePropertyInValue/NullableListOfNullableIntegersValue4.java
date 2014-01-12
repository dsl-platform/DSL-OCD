package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableIntegersValue4 implements
        java.io.Serializable {
    public NullableListOfNullableIntegersValue4(
            final java.util.List<Integer> nullableListOfNullableIntegers) {
        setNullableListOfNullableIntegers(nullableListOfNullableIntegers);
    }

    public NullableListOfNullableIntegersValue4() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1322857777;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableIntegersValue4))
            return false;
        final NullableListOfNullableIntegersValue4 other = (NullableListOfNullableIntegersValue4) obj;

        if (!(this.nullableListOfNullableIntegers == other.nullableListOfNullableIntegers || this.nullableListOfNullableIntegers != null
                && this.nullableListOfNullableIntegers
                        .equals(other.nullableListOfNullableIntegers)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableIntegersValue4("
                + nullableListOfNullableIntegers + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Integer> nullableListOfNullableIntegers;

    @JsonProperty("nullableListOfNullableIntegers")
    public java.util.List<Integer> getNullableListOfNullableIntegers() {
        return nullableListOfNullableIntegers;
    }

    public NullableListOfNullableIntegersValue4 setNullableListOfNullableIntegers(
            final java.util.List<Integer> value) {
        this.nullableListOfNullableIntegers = value;

        return this;
    }
}
