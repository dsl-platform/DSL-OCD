package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableIntegersValue6 implements
        java.io.Serializable {
    public NullableListOfNullableIntegersValue6(
            final java.util.List<Integer> nullableListOfNullableIntegers) {
        setNullableListOfNullableIntegers(nullableListOfNullableIntegers);
    }

    public NullableListOfNullableIntegersValue6() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1809310105;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableIntegersValue6))
            return false;
        final NullableListOfNullableIntegersValue6 other = (NullableListOfNullableIntegersValue6) obj;

        if (!(this.nullableListOfNullableIntegers == other.nullableListOfNullableIntegers || this.nullableListOfNullableIntegers != null
                && this.nullableListOfNullableIntegers
                        .equals(other.nullableListOfNullableIntegers)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableIntegersValue6("
                + nullableListOfNullableIntegers + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Integer> nullableListOfNullableIntegers;

    @JsonProperty("nullableListOfNullableIntegers")
    public java.util.List<Integer> getNullableListOfNullableIntegers() {
        return nullableListOfNullableIntegers;
    }

    public NullableListOfNullableIntegersValue6 setNullableListOfNullableIntegers(
            final java.util.List<Integer> value) {
        this.nullableListOfNullableIntegers = value;

        return this;
    }
}
