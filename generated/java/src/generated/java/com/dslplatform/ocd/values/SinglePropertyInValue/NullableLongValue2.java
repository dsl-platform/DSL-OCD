package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableLongValue2 implements java.io.Serializable {
    public NullableLongValue2(
            final Long nullableLong) {
        setNullableLong(nullableLong);
    }

    public NullableLongValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1412167072;
        result = prime
                * result
                + (this.nullableLong != null ? this.nullableLong.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableLongValue2)) return false;
        final NullableLongValue2 other = (NullableLongValue2) obj;

        if (!(this.nullableLong == other.nullableLong || this.nullableLong != null
                && this.nullableLong.equals(other.nullableLong))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableLongValue2(" + nullableLong + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Long nullableLong;

    @JsonProperty("nullableLong")
    public Long getNullableLong() {
        return nullableLong;
    }

    public NullableLongValue2 setNullableLong(final Long value) {
        this.nullableLong = value;

        return this;
    }
}
