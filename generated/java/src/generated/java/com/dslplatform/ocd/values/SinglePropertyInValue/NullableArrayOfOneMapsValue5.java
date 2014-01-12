package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneMapsValue5 implements java.io.Serializable {
    public NullableArrayOfOneMapsValue5(
            final java.util.Map<String, String>[] nullableArrayOfOneMaps) {
        setNullableArrayOfOneMaps(nullableArrayOfOneMaps);
    }

    public NullableArrayOfOneMapsValue5() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1550961248;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneMapsValue5)) return false;
        final NullableArrayOfOneMapsValue5 other = (NullableArrayOfOneMapsValue5) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfOneMaps,
                other.nullableArrayOfOneMaps))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneMapsValue5(" + nullableArrayOfOneMaps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Map<String, String>[] nullableArrayOfOneMaps;

    @JsonProperty("nullableArrayOfOneMaps")
    public java.util.Map<String, String>[] getNullableArrayOfOneMaps() {
        return nullableArrayOfOneMaps;
    }

    public NullableArrayOfOneMapsValue5 setNullableArrayOfOneMaps(
            final java.util.Map<String, String>[] value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableArrayOfOneMaps = value;

        return this;
    }
}
