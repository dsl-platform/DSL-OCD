package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableStringsValue2 implements
        java.io.Serializable {
    public NullableListOfNullableStringsValue2(
            final java.util.List<String> nullableListOfNullableStrings) {
        setNullableListOfNullableStrings(nullableListOfNullableStrings);
    }

    public NullableListOfNullableStringsValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1100293910;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableStringsValue2))
            return false;
        final NullableListOfNullableStringsValue2 other = (NullableListOfNullableStringsValue2) obj;

        if (!(this.nullableListOfNullableStrings == other.nullableListOfNullableStrings || this.nullableListOfNullableStrings != null
                && this.nullableListOfNullableStrings
                        .equals(other.nullableListOfNullableStrings)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableStringsValue2("
                + nullableListOfNullableStrings + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<String> nullableListOfNullableStrings;

    @JsonProperty("nullableListOfNullableStrings")
    public java.util.List<String> getNullableListOfNullableStrings() {
        return nullableListOfNullableStrings;
    }

    public NullableListOfNullableStringsValue2 setNullableListOfNullableStrings(
            final java.util.List<String> value) {
        this.nullableListOfNullableStrings = value;

        return this;
    }
}
