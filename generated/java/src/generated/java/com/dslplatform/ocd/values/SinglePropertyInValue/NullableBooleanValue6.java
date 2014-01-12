package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableBooleanValue6 implements java.io.Serializable {
    public NullableBooleanValue6(
            final Boolean nullableBoolean) {
        setNullableBoolean(nullableBoolean);
    }

    public NullableBooleanValue6() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 245849620;
        result = prime
                * result
                + (this.nullableBoolean != null ? this.nullableBoolean
                        .hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableBooleanValue6)) return false;
        final NullableBooleanValue6 other = (NullableBooleanValue6) obj;

        if (!(this.nullableBoolean == other.nullableBoolean || this.nullableBoolean != null
                && this.nullableBoolean.equals(other.nullableBoolean)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableBooleanValue6(" + nullableBoolean + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Boolean nullableBoolean;

    @JsonProperty("nullableBoolean")
    public Boolean getNullableBoolean() {
        return nullableBoolean;
    }

    public NullableBooleanValue6 setNullableBoolean(final Boolean value) {
        this.nullableBoolean = value;

        return this;
    }
}
