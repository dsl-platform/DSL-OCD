package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneLongValue3 implements java.io.Serializable {
    public OneLongValue3(
            final long oneLong) {
        setOneLong(oneLong);
    }

    public OneLongValue3() {
        this.oneLong = 0L;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1816280238;
        result = prime * result
                + ((int) (this.oneLong ^ (this.oneLong >>> 32)));
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneLongValue3)) return false;
        final OneLongValue3 other = (OneLongValue3) obj;

        if (!(this.oneLong == other.oneLong)) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneLongValue3(" + oneLong + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private long oneLong;

    @JsonProperty("oneLong")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public long getOneLong() {
        return oneLong;
    }

    public OneLongValue3 setOneLong(final long value) {
        this.oneLong = value;

        return this;
    }
}
