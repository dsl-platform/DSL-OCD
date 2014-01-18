package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneStrings_1 implements java.io.Serializable {
    public NullableSetOfOneStrings_1(
            final java.util.Set<String> nullableSetOfOneStrings) {
        setNullableSetOfOneStrings(nullableSetOfOneStrings);
    }

    public NullableSetOfOneStrings_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1247069186;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneStrings_1)) return false;
        final NullableSetOfOneStrings_1 other = (NullableSetOfOneStrings_1) obj;

        if (!(this.nullableSetOfOneStrings == other.nullableSetOfOneStrings || this.nullableSetOfOneStrings != null
                && this.nullableSetOfOneStrings
                        .equals(other.nullableSetOfOneStrings))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneStrings_1(" + nullableSetOfOneStrings + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<String> nullableSetOfOneStrings;

    @JsonProperty("nullableSetOfOneStrings")
    public java.util.Set<String> getNullableSetOfOneStrings() {
        return nullableSetOfOneStrings;
    }

    public NullableSetOfOneStrings_1 setNullableSetOfOneStrings(
            final java.util.Set<String> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableSetOfOneStrings = value;

        return this;
    }
}
