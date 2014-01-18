package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableString_1 implements java.io.Serializable {
    public NullableString_1(
            final String nullableString) {
        setNullableString(nullableString);
    }

    public NullableString_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1154461322;
        result = prime
                * result
                + (this.nullableString != null
                        ? this.nullableString.hashCode()
                        : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableString_1)) return false;
        final NullableString_1 other = (NullableString_1) obj;

        if (!(this.nullableString == other.nullableString || this.nullableString != null
                && this.nullableString.equals(other.nullableString)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableString_1(" + nullableString + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private String nullableString;

    @JsonProperty("nullableString")
    public String getNullableString() {
        return nullableString;
    }

    public NullableString_1 setNullableString(final String value) {
        this.nullableString = value;

        return this;
    }
}
