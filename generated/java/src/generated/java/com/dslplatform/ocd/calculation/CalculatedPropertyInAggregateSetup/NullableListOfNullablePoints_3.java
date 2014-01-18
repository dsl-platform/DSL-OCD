package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class NullableListOfNullablePoints_3 implements java.io.Serializable,
        AggregateRoot {
    public NullableListOfNullablePoints_3() {
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
        final NullableListOfNullablePoints_3 other = (NullableListOfNullablePoints_3) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "NullableListOfNullablePoints_3(" + URI + ')'
                : "new NullableListOfNullablePoints_3(" + super.hashCode()
                        + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public NullableListOfNullablePoints_3(
            final java.util.List<java.awt.geom.Point2D> nullableListOfNullablePoints) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setNullableListOfNullablePoints(nullableListOfNullablePoints);
    }

    @JsonCreator
    private NullableListOfNullablePoints_3(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("nullableListOfNullablePoints") final java.util.List<java.awt.geom.Point2D> nullableListOfNullablePoints,
            @JsonProperty("calculatedNullableListOfNullablePoints") final java.util.List<java.awt.geom.Point2D> calculatedNullableListOfNullablePoints,
            @JsonProperty("persistedNullableListOfNullablePoints") final java.util.List<java.awt.geom.Point2D> persistedNullableListOfNullablePoints) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.nullableListOfNullablePoints = nullableListOfNullablePoints;
        this.calculatedNullableListOfNullablePoints = calculatedNullableListOfNullablePoints == null
                ? new java.util.ArrayList<java.awt.geom.Point2D>()
                : calculatedNullableListOfNullablePoints;
        this.persistedNullableListOfNullablePoints = persistedNullableListOfNullablePoints == null
                ? new java.util.ArrayList<java.awt.geom.Point2D>()
                : persistedNullableListOfNullablePoints;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private NullableListOfNullablePoints_3 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static NullableListOfNullablePoints_3 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static NullableListOfNullablePoints_3 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(NullableListOfNullablePoints_3.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableListOfNullablePoints_3> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<NullableListOfNullablePoints_3> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(NullableListOfNullablePoints_3.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableListOfNullablePoints_3> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableListOfNullablePoints_3> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<NullableListOfNullablePoints_3> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableListOfNullablePoints_3> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(NullableListOfNullablePoints_3.class, limit,
                            offset, null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableListOfNullablePoints_3> search(
            final Specification<NullableListOfNullablePoints_3> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableListOfNullablePoints_3> search(
            final Specification<NullableListOfNullablePoints_3> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<NullableListOfNullablePoints_3> search(
            final Specification<NullableListOfNullablePoints_3> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableListOfNullablePoints_3> search(
            final Specification<NullableListOfNullablePoints_3> specification,
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
                    .count(NullableListOfNullablePoints_3.class).get()
                    .longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<NullableListOfNullablePoints_3> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<NullableListOfNullablePoints_3> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfNullablePoints_3 result) {
        this.URI = result.URI;

        this.nullableListOfNullablePoints = result.nullableListOfNullablePoints;
        this.calculatedNullableListOfNullablePoints = result.calculatedNullableListOfNullablePoints;
        this.persistedNullableListOfNullablePoints = result.persistedNullableListOfNullablePoints;
        this.ID = result.ID;
    }

    public NullableListOfNullablePoints_3 persist() throws java.io.IOException {
        final NullableListOfNullablePoints_3 result;
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

    public NullableListOfNullablePoints_3 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(NullableListOfNullablePoints_3.class, URI)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.List<java.awt.geom.Point2D> nullableListOfNullablePoints;

    @JsonProperty("nullableListOfNullablePoints")
    public java.util.List<java.awt.geom.Point2D> getNullableListOfNullablePoints() {
        return nullableListOfNullablePoints;
    }

    public NullableListOfNullablePoints_3 setNullableListOfNullablePoints(
            final java.util.List<java.awt.geom.Point2D> value) {
        this.nullableListOfNullablePoints = value;

        return this;
    }

    private java.util.List<java.awt.geom.Point2D> calculatedNullableListOfNullablePoints;

    @JsonProperty("calculatedNullableListOfNullablePoints")
    public java.util.List<java.awt.geom.Point2D> getCalculatedNullableListOfNullablePoints() {
        return this.calculatedNullableListOfNullablePoints;
    }

    private java.util.List<java.awt.geom.Point2D> persistedNullableListOfNullablePoints;

    @JsonProperty("persistedNullableListOfNullablePoints")
    public java.util.List<java.awt.geom.Point2D> getPersistedNullableListOfNullablePoints() {
        return this.persistedNullableListOfNullablePoints;
    }
}
