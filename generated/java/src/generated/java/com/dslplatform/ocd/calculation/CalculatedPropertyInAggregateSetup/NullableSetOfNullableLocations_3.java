package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class NullableSetOfNullableLocations_3 implements java.io.Serializable,
        AggregateRoot {
    public NullableSetOfNullableLocations_3() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
    }

    private transient final ServiceLocator _serviceLocator;
    private transient final DomainProxy _domainProxy;
    private transient final CrudProxy _crudProxy;

    private String URI;

    @JsonProperty("URI")
    public String getURI() {
        return this.URI;
    }

    @Override
    public int hashCode() {
        return URI != null ? URI.hashCode() : super.hashCode();
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (getClass() != obj.getClass()) return false;
        final NullableSetOfNullableLocations_3 other = (NullableSetOfNullableLocations_3) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "NullableSetOfNullableLocations_3(" + URI + ')'
                : "new NullableSetOfNullableLocations_3(" + super.hashCode()
                        + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public NullableSetOfNullableLocations_3(
            final java.util.Set<java.awt.geom.Point2D> nullableSetOfNullableLocations) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setNullableSetOfNullableLocations(nullableSetOfNullableLocations);
    }

    @JsonCreator
    private NullableSetOfNullableLocations_3(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("nullableSetOfNullableLocations") final java.util.Set<java.awt.geom.Point2D> nullableSetOfNullableLocations,
            @JsonProperty("calculatedNullableSetOfNullableLocations") final java.util.Set<java.awt.geom.Point2D> calculatedNullableSetOfNullableLocations,
            @JsonProperty("persistedNullableSetOfNullableLocations") final java.util.Set<java.awt.geom.Point2D> persistedNullableSetOfNullableLocations) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.nullableSetOfNullableLocations = nullableSetOfNullableLocations;
        this.calculatedNullableSetOfNullableLocations = calculatedNullableSetOfNullableLocations == null
                ? new java.util.HashSet<java.awt.geom.Point2D>()
                : calculatedNullableSetOfNullableLocations;
        this.persistedNullableSetOfNullableLocations = persistedNullableSetOfNullableLocations == null
                ? new java.util.HashSet<java.awt.geom.Point2D>()
                : persistedNullableSetOfNullableLocations;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private NullableSetOfNullableLocations_3 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static NullableSetOfNullableLocations_3 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static NullableSetOfNullableLocations_3 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(NullableSetOfNullableLocations_3.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableSetOfNullableLocations_3> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfNullableLocations_3> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(NullableSetOfNullableLocations_3.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableSetOfNullableLocations_3> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfNullableLocations_3> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<NullableSetOfNullableLocations_3> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfNullableLocations_3> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(NullableSetOfNullableLocations_3.class, limit,
                            offset, null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableSetOfNullableLocations_3> search(
            final Specification<NullableSetOfNullableLocations_3> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfNullableLocations_3> search(
            final Specification<NullableSetOfNullableLocations_3> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<NullableSetOfNullableLocations_3> search(
            final Specification<NullableSetOfNullableLocations_3> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfNullableLocations_3> search(
            final Specification<NullableSetOfNullableLocations_3> specification,
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
                    .count(NullableSetOfNullableLocations_3.class).get()
                    .longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<NullableSetOfNullableLocations_3> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<NullableSetOfNullableLocations_3> specification,
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

    private void updateWithAnother(
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfNullableLocations_3 result) {
        this.URI = result.URI;

        this.nullableSetOfNullableLocations = result.nullableSetOfNullableLocations;
        this.calculatedNullableSetOfNullableLocations = result.calculatedNullableSetOfNullableLocations;
        this.persistedNullableSetOfNullableLocations = result.persistedNullableSetOfNullableLocations;
        this.ID = result.ID;
    }

    public NullableSetOfNullableLocations_3 persist()
            throws java.io.IOException {
        final NullableSetOfNullableLocations_3 result;
        try {
            result = this.URI == null
                    ? _crudProxy.create(this).get()
                    : _crudProxy.update(this).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
        this.updateWithAnother(result);
        return this;
    }

    public NullableSetOfNullableLocations_3 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(NullableSetOfNullableLocations_3.class,
                    URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.Set<java.awt.geom.Point2D> nullableSetOfNullableLocations;

    @JsonProperty("nullableSetOfNullableLocations")
    public java.util.Set<java.awt.geom.Point2D> getNullableSetOfNullableLocations() {
        return nullableSetOfNullableLocations;
    }

    public NullableSetOfNullableLocations_3 setNullableSetOfNullableLocations(
            final java.util.Set<java.awt.geom.Point2D> value) {
        this.nullableSetOfNullableLocations = value;

        return this;
    }

    private java.util.Set<java.awt.geom.Point2D> calculatedNullableSetOfNullableLocations;

    @JsonProperty("calculatedNullableSetOfNullableLocations")
    public java.util.Set<java.awt.geom.Point2D> getCalculatedNullableSetOfNullableLocations() {
        return this.calculatedNullableSetOfNullableLocations;
    }

    private java.util.Set<java.awt.geom.Point2D> persistedNullableSetOfNullableLocations;

    @JsonProperty("persistedNullableSetOfNullableLocations")
    public java.util.Set<java.awt.geom.Point2D> getPersistedNullableSetOfNullableLocations() {
        return this.persistedNullableSetOfNullableLocations;
    }
}
