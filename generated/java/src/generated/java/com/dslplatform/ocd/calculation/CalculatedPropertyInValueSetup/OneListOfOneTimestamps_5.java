package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneTimestamps_5 implements java.io.Serializable {
    public OneListOfOneTimestamps_5(
            final java.util.List<org.joda.time.DateTime> oneListOfOneTimestamps,
            final java.util.List<org.joda.time.DateTime> calculatedOneListOfOneTimestamps,
            final java.util.List<org.joda.time.DateTime> persistedOneListOfOneTimestamps) {
        setOneListOfOneTimestamps(oneListOfOneTimestamps);
        this.calculatedOneListOfOneTimestamps = calculatedOneListOfOneTimestamps;
        this.persistedOneListOfOneTimestamps = persistedOneListOfOneTimestamps;
    }

    public OneListOfOneTimestamps_5() {
        this.oneListOfOneTimestamps = new java.util.ArrayList<org.joda.time.DateTime>();
        this.calculatedOneListOfOneTimestamps = new java.util.ArrayList<org.joda.time.DateTime>();
        this.persistedOneListOfOneTimestamps = new java.util.ArrayList<org.joda.time.DateTime>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1710549896;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneTimestamps_5)) return false;
        final OneListOfOneTimestamps_5 other = (OneListOfOneTimestamps_5) obj;

        if (!(this.oneListOfOneTimestamps.equals(other.oneListOfOneTimestamps)))
            return false;
        if (!(this.calculatedOneListOfOneTimestamps
                .equals(other.calculatedOneListOfOneTimestamps))) return false;
        if (!(this.persistedOneListOfOneTimestamps
                .equals(other.persistedOneListOfOneTimestamps))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneTimestamps_5(" + oneListOfOneTimestamps + ','
                + calculatedOneListOfOneTimestamps + ','
                + persistedOneListOfOneTimestamps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<org.joda.time.DateTime> oneListOfOneTimestamps;

    @JsonProperty("oneListOfOneTimestamps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<org.joda.time.DateTime> getOneListOfOneTimestamps() {
        return oneListOfOneTimestamps;
    }

    public OneListOfOneTimestamps_5 setOneListOfOneTimestamps(
            final java.util.List<org.joda.time.DateTime> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneTimestamps\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneListOfOneTimestamps = value;

        return this;
    }

    private final java.util.List<org.joda.time.DateTime> calculatedOneListOfOneTimestamps;

    public java.util.List<org.joda.time.DateTime> getCalculatedOneListOfOneTimestamps() {
        return this.calculatedOneListOfOneTimestamps;
    }

    private final java.util.List<org.joda.time.DateTime> persistedOneListOfOneTimestamps;

    public java.util.List<org.joda.time.DateTime> getPersistedOneListOfOneTimestamps() {
        return this.persistedOneListOfOneTimestamps;
    }
}
