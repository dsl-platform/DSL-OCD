package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableStringsValue3 implements
        java.io.Serializable {
    public NullableListOfNullableStringsValue3(
            final java.util.List<String> nullableListOfNullableStrings) {
        setNullableListOfNullableStrings(nullableListOfNullableStrings);
    }

    public NullableListOfNullableStringsValue3() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1100293909;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableStringsValue3))
            return false;
        final NullableListOfNullableStringsValue3 other = (NullableListOfNullableStringsValue3) obj;

        if (!(this.nullableListOfNullableStrings == other.nullableListOfNullableStrings || this.nullableListOfNullableStrings != null
                && this.nullableListOfNullableStrings
                        .equals(other.nullableListOfNullableStrings)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableStringsValue3("
                + nullableListOfNullableStrings + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<String> nullableListOfNullableStrings;

    @JsonProperty("nullableListOfNullableStrings")
    public java.util.List<String> getNullableListOfNullableStrings() {
        return nullableListOfNullableStrings;
    }

    public NullableListOfNullableStringsValue3 setNullableListOfNullableStrings(
            final java.util.List<String> value) {
        this.nullableListOfNullableStrings = value;

        return this;
    }
}
