package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneTimestamps_5 implements java.io.Serializable {
    public OneSetOfOneTimestamps_5(
            final java.util.Set<org.joda.time.DateTime> oneSetOfOneTimestamps,
            final java.util.Set<org.joda.time.DateTime> calculatedOneSetOfOneTimestamps,
            final java.util.Set<org.joda.time.DateTime> persistedOneSetOfOneTimestamps) {
        setOneSetOfOneTimestamps(oneSetOfOneTimestamps);
        this.calculatedOneSetOfOneTimestamps = calculatedOneSetOfOneTimestamps;
        this.persistedOneSetOfOneTimestamps = persistedOneSetOfOneTimestamps;
    }

    public OneSetOfOneTimestamps_5() {
        this.oneSetOfOneTimestamps = new java.util.HashSet<org.joda.time.DateTime>();
        this.calculatedOneSetOfOneTimestamps = new java.util.HashSet<org.joda.time.DateTime>();
        this.persistedOneSetOfOneTimestamps = new java.util.HashSet<org.joda.time.DateTime>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1919340796;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneTimestamps_5)) return false;
        final OneSetOfOneTimestamps_5 other = (OneSetOfOneTimestamps_5) obj;

        if (!(this.oneSetOfOneTimestamps.equals(other.oneSetOfOneTimestamps)))
            return false;
        if (!(this.calculatedOneSetOfOneTimestamps
                .equals(other.calculatedOneSetOfOneTimestamps))) return false;
        if (!(this.persistedOneSetOfOneTimestamps
                .equals(other.persistedOneSetOfOneTimestamps))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneTimestamps_5(" + oneSetOfOneTimestamps + ','
                + calculatedOneSetOfOneTimestamps + ','
                + persistedOneSetOfOneTimestamps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<org.joda.time.DateTime> oneSetOfOneTimestamps;

    @JsonProperty("oneSetOfOneTimestamps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<org.joda.time.DateTime> getOneSetOfOneTimestamps() {
        return oneSetOfOneTimestamps;
    }

    public OneSetOfOneTimestamps_5 setOneSetOfOneTimestamps(
            final java.util.Set<org.joda.time.DateTime> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneTimestamps\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneSetOfOneTimestamps = value;

        return this;
    }

    private final java.util.Set<org.joda.time.DateTime> calculatedOneSetOfOneTimestamps;

    public java.util.Set<org.joda.time.DateTime> getCalculatedOneSetOfOneTimestamps() {
        return this.calculatedOneSetOfOneTimestamps;
    }

    private final java.util.Set<org.joda.time.DateTime> persistedOneSetOfOneTimestamps;

    public java.util.Set<org.joda.time.DateTime> getPersistedOneSetOfOneTimestamps() {
        return this.persistedOneSetOfOneTimestamps;
    }
}
