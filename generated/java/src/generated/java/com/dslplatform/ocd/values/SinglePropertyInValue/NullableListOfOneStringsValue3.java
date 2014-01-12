package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneStringsValue3 implements
        java.io.Serializable {
    public NullableListOfOneStringsValue3(
            final java.util.List<String> nullableListOfOneStrings) {
        setNullableListOfOneStrings(nullableListOfOneStrings);
    }

    public NullableListOfOneStringsValue3() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1298798558;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneStringsValue3)) return false;
        final NullableListOfOneStringsValue3 other = (NullableListOfOneStringsValue3) obj;

        if (!(this.nullableListOfOneStrings == other.nullableListOfOneStrings || this.nullableListOfOneStrings != null
                && this.nullableListOfOneStrings
                        .equals(other.nullableListOfOneStrings))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneStringsValue3(" + nullableListOfOneStrings
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<String> nullableListOfOneStrings;

    @JsonProperty("nullableListOfOneStrings")
    public java.util.List<String> getNullableListOfOneStrings() {
        return nullableListOfOneStrings;
    }

    public NullableListOfOneStringsValue3 setNullableListOfOneStrings(
            final java.util.List<String> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableListOfOneStrings = value;

        return this;
    }
}
