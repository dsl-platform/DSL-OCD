package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneIntegersValue6 implements
        java.io.Serializable {
    public NullableListOfOneIntegersValue6(
            final java.util.List<Integer> nullableListOfOneIntegers) {
        setNullableListOfOneIntegers(nullableListOfOneIntegers);
    }

    public NullableListOfOneIntegersValue6() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 40278772;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneIntegersValue6)) return false;
        final NullableListOfOneIntegersValue6 other = (NullableListOfOneIntegersValue6) obj;

        if (!(this.nullableListOfOneIntegers == other.nullableListOfOneIntegers || this.nullableListOfOneIntegers != null
                && this.nullableListOfOneIntegers
                        .equals(other.nullableListOfOneIntegers)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneIntegersValue6(" + nullableListOfOneIntegers
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Integer> nullableListOfOneIntegers;

    @JsonProperty("nullableListOfOneIntegers")
    public java.util.List<Integer> getNullableListOfOneIntegers() {
        return nullableListOfOneIntegers;
    }

    public NullableListOfOneIntegersValue6 setNullableListOfOneIntegers(
            final java.util.List<Integer> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableListOfOneIntegers = value;

        return this;
    }
}
