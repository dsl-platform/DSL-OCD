package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableBooleanValue5 implements java.io.Serializable {
    public NullableBooleanValue5(
            final Boolean nullableBoolean) {
        setNullableBoolean(nullableBoolean);
    }

    public NullableBooleanValue5() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 245849621;
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

        if (!(obj instanceof NullableBooleanValue5)) return false;
        final NullableBooleanValue5 other = (NullableBooleanValue5) obj;

        if (!(this.nullableBoolean == other.nullableBoolean || this.nullableBoolean != null
                && this.nullableBoolean.equals(other.nullableBoolean)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableBooleanValue5(" + nullableBoolean + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Boolean nullableBoolean;

    @JsonProperty("nullableBoolean")
    public Boolean getNullableBoolean() {
        return nullableBoolean;
    }

    public NullableBooleanValue5 setNullableBoolean(final Boolean value) {
        this.nullableBoolean = value;

        return this;
    }
}
