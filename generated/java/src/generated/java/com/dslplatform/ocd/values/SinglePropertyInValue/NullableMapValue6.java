package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableMapValue6 implements java.io.Serializable {
    public NullableMapValue6(
            final java.util.Map<String, String> nullableMap) {
        setNullableMap(nullableMap);
    }

    public NullableMapValue6() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2121618190;
        result = prime * result
                + (this.nullableMap != null ? this.nullableMap.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableMapValue6)) return false;
        final NullableMapValue6 other = (NullableMapValue6) obj;

        if (!(this.nullableMap != null
                && this.nullableMap.equals(other.nullableMap) || this.nullableMap == null
                && other.nullableMap == null)) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableMapValue6(" + nullableMap + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Map<String, String> nullableMap;

    @JsonProperty("nullableMap")
    public java.util.Map<String, String> getNullableMap() {
        return nullableMap;
    }

    public NullableMapValue6 setNullableMap(
            final java.util.Map<String, String> value) {
        this.nullableMap = value;

        return this;
    }
}
