package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableBooleans_5 implements java.io.Serializable {
    public OneListOfNullableBooleans_5(
            final java.util.List<Boolean> oneListOfNullableBooleans,
            final java.util.List<Boolean> calculatedOneListOfNullableBooleans,
            final java.util.List<Boolean> persistedOneListOfNullableBooleans) {
        setOneListOfNullableBooleans(oneListOfNullableBooleans);
        this.calculatedOneListOfNullableBooleans = calculatedOneListOfNullableBooleans;
        this.persistedOneListOfNullableBooleans = persistedOneListOfNullableBooleans;
    }

    public OneListOfNullableBooleans_5() {
        this.oneListOfNullableBooleans = new java.util.ArrayList<Boolean>();
        this.calculatedOneListOfNullableBooleans = new java.util.ArrayList<Boolean>();
        this.persistedOneListOfNullableBooleans = new java.util.ArrayList<Boolean>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1162464529;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableBooleans_5)) return false;
        final OneListOfNullableBooleans_5 other = (OneListOfNullableBooleans_5) obj;

        if (!(this.oneListOfNullableBooleans
                .equals(other.oneListOfNullableBooleans))) return false;
        if (!(this.calculatedOneListOfNullableBooleans
                .equals(other.calculatedOneListOfNullableBooleans)))
            return false;
        if (!(this.persistedOneListOfNullableBooleans
                .equals(other.persistedOneListOfNullableBooleans)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableBooleans_5(" + oneListOfNullableBooleans + ','
                + calculatedOneListOfNullableBooleans + ','
                + persistedOneListOfNullableBooleans + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Boolean> oneListOfNullableBooleans;

    @JsonProperty("oneListOfNullableBooleans")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<Boolean> getOneListOfNullableBooleans() {
        return oneListOfNullableBooleans;
    }

    public OneListOfNullableBooleans_5 setOneListOfNullableBooleans(
            final java.util.List<Boolean> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableBooleans\" cannot be null!");
        this.oneListOfNullableBooleans = value;

        return this;
    }

    private final java.util.List<Boolean> calculatedOneListOfNullableBooleans;

    public java.util.List<Boolean> getCalculatedOneListOfNullableBooleans() {
        return this.calculatedOneListOfNullableBooleans;
    }

    private final java.util.List<Boolean> persistedOneListOfNullableBooleans;

    public java.util.List<Boolean> getPersistedOneListOfNullableBooleans() {
        return this.persistedOneListOfNullableBooleans;
    }
}
