package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableStrings_1 implements
        java.io.Serializable {
    public NullableSetOfNullableStrings_1(
            final java.util.Set<String> nullableSetOfNullableStrings) {
        setNullableSetOfNullableStrings(nullableSetOfNullableStrings);
    }

    public NullableSetOfNullableStrings_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 992272145;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableStrings_1)) return false;
        final NullableSetOfNullableStrings_1 other = (NullableSetOfNullableStrings_1) obj;

        if (!(this.nullableSetOfNullableStrings == other.nullableSetOfNullableStrings || this.nullableSetOfNullableStrings != null
                && this.nullableSetOfNullableStrings
                        .equals(other.nullableSetOfNullableStrings)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableStrings_1(" + nullableSetOfNullableStrings
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<String> nullableSetOfNullableStrings;

    @JsonProperty("nullableSetOfNullableStrings")
    public java.util.Set<String> getNullableSetOfNullableStrings() {
        return nullableSetOfNullableStrings;
    }

    public NullableSetOfNullableStrings_1 setNullableSetOfNullableStrings(
            final java.util.Set<String> value) {
        this.nullableSetOfNullableStrings = value;

        return this;
    }
}
