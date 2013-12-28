package com.dslplatform.ocd.values.OptArrayOptBoolInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptArrayOptBoolValue implements java.io.Serializable {
    public OptArrayOptBoolValue(
            final Boolean[] optArrayOptBool) {
        setOptArrayOptBool(optArrayOptBool);
    }

    public OptArrayOptBoolValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 818479246;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptArrayOptBoolValue)) return false;
        final OptArrayOptBoolValue other = (OptArrayOptBoolValue) obj;

        if (!(java.util.Arrays.equals(this.optArrayOptBool,
                other.optArrayOptBool))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptArrayOptBoolValue(" + optArrayOptBool + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Boolean[] optArrayOptBool;

    @JsonProperty("optArrayOptBool")
    public Boolean[] getOptArrayOptBool() {
        return optArrayOptBool;
    }

    public OptArrayOptBoolValue setOptArrayOptBool(final Boolean[] value) {
        this.optArrayOptBool = value;

        return this;
    }
}
