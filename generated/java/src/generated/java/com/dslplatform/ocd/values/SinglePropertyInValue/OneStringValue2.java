package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneStringValue2 implements java.io.Serializable {
    public OneStringValue2(
            final String oneString) {
        setOneString(oneString);
    }

    public OneStringValue2() {
        this.oneString = "";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 961499110;
        result = prime * result
                + (this.oneString != null ? this.oneString.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneStringValue2)) return false;
        final OneStringValue2 other = (OneStringValue2) obj;

        if (!(this.oneString.equals(other.oneString))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneStringValue2(" + oneString + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private String oneString;

    @JsonProperty("oneString")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String getOneString() {
        return oneString;
    }

    public OneStringValue2 setOneString(final String value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneString\" cannot be null!");
        this.oneString = value;

        return this;
    }
}
