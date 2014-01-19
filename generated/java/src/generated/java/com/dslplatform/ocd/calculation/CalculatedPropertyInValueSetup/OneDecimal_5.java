package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneDecimal_5 implements java.io.Serializable {
    public OneDecimal_5(
            final java.math.BigDecimal oneDecimal,
            final java.math.BigDecimal calculatedOneDecimal,
            final java.math.BigDecimal persistedOneDecimal) {
        setOneDecimal(oneDecimal);
        this.calculatedOneDecimal = calculatedOneDecimal;
        this.persistedOneDecimal = persistedOneDecimal;
    }

    public OneDecimal_5() {
        this.oneDecimal = java.math.BigDecimal.ZERO;
        this.calculatedOneDecimal = java.math.BigDecimal.ZERO;
        this.persistedOneDecimal = java.math.BigDecimal.ZERO;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2064927563;
        result = prime * result + (0);
        result = prime * result + (0);
        result = prime * result + (0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneDecimal_5)) return false;
        final OneDecimal_5 other = (OneDecimal_5) obj;

        if (!(this.oneDecimal == other.oneDecimal || this.oneDecimal != null
                && this.oneDecimal.compareTo(other.oneDecimal) == 0))
            return false;
        if (!(this.calculatedOneDecimal == other.calculatedOneDecimal || this.calculatedOneDecimal != null
                && this.calculatedOneDecimal
                        .compareTo(other.calculatedOneDecimal) == 0))
            return false;
        if (!(this.persistedOneDecimal == other.persistedOneDecimal || this.persistedOneDecimal != null
                && this.persistedOneDecimal
                        .compareTo(other.persistedOneDecimal) == 0))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneDecimal_5(" + oneDecimal + ',' + calculatedOneDecimal + ','
                + persistedOneDecimal + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.math.BigDecimal oneDecimal;

    @JsonProperty("oneDecimal")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.math.BigDecimal getOneDecimal() {
        return oneDecimal;
    }

    public OneDecimal_5 setOneDecimal(final java.math.BigDecimal value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneDecimal\" cannot be null!");
        this.oneDecimal = value;

        return this;
    }

    private final java.math.BigDecimal calculatedOneDecimal;

    public java.math.BigDecimal getCalculatedOneDecimal() {
        return this.calculatedOneDecimal;
    }

    private final java.math.BigDecimal persistedOneDecimal;

    public java.math.BigDecimal getPersistedOneDecimal() {
        return this.persistedOneDecimal;
    }
}
