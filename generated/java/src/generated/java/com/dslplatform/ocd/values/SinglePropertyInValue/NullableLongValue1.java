package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableLongValue1 implements java.io.Serializable {
    public NullableLongValue1(
            final Long nullableLong) {
        setNullableLong(nullableLong);
    }

    public NullableLongValue1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 153916869;
        result = prime
                * result
                + (this.nullableLong != null ? this.nullableLong.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableLongValue1)) return false;
        final NullableLongValue1 other = (NullableLongValue1) obj;

        if (!(this.nullableLong == other.nullableLong || this.nullableLong != null
                && this.nullableLong.equals(other.nullableLong))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableLongValue1(" + nullableLong + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Long nullableLong;

    @JsonProperty("nullableLong")
    public Long getNullableLong() {
        return nullableLong;
    }

    public NullableLongValue1 setNullableLong(final Long value) {
        this.nullableLong = value;

        return this;
    }
}
