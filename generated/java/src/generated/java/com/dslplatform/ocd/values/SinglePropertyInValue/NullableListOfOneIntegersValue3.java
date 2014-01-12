package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneIntegersValue3 implements
        java.io.Serializable {
    public NullableListOfOneIntegersValue3(
            final java.util.List<Integer> nullableListOfOneIntegers) {
        setNullableListOfOneIntegers(nullableListOfOneIntegers);
    }

    public NullableListOfOneIntegersValue3() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 40278777;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneIntegersValue3)) return false;
        final NullableListOfOneIntegersValue3 other = (NullableListOfOneIntegersValue3) obj;

        if (!(this.nullableListOfOneIntegers == other.nullableListOfOneIntegers || this.nullableListOfOneIntegers != null
                && this.nullableListOfOneIntegers
                        .equals(other.nullableListOfOneIntegers)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneIntegersValue3(" + nullableListOfOneIntegers
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Integer> nullableListOfOneIntegers;

    @JsonProperty("nullableListOfOneIntegers")
    public java.util.List<Integer> getNullableListOfOneIntegers() {
        return nullableListOfOneIntegers;
    }

    public NullableListOfOneIntegersValue3 setNullableListOfOneIntegers(
            final java.util.List<Integer> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableListOfOneIntegers = value;

        return this;
    }
}
