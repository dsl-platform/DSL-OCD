package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneBooleans_5 implements java.io.Serializable {
    public OneSetOfOneBooleans_5(
            final java.util.Set<Boolean> oneSetOfOneBooleans,
            final java.util.Set<Boolean> calculatedOneSetOfOneBooleans,
            final java.util.Set<Boolean> persistedOneSetOfOneBooleans) {
        setOneSetOfOneBooleans(oneSetOfOneBooleans);
        this.calculatedOneSetOfOneBooleans = calculatedOneSetOfOneBooleans;
        this.persistedOneSetOfOneBooleans = persistedOneSetOfOneBooleans;
    }

    public OneSetOfOneBooleans_5() {
        this.oneSetOfOneBooleans = new java.util.HashSet<Boolean>();
        this.calculatedOneSetOfOneBooleans = new java.util.HashSet<Boolean>();
        this.persistedOneSetOfOneBooleans = new java.util.HashSet<Boolean>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2040475300;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneBooleans_5)) return false;
        final OneSetOfOneBooleans_5 other = (OneSetOfOneBooleans_5) obj;

        if (!(this.oneSetOfOneBooleans.equals(other.oneSetOfOneBooleans)))
            return false;
        if (!(this.calculatedOneSetOfOneBooleans
                .equals(other.calculatedOneSetOfOneBooleans))) return false;
        if (!(this.persistedOneSetOfOneBooleans
                .equals(other.persistedOneSetOfOneBooleans))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneBooleans_5(" + oneSetOfOneBooleans + ','
                + calculatedOneSetOfOneBooleans + ','
                + persistedOneSetOfOneBooleans + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Boolean> oneSetOfOneBooleans;

    @JsonProperty("oneSetOfOneBooleans")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<Boolean> getOneSetOfOneBooleans() {
        return oneSetOfOneBooleans;
    }

    public OneSetOfOneBooleans_5 setOneSetOfOneBooleans(
            final java.util.Set<Boolean> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneBooleans\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneSetOfOneBooleans = value;

        return this;
    }

    private final java.util.Set<Boolean> calculatedOneSetOfOneBooleans;

    public java.util.Set<Boolean> getCalculatedOneSetOfOneBooleans() {
        return this.calculatedOneSetOfOneBooleans;
    }

    private final java.util.Set<Boolean> persistedOneSetOfOneBooleans;

    public java.util.Set<Boolean> getPersistedOneSetOfOneBooleans() {
        return this.persistedOneSetOfOneBooleans;
    }
}
