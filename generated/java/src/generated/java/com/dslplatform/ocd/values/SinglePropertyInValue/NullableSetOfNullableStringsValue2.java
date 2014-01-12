package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableStringsValue2 implements
        java.io.Serializable {
    public NullableSetOfNullableStringsValue2(
            final java.util.Set<String> nullableSetOfNullableStrings) {
        setNullableSetOfNullableStrings(nullableSetOfNullableStrings);
    }

    public NullableSetOfNullableStringsValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1070199460;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableStringsValue2)) return false;
        final NullableSetOfNullableStringsValue2 other = (NullableSetOfNullableStringsValue2) obj;

        if (!(this.nullableSetOfNullableStrings == other.nullableSetOfNullableStrings || this.nullableSetOfNullableStrings != null
                && this.nullableSetOfNullableStrings
                        .equals(other.nullableSetOfNullableStrings)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableStringsValue2("
                + nullableSetOfNullableStrings + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<String> nullableSetOfNullableStrings;

    @JsonProperty("nullableSetOfNullableStrings")
    public java.util.Set<String> getNullableSetOfNullableStrings() {
        return nullableSetOfNullableStrings;
    }

    public NullableSetOfNullableStringsValue2 setNullableSetOfNullableStrings(
            final java.util.Set<String> value) {
        this.nullableSetOfNullableStrings = value;

        return this;
    }
}
