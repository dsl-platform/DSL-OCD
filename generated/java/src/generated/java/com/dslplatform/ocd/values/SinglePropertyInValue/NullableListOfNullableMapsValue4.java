package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableMapsValue4 implements
        java.io.Serializable {
    public NullableListOfNullableMapsValue4(
            final java.util.List<java.util.Map<String, String>> nullableListOfNullableMaps) {
        setNullableListOfNullableMaps(nullableListOfNullableMaps);
    }

    public NullableListOfNullableMapsValue4() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 423085363;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableMapsValue4)) return false;
        final NullableListOfNullableMapsValue4 other = (NullableListOfNullableMapsValue4) obj;

        if (!(this.nullableListOfNullableMaps == other.nullableListOfNullableMaps || this.nullableListOfNullableMaps != null
                && this.nullableListOfNullableMaps
                        .equals(other.nullableListOfNullableMaps)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableMapsValue4(" + nullableListOfNullableMaps
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.util.Map<String, String>> nullableListOfNullableMaps;

    @JsonProperty("nullableListOfNullableMaps")
    public java.util.List<java.util.Map<String, String>> getNullableListOfNullableMaps() {
        return nullableListOfNullableMaps;
    }

    public NullableListOfNullableMapsValue4 setNullableListOfNullableMaps(
            final java.util.List<java.util.Map<String, String>> value) {
        this.nullableListOfNullableMaps = value;

        return this;
    }
}
