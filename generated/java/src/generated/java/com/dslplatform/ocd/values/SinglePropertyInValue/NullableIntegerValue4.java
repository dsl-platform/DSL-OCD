package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableIntegerValue4 implements java.io.Serializable {
    public NullableIntegerValue4(
            final Integer nullableInteger) {
        setNullableInteger(nullableInteger);
    }

    public NullableIntegerValue4() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1325358452;
        result = prime
                * result
                + (this.nullableInteger != null ? this.nullableInteger
                        .hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableIntegerValue4)) return false;
        final NullableIntegerValue4 other = (NullableIntegerValue4) obj;

        if (!(this.nullableInteger == other.nullableInteger || this.nullableInteger != null
                && this.nullableInteger.equals(other.nullableInteger)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableIntegerValue4(" + nullableInteger + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Integer nullableInteger;

    @JsonProperty("nullableInteger")
    public Integer getNullableInteger() {
        return nullableInteger;
    }

    public NullableIntegerValue4 setNullableInteger(final Integer value) {
        this.nullableInteger = value;

        return this;
    }
}
