package com.dslplatform.ocd.values.OptListOptBoolInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptListOptBoolValue implements java.io.Serializable {
    public OptListOptBoolValue(
            final java.util.List<Boolean> optListOptBool) {
        setOptListOptBool(optListOptBool);
    }

    public OptListOptBoolValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 921708673;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptListOptBoolValue)) return false;
        final OptListOptBoolValue other = (OptListOptBoolValue) obj;

        if (!(this.optListOptBool == other.optListOptBool || this.optListOptBool != null
                && this.optListOptBool.equals(other.optListOptBool)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptListOptBoolValue(" + optListOptBool + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Boolean> optListOptBool;

    @JsonProperty("optListOptBool")
    public java.util.List<Boolean> getOptListOptBool() {
        return optListOptBool;
    }

    public OptListOptBoolValue setOptListOptBool(
            final java.util.List<Boolean> value) {
        this.optListOptBool = value;

        return this;
    }
}
