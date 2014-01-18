package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableStrings_1 implements
        java.io.Serializable {
    public NullableListOfNullableStrings_1(
            final java.util.List<String> nullableListOfNullableStrings) {
        setNullableListOfNullableStrings(nullableListOfNullableStrings);
    }

    public NullableListOfNullableStrings_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 247576255;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableStrings_1)) return false;
        final NullableListOfNullableStrings_1 other = (NullableListOfNullableStrings_1) obj;

        if (!(this.nullableListOfNullableStrings == other.nullableListOfNullableStrings || this.nullableListOfNullableStrings != null
                && this.nullableListOfNullableStrings
                        .equals(other.nullableListOfNullableStrings)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableStrings_1("
                + nullableListOfNullableStrings + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<String> nullableListOfNullableStrings;

    @JsonProperty("nullableListOfNullableStrings")
    public java.util.List<String> getNullableListOfNullableStrings() {
        return nullableListOfNullableStrings;
    }

    public NullableListOfNullableStrings_1 setNullableListOfNullableStrings(
            final java.util.List<String> value) {
        this.nullableListOfNullableStrings = value;

        return this;
    }
}
