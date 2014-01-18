package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneMaps_1 implements java.io.Serializable {
    public NullableSetOfOneMaps_1(
            final java.util.Set<java.util.Map<String, String>> nullableSetOfOneMaps) {
        setNullableSetOfOneMaps(nullableSetOfOneMaps);
    }

    public NullableSetOfOneMaps_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 552044225;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneMaps_1)) return false;
        final NullableSetOfOneMaps_1 other = (NullableSetOfOneMaps_1) obj;

        if (!(this.nullableSetOfOneMaps == other.nullableSetOfOneMaps || this.nullableSetOfOneMaps != null
                && this.nullableSetOfOneMaps.equals(other.nullableSetOfOneMaps)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneMaps_1(" + nullableSetOfOneMaps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.util.Map<String, String>> nullableSetOfOneMaps;

    @JsonProperty("nullableSetOfOneMaps")
    public java.util.Set<java.util.Map<String, String>> getNullableSetOfOneMaps() {
        return nullableSetOfOneMaps;
    }

    public NullableSetOfOneMaps_1 setNullableSetOfOneMaps(
            final java.util.Set<java.util.Map<String, String>> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableSetOfOneMaps = value;

        return this;
    }
}
