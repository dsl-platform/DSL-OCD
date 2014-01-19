package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneGuid_5 implements java.io.Serializable {
    public OneGuid_5(
            final java.util.UUID oneGuid,
            final java.util.UUID calculatedOneGuid,
            final java.util.UUID persistedOneGuid) {
        setOneGuid(oneGuid);
        this.calculatedOneGuid = calculatedOneGuid;
        this.persistedOneGuid = persistedOneGuid;
    }

    public OneGuid_5() {
        this.oneGuid = java.util.UUID.randomUUID();
        this.calculatedOneGuid = java.util.UUID.randomUUID();
        this.persistedOneGuid = java.util.UUID.randomUUID();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2127718483;
        result = prime * result
                + (this.oneGuid != null ? this.oneGuid.hashCode() : 0);
        result = prime
                * result
                + (this.calculatedOneGuid != null ? this.calculatedOneGuid
                        .hashCode() : 0);
        result = prime
                * result
                + (this.persistedOneGuid != null ? this.persistedOneGuid
                        .hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneGuid_5)) return false;
        final OneGuid_5 other = (OneGuid_5) obj;

        if (!(this.oneGuid.equals(other.oneGuid))) return false;
        if (!(this.calculatedOneGuid.equals(other.calculatedOneGuid)))
            return false;
        if (!(this.persistedOneGuid.equals(other.persistedOneGuid)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneGuid_5(" + oneGuid + ',' + calculatedOneGuid + ','
                + persistedOneGuid + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.UUID oneGuid;

    @JsonProperty("oneGuid")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.UUID getOneGuid() {
        return oneGuid;
    }

    public OneGuid_5 setOneGuid(final java.util.UUID value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneGuid\" cannot be null!");
        this.oneGuid = value;

        return this;
    }

    private final java.util.UUID calculatedOneGuid;

    public java.util.UUID getCalculatedOneGuid() {
        return this.calculatedOneGuid;
    }

    private final java.util.UUID persistedOneGuid;

    public java.util.UUID getPersistedOneGuid() {
        return this.persistedOneGuid;
    }
}
