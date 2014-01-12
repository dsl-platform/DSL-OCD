package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneMapsValue1 implements java.io.Serializable {
    public NullableListOfOneMapsValue1(
            final java.util.List<java.util.Map<String, String>> nullableListOfOneMaps) {
        setNullableListOfOneMaps(nullableListOfOneMaps);
    }

    public NullableListOfOneMapsValue1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2144169405;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneMapsValue1)) return false;
        final NullableListOfOneMapsValue1 other = (NullableListOfOneMapsValue1) obj;

        if (!(this.nullableListOfOneMaps == other.nullableListOfOneMaps || this.nullableListOfOneMaps != null
                && this.nullableListOfOneMaps
                        .equals(other.nullableListOfOneMaps))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneMapsValue1(" + nullableListOfOneMaps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.util.Map<String, String>> nullableListOfOneMaps;

    @JsonProperty("nullableListOfOneMaps")
    public java.util.List<java.util.Map<String, String>> getNullableListOfOneMaps() {
        return nullableListOfOneMaps;
    }

    public NullableListOfOneMapsValue1 setNullableListOfOneMaps(
            final java.util.List<java.util.Map<String, String>> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableListOfOneMaps = value;

        return this;
    }
}
