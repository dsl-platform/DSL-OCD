package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneDecimalValue1 implements java.io.Serializable {
    public OneDecimalValue1(
            final java.math.BigDecimal oneDecimal) {
        setOneDecimal(oneDecimal);
    }

    public OneDecimalValue1() {
        this.oneDecimal = java.math.BigDecimal.ZERO;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1387210683;
        result = prime * result + (0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneDecimalValue1)) return false;
        final OneDecimalValue1 other = (OneDecimalValue1) obj;

        if (!(this.oneDecimal == other.oneDecimal || this.oneDecimal != null
                && this.oneDecimal.compareTo(other.oneDecimal) == 0))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneDecimalValue1(" + oneDecimal + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.math.BigDecimal oneDecimal;

    @JsonProperty("oneDecimal")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.math.BigDecimal getOneDecimal() {
        return oneDecimal;
    }

    public OneDecimalValue1 setOneDecimal(final java.math.BigDecimal value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneDecimal\" cannot be null!");
        this.oneDecimal = value;

        return this;
    }
}
