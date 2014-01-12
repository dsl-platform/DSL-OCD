package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableMapsValue6 implements
        java.io.Serializable {
    public NullableListOfNullableMapsValue6(
            final java.util.List<java.util.Map<String, String>> nullableListOfNullableMaps) {
        setNullableListOfNullableMaps(nullableListOfNullableMaps);
    }

    public NullableListOfNullableMapsValue6() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 739714051;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableMapsValue6)) return false;
        final NullableListOfNullableMapsValue6 other = (NullableListOfNullableMapsValue6) obj;

        if (!(this.nullableListOfNullableMaps == other.nullableListOfNullableMaps || this.nullableListOfNullableMaps != null
                && this.nullableListOfNullableMaps
                        .equals(other.nullableListOfNullableMaps)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableMapsValue6(" + nullableListOfNullableMaps
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.util.Map<String, String>> nullableListOfNullableMaps;

    @JsonProperty("nullableListOfNullableMaps")
    public java.util.List<java.util.Map<String, String>> getNullableListOfNullableMaps() {
        return nullableListOfNullableMaps;
    }

    public NullableListOfNullableMapsValue6 setNullableListOfNullableMaps(
            final java.util.List<java.util.Map<String, String>> value) {
        this.nullableListOfNullableMaps = value;

        return this;
    }
}
