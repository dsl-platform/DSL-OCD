package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableLongs_1 implements
        java.io.Serializable {
    public NullableListOfNullableLongs_1(
            final java.util.List<Long> nullableListOfNullableLongs) {
        setNullableListOfNullableLongs(nullableListOfNullableLongs);
    }

    public NullableListOfNullableLongs_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 205630978;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableLongs_1)) return false;
        final NullableListOfNullableLongs_1 other = (NullableListOfNullableLongs_1) obj;

        if (!(this.nullableListOfNullableLongs == other.nullableListOfNullableLongs || this.nullableListOfNullableLongs != null
                && this.nullableListOfNullableLongs
                        .equals(other.nullableListOfNullableLongs)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableLongs_1(" + nullableListOfNullableLongs
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Long> nullableListOfNullableLongs;

    @JsonProperty("nullableListOfNullableLongs")
    public java.util.List<Long> getNullableListOfNullableLongs() {
        return nullableListOfNullableLongs;
    }

    public NullableListOfNullableLongs_1 setNullableListOfNullableLongs(
            final java.util.List<Long> value) {
        this.nullableListOfNullableLongs = value;

        return this;
    }
}
