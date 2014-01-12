package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableStringValue2 implements java.io.Serializable {
    public NullableStringValue2(
            final String nullableString) {
        setNullableString(nullableString);
    }

    public NullableStringValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1531956445;
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

        if (!(obj instanceof NullableStringValue2)) return false;
        final NullableStringValue2 other = (NullableStringValue2) obj;

        if (!(this.nullableString == other.nullableString || this.nullableString != null
                && this.nullableString.equals(other.nullableString)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableStringValue2(" + nullableString + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private String nullableString;

    @JsonProperty("nullableString")
    public String getNullableString() {
        return nullableString;
    }

    public NullableStringValue2 setNullableString(final String value) {
        this.nullableString = value;

        return this;
    }
}
