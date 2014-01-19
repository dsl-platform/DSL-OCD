package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableBooleans_5 implements java.io.Serializable {
    public OneSetOfNullableBooleans_5(
            final java.util.Set<Boolean> oneSetOfNullableBooleans,
            final java.util.Set<Boolean> calculatedOneSetOfNullableBooleans,
            final java.util.Set<Boolean> persistedOneSetOfNullableBooleans) {
        setOneSetOfNullableBooleans(oneSetOfNullableBooleans);
        this.calculatedOneSetOfNullableBooleans = calculatedOneSetOfNullableBooleans;
        this.persistedOneSetOfNullableBooleans = persistedOneSetOfNullableBooleans;
    }

    public OneSetOfNullableBooleans_5() {
        this.oneSetOfNullableBooleans = new java.util.HashSet<Boolean>();
        this.calculatedOneSetOfNullableBooleans = new java.util.HashSet<Boolean>();
        this.persistedOneSetOfNullableBooleans = new java.util.HashSet<Boolean>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 508882845;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableBooleans_5)) return false;
        final OneSetOfNullableBooleans_5 other = (OneSetOfNullableBooleans_5) obj;

        if (!(this.oneSetOfNullableBooleans
                .equals(other.oneSetOfNullableBooleans))) return false;
        if (!(this.calculatedOneSetOfNullableBooleans
                .equals(other.calculatedOneSetOfNullableBooleans)))
            return false;
        if (!(this.persistedOneSetOfNullableBooleans
                .equals(other.persistedOneSetOfNullableBooleans)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableBooleans_5(" + oneSetOfNullableBooleans + ','
                + calculatedOneSetOfNullableBooleans + ','
                + persistedOneSetOfNullableBooleans + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Boolean> oneSetOfNullableBooleans;

    @JsonProperty("oneSetOfNullableBooleans")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<Boolean> getOneSetOfNullableBooleans() {
        return oneSetOfNullableBooleans;
    }

    public OneSetOfNullableBooleans_5 setOneSetOfNullableBooleans(
            final java.util.Set<Boolean> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableBooleans\" cannot be null!");
        this.oneSetOfNullableBooleans = value;

        return this;
    }

    private final java.util.Set<Boolean> calculatedOneSetOfNullableBooleans;

    public java.util.Set<Boolean> getCalculatedOneSetOfNullableBooleans() {
        return this.calculatedOneSetOfNullableBooleans;
    }

    private final java.util.Set<Boolean> persistedOneSetOfNullableBooleans;

    public java.util.Set<Boolean> getPersistedOneSetOfNullableBooleans() {
        return this.persistedOneSetOfNullableBooleans;
    }
}
