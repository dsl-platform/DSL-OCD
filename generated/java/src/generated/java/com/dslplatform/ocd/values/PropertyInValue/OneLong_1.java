package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneLong_1 implements java.io.Serializable {
    public OneLong_1(
            final long oneLong) {
        setOneLong(oneLong);
    }

    public OneLong_1() {
        this.oneLong = 0L;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 468850204;
        result = prime * result
                + ((int) (this.oneLong ^ (this.oneLong >>> 32)));
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneLong_1)) return false;
        final OneLong_1 other = (OneLong_1) obj;

        if (!(this.oneLong == other.oneLong)) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneLong_1(" + oneLong + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private long oneLong;

    @JsonProperty("oneLong")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public long getOneLong() {
        return oneLong;
    }

    public OneLong_1 setOneLong(final long value) {
        this.oneLong = value;

        return this;
    }
}
