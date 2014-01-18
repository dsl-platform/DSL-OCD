package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneLongs_1 implements java.io.Serializable {
    public NullableArrayOfOneLongs_1(
            final long[] nullableArrayOfOneLongs) {
        setNullableArrayOfOneLongs(nullableArrayOfOneLongs);
    }

    public NullableArrayOfOneLongs_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 43799894;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneLongs_1)) return false;
        final NullableArrayOfOneLongs_1 other = (NullableArrayOfOneLongs_1) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfOneLongs,
                other.nullableArrayOfOneLongs))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneLongs_1(" + nullableArrayOfOneLongs + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private long[] nullableArrayOfOneLongs;

    @JsonProperty("nullableArrayOfOneLongs")
    public long[] getNullableArrayOfOneLongs() {
        return nullableArrayOfOneLongs;
    }

    public NullableArrayOfOneLongs_1 setNullableArrayOfOneLongs(
            final long[] value) {
        this.nullableArrayOfOneLongs = value;

        return this;
    }
}
