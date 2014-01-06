package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneIntegerValue2 implements java.io.Serializable {
    public OneIntegerValue2(
            final int oneInteger) {
        setOneInteger(oneInteger);
    }

    public OneIntegerValue2() {
        this.oneInteger = 0;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 521917207;
        result = prime * result + (this.oneInteger);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneIntegerValue2)) return false;
        final OneIntegerValue2 other = (OneIntegerValue2) obj;

        if (!(this.oneInteger == other.oneInteger)) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneIntegerValue2(" + oneInteger + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private int oneInteger;

    @JsonProperty("oneInteger")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getOneInteger() {
        return oneInteger;
    }

    public OneIntegerValue2 setOneInteger(final int value) {
        this.oneInteger = value;

        return this;
    }
}
