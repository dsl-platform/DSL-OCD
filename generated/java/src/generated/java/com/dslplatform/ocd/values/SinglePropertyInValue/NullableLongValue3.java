package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableLongValue3 implements java.io.Serializable {
    public NullableLongValue3(
            final Long nullableLong) {
        setNullableLong(nullableLong);
    }

    public NullableLongValue3() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1316716283;
        result = prime
                * result
                + (this.nullableLong != null ? this.nullableLong.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableLongValue3)) return false;
        final NullableLongValue3 other = (NullableLongValue3) obj;

        if (!(this.nullableLong == other.nullableLong || this.nullableLong != null
                && this.nullableLong.equals(other.nullableLong))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableLongValue3(" + nullableLong + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Long nullableLong;

    @JsonProperty("nullableLong")
    public Long getNullableLong() {
        return nullableLong;
    }

    public NullableLongValue3 setNullableLong(final Long value) {
        this.nullableLong = value;

        return this;
    }
}
