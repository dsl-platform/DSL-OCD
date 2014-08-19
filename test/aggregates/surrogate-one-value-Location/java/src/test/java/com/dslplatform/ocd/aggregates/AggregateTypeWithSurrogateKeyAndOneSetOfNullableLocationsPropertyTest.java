package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndOneSetOfNullableLocationsPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateLocation.Aggregate1S0Lc> aggregate1S0LcRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndOneSetOfNullableLocationsPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate1S0LcRepository = locator.resolve(ocd.AggregateSurrogateLocation.repositories.Aggregate1S0LcRepository.class);
    }

    /* Testing the "p1S0Lc" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S0LcDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateLocation.Aggregate1S0Lc aggregate =
                new ocd.AggregateSurrogateLocation.Aggregate1S0Lc();
        final java.util.Set<java.awt.geom.Point2D> testValue = aggregate.getP1S0Lc();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Lc());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLocation.Aggregate1S0Lc aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLocation.Aggregate1S0Lc.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1S0Lc());
    }

    /* Testing the "p1S0Lc" Default property value after active record persist */
    @org.junit.Test
    public void testP1S0LcDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateLocation.Aggregate1S0Lc aggregate =
                new ocd.AggregateSurrogateLocation.Aggregate1S0Lc();
        final java.util.Set<java.awt.geom.Point2D> testValue = aggregate.getP1S0Lc();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Lc().getP1S0Lc());

        final ocd.AggregateSurrogateLocation.Aggregate1S0Lc aggregateFound =
                ocd.AggregateSurrogateLocation.Aggregate1S0Lc.find(aggregate.getURI());

        final ocd.AggregateSurrogateLocation.Aggregate1S0Lc aggregateFound =
                ocd.AggregateSurrogateLocation.Aggregate1S0Lc.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateFound.getP1S0Lc());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1S0Lc" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S0LcNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<java.awt.geom.Point2D> testValue = new java.util.HashSet<java.awt.geom.Point2D>() {{ add(null); }};
        final ocd.AggregateSurrogateLocation.Aggregate1S0Lc aggregate =
                new ocd.AggregateSurrogateLocation.Aggregate1S0Lc()
                .setP1S0Lc(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Lc());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLocation.Aggregate1S0Lc aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLocation.Aggregate1S0Lc.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1S0Lc());
    }

    /* Testing the "p1S0Lc" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP1S0LcNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<java.awt.geom.Point2D> testValue = new java.util.HashSet<java.awt.geom.Point2D>() {{ add(null); }};
        final ocd.AggregateSurrogateLocation.Aggregate1S0Lc aggregate =
                new ocd.AggregateSurrogateLocation.Aggregate1S0Lc()
                .setP1S0Lc(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Lc().getP1S0Lc());

        final ocd.AggregateSurrogateLocation.Aggregate1S0Lc aggregateFound =
                ocd.AggregateSurrogateLocation.Aggregate1S0Lc.find(aggregate.getURI());

        final ocd.AggregateSurrogateLocation.Aggregate1S0Lc aggregateFound =
                ocd.AggregateSurrogateLocation.Aggregate1S0Lc.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateFound.getP1S0Lc());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1S0Lc" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S0LcNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<java.awt.geom.Point2D> testValue = new java.util.HashSet<java.awt.geom.Point2D>() {{ add(new java.awt.geom.Point2D.Float()); }};
        final ocd.AggregateSurrogateLocation.Aggregate1S0Lc aggregate =
                new ocd.AggregateSurrogateLocation.Aggregate1S0Lc()
                .setP1S0Lc(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Lc());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLocation.Aggregate1S0Lc aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLocation.Aggregate1S0Lc.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1S0Lc());
    }

    /* Testing the "p1S0Lc" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP1S0LcNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<java.awt.geom.Point2D> testValue = new java.util.HashSet<java.awt.geom.Point2D>() {{ add(new java.awt.geom.Point2D.Float()); }};
        final ocd.AggregateSurrogateLocation.Aggregate1S0Lc aggregate =
                new ocd.AggregateSurrogateLocation.Aggregate1S0Lc()
                .setP1S0Lc(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Lc().getP1S0Lc());

        final ocd.AggregateSurrogateLocation.Aggregate1S0Lc aggregateFound =
                ocd.AggregateSurrogateLocation.Aggregate1S0Lc.find(aggregate.getURI());

        final ocd.AggregateSurrogateLocation.Aggregate1S0Lc aggregateFound =
                ocd.AggregateSurrogateLocation.Aggregate1S0Lc.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateFound.getP1S0Lc());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1S0Lc" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S0LcNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<java.awt.geom.Point2D> testValue = new java.util.HashSet<java.awt.geom.Point2D>() {{ add(new java.awt.geom.Point2D.Double(-1.000000000000001, 1.000000000000001)); }};
        final ocd.AggregateSurrogateLocation.Aggregate1S0Lc aggregate =
                new ocd.AggregateSurrogateLocation.Aggregate1S0Lc()
                .setP1S0Lc(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Lc());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLocation.Aggregate1S0Lc aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLocation.Aggregate1S0Lc.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1S0Lc());
    }

    /* Testing the "p1S0Lc" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP1S0LcNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<java.awt.geom.Point2D> testValue = new java.util.HashSet<java.awt.geom.Point2D>() {{ add(new java.awt.geom.Point2D.Double(-1.000000000000001, 1.000000000000001)); }};
        final ocd.AggregateSurrogateLocation.Aggregate1S0Lc aggregate =
                new ocd.AggregateSurrogateLocation.Aggregate1S0Lc()
                .setP1S0Lc(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Lc().getP1S0Lc());

        final ocd.AggregateSurrogateLocation.Aggregate1S0Lc aggregateFound =
                ocd.AggregateSurrogateLocation.Aggregate1S0Lc.find(aggregate.getURI());

        final ocd.AggregateSurrogateLocation.Aggregate1S0Lc aggregateFound =
                ocd.AggregateSurrogateLocation.Aggregate1S0Lc.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateFound.getP1S0Lc());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1S0Lc" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S0LcNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<java.awt.geom.Point2D> testValue = new java.util.HashSet<java.awt.geom.Point2D>() {{ add(new java.awt.geom.Point2D.Float()); add(new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)); add(new java.awt.Point(-1000000000, 1000000000)); add(new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)); add(new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)); add(new java.awt.geom.Point2D.Double(Double.MIN_VALUE, Double.MAX_VALUE)); add(new java.awt.geom.Point2D.Double(-1.000000000000001, 1.000000000000001)); }};
        final ocd.AggregateSurrogateLocation.Aggregate1S0Lc aggregate =
                new ocd.AggregateSurrogateLocation.Aggregate1S0Lc()
                .setP1S0Lc(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Lc());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLocation.Aggregate1S0Lc aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLocation.Aggregate1S0Lc.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1S0Lc());
    }

    /* Testing the "p1S0Lc" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP1S0LcNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<java.awt.geom.Point2D> testValue = new java.util.HashSet<java.awt.geom.Point2D>() {{ add(new java.awt.geom.Point2D.Float()); add(new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)); add(new java.awt.Point(-1000000000, 1000000000)); add(new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)); add(new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)); add(new java.awt.geom.Point2D.Double(Double.MIN_VALUE, Double.MAX_VALUE)); add(new java.awt.geom.Point2D.Double(-1.000000000000001, 1.000000000000001)); }};
        final ocd.AggregateSurrogateLocation.Aggregate1S0Lc aggregate =
                new ocd.AggregateSurrogateLocation.Aggregate1S0Lc()
                .setP1S0Lc(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Lc().getP1S0Lc());

        final ocd.AggregateSurrogateLocation.Aggregate1S0Lc aggregateFound =
                ocd.AggregateSurrogateLocation.Aggregate1S0Lc.find(aggregate.getURI());

        final ocd.AggregateSurrogateLocation.Aggregate1S0Lc aggregateFound =
                ocd.AggregateSurrogateLocation.Aggregate1S0Lc.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateFound.getP1S0Lc());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1S0Lc" NonDefault5 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S0LcNonDefault5PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<java.awt.geom.Point2D> testValue = new java.util.HashSet<java.awt.geom.Point2D>() {{ add(null); add(new java.awt.geom.Point2D.Float()); add(new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)); add(new java.awt.Point(-1000000000, 1000000000)); add(new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)); add(new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)); add(new java.awt.geom.Point2D.Double(Double.MIN_VALUE, Double.MAX_VALUE)); add(new java.awt.geom.Point2D.Double(-1.000000000000001, 1.000000000000001)); }};
        final ocd.AggregateSurrogateLocation.Aggregate1S0Lc aggregate =
                new ocd.AggregateSurrogateLocation.Aggregate1S0Lc()
                .setP1S0Lc(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Lc());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLocation.Aggregate1S0Lc aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLocation.Aggregate1S0Lc.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1S0Lc());
    }

    /* Testing the "p1S0Lc" NonDefault5 property value after active record persist */
    @org.junit.Test
    public void testP1S0LcNonDefault5PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<java.awt.geom.Point2D> testValue = new java.util.HashSet<java.awt.geom.Point2D>() {{ add(null); add(new java.awt.geom.Point2D.Float()); add(new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)); add(new java.awt.Point(-1000000000, 1000000000)); add(new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)); add(new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)); add(new java.awt.geom.Point2D.Double(Double.MIN_VALUE, Double.MAX_VALUE)); add(new java.awt.geom.Point2D.Double(-1.000000000000001, 1.000000000000001)); }};
        final ocd.AggregateSurrogateLocation.Aggregate1S0Lc aggregate =
                new ocd.AggregateSurrogateLocation.Aggregate1S0Lc()
                .setP1S0Lc(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Lc().getP1S0Lc());

        final ocd.AggregateSurrogateLocation.Aggregate1S0Lc aggregateFound =
                ocd.AggregateSurrogateLocation.Aggregate1S0Lc.find(aggregate.getURI());

        final ocd.AggregateSurrogateLocation.Aggregate1S0Lc aggregateFound =
                ocd.AggregateSurrogateLocation.Aggregate1S0Lc.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateFound.getP1S0Lc());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
