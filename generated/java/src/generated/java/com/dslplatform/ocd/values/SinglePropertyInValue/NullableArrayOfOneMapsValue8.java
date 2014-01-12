package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneMapsValue8 implements java.io.Serializable {
    public NullableArrayOfOneMapsValue8(
            final java.util.Map<String, String>[] nullableArrayOfOneMaps) {
        setNullableArrayOfOneMaps(nullableArrayOfOneMaps);
    }

    public NullableArrayOfOneMapsValue8() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1598015415;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneMapsValue8)) return false;
        final NullableArrayOfOneMapsValue8 other = (NullableArrayOfOneMapsValue8) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfOneMaps,
                other.nullableArrayOfOneMaps))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneMapsValue8(" + nullableArrayOfOneMaps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Map<String, String>[] nullableArrayOfOneMaps;

    @JsonProperty("nullableArrayOfOneMaps")
    public java.util.Map<String, String>[] getNullableArrayOfOneMaps() {
        return nullableArrayOfOneMaps;
    }

    public NullableArrayOfOneMapsValue8 setNullableArrayOfOneMaps(
            final java.util.Map<String, String>[] value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableArrayOfOneMaps = value;

        return this;
    }
}
