package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneStringsValue2 implements
        java.io.Serializable {
    public NullableSetOfOneStringsValue2(
            final java.util.Set<String> nullableSetOfOneStrings) {
        setNullableSetOfOneStrings(nullableSetOfOneStrings);
    }

    public NullableSetOfOneStringsValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1668377973;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneStringsValue2)) return false;
        final NullableSetOfOneStringsValue2 other = (NullableSetOfOneStringsValue2) obj;

        if (!(this.nullableSetOfOneStrings == other.nullableSetOfOneStrings || this.nullableSetOfOneStrings != null
                && this.nullableSetOfOneStrings
                        .equals(other.nullableSetOfOneStrings))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneStringsValue2(" + nullableSetOfOneStrings + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<String> nullableSetOfOneStrings;

    @JsonProperty("nullableSetOfOneStrings")
    public java.util.Set<String> getNullableSetOfOneStrings() {
        return nullableSetOfOneStrings;
    }

    public NullableSetOfOneStringsValue2 setNullableSetOfOneStrings(
            final java.util.Set<String> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableSetOfOneStrings = value;

        return this;
    }
}
