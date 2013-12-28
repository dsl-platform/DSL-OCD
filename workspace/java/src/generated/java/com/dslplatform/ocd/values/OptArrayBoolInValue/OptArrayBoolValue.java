package com.dslplatform.ocd.values.OptArrayBoolInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptArrayBoolValue implements java.io.Serializable {
    public OptArrayBoolValue(
            final boolean[] optArrayBool) {
        setOptArrayBool(optArrayBool);
    }

    public OptArrayBoolValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1090589369;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptArrayBoolValue)) return false;
        final OptArrayBoolValue other = (OptArrayBoolValue) obj;

        if (!(java.util.Arrays.equals(this.optArrayBool, other.optArrayBool)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptArrayBoolValue(" + optArrayBool + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private boolean[] optArrayBool;

    @JsonProperty("optArrayBool")
    public boolean[] getOptArrayBool() {
        return optArrayBool;
    }

    public OptArrayBoolValue setOptArrayBool(final boolean[] value) {
        this.optArrayBool = value;

        return this;
    }
}
