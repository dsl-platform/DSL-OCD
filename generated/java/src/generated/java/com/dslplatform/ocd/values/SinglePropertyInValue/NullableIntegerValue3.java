package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableIntegerValue3 implements java.io.Serializable {
    public NullableIntegerValue3(
            final Integer nullableInteger) {
        setNullableInteger(nullableInteger);
    }

    public NullableIntegerValue3() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1325358455;
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

        if (!(obj instanceof NullableIntegerValue3)) return false;
        final NullableIntegerValue3 other = (NullableIntegerValue3) obj;

        if (!(this.nullableInteger == other.nullableInteger || this.nullableInteger != null
                && this.nullableInteger.equals(other.nullableInteger)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableIntegerValue3(" + nullableInteger + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Integer nullableInteger;

    @JsonProperty("nullableInteger")
    public Integer getNullableInteger() {
        return nullableInteger;
    }

    public NullableIntegerValue3 setNullableInteger(final Integer value) {
        this.nullableInteger = value;

        return this;
    }
}
