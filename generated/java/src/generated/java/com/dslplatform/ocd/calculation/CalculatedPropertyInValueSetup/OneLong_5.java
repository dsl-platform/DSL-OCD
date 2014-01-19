package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneLong_5 implements java.io.Serializable {
    public OneLong_5(
            final long oneLong,
            final long calculatedOneLong,
            final long persistedOneLong) {
        setOneLong(oneLong);
        this.calculatedOneLong = calculatedOneLong;
        this.persistedOneLong = persistedOneLong;
    }

    public OneLong_5() {
        this.oneLong = 0L;
        this.calculatedOneLong = 0L;
        this.persistedOneLong = 0L;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 468850208;
        result = prime * result
                + ((int) (this.oneLong ^ (this.oneLong >>> 32)));
        result = prime
                * result
                + ((int) (this.calculatedOneLong ^ (this.calculatedOneLong >>> 32)));
        result = prime
                * result
                + ((int) (this.persistedOneLong ^ (this.persistedOneLong >>> 32)));
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneLong_5)) return false;
        final OneLong_5 other = (OneLong_5) obj;

        if (!(this.oneLong == other.oneLong)) return false;
        if (!(this.calculatedOneLong == other.calculatedOneLong)) return false;
        if (!(this.persistedOneLong == other.persistedOneLong)) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneLong_5(" + oneLong + ',' + calculatedOneLong + ','
                + persistedOneLong + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private long oneLong;

    @JsonProperty("oneLong")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public long getOneLong() {
        return oneLong;
    }

    public OneLong_5 setOneLong(final long value) {
        this.oneLong = value;

        return this;
    }

    private final long calculatedOneLong;

    public long getCalculatedOneLong() {
        return this.calculatedOneLong;
    }

    private final long persistedOneLong;

    public long getPersistedOneLong() {
        return this.persistedOneLong;
    }
}
