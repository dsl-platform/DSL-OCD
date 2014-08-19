package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndNullableSetOfOneLocationsPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateLocation.Aggregate0S1Lc> aggregate0S1LcRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndNullableSetOfOneLocationsPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate0S1LcRepository = locator.resolve(ocd.AggregateSurrogateLocation.repositories.Aggregate0S1LcRepository.class);
    }

    /* Testing the "p0S1Lc" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S1LcDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateLocation.Aggregate0S1Lc aggregate =
                new ocd.AggregateSurrogateLocation.Aggregate0S1Lc();
        final java.util.Set<java.awt.geom.Point2D> testValue = aggregate.getP0S1Lc();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Lc());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLocation.Aggregate0S1Lc aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLocation.Aggregate0S1Lc.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP0S1Lc());
    }

    /* Testing the "p0S1Lc" Default property value after active record persist */
    @org.junit.Test
    public void testP0S1LcDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateLocation.Aggregate0S1Lc aggregate =
                new ocd.AggregateSurrogateLocation.Aggregate0S1Lc();
        final java.util.Set<java.awt.geom.Point2D> testValue = aggregate.getP0S1Lc();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Lc().getP0S1Lc());

        final ocd.AggregateSurrogateLocation.Aggregate0S1Lc aggregateFound =
                ocd.AggregateSurrogateLocation.Aggregate0S1Lc.find(aggregate.getURI());

        final ocd.AggregateSurrogateLocation.Aggregate0S1Lc aggregateFound =
                ocd.AggregateSurrogateLocation.Aggregate0S1Lc.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateFound.getP0S1Lc());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0S1Lc" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S1LcNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<java.awt.geom.Point2D> testValue = new java.util.HashSet<java.awt.geom.Point2D>() {{ add(new java.awt.geom.Point2D.Float()); }};
        final ocd.AggregateSurrogateLocation.Aggregate0S1Lc aggregate =
                new ocd.AggregateSurrogateLocation.Aggregate0S1Lc()
                .setP0S1Lc(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Lc());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLocation.Aggregate0S1Lc aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLocation.Aggregate0S1Lc.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP0S1Lc());
    }

    /* Testing the "p0S1Lc" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP0S1LcNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<java.awt.geom.Point2D> testValue = new java.util.HashSet<java.awt.geom.Point2D>() {{ add(new java.awt.geom.Point2D.Float()); }};
        final ocd.AggregateSurrogateLocation.Aggregate0S1Lc aggregate =
                new ocd.AggregateSurrogateLocation.Aggregate0S1Lc()
                .setP0S1Lc(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Lc().getP0S1Lc());

        final ocd.AggregateSurrogateLocation.Aggregate0S1Lc aggregateFound =
                ocd.AggregateSurrogateLocation.Aggregate0S1Lc.find(aggregate.getURI());

        final ocd.AggregateSurrogateLocation.Aggregate0S1Lc aggregateFound =
                ocd.AggregateSurrogateLocation.Aggregate0S1Lc.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateFound.getP0S1Lc());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0S1Lc" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S1LcNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<java.awt.geom.Point2D> testValue = new java.util.HashSet<java.awt.geom.Point2D>() {{ add(new java.awt.geom.Point2D.Double(-1.000000000000001, 1.000000000000001)); }};
        final ocd.AggregateSurrogateLocation.Aggregate0S1Lc aggregate =
                new ocd.AggregateSurrogateLocation.Aggregate0S1Lc()
                .setP0S1Lc(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Lc());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLocation.Aggregate0S1Lc aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLocation.Aggregate0S1Lc.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP0S1Lc());
    }

    /* Testing the "p0S1Lc" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP0S1LcNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<java.awt.geom.Point2D> testValue = new java.util.HashSet<java.awt.geom.Point2D>() {{ add(new java.awt.geom.Point2D.Double(-1.000000000000001, 1.000000000000001)); }};
        final ocd.AggregateSurrogateLocation.Aggregate0S1Lc aggregate =
                new ocd.AggregateSurrogateLocation.Aggregate0S1Lc()
                .setP0S1Lc(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Lc().getP0S1Lc());

        final ocd.AggregateSurrogateLocation.Aggregate0S1Lc aggregateFound =
                ocd.AggregateSurrogateLocation.Aggregate0S1Lc.find(aggregate.getURI());

        final ocd.AggregateSurrogateLocation.Aggregate0S1Lc aggregateFound =
                ocd.AggregateSurrogateLocation.Aggregate0S1Lc.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateFound.getP0S1Lc());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0S1Lc" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S1LcNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<java.awt.geom.Point2D> testValue = new java.util.HashSet<java.awt.geom.Point2D>() {{ add(new java.awt.geom.Point2D.Float()); add(new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)); add(new java.awt.Point(-1000000000, 1000000000)); add(new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)); add(new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)); add(new java.awt.geom.Point2D.Double(Double.MIN_VALUE, Double.MAX_VALUE)); add(new java.awt.geom.Point2D.Double(-1.000000000000001, 1.000000000000001)); }};
        final ocd.AggregateSurrogateLocation.Aggregate0S1Lc aggregate =
                new ocd.AggregateSurrogateLocation.Aggregate0S1Lc()
                .setP0S1Lc(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Lc());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLocation.Aggregate0S1Lc aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLocation.Aggregate0S1Lc.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP0S1Lc());
    }

    /* Testing the "p0S1Lc" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP0S1LcNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<java.awt.geom.Point2D> testValue = new java.util.HashSet<java.awt.geom.Point2D>() {{ add(new java.awt.geom.Point2D.Float()); add(new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)); add(new java.awt.Point(-1000000000, 1000000000)); add(new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)); add(new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)); add(new java.awt.geom.Point2D.Double(Double.MIN_VALUE, Double.MAX_VALUE)); add(new java.awt.geom.Point2D.Double(-1.000000000000001, 1.000000000000001)); }};
        final ocd.AggregateSurrogateLocation.Aggregate0S1Lc aggregate =
                new ocd.AggregateSurrogateLocation.Aggregate0S1Lc()
                .setP0S1Lc(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Lc().getP0S1Lc());

        final ocd.AggregateSurrogateLocation.Aggregate0S1Lc aggregateFound =
                ocd.AggregateSurrogateLocation.Aggregate0S1Lc.find(aggregate.getURI());

        final ocd.AggregateSurrogateLocation.Aggregate0S1Lc aggregateFound =
                ocd.AggregateSurrogateLocation.Aggregate0S1Lc.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateFound.getP0S1Lc());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
