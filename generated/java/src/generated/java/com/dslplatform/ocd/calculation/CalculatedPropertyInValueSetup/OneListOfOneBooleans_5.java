package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneBooleans_5 implements java.io.Serializable {
    public OneListOfOneBooleans_5(
            final java.util.List<Boolean> oneListOfOneBooleans,
            final java.util.List<Boolean> calculatedOneListOfOneBooleans,
            final java.util.List<Boolean> persistedOneListOfOneBooleans) {
        setOneListOfOneBooleans(oneListOfOneBooleans);
        this.calculatedOneListOfOneBooleans = calculatedOneListOfOneBooleans;
        this.persistedOneListOfOneBooleans = persistedOneListOfOneBooleans;
    }

    public OneListOfOneBooleans_5() {
        this.oneListOfOneBooleans = new java.util.ArrayList<Boolean>();
        this.calculatedOneListOfOneBooleans = new java.util.ArrayList<Boolean>();
        this.persistedOneListOfOneBooleans = new java.util.ArrayList<Boolean>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 17391980;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneBooleans_5)) return false;
        final OneListOfOneBooleans_5 other = (OneListOfOneBooleans_5) obj;

        if (!(this.oneListOfOneBooleans.equals(other.oneListOfOneBooleans)))
            return false;
        if (!(this.calculatedOneListOfOneBooleans
                .equals(other.calculatedOneListOfOneBooleans))) return false;
        if (!(this.persistedOneListOfOneBooleans
                .equals(other.persistedOneListOfOneBooleans))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneBooleans_5(" + oneListOfOneBooleans + ','
                + calculatedOneListOfOneBooleans + ','
                + persistedOneListOfOneBooleans + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Boolean> oneListOfOneBooleans;

    @JsonProperty("oneListOfOneBooleans")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<Boolean> getOneListOfOneBooleans() {
        return oneListOfOneBooleans;
    }

    public OneListOfOneBooleans_5 setOneListOfOneBooleans(
            final java.util.List<Boolean> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneBooleans\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneListOfOneBooleans = value;

        return this;
    }

    private final java.util.List<Boolean> calculatedOneListOfOneBooleans;

    public java.util.List<Boolean> getCalculatedOneListOfOneBooleans() {
        return this.calculatedOneListOfOneBooleans;
    }

    private final java.util.List<Boolean> persistedOneListOfOneBooleans;

    public java.util.List<Boolean> getPersistedOneListOfOneBooleans() {
        return this.persistedOneListOfOneBooleans;
    }
}
