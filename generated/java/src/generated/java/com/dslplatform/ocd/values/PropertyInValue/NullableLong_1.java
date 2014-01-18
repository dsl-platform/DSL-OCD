package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableLong_1 implements java.io.Serializable {
    public NullableLong_1(
            final Long nullableLong) {
        setNullableLong(nullableLong);
    }

    public NullableLong_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1456643329;
        result = prime
                * result
                + (this.nullableLong != null ? this.nullableLong.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableLong_1)) return false;
        final NullableLong_1 other = (NullableLong_1) obj;

        if (!(this.nullableLong == other.nullableLong || this.nullableLong != null
                && this.nullableLong.equals(other.nullableLong))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableLong_1(" + nullableLong + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Long nullableLong;

    @JsonProperty("nullableLong")
    public Long getNullableLong() {
        return nullableLong;
    }

    public NullableLong_1 setNullableLong(final Long value) {
        this.nullableLong = value;

        return this;
    }
}
