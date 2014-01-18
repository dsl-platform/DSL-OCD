package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneStrings_1 implements java.io.Serializable {
    public NullableListOfOneStrings_1(
            final java.util.List<String> nullableListOfOneStrings) {
        setNullableListOfOneStrings(nullableListOfOneStrings);
    }

    public NullableListOfOneStrings_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 777792932;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneStrings_1)) return false;
        final NullableListOfOneStrings_1 other = (NullableListOfOneStrings_1) obj;

        if (!(this.nullableListOfOneStrings == other.nullableListOfOneStrings || this.nullableListOfOneStrings != null
                && this.nullableListOfOneStrings
                        .equals(other.nullableListOfOneStrings))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneStrings_1(" + nullableListOfOneStrings + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<String> nullableListOfOneStrings;

    @JsonProperty("nullableListOfOneStrings")
    public java.util.List<String> getNullableListOfOneStrings() {
        return nullableListOfOneStrings;
    }

    public NullableListOfOneStrings_1 setNullableListOfOneStrings(
            final java.util.List<String> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableListOfOneStrings = value;

        return this;
    }
}
