package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneIntegersValue4 implements
        java.io.Serializable {
    public NullableListOfOneIntegersValue4(
            final java.util.List<Integer> nullableListOfOneIntegers) {
        setNullableListOfOneIntegers(nullableListOfOneIntegers);
    }

    public NullableListOfOneIntegersValue4() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 40278774;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneIntegersValue4)) return false;
        final NullableListOfOneIntegersValue4 other = (NullableListOfOneIntegersValue4) obj;

        if (!(this.nullableListOfOneIntegers == other.nullableListOfOneIntegers || this.nullableListOfOneIntegers != null
                && this.nullableListOfOneIntegers
                        .equals(other.nullableListOfOneIntegers)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneIntegersValue4(" + nullableListOfOneIntegers
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Integer> nullableListOfOneIntegers;

    @JsonProperty("nullableListOfOneIntegers")
    public java.util.List<Integer> getNullableListOfOneIntegers() {
        return nullableListOfOneIntegers;
    }

    public NullableListOfOneIntegersValue4 setNullableListOfOneIntegers(
            final java.util.List<Integer> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableListOfOneIntegers = value;

        return this;
    }
}
