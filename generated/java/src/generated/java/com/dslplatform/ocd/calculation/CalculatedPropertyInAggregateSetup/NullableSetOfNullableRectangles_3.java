package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class NullableSetOfNullableRectangles_3 implements java.io.Serializable,
        AggregateRoot {
    public NullableSetOfNullableRectangles_3() {
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
        final NullableSetOfNullableRectangles_3 other = (NullableSetOfNullableRectangles_3) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "NullableSetOfNullableRectangles_3(" + URI + ')'
                : "new NullableSetOfNullableRectangles_3(" + super.hashCode()
                        + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public NullableSetOfNullableRectangles_3(
            final java.util.Set<java.awt.geom.Rectangle2D> nullableSetOfNullableRectangles) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setNullableSetOfNullableRectangles(nullableSetOfNullableRectangles);
    }

    @JsonCreator
    private NullableSetOfNullableRectangles_3(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("nullableSetOfNullableRectangles") final java.util.Set<java.awt.geom.Rectangle2D> nullableSetOfNullableRectangles,
            @JsonProperty("calculatedNullableSetOfNullableRectangles") final java.util.Set<java.awt.geom.Rectangle2D> calculatedNullableSetOfNullableRectangles,
            @JsonProperty("persistedNullableSetOfNullableRectangles") final java.util.Set<java.awt.geom.Rectangle2D> persistedNullableSetOfNullableRectangles) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.nullableSetOfNullableRectangles = nullableSetOfNullableRectangles;
        this.calculatedNullableSetOfNullableRectangles = calculatedNullableSetOfNullableRectangles == null
                ? new java.util.HashSet<java.awt.geom.Rectangle2D>()
                : calculatedNullableSetOfNullableRectangles;
        this.persistedNullableSetOfNullableRectangles = persistedNullableSetOfNullableRectangles == null
                ? new java.util.HashSet<java.awt.geom.Rectangle2D>()
                : persistedNullableSetOfNullableRectangles;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private NullableSetOfNullableRectangles_3 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static NullableSetOfNullableRectangles_3 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static NullableSetOfNullableRectangles_3 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(NullableSetOfNullableRectangles_3.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableSetOfNullableRectangles_3> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfNullableRectangles_3> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(NullableSetOfNullableRectangles_3.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableSetOfNullableRectangles_3> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfNullableRectangles_3> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<NullableSetOfNullableRectangles_3> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfNullableRectangles_3> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(NullableSetOfNullableRectangles_3.class, limit,
                            offset, null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableSetOfNullableRectangles_3> search(
            final Specification<NullableSetOfNullableRectangles_3> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfNullableRectangles_3> search(
            final Specification<NullableSetOfNullableRectangles_3> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<NullableSetOfNullableRectangles_3> search(
            final Specification<NullableSetOfNullableRectangles_3> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfNullableRectangles_3> search(
            final Specification<NullableSetOfNullableRectangles_3> specification,
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
                    .count(NullableSetOfNullableRectangles_3.class).get()
                    .longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<NullableSetOfNullableRectangles_3> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<NullableSetOfNullableRectangles_3> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfNullableRectangles_3 result) {
        this.URI = result.URI;

        this.nullableSetOfNullableRectangles = result.nullableSetOfNullableRectangles;
        this.calculatedNullableSetOfNullableRectangles = result.calculatedNullableSetOfNullableRectangles;
        this.persistedNullableSetOfNullableRectangles = result.persistedNullableSetOfNullableRectangles;
        this.ID = result.ID;
    }

    public NullableSetOfNullableRectangles_3 persist()
            throws java.io.IOException {
        final NullableSetOfNullableRectangles_3 result;
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

    public NullableSetOfNullableRectangles_3 delete()
            throws java.io.IOException {
        try {
            return _crudProxy.delete(NullableSetOfNullableRectangles_3.class,
                    URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.Set<java.awt.geom.Rectangle2D> nullableSetOfNullableRectangles;

    @JsonProperty("nullableSetOfNullableRectangles")
    public java.util.Set<java.awt.geom.Rectangle2D> getNullableSetOfNullableRectangles() {
        return nullableSetOfNullableRectangles;
    }

    public NullableSetOfNullableRectangles_3 setNullableSetOfNullableRectangles(
            final java.util.Set<java.awt.geom.Rectangle2D> value) {
        this.nullableSetOfNullableRectangles = value;

        return this;
    }

    private java.util.Set<java.awt.geom.Rectangle2D> calculatedNullableSetOfNullableRectangles;

    @JsonProperty("calculatedNullableSetOfNullableRectangles")
    public java.util.Set<java.awt.geom.Rectangle2D> getCalculatedNullableSetOfNullableRectangles() {
        return this.calculatedNullableSetOfNullableRectangles;
    }

    private java.util.Set<java.awt.geom.Rectangle2D> persistedNullableSetOfNullableRectangles;

    @JsonProperty("persistedNullableSetOfNullableRectangles")
    public java.util.Set<java.awt.geom.Rectangle2D> getPersistedNullableSetOfNullableRectangles() {
        return this.persistedNullableSetOfNullableRectangles;
    }
}
