package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneMaps_1 implements java.io.Serializable {
    public NullableListOfOneMaps_1(
            final java.util.List<java.util.Map<String, String>> nullableListOfOneMaps) {
        setNullableListOfOneMaps(nullableListOfOneMaps);
    }

    public NullableListOfOneMaps_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1314489809;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneMaps_1)) return false;
        final NullableListOfOneMaps_1 other = (NullableListOfOneMaps_1) obj;

        if (!(this.nullableListOfOneMaps == other.nullableListOfOneMaps || this.nullableListOfOneMaps != null
                && this.nullableListOfOneMaps
                        .equals(other.nullableListOfOneMaps))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneMaps_1(" + nullableListOfOneMaps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.util.Map<String, String>> nullableListOfOneMaps;

    @JsonProperty("nullableListOfOneMaps")
    public java.util.List<java.util.Map<String, String>> getNullableListOfOneMaps() {
        return nullableListOfOneMaps;
    }

    public NullableListOfOneMaps_1 setNullableListOfOneMaps(
            final java.util.List<java.util.Map<String, String>> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableListOfOneMaps = value;

        return this;
    }
}
