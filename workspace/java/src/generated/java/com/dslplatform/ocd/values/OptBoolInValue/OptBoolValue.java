package com.dslplatform.ocd.values.OptBoolInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptBoolValue implements java.io.Serializable {
    public OptBoolValue(
            final Boolean optBool) {
        setOptBool(optBool);
    }

    public OptBoolValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 119562988;
        result = prime * result
                + (this.optBool != null ? this.optBool.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptBoolValue)) return false;
        final OptBoolValue other = (OptBoolValue) obj;

        if (!(this.optBool == other.optBool || this.optBool != null
                && this.optBool.equals(other.optBool))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptBoolValue(" + optBool + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Boolean optBool;

    @JsonProperty("optBool")
    public Boolean getOptBool() {
        return optBool;
    }

    public OptBoolValue setOptBool(final Boolean value) {
        this.optBool = value;

        return this;
    }
}
