package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableTimestamps_5Grid implements
        Identifiable, java.io.Serializable {
    @JsonCreator
    public NullableSetOfNullableTimestamps_5Grid(
            @JsonProperty("URI") final String URI,
            @JsonProperty("nullableSetOfNullableTimestamps") final java.util.Set<org.joda.time.DateTime> nullableSetOfNullableTimestamps) {
        this.URI = URI;
        this.nullableSetOfNullableTimestamps = nullableSetOfNullableTimestamps;
    }

    private NullableSetOfNullableTimestamps_5Grid() {
        this.URI = null;
        this.nullableSetOfNullableTimestamps = null;
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
        final NullableSetOfNullableTimestamps_5Grid other = (NullableSetOfNullableTimestamps_5Grid) obj;

        return URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableTimestamps_5Grid(" + URI + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public static NullableSetOfNullableTimestamps_5Grid find(final String uri)
            throws java.io.IOException {
        return find(uri, null);
    }

    public static NullableSetOfNullableTimestamps_5Grid find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(NullableSetOfNullableTimestamps_5Grid.class, uri)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableSetOfNullableTimestamps_5Grid> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfNullableTimestamps_5Grid> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(NullableSetOfNullableTimestamps_5Grid.class, uris)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableSetOfNullableTimestamps_5Grid> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfNullableTimestamps_5Grid> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<NullableSetOfNullableTimestamps_5Grid> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfNullableTimestamps_5Grid> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(NullableSetOfNullableTimestamps_5Grid.class,
                            limit, offset, null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableSetOfNullableTimestamps_5Grid> search(
            final Specification<NullableSetOfNullableTimestamps_5Grid> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfNullableTimestamps_5Grid> search(
            final Specification<NullableSetOfNullableTimestamps_5Grid> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<NullableSetOfNullableTimestamps_5Grid> search(
            final Specification<NullableSetOfNullableTimestamps_5Grid> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfNullableTimestamps_5Grid> search(
            final Specification<NullableSetOfNullableTimestamps_5Grid> specification,
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
                    .count(NullableSetOfNullableTimestamps_5Grid.class).get()
                    .longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<NullableSetOfNullableTimestamps_5Grid> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<NullableSetOfNullableTimestamps_5Grid> specification,
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

    private final java.util.Set<org.joda.time.DateTime> nullableSetOfNullableTimestamps;

    public java.util.Set<org.joda.time.DateTime> getNullableSetOfNullableTimestamps() {
        return this.nullableSetOfNullableTimestamps;
    }
}
