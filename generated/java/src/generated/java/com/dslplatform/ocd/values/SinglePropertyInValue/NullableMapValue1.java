package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableMapValue1 implements java.io.Serializable {
    public NullableMapValue1(
            final java.util.Map<String, String> nullableMap) {
        setNullableMap(nullableMap);
    }

    public NullableMapValue1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2121618187;
        result = prime * result
                + (this.nullableMap != null ? this.nullableMap.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableMapValue1)) return false;
        final NullableMapValue1 other = (NullableMapValue1) obj;

        if (!(this.nullableMap != null
                && this.nullableMap.equals(other.nullableMap) || this.nullableMap == null
                && other.nullableMap == null)) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableMapValue1(" + nullableMap + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Map<String, String> nullableMap;

    @JsonProperty("nullableMap")
    public java.util.Map<String, String> getNullableMap() {
        return nullableMap;
    }

    public NullableMapValue1 setNullableMap(
            final java.util.Map<String, String> value) {
        this.nullableMap = value;

        return this;
    }
}
