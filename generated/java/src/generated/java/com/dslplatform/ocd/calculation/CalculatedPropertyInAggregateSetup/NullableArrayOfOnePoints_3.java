package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class NullableArrayOfOnePoints_3 implements java.io.Serializable,
        AggregateRoot {
    public NullableArrayOfOnePoints_3() {
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
        final NullableArrayOfOnePoints_3 other = (NullableArrayOfOnePoints_3) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "NullableArrayOfOnePoints_3(" + URI + ')'
                : "new NullableArrayOfOnePoints_3(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public NullableArrayOfOnePoints_3(
            final java.awt.geom.Point2D[] nullableArrayOfOnePoints) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setNullableArrayOfOnePoints(nullableArrayOfOnePoints);
    }

    @JsonCreator
    private NullableArrayOfOnePoints_3(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("nullableArrayOfOnePoints") final java.awt.geom.Point2D[] nullableArrayOfOnePoints,
            @JsonProperty("calculatedNullableArrayOfOnePoints") final java.awt.geom.Point2D[] calculatedNullableArrayOfOnePoints,
            @JsonProperty("persistedNullableArrayOfOnePoints") final java.awt.geom.Point2D[] persistedNullableArrayOfOnePoints) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.nullableArrayOfOnePoints = nullableArrayOfOnePoints;
        this.calculatedNullableArrayOfOnePoints = calculatedNullableArrayOfOnePoints == null
                ? new java.awt.geom.Point2D[] {}
                : calculatedNullableArrayOfOnePoints;
        this.persistedNullableArrayOfOnePoints = persistedNullableArrayOfOnePoints == null
                ? new java.awt.geom.Point2D[] {}
                : persistedNullableArrayOfOnePoints;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private NullableArrayOfOnePoints_3 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static NullableArrayOfOnePoints_3 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static NullableArrayOfOnePoints_3 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(NullableArrayOfOnePoints_3.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableArrayOfOnePoints_3> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<NullableArrayOfOnePoints_3> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(NullableArrayOfOnePoints_3.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableArrayOfOnePoints_3> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableArrayOfOnePoints_3> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<NullableArrayOfOnePoints_3> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableArrayOfOnePoints_3> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(NullableArrayOfOnePoints_3.class, limit, offset,
                            null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableArrayOfOnePoints_3> search(
            final Specification<NullableArrayOfOnePoints_3> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableArrayOfOnePoints_3> search(
            final Specification<NullableArrayOfOnePoints_3> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<NullableArrayOfOnePoints_3> search(
            final Specification<NullableArrayOfOnePoints_3> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableArrayOfOnePoints_3> search(
            final Specification<NullableArrayOfOnePoints_3> specification,
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
                    .count(NullableArrayOfOnePoints_3.class).get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<NullableArrayOfOnePoints_3> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<NullableArrayOfOnePoints_3> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfOnePoints_3 result) {
        this.URI = result.URI;

        this.nullableArrayOfOnePoints = result.nullableArrayOfOnePoints;
        this.calculatedNullableArrayOfOnePoints = result.calculatedNullableArrayOfOnePoints;
        this.persistedNullableArrayOfOnePoints = result.persistedNullableArrayOfOnePoints;
        this.ID = result.ID;
    }

    public NullableArrayOfOnePoints_3 persist() throws java.io.IOException {
        final NullableArrayOfOnePoints_3 result;
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

    public NullableArrayOfOnePoints_3 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(NullableArrayOfOnePoints_3.class, URI)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.awt.geom.Point2D[] nullableArrayOfOnePoints;

    @JsonProperty("nullableArrayOfOnePoints")
    public java.awt.geom.Point2D[] getNullableArrayOfOnePoints() {
        return nullableArrayOfOnePoints;
    }

    public NullableArrayOfOnePoints_3 setNullableArrayOfOnePoints(
            final java.awt.geom.Point2D[] value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableArrayOfOnePoints = value;

        return this;
    }

    private java.awt.geom.Point2D[] calculatedNullableArrayOfOnePoints;

    @JsonProperty("calculatedNullableArrayOfOnePoints")
    public java.awt.geom.Point2D[] getCalculatedNullableArrayOfOnePoints() {
        return this.calculatedNullableArrayOfOnePoints;
    }

    private java.awt.geom.Point2D[] persistedNullableArrayOfOnePoints;

    @JsonProperty("persistedNullableArrayOfOnePoints")
    public java.awt.geom.Point2D[] getPersistedNullableArrayOfOnePoints() {
        return this.persistedNullableArrayOfOnePoints;
    }
}
