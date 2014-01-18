package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class NullableListOfNullableLocations_3 implements java.io.Serializable,
        AggregateRoot {
    public NullableListOfNullableLocations_3() {
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
        final NullableListOfNullableLocations_3 other = (NullableListOfNullableLocations_3) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "NullableListOfNullableLocations_3(" + URI + ')'
                : "new NullableListOfNullableLocations_3(" + super.hashCode()
                        + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public NullableListOfNullableLocations_3(
            final java.util.List<java.awt.geom.Point2D> nullableListOfNullableLocations) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setNullableListOfNullableLocations(nullableListOfNullableLocations);
    }

    @JsonCreator
    private NullableListOfNullableLocations_3(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("nullableListOfNullableLocations") final java.util.List<java.awt.geom.Point2D> nullableListOfNullableLocations,
            @JsonProperty("calculatedNullableListOfNullableLocations") final java.util.List<java.awt.geom.Point2D> calculatedNullableListOfNullableLocations,
            @JsonProperty("persistedNullableListOfNullableLocations") final java.util.List<java.awt.geom.Point2D> persistedNullableListOfNullableLocations) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.nullableListOfNullableLocations = nullableListOfNullableLocations;
        this.calculatedNullableListOfNullableLocations = calculatedNullableListOfNullableLocations == null
                ? new java.util.ArrayList<java.awt.geom.Point2D>()
                : calculatedNullableListOfNullableLocations;
        this.persistedNullableListOfNullableLocations = persistedNullableListOfNullableLocations == null
                ? new java.util.ArrayList<java.awt.geom.Point2D>()
                : persistedNullableListOfNullableLocations;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private NullableListOfNullableLocations_3 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static NullableListOfNullableLocations_3 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static NullableListOfNullableLocations_3 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(NullableListOfNullableLocations_3.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableListOfNullableLocations_3> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<NullableListOfNullableLocations_3> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(NullableListOfNullableLocations_3.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableListOfNullableLocations_3> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableListOfNullableLocations_3> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<NullableListOfNullableLocations_3> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableListOfNullableLocations_3> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(NullableListOfNullableLocations_3.class, limit,
                            offset, null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableListOfNullableLocations_3> search(
            final Specification<NullableListOfNullableLocations_3> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableListOfNullableLocations_3> search(
            final Specification<NullableListOfNullableLocations_3> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<NullableListOfNullableLocations_3> search(
            final Specification<NullableListOfNullableLocations_3> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableListOfNullableLocations_3> search(
            final Specification<NullableListOfNullableLocations_3> specification,
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
                    .count(NullableListOfNullableLocations_3.class).get()
                    .longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<NullableListOfNullableLocations_3> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<NullableListOfNullableLocations_3> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfNullableLocations_3 result) {
        this.URI = result.URI;

        this.nullableListOfNullableLocations = result.nullableListOfNullableLocations;
        this.calculatedNullableListOfNullableLocations = result.calculatedNullableListOfNullableLocations;
        this.persistedNullableListOfNullableLocations = result.persistedNullableListOfNullableLocations;
        this.ID = result.ID;
    }

    public NullableListOfNullableLocations_3 persist()
            throws java.io.IOException {
        final NullableListOfNullableLocations_3 result;
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

    public NullableListOfNullableLocations_3 delete()
            throws java.io.IOException {
        try {
            return _crudProxy.delete(NullableListOfNullableLocations_3.class,
                    URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.List<java.awt.geom.Point2D> nullableListOfNullableLocations;

    @JsonProperty("nullableListOfNullableLocations")
    public java.util.List<java.awt.geom.Point2D> getNullableListOfNullableLocations() {
        return nullableListOfNullableLocations;
    }

    public NullableListOfNullableLocations_3 setNullableListOfNullableLocations(
            final java.util.List<java.awt.geom.Point2D> value) {
        this.nullableListOfNullableLocations = value;

        return this;
    }

    private java.util.List<java.awt.geom.Point2D> calculatedNullableListOfNullableLocations;

    @JsonProperty("calculatedNullableListOfNullableLocations")
    public java.util.List<java.awt.geom.Point2D> getCalculatedNullableListOfNullableLocations() {
        return this.calculatedNullableListOfNullableLocations;
    }

    private java.util.List<java.awt.geom.Point2D> persistedNullableListOfNullableLocations;

    @JsonProperty("persistedNullableListOfNullableLocations")
    public java.util.List<java.awt.geom.Point2D> getPersistedNullableListOfNullableLocations() {
        return this.persistedNullableListOfNullableLocations;
    }
}
