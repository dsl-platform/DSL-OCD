package com.dslplatform.ocd.values.OptArrayStringInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptArrayStringValue implements java.io.Serializable {
    public OptArrayStringValue(
            final String[] optArrayString) {
        setOptArrayString(optArrayString);
    }

    public OptArrayStringValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 77117778;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptArrayStringValue)) return false;
        final OptArrayStringValue other = (OptArrayStringValue) obj;

        if (!(java.util.Arrays
                .equals(this.optArrayString, other.optArrayString)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptArrayStringValue(" + optArrayString + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private String[] optArrayString;

    @JsonProperty("optArrayString")
    public String[] getOptArrayString() {
        return optArrayString;
    }

    public OptArrayStringValue setOptArrayString(final String[] value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.optArrayString = value;

        return this;
    }
}
