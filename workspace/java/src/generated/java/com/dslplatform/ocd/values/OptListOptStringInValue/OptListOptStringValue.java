package com.dslplatform.ocd.values.OptListOptStringInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptListOptStringValue implements java.io.Serializable {
    public OptListOptStringValue(
            final java.util.List<String> optListOptString) {
        setOptListOptString(optListOptString);
    }

    public OptListOptStringValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 994703646;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptListOptStringValue)) return false;
        final OptListOptStringValue other = (OptListOptStringValue) obj;

        if (!(this.optListOptString == other.optListOptString || this.optListOptString != null
                && this.optListOptString.equals(other.optListOptString)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptListOptStringValue(" + optListOptString + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<String> optListOptString;

    @JsonProperty("optListOptString")
    public java.util.List<String> getOptListOptString() {
        return optListOptString;
    }

    public OptListOptStringValue setOptListOptString(
            final java.util.List<String> value) {
        this.optListOptString = value;

        return this;
    }
}
