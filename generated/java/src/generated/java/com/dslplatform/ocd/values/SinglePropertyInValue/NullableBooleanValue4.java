package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableBooleanValue4 implements java.io.Serializable {
    public NullableBooleanValue4(
            final Boolean nullableBoolean) {
        setNullableBoolean(nullableBoolean);
    }

    public NullableBooleanValue4() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 245849622;
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

        if (!(obj instanceof NullableBooleanValue4)) return false;
        final NullableBooleanValue4 other = (NullableBooleanValue4) obj;

        if (!(this.nullableBoolean == other.nullableBoolean || this.nullableBoolean != null
                && this.nullableBoolean.equals(other.nullableBoolean)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableBooleanValue4(" + nullableBoolean + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Boolean nullableBoolean;

    @JsonProperty("nullableBoolean")
    public Boolean getNullableBoolean() {
        return nullableBoolean;
    }

    public NullableBooleanValue4 setNullableBoolean(final Boolean value) {
        this.nullableBoolean = value;

        return this;
    }
}
