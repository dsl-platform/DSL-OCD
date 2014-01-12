package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableStringsValue2 implements
        java.io.Serializable {
    public NullableArrayOfNullableStringsValue2(
            final String[] nullableArrayOfNullableStrings) {
        setNullableArrayOfNullableStrings(nullableArrayOfNullableStrings);
    }

    public NullableArrayOfNullableStringsValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1001056407;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableStringsValue2))
            return false;
        final NullableArrayOfNullableStringsValue2 other = (NullableArrayOfNullableStringsValue2) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableStrings,
                other.nullableArrayOfNullableStrings))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableStringsValue2("
                + nullableArrayOfNullableStrings + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private String[] nullableArrayOfNullableStrings;

    @JsonProperty("nullableArrayOfNullableStrings")
    public String[] getNullableArrayOfNullableStrings() {
        return nullableArrayOfNullableStrings;
    }

    public NullableArrayOfNullableStringsValue2 setNullableArrayOfNullableStrings(
            final String[] value) {
        this.nullableArrayOfNullableStrings = value;

        return this;
    }
}
