package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneBooleanValue6 implements java.io.Serializable {
    public OneBooleanValue6(
            final boolean oneBoolean) {
        setOneBoolean(oneBoolean);
    }

    public OneBooleanValue6() {
        this.oneBoolean = false;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2063425725;
        result = prime * result + (this.oneBoolean ? 1231 : 1237);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneBooleanValue6)) return false;
        final OneBooleanValue6 other = (OneBooleanValue6) obj;

        if (!(this.oneBoolean == other.oneBoolean)) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneBooleanValue6(" + oneBoolean + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private boolean oneBoolean;

    @JsonProperty("oneBoolean")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public boolean getOneBoolean() {
        return oneBoolean;
    }

    public OneBooleanValue6 setOneBoolean(final boolean value) {
        this.oneBoolean = value;

        return this;
    }
}
