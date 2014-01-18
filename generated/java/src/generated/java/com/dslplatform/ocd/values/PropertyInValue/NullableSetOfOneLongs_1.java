package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneLongs_1 implements java.io.Serializable {
    public NullableSetOfOneLongs_1(
            final java.util.Set<Long> nullableSetOfOneLongs) {
        setNullableSetOfOneLongs(nullableSetOfOneLongs);
    }

    public NullableSetOfOneLongs_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2081839967;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneLongs_1)) return false;
        final NullableSetOfOneLongs_1 other = (NullableSetOfOneLongs_1) obj;

        if (!(this.nullableSetOfOneLongs == other.nullableSetOfOneLongs || this.nullableSetOfOneLongs != null
                && this.nullableSetOfOneLongs
                        .equals(other.nullableSetOfOneLongs))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneLongs_1(" + nullableSetOfOneLongs + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Long> nullableSetOfOneLongs;

    @JsonProperty("nullableSetOfOneLongs")
    public java.util.Set<Long> getNullableSetOfOneLongs() {
        return nullableSetOfOneLongs;
    }

    public NullableSetOfOneLongs_1 setNullableSetOfOneLongs(
            final java.util.Set<Long> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableSetOfOneLongs = value;

        return this;
    }
}
