package com.dslplatform.ocd.values.OptStringInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptStringValue implements java.io.Serializable {
    public OptStringValue(
            final String optString) {
        setOptString(optString);
    }

    public OptStringValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1772610825;
        result = prime * result
                + (this.optString != null ? this.optString.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptStringValue)) return false;
        final OptStringValue other = (OptStringValue) obj;

        if (!(this.optString == other.optString || this.optString != null
                && this.optString.equals(other.optString))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptStringValue(" + optString + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private String optString;

    @JsonProperty("optString")
    public String getOptString() {
        return optString;
    }

    public OptStringValue setOptString(final String value) {
        this.optString = value;

        return this;
    }
}
