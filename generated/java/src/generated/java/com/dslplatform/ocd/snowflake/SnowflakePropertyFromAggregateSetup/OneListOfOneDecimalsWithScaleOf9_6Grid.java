package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneDecimalsWithScaleOf9_6Grid implements
        Identifiable, java.io.Serializable {
    @JsonCreator
    public OneListOfOneDecimalsWithScaleOf9_6Grid(
            @JsonProperty("URI") final String URI,
            @JsonProperty("oneListOfOneDecimalsWithScaleOf9") final java.util.List<java.math.BigDecimal> oneListOfOneDecimalsWithScaleOf9) {
        this.URI = URI;
        this.oneListOfOneDecimalsWithScaleOf9 = oneListOfOneDecimalsWithScaleOf9;
        if (oneListOfOneDecimalsWithScaleOf9 == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneDecimalsWithScaleOf9\" cannot be null!");
        com.dslplatform.ocd.snowflake.Guards
                .checkNulls(oneListOfOneDecimalsWithScaleOf9);
        com.dslplatform.ocd.snowflake.Guards.checkScale(
                oneListOfOneDecimalsWithScaleOf9, 9);
    }

    private OneListOfOneDecimalsWithScaleOf9_6Grid() {
        this.URI = null;
        this.oneListOfOneDecimalsWithScaleOf9 = null;
    }

    private final String URI;

    public String getURI() {
        return this.URI;
    }

    @Override
    public int hashCode() {
        return URI.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (getClass() != obj.getClass()) return false;
        final OneListOfOneDecimalsWithScaleOf9_6Grid other = (OneListOfOneDecimalsWithScaleOf9_6Grid) obj;

        return URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return "OneListOfOneDecimalsWithScaleOf9_6Grid(" + URI + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public static OneListOfOneDecimalsWithScaleOf9_6Grid find(final String uri)
            throws java.io.IOException {
        return find(uri, null);
    }

    public static OneListOfOneDecimalsWithScaleOf9_6Grid find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(OneListOfOneDecimalsWithScaleOf9_6Grid.class, uri)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneListOfOneDecimalsWithScaleOf9_6Grid> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfOneDecimalsWithScaleOf9_6Grid> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(OneListOfOneDecimalsWithScaleOf9_6Grid.class, uris)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneListOfOneDecimalsWithScaleOf9_6Grid> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfOneDecimalsWithScaleOf9_6Grid> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<OneListOfOneDecimalsWithScaleOf9_6Grid> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfOneDecimalsWithScaleOf9_6Grid> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(OneListOfOneDecimalsWithScaleOf9_6Grid.class,
                            limit, offset, null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneListOfOneDecimalsWithScaleOf9_6Grid> search(
            final Specification<OneListOfOneDecimalsWithScaleOf9_6Grid> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfOneDecimalsWithScaleOf9_6Grid> search(
            final Specification<OneListOfOneDecimalsWithScaleOf9_6Grid> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<OneListOfOneDecimalsWithScaleOf9_6Grid> search(
            final Specification<OneListOfOneDecimalsWithScaleOf9_6Grid> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfOneDecimalsWithScaleOf9_6Grid> search(
            final Specification<OneListOfOneDecimalsWithScaleOf9_6Grid> specification,
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .search(specification, limit, offset, null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count() throws java.io.IOException {
        return count(Bootstrap.getLocator());
    }

    public static long count(final ServiceLocator locator)
            throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .count(OneListOfOneDecimalsWithScaleOf9_6Grid.class).get()
                    .longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<OneListOfOneDecimalsWithScaleOf9_6Grid> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<OneListOfOneDecimalsWithScaleOf9_6Grid> specification,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class).count(specification).get()
                    .longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private final java.util.List<java.math.BigDecimal> oneListOfOneDecimalsWithScaleOf9;

    public java.util.List<java.math.BigDecimal> getOneListOfOneDecimalsWithScaleOf9() {
        return this.oneListOfOneDecimalsWithScaleOf9;
    }
}
