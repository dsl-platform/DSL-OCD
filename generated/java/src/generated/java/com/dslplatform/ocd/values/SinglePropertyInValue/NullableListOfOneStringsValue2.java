package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneStringsValue2 implements
        java.io.Serializable {
    public NullableListOfOneStringsValue2(
            final java.util.List<String> nullableListOfOneStrings) {
        setNullableListOfOneStrings(nullableListOfOneStrings);
    }

    public NullableListOfOneStringsValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 267285383;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneStringsValue2)) return false;
        final NullableListOfOneStringsValue2 other = (NullableListOfOneStringsValue2) obj;

        if (!(this.nullableListOfOneStrings == other.nullableListOfOneStrings || this.nullableListOfOneStrings != null
                && this.nullableListOfOneStrings
                        .equals(other.nullableListOfOneStrings))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneStringsValue2(" + nullableListOfOneStrings
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<String> nullableListOfOneStrings;

    @JsonProperty("nullableListOfOneStrings")
    public java.util.List<String> getNullableListOfOneStrings() {
        return nullableListOfOneStrings;
    }

    public NullableListOfOneStringsValue2 setNullableListOfOneStrings(
            final java.util.List<String> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableListOfOneStrings = value;

        return this;
    }
}
