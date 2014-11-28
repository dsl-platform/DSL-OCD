package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndOneListOfOneLocationsPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateLocation.Aggregate1L1Lc> aggregate1L1LcRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndOneListOfOneLocationsPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate1L1LcRepository = locator.resolve(ocd.AggregateSurrogateLocation.repositories.Aggregate1L1LcRepository.class);
    }

    /* Testing the "p1L1Lc" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L1LcDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateLocation.Aggregate1L1Lc aggregate =
                new ocd.AggregateSurrogateLocation.Aggregate1L1Lc();
        final java.util.List<java.awt.geom.Point2D> testValue = aggregate.getP1L1Lc();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Lc());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLocation.Aggregate1L1Lc aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLocation.Aggregate1L1Lc.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateDeserialized.getP1L1Lc());
    }

    /* Testing the "p1L1Lc" Default property value after active record persist */
    @org.junit.Test
    public void testP1L1LcDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateLocation.Aggregate1L1Lc aggregate =
                new ocd.AggregateSurrogateLocation.Aggregate1L1Lc();
        final java.util.List<java.awt.geom.Point2D> testValue = aggregate.getP1L1Lc();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Lc().getP1L1Lc());

        final ocd.AggregateSurrogateLocation.Aggregate1L1Lc aggregateFound =
                ocd.AggregateSurrogateLocation.Aggregate1L1Lc.find(aggregate.getURI());

        final ocd.AggregateSurrogateLocation.Aggregate1L1Lc aggregateFound =
                ocd.AggregateSurrogateLocation.Aggregate1L1Lc.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateFound.getP1L1Lc());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L1Lc" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L1LcNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<java.awt.geom.Point2D> testValue = new java.util.ArrayList<java.awt.geom.Point2D>() {{ add(new java.awt.geom.Point2D.Float()); }};
        final ocd.AggregateSurrogateLocation.Aggregate1L1Lc aggregate =
                new ocd.AggregateSurrogateLocation.Aggregate1L1Lc()
                .setP1L1Lc(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Lc());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLocation.Aggregate1L1Lc aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLocation.Aggregate1L1Lc.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateDeserialized.getP1L1Lc());
    }

    /* Testing the "p1L1Lc" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP1L1LcNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<java.awt.geom.Point2D> testValue = new java.util.ArrayList<java.awt.geom.Point2D>() {{ add(new java.awt.geom.Point2D.Float()); }};
        final ocd.AggregateSurrogateLocation.Aggregate1L1Lc aggregate =
                new ocd.AggregateSurrogateLocation.Aggregate1L1Lc()
                .setP1L1Lc(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Lc().getP1L1Lc());

        final ocd.AggregateSurrogateLocation.Aggregate1L1Lc aggregateFound =
                ocd.AggregateSurrogateLocation.Aggregate1L1Lc.find(aggregate.getURI());

        final ocd.AggregateSurrogateLocation.Aggregate1L1Lc aggregateFound =
                ocd.AggregateSurrogateLocation.Aggregate1L1Lc.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateFound.getP1L1Lc());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L1Lc" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L1LcNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<java.awt.geom.Point2D> testValue = new java.util.ArrayList<java.awt.geom.Point2D>() {{ add(new java.awt.geom.Point2D.Double(-1.000000000000001, 1.000000000000001)); }};
        final ocd.AggregateSurrogateLocation.Aggregate1L1Lc aggregate =
                new ocd.AggregateSurrogateLocation.Aggregate1L1Lc()
                .setP1L1Lc(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Lc());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLocation.Aggregate1L1Lc aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLocation.Aggregate1L1Lc.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateDeserialized.getP1L1Lc());
    }

    /* Testing the "p1L1Lc" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP1L1LcNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<java.awt.geom.Point2D> testValue = new java.util.ArrayList<java.awt.geom.Point2D>() {{ add(new java.awt.geom.Point2D.Double(-1.000000000000001, 1.000000000000001)); }};
        final ocd.AggregateSurrogateLocation.Aggregate1L1Lc aggregate =
                new ocd.AggregateSurrogateLocation.Aggregate1L1Lc()
                .setP1L1Lc(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Lc().getP1L1Lc());

        final ocd.AggregateSurrogateLocation.Aggregate1L1Lc aggregateFound =
                ocd.AggregateSurrogateLocation.Aggregate1L1Lc.find(aggregate.getURI());

        final ocd.AggregateSurrogateLocation.Aggregate1L1Lc aggregateFound =
                ocd.AggregateSurrogateLocation.Aggregate1L1Lc.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateFound.getP1L1Lc());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L1Lc" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L1LcNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<java.awt.geom.Point2D> testValue = new java.util.ArrayList<java.awt.geom.Point2D>() {{ add(new java.awt.geom.Point2D.Float()); add(new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)); add(new java.awt.Point(-1000000000, 1000000000)); add(new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)); add(new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)); add(new java.awt.geom.Point2D.Double(Double.MIN_VALUE, Double.MAX_VALUE)); add(new java.awt.geom.Point2D.Double(-1.000000000000001, 1.000000000000001)); }};
        final ocd.AggregateSurrogateLocation.Aggregate1L1Lc aggregate =
                new ocd.AggregateSurrogateLocation.Aggregate1L1Lc()
                .setP1L1Lc(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Lc());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLocation.Aggregate1L1Lc aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLocation.Aggregate1L1Lc.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateDeserialized.getP1L1Lc());
    }

    /* Testing the "p1L1Lc" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP1L1LcNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<java.awt.geom.Point2D> testValue = new java.util.ArrayList<java.awt.geom.Point2D>() {{ add(new java.awt.geom.Point2D.Float()); add(new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)); add(new java.awt.Point(-1000000000, 1000000000)); add(new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)); add(new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)); add(new java.awt.geom.Point2D.Double(Double.MIN_VALUE, Double.MAX_VALUE)); add(new java.awt.geom.Point2D.Double(-1.000000000000001, 1.000000000000001)); }};
        final ocd.AggregateSurrogateLocation.Aggregate1L1Lc aggregate =
                new ocd.AggregateSurrogateLocation.Aggregate1L1Lc()
                .setP1L1Lc(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Lc().getP1L1Lc());

        final ocd.AggregateSurrogateLocation.Aggregate1L1Lc aggregateFound =
                ocd.AggregateSurrogateLocation.Aggregate1L1Lc.find(aggregate.getURI());

        final ocd.AggregateSurrogateLocation.Aggregate1L1Lc aggregateFound =
                ocd.AggregateSurrogateLocation.Aggregate1L1Lc.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateFound.getP1L1Lc());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}