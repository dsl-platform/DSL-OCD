package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneIntegersValue2 implements
        java.io.Serializable {
    public NullableListOfOneIntegersValue2(
            final java.util.List<Integer> nullableListOfOneIntegers) {
        setNullableListOfOneIntegers(nullableListOfOneIntegers);
    }

    public NullableListOfOneIntegersValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 40278776;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneIntegersValue2)) return false;
        final NullableListOfOneIntegersValue2 other = (NullableListOfOneIntegersValue2) obj;

        if (!(this.nullableListOfOneIntegers == other.nullableListOfOneIntegers || this.nullableListOfOneIntegers != null
                && this.nullableListOfOneIntegers
                        .equals(other.nullableListOfOneIntegers)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneIntegersValue2(" + nullableListOfOneIntegers
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Integer> nullableListOfOneIntegers;

    @JsonProperty("nullableListOfOneIntegers")
    public java.util.List<Integer> getNullableListOfOneIntegers() {
        return nullableListOfOneIntegers;
    }

    public NullableListOfOneIntegersValue2 setNullableListOfOneIntegers(
            final java.util.List<Integer> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableListOfOneIntegers = value;

        return this;
    }
}
