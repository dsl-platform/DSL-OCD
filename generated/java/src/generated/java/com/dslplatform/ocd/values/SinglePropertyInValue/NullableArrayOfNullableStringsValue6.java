package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableStringsValue6 implements
        java.io.Serializable {
    public NullableArrayOfNullableStringsValue6(
            final String[] nullableArrayOfNullableStrings) {
        setNullableArrayOfNullableStrings(nullableArrayOfNullableStrings);
    }

    public NullableArrayOfNullableStringsValue6() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1324542421;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableStringsValue6))
            return false;
        final NullableArrayOfNullableStringsValue6 other = (NullableArrayOfNullableStringsValue6) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableStrings,
                other.nullableArrayOfNullableStrings))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableStringsValue6("
                + nullableArrayOfNullableStrings + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private String[] nullableArrayOfNullableStrings;

    @JsonProperty("nullableArrayOfNullableStrings")
    public String[] getNullableArrayOfNullableStrings() {
        return nullableArrayOfNullableStrings;
    }

    public NullableArrayOfNullableStringsValue6 setNullableArrayOfNullableStrings(
            final String[] value) {
        this.nullableArrayOfNullableStrings = value;

        return this;
    }
}
