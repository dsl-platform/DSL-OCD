package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneLongs_1 implements java.io.Serializable {
    public NullableListOfOneLongs_1(
            final java.util.List<Long> nullableListOfOneLongs) {
        setNullableListOfOneLongs(nullableListOfOneLongs);
    }

    public NullableListOfOneLongs_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1317633747;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneLongs_1)) return false;
        final NullableListOfOneLongs_1 other = (NullableListOfOneLongs_1) obj;

        if (!(this.nullableListOfOneLongs == other.nullableListOfOneLongs || this.nullableListOfOneLongs != null
                && this.nullableListOfOneLongs
                        .equals(other.nullableListOfOneLongs))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneLongs_1(" + nullableListOfOneLongs + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Long> nullableListOfOneLongs;

    @JsonProperty("nullableListOfOneLongs")
    public java.util.List<Long> getNullableListOfOneLongs() {
        return nullableListOfOneLongs;
    }

    public NullableListOfOneLongs_1 setNullableListOfOneLongs(
            final java.util.List<Long> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableListOfOneLongs = value;

        return this;
    }
}
