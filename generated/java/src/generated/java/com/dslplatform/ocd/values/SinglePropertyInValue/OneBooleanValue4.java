package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneBooleanValue4 implements java.io.Serializable {
    public OneBooleanValue4(
            final boolean oneBoolean) {
        setOneBoolean(oneBoolean);
    }

    public OneBooleanValue4() {
        this.oneBoolean = false;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1068742157;
        result = prime * result + (this.oneBoolean ? 1231 : 1237);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneBooleanValue4)) return false;
        final OneBooleanValue4 other = (OneBooleanValue4) obj;

        if (!(this.oneBoolean == other.oneBoolean)) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneBooleanValue4(" + oneBoolean + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private boolean oneBoolean;

    @JsonProperty("oneBoolean")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public boolean getOneBoolean() {
        return oneBoolean;
    }

    public OneBooleanValue4 setOneBoolean(final boolean value) {
        this.oneBoolean = value;

        return this;
    }
}
