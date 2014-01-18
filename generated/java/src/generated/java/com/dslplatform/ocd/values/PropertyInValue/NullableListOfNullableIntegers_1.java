package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableIntegers_1 implements
        java.io.Serializable {
    public NullableListOfNullableIntegers_1(
            final java.util.List<Integer> nullableListOfNullableIntegers) {
        setNullableListOfNullableIntegers(nullableListOfNullableIntegers);
    }

    public NullableListOfNullableIntegers_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 128313924;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableIntegers_1)) return false;
        final NullableListOfNullableIntegers_1 other = (NullableListOfNullableIntegers_1) obj;

        if (!(this.nullableListOfNullableIntegers == other.nullableListOfNullableIntegers || this.nullableListOfNullableIntegers != null
                && this.nullableListOfNullableIntegers
                        .equals(other.nullableListOfNullableIntegers)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableIntegers_1("
                + nullableListOfNullableIntegers + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Integer> nullableListOfNullableIntegers;

    @JsonProperty("nullableListOfNullableIntegers")
    public java.util.List<Integer> getNullableListOfNullableIntegers() {
        return nullableListOfNullableIntegers;
    }

    public NullableListOfNullableIntegers_1 setNullableListOfNullableIntegers(
            final java.util.List<Integer> value) {
        this.nullableListOfNullableIntegers = value;

        return this;
    }
}
