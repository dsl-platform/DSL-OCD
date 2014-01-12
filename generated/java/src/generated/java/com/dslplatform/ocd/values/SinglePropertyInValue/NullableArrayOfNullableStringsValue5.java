package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableStringsValue5 implements
        java.io.Serializable {
    public NullableArrayOfNullableStringsValue5(
            final String[] nullableArrayOfNullableStrings) {
        setNullableArrayOfNullableStrings(nullableArrayOfNullableStrings);
    }

    public NullableArrayOfNullableStringsValue5() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1404340934;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableStringsValue5))
            return false;
        final NullableArrayOfNullableStringsValue5 other = (NullableArrayOfNullableStringsValue5) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableStrings,
                other.nullableArrayOfNullableStrings))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableStringsValue5("
                + nullableArrayOfNullableStrings + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private String[] nullableArrayOfNullableStrings;

    @JsonProperty("nullableArrayOfNullableStrings")
    public String[] getNullableArrayOfNullableStrings() {
        return nullableArrayOfNullableStrings;
    }

    public NullableArrayOfNullableStringsValue5 setNullableArrayOfNullableStrings(
            final String[] value) {
        this.nullableArrayOfNullableStrings = value;

        return this;
    }
}
