package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndNullableListOfNullableLocationsPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateLocation.Aggregate0L0Lc> aggregate0L0LcRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndNullableListOfNullableLocationsPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate0L0LcRepository = locator.resolve(ocd.AggregateSurrogateLocation.repositories.Aggregate0L0LcRepository.class);
    }

    /* Testing the "p0L0Lc" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP0L0LcDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateLocation.Aggregate0L0Lc aggregate =
                new ocd.AggregateSurrogateLocation.Aggregate0L0Lc();
        final java.util.List<java.awt.geom.Point2D> testValue = aggregate.getP0L0Lc();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Lc());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLocation.Aggregate0L0Lc aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLocation.Aggregate0L0Lc.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0L0Lc());
    }

    /* Testing the "p0L0Lc" Default property value after active record persist */
    @org.junit.Test
    public void testP0L0LcDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateLocation.Aggregate0L0Lc aggregate =
                new ocd.AggregateSurrogateLocation.Aggregate0L0Lc();
        final java.util.List<java.awt.geom.Point2D> testValue = aggregate.getP0L0Lc();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Lc().getP0L0Lc());

        final ocd.AggregateSurrogateLocation.Aggregate0L0Lc aggregateFound =
                ocd.AggregateSurrogateLocation.Aggregate0L0Lc.find(aggregate.getURI());

        final ocd.AggregateSurrogateLocation.Aggregate0L0Lc aggregateFound =
                ocd.AggregateSurrogateLocation.Aggregate0L0Lc.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateFound.getP0L0Lc());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0L0Lc" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0L0LcNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<java.awt.geom.Point2D> testValue = new java.util.ArrayList<java.awt.geom.Point2D>() {{ add(null); }};
        final ocd.AggregateSurrogateLocation.Aggregate0L0Lc aggregate =
                new ocd.AggregateSurrogateLocation.Aggregate0L0Lc()
                .setP0L0Lc(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Lc());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLocation.Aggregate0L0Lc aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLocation.Aggregate0L0Lc.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0L0Lc());
    }

    /* Testing the "p0L0Lc" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP0L0LcNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<java.awt.geom.Point2D> testValue = new java.util.ArrayList<java.awt.geom.Point2D>() {{ add(null); }};
        final ocd.AggregateSurrogateLocation.Aggregate0L0Lc aggregate =
                new ocd.AggregateSurrogateLocation.Aggregate0L0Lc()
                .setP0L0Lc(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Lc().getP0L0Lc());

        final ocd.AggregateSurrogateLocation.Aggregate0L0Lc aggregateFound =
                ocd.AggregateSurrogateLocation.Aggregate0L0Lc.find(aggregate.getURI());

        final ocd.AggregateSurrogateLocation.Aggregate0L0Lc aggregateFound =
                ocd.AggregateSurrogateLocation.Aggregate0L0Lc.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateFound.getP0L0Lc());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0L0Lc" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0L0LcNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<java.awt.geom.Point2D> testValue = new java.util.ArrayList<java.awt.geom.Point2D>() {{ add(new java.awt.geom.Point2D.Float()); }};
        final ocd.AggregateSurrogateLocation.Aggregate0L0Lc aggregate =
                new ocd.AggregateSurrogateLocation.Aggregate0L0Lc()
                .setP0L0Lc(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Lc());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLocation.Aggregate0L0Lc aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLocation.Aggregate0L0Lc.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0L0Lc());
    }

    /* Testing the "p0L0Lc" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP0L0LcNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<java.awt.geom.Point2D> testValue = new java.util.ArrayList<java.awt.geom.Point2D>() {{ add(new java.awt.geom.Point2D.Float()); }};
        final ocd.AggregateSurrogateLocation.Aggregate0L0Lc aggregate =
                new ocd.AggregateSurrogateLocation.Aggregate0L0Lc()
                .setP0L0Lc(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Lc().getP0L0Lc());

        final ocd.AggregateSurrogateLocation.Aggregate0L0Lc aggregateFound =
                ocd.AggregateSurrogateLocation.Aggregate0L0Lc.find(aggregate.getURI());

        final ocd.AggregateSurrogateLocation.Aggregate0L0Lc aggregateFound =
                ocd.AggregateSurrogateLocation.Aggregate0L0Lc.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateFound.getP0L0Lc());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0L0Lc" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0L0LcNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<java.awt.geom.Point2D> testValue = new java.util.ArrayList<java.awt.geom.Point2D>() {{ add(new java.awt.geom.Point2D.Double(-1.000000000000001, 1.000000000000001)); }};
        final ocd.AggregateSurrogateLocation.Aggregate0L0Lc aggregate =
                new ocd.AggregateSurrogateLocation.Aggregate0L0Lc()
                .setP0L0Lc(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Lc());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLocation.Aggregate0L0Lc aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLocation.Aggregate0L0Lc.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0L0Lc());
    }

    /* Testing the "p0L0Lc" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP0L0LcNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<java.awt.geom.Point2D> testValue = new java.util.ArrayList<java.awt.geom.Point2D>() {{ add(new java.awt.geom.Point2D.Double(-1.000000000000001, 1.000000000000001)); }};
        final ocd.AggregateSurrogateLocation.Aggregate0L0Lc aggregate =
                new ocd.AggregateSurrogateLocation.Aggregate0L0Lc()
                .setP0L0Lc(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Lc().getP0L0Lc());

        final ocd.AggregateSurrogateLocation.Aggregate0L0Lc aggregateFound =
                ocd.AggregateSurrogateLocation.Aggregate0L0Lc.find(aggregate.getURI());

        final ocd.AggregateSurrogateLocation.Aggregate0L0Lc aggregateFound =
                ocd.AggregateSurrogateLocation.Aggregate0L0Lc.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateFound.getP0L0Lc());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0L0Lc" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0L0LcNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<java.awt.geom.Point2D> testValue = new java.util.ArrayList<java.awt.geom.Point2D>() {{ add(new java.awt.geom.Point2D.Float()); add(new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)); add(new java.awt.Point(-1000000000, 1000000000)); add(new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)); add(new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)); add(new java.awt.geom.Point2D.Double(Double.MIN_VALUE, Double.MAX_VALUE)); add(new java.awt.geom.Point2D.Double(-1.000000000000001, 1.000000000000001)); }};
        final ocd.AggregateSurrogateLocation.Aggregate0L0Lc aggregate =
                new ocd.AggregateSurrogateLocation.Aggregate0L0Lc()
                .setP0L0Lc(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Lc());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLocation.Aggregate0L0Lc aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLocation.Aggregate0L0Lc.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0L0Lc());
    }

    /* Testing the "p0L0Lc" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP0L0LcNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<java.awt.geom.Point2D> testValue = new java.util.ArrayList<java.awt.geom.Point2D>() {{ add(new java.awt.geom.Point2D.Float()); add(new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)); add(new java.awt.Point(-1000000000, 1000000000)); add(new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)); add(new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)); add(new java.awt.geom.Point2D.Double(Double.MIN_VALUE, Double.MAX_VALUE)); add(new java.awt.geom.Point2D.Double(-1.000000000000001, 1.000000000000001)); }};
        final ocd.AggregateSurrogateLocation.Aggregate0L0Lc aggregate =
                new ocd.AggregateSurrogateLocation.Aggregate0L0Lc()
                .setP0L0Lc(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Lc().getP0L0Lc());

        final ocd.AggregateSurrogateLocation.Aggregate0L0Lc aggregateFound =
                ocd.AggregateSurrogateLocation.Aggregate0L0Lc.find(aggregate.getURI());

        final ocd.AggregateSurrogateLocation.Aggregate0L0Lc aggregateFound =
                ocd.AggregateSurrogateLocation.Aggregate0L0Lc.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateFound.getP0L0Lc());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0L0Lc" NonDefault5 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0L0LcNonDefault5PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<java.awt.geom.Point2D> testValue = new java.util.ArrayList<java.awt.geom.Point2D>() {{ add(null); add(new java.awt.geom.Point2D.Float()); add(new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)); add(new java.awt.Point(-1000000000, 1000000000)); add(new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)); add(new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)); add(new java.awt.geom.Point2D.Double(Double.MIN_VALUE, Double.MAX_VALUE)); add(new java.awt.geom.Point2D.Double(-1.000000000000001, 1.000000000000001)); }};
        final ocd.AggregateSurrogateLocation.Aggregate0L0Lc aggregate =
                new ocd.AggregateSurrogateLocation.Aggregate0L0Lc()
                .setP0L0Lc(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Lc());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLocation.Aggregate0L0Lc aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLocation.Aggregate0L0Lc.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0L0Lc());
    }

    /* Testing the "p0L0Lc" NonDefault5 property value after active record persist */
    @org.junit.Test
    public void testP0L0LcNonDefault5PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<java.awt.geom.Point2D> testValue = new java.util.ArrayList<java.awt.geom.Point2D>() {{ add(null); add(new java.awt.geom.Point2D.Float()); add(new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)); add(new java.awt.Point(-1000000000, 1000000000)); add(new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)); add(new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)); add(new java.awt.geom.Point2D.Double(Double.MIN_VALUE, Double.MAX_VALUE)); add(new java.awt.geom.Point2D.Double(-1.000000000000001, 1.000000000000001)); }};
        final ocd.AggregateSurrogateLocation.Aggregate0L0Lc aggregate =
                new ocd.AggregateSurrogateLocation.Aggregate0L0Lc()
                .setP0L0Lc(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Lc().getP0L0Lc());

        final ocd.AggregateSurrogateLocation.Aggregate0L0Lc aggregateFound =
                ocd.AggregateSurrogateLocation.Aggregate0L0Lc.find(aggregate.getURI());

        final ocd.AggregateSurrogateLocation.Aggregate0L0Lc aggregateFound =
                ocd.AggregateSurrogateLocation.Aggregate0L0Lc.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LocationAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateFound.getP0L0Lc());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
