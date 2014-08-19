package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndOneLocationPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateLocation.Aggregate1Lc> aggregate1LcRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndOneLocationPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate1LcRepository = locator.resolve(ocd.AggregateSurrogateLocation.repositories.Aggregate1LcRepository.class);
    }

    /* Testing the "p1Lc" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP1LcDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateLocation.Aggregate1Lc aggregate =
                new ocd.AggregateSurrogateLocation.Aggregate1Lc();
        final java.awt.geom.Point2D testValue = aggregate.getP1Lc();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Lc());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLocation.Aggregate1Lc aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLocation.Aggregate1Lc.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Lc());
    }

    /* Testing the "p1Lc" Default property value after active record persist */
    @org.junit.Test
    public void testP1LcDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateLocation.Aggregate1Lc aggregate =
                new ocd.AggregateSurrogateLocation.Aggregate1Lc();
        final java.awt.geom.Point2D testValue = aggregate.getP1Lc();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Lc().getP1Lc());

        final ocd.AggregateSurrogateLocation.Aggregate1Lc aggregateFound =
                ocd.AggregateSurrogateLocation.Aggregate1Lc.find(aggregate.getURI());

        final ocd.AggregateSurrogateLocation.Aggregate1Lc aggregateFound =
                ocd.AggregateSurrogateLocation.Aggregate1Lc.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Lc());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Lc" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1LcNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.awt.geom.Point2D testValue = new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE);
        final ocd.AggregateSurrogateLocation.Aggregate1Lc aggregate =
                new ocd.AggregateSurrogateLocation.Aggregate1Lc()
                .setP1Lc(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Lc());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLocation.Aggregate1Lc aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLocation.Aggregate1Lc.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Lc());
    }

    /* Testing the "p1Lc" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP1LcNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.awt.geom.Point2D testValue = new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE);
        final ocd.AggregateSurrogateLocation.Aggregate1Lc aggregate =
                new ocd.AggregateSurrogateLocation.Aggregate1Lc()
                .setP1Lc(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Lc().getP1Lc());

        final ocd.AggregateSurrogateLocation.Aggregate1Lc aggregateFound =
                ocd.AggregateSurrogateLocation.Aggregate1Lc.find(aggregate.getURI());

        final ocd.AggregateSurrogateLocation.Aggregate1Lc aggregateFound =
                ocd.AggregateSurrogateLocation.Aggregate1Lc.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Lc());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Lc" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1LcNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.awt.geom.Point2D testValue = new java.awt.Point(-1000000000, 1000000000);
        final ocd.AggregateSurrogateLocation.Aggregate1Lc aggregate =
                new ocd.AggregateSurrogateLocation.Aggregate1Lc()
                .setP1Lc(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Lc());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLocation.Aggregate1Lc aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLocation.Aggregate1Lc.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Lc());
    }

    /* Testing the "p1Lc" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP1LcNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.awt.geom.Point2D testValue = new java.awt.Point(-1000000000, 1000000000);
        final ocd.AggregateSurrogateLocation.Aggregate1Lc aggregate =
                new ocd.AggregateSurrogateLocation.Aggregate1Lc()
                .setP1Lc(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Lc().getP1Lc());

        final ocd.AggregateSurrogateLocation.Aggregate1Lc aggregateFound =
                ocd.AggregateSurrogateLocation.Aggregate1Lc.find(aggregate.getURI());

        final ocd.AggregateSurrogateLocation.Aggregate1Lc aggregateFound =
                ocd.AggregateSurrogateLocation.Aggregate1Lc.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Lc());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Lc" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1LcNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.awt.geom.Point2D testValue = new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE);
        final ocd.AggregateSurrogateLocation.Aggregate1Lc aggregate =
                new ocd.AggregateSurrogateLocation.Aggregate1Lc()
                .setP1Lc(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Lc());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLocation.Aggregate1Lc aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLocation.Aggregate1Lc.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Lc());
    }

    /* Testing the "p1Lc" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP1LcNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.awt.geom.Point2D testValue = new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE);
        final ocd.AggregateSurrogateLocation.Aggregate1Lc aggregate =
                new ocd.AggregateSurrogateLocation.Aggregate1Lc()
                .setP1Lc(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Lc().getP1Lc());

        final ocd.AggregateSurrogateLocation.Aggregate1Lc aggregateFound =
                ocd.AggregateSurrogateLocation.Aggregate1Lc.find(aggregate.getURI());

        final ocd.AggregateSurrogateLocation.Aggregate1Lc aggregateFound =
                ocd.AggregateSurrogateLocation.Aggregate1Lc.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Lc());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Lc" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1LcNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.awt.geom.Point2D testValue = new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f);
        final ocd.AggregateSurrogateLocation.Aggregate1Lc aggregate =
                new ocd.AggregateSurrogateLocation.Aggregate1Lc()
                .setP1Lc(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Lc());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLocation.Aggregate1Lc aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLocation.Aggregate1Lc.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Lc());
    }

    /* Testing the "p1Lc" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP1LcNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.awt.geom.Point2D testValue = new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f);
        final ocd.AggregateSurrogateLocation.Aggregate1Lc aggregate =
                new ocd.AggregateSurrogateLocation.Aggregate1Lc()
                .setP1Lc(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Lc().getP1Lc());

        final ocd.AggregateSurrogateLocation.Aggregate1Lc aggregateFound =
                ocd.AggregateSurrogateLocation.Aggregate1Lc.find(aggregate.getURI());

        final ocd.AggregateSurrogateLocation.Aggregate1Lc aggregateFound =
                ocd.AggregateSurrogateLocation.Aggregate1Lc.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Lc());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Lc" NonDefault5 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1LcNonDefault5PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.awt.geom.Point2D testValue = new java.awt.geom.Point2D.Double(Double.MIN_VALUE, Double.MAX_VALUE);
        final ocd.AggregateSurrogateLocation.Aggregate1Lc aggregate =
                new ocd.AggregateSurrogateLocation.Aggregate1Lc()
                .setP1Lc(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Lc());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLocation.Aggregate1Lc aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLocation.Aggregate1Lc.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Lc());
    }

    /* Testing the "p1Lc" NonDefault5 property value after active record persist */
    @org.junit.Test
    public void testP1LcNonDefault5PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.awt.geom.Point2D testValue = new java.awt.geom.Point2D.Double(Double.MIN_VALUE, Double.MAX_VALUE);
        final ocd.AggregateSurrogateLocation.Aggregate1Lc aggregate =
                new ocd.AggregateSurrogateLocation.Aggregate1Lc()
                .setP1Lc(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Lc().getP1Lc());

        final ocd.AggregateSurrogateLocation.Aggregate1Lc aggregateFound =
                ocd.AggregateSurrogateLocation.Aggregate1Lc.find(aggregate.getURI());

        final ocd.AggregateSurrogateLocation.Aggregate1Lc aggregateFound =
                ocd.AggregateSurrogateLocation.Aggregate1Lc.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Lc());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Lc" NonDefault6 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1LcNonDefault6PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.awt.geom.Point2D testValue = new java.awt.geom.Point2D.Double(-1.000000000000001, 1.000000000000001);
        final ocd.AggregateSurrogateLocation.Aggregate1Lc aggregate =
                new ocd.AggregateSurrogateLocation.Aggregate1Lc()
                .setP1Lc(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Lc());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLocation.Aggregate1Lc aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLocation.Aggregate1Lc.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Lc());
    }

    /* Testing the "p1Lc" NonDefault6 property value after active record persist */
    @org.junit.Test
    public void testP1LcNonDefault6PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.awt.geom.Point2D testValue = new java.awt.geom.Point2D.Double(-1.000000000000001, 1.000000000000001);
        final ocd.AggregateSurrogateLocation.Aggregate1Lc aggregate =
                new ocd.AggregateSurrogateLocation.Aggregate1Lc()
                .setP1Lc(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Lc().getP1Lc());

        final ocd.AggregateSurrogateLocation.Aggregate1Lc aggregateFound =
                ocd.AggregateSurrogateLocation.Aggregate1Lc.find(aggregate.getURI());

        final ocd.AggregateSurrogateLocation.Aggregate1Lc aggregateFound =
                ocd.AggregateSurrogateLocation.Aggregate1Lc.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Lc());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
