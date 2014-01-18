package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableText_1 implements java.io.Serializable {
    public NullableText_1(
            final String nullableText) {
        setNullableText(nullableText);
    }

    public NullableText_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 377006208;
        result = prime
                * result
                + (this.nullableText != null ? this.nullableText.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableText_1)) return false;
        final NullableText_1 other = (NullableText_1) obj;

        if (!(this.nullableText == other.nullableText || this.nullableText != null
                && this.nullableText.equals(other.nullableText))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableText_1(" + nullableText + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private String nullableText;

    @JsonProperty("nullableText")
    public String getNullableText() {
        return nullableText;
    }

    public NullableText_1 setNullableText(final String value) {
        this.nullableText = value;

        return this;
    }
}
