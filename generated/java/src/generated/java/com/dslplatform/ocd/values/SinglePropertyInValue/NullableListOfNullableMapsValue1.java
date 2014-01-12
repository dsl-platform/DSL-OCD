package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableMapsValue1 implements
        java.io.Serializable {
    public NullableListOfNullableMapsValue1(
            final java.util.List<java.util.Map<String, String>> nullableListOfNullableMaps) {
        setNullableListOfNullableMaps(nullableListOfNullableMaps);
    }

    public NullableListOfNullableMapsValue1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 19800836;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableMapsValue1)) return false;
        final NullableListOfNullableMapsValue1 other = (NullableListOfNullableMapsValue1) obj;

        if (!(this.nullableListOfNullableMaps == other.nullableListOfNullableMaps || this.nullableListOfNullableMaps != null
                && this.nullableListOfNullableMaps
                        .equals(other.nullableListOfNullableMaps)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableMapsValue1(" + nullableListOfNullableMaps
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.util.Map<String, String>> nullableListOfNullableMaps;

    @JsonProperty("nullableListOfNullableMaps")
    public java.util.List<java.util.Map<String, String>> getNullableListOfNullableMaps() {
        return nullableListOfNullableMaps;
    }

    public NullableListOfNullableMapsValue1 setNullableListOfNullableMaps(
            final java.util.List<java.util.Map<String, String>> value) {
        this.nullableListOfNullableMaps = value;

        return this;
    }
}
