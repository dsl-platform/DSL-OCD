package com.dslplatform.ocd.values.OneStringInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneStringValue implements java.io.Serializable {
    public OneStringValue(
            final String oneString) {
        setOneString(oneString);
    }

    public OneStringValue() {
        this.oneString = "";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 826581000;
        result = prime * result
                + (this.oneString != null ? this.oneString.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneStringValue)) return false;
        final OneStringValue other = (OneStringValue) obj;

        if (!(this.oneString.equals(other.oneString))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneStringValue(" + oneString + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private String oneString;

    @JsonProperty("oneString")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String getOneString() {
        return oneString;
    }

    public OneStringValue setOneString(final String value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneString\" cannot be null!");
        this.oneString = value;

        return this;
    }
}
