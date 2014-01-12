package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneStringsValue3 implements
        java.io.Serializable {
    public NullableArrayOfOneStringsValue3(
            final String[] nullableArrayOfOneStrings) {
        setNullableArrayOfOneStrings(nullableArrayOfOneStrings);
    }

    public NullableArrayOfOneStringsValue3() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 118293285;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneStringsValue3)) return false;
        final NullableArrayOfOneStringsValue3 other = (NullableArrayOfOneStringsValue3) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfOneStrings,
                other.nullableArrayOfOneStrings))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneStringsValue3(" + nullableArrayOfOneStrings
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private String[] nullableArrayOfOneStrings;

    @JsonProperty("nullableArrayOfOneStrings")
    public String[] getNullableArrayOfOneStrings() {
        return nullableArrayOfOneStrings;
    }

    public NullableArrayOfOneStringsValue3 setNullableArrayOfOneStrings(
            final String[] value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableArrayOfOneStrings = value;

        return this;
    }
}
