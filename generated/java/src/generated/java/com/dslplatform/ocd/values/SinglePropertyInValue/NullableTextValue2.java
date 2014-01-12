package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableTextValue2 implements java.io.Serializable {
    public NullableTextValue2(
            final String nullableText) {
        setNullableText(nullableText);
    }

    public NullableTextValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1590039733;
        result = prime
                * result
                + (this.nullableText != null ? this.nullableText.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableTextValue2)) return false;
        final NullableTextValue2 other = (NullableTextValue2) obj;

        if (!(this.nullableText == other.nullableText || this.nullableText != null
                && this.nullableText.equals(other.nullableText))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableTextValue2(" + nullableText + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private String nullableText;

    @JsonProperty("nullableText")
    public String getNullableText() {
        return nullableText;
    }

    public NullableTextValue2 setNullableText(final String value) {
        this.nullableText = value;

        return this;
    }
}
