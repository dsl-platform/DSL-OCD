package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableInteger_1 implements java.io.Serializable {
    public NullableInteger_1(
            final Integer nullableInteger) {
        setNullableInteger(nullableInteger);
    }

    public NullableInteger_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 247848549;
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

        if (!(obj instanceof NullableInteger_1)) return false;
        final NullableInteger_1 other = (NullableInteger_1) obj;

        if (!(this.nullableInteger == other.nullableInteger || this.nullableInteger != null
                && this.nullableInteger.equals(other.nullableInteger)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableInteger_1(" + nullableInteger + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Integer nullableInteger;

    @JsonProperty("nullableInteger")
    public Integer getNullableInteger() {
        return nullableInteger;
    }

    public NullableInteger_1 setNullableInteger(final Integer value) {
        this.nullableInteger = value;

        return this;
    }
}
