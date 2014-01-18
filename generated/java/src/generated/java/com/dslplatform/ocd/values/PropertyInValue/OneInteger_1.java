package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneInteger_1 implements java.io.Serializable {
    public OneInteger_1(
            final int oneInteger) {
        setOneInteger(oneInteger);
    }

    public OneInteger_1() {
        this.oneInteger = 0;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 904794920;
        result = prime * result + (this.oneInteger);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneInteger_1)) return false;
        final OneInteger_1 other = (OneInteger_1) obj;

        if (!(this.oneInteger == other.oneInteger)) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneInteger_1(" + oneInteger + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private int oneInteger;

    @JsonProperty("oneInteger")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getOneInteger() {
        return oneInteger;
    }

    public OneInteger_1 setOneInteger(final int value) {
        this.oneInteger = value;

        return this;
    }
}
