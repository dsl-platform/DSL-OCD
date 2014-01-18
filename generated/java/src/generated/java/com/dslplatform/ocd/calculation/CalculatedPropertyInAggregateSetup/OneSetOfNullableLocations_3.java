package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class OneSetOfNullableLocations_3 implements java.io.Serializable,
        AggregateRoot {
    public OneSetOfNullableLocations_3() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.oneSetOfNullableLocations = new java.util.HashSet<java.awt.geom.Point2D>();
        this.calculatedOneSetOfNullableLocations = new java.util.HashSet<java.awt.geom.Point2D>();
        this.persistedOneSetOfNullableLocations = new java.util.HashSet<java.awt.geom.Point2D>();
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
        final OneSetOfNullableLocations_3 other = (OneSetOfNullableLocations_3) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "OneSetOfNullableLocations_3(" + URI + ')'
                : "new OneSetOfNullableLocations_3(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public OneSetOfNullableLocations_3(
            final java.util.Set<java.awt.geom.Point2D> oneSetOfNullableLocations) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOneSetOfNullableLocations(oneSetOfNullableLocations);
    }

    @JsonCreator
    private OneSetOfNullableLocations_3(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("oneSetOfNullableLocations") final java.util.Set<java.awt.geom.Point2D> oneSetOfNullableLocations,
            @JsonProperty("calculatedOneSetOfNullableLocations") final java.util.Set<java.awt.geom.Point2D> calculatedOneSetOfNullableLocations,
            @JsonProperty("persistedOneSetOfNullableLocations") final java.util.Set<java.awt.geom.Point2D> persistedOneSetOfNullableLocations) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.oneSetOfNullableLocations = oneSetOfNullableLocations == null
                ? new java.util.HashSet<java.awt.geom.Point2D>()
                : oneSetOfNullableLocations;
        this.calculatedOneSetOfNullableLocations = calculatedOneSetOfNullableLocations;
        this.persistedOneSetOfNullableLocations = persistedOneSetOfNullableLocations;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private OneSetOfNullableLocations_3 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static OneSetOfNullableLocations_3 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static OneSetOfNullableLocations_3 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(OneSetOfNullableLocations_3.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfNullableLocations_3> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfNullableLocations_3> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(OneSetOfNullableLocations_3.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfNullableLocations_3> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfNullableLocations_3> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<OneSetOfNullableLocations_3> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfNullableLocations_3> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(OneSetOfNullableLocations_3.class, limit, offset,
                            null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfNullableLocations_3> search(
            final Specification<OneSetOfNullableLocations_3> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfNullableLocations_3> search(
            final Specification<OneSetOfNullableLocations_3> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<OneSetOfNullableLocations_3> search(
            final Specification<OneSetOfNullableLocations_3> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfNullableLocations_3> search(
            final Specification<OneSetOfNullableLocations_3> specification,
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
                    .count(OneSetOfNullableLocations_3.class).get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<OneSetOfNullableLocations_3> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<OneSetOfNullableLocations_3> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfNullableLocations_3 result) {
        this.URI = result.URI;

        this.oneSetOfNullableLocations = result.oneSetOfNullableLocations;
        this.calculatedOneSetOfNullableLocations = result.calculatedOneSetOfNullableLocations;
        this.persistedOneSetOfNullableLocations = result.persistedOneSetOfNullableLocations;
        this.ID = result.ID;
    }

    public OneSetOfNullableLocations_3 persist() throws java.io.IOException {
        final OneSetOfNullableLocations_3 result;
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

    public OneSetOfNullableLocations_3 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(OneSetOfNullableLocations_3.class, URI)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.Set<java.awt.geom.Point2D> oneSetOfNullableLocations;

    @JsonProperty("oneSetOfNullableLocations")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.awt.geom.Point2D> getOneSetOfNullableLocations() {
        return oneSetOfNullableLocations;
    }

    public OneSetOfNullableLocations_3 setOneSetOfNullableLocations(
            final java.util.Set<java.awt.geom.Point2D> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableLocations\" cannot be null!");
        this.oneSetOfNullableLocations = value;

        return this;
    }

    private java.util.Set<java.awt.geom.Point2D> calculatedOneSetOfNullableLocations;

    @JsonProperty("calculatedOneSetOfNullableLocations")
    public java.util.Set<java.awt.geom.Point2D> getCalculatedOneSetOfNullableLocations() {
        return this.calculatedOneSetOfNullableLocations;
    }

    private java.util.Set<java.awt.geom.Point2D> persistedOneSetOfNullableLocations;

    @JsonProperty("persistedOneSetOfNullableLocations")
    public java.util.Set<java.awt.geom.Point2D> getPersistedOneSetOfNullableLocations() {
        return this.persistedOneSetOfNullableLocations;
    }
}
