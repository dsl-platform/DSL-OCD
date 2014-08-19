package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndOneListOfNullablePointsPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogatePoint.Aggregate1L0Po> aggregate1L0PoRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndOneListOfNullablePointsPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate1L0PoRepository = locator.resolve(ocd.AggregateSurrogatePoint.repositories.Aggregate1L0PoRepository.class);
    }

    /* Testing the "p1L0Po" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L0PoDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogatePoint.Aggregate1L0Po aggregate =
                new ocd.AggregateSurrogatePoint.Aggregate1L0Po();
        final java.util.List<java.awt.Point> testValue = aggregate.getP1L0Po();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.PointAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Po());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogatePoint.Aggregate1L0Po aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogatePoint.Aggregate1L0Po.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.PointAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1L0Po());
    }

    /* Testing the "p1L0Po" Default property value after active record persist */
    @org.junit.Test
    public void testP1L0PoDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogatePoint.Aggregate1L0Po aggregate =
                new ocd.AggregateSurrogatePoint.Aggregate1L0Po();
        final java.util.List<java.awt.Point> testValue = aggregate.getP1L0Po();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.PointAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Po().getP1L0Po());

        final ocd.AggregateSurrogatePoint.Aggregate1L0Po aggregateFound =
                ocd.AggregateSurrogatePoint.Aggregate1L0Po.find(aggregate.getURI());

        final ocd.AggregateSurrogatePoint.Aggregate1L0Po aggregateFound =
                ocd.AggregateSurrogatePoint.Aggregate1L0Po.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.PointAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateFound.getP1L0Po());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L0Po" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L0PoNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<java.awt.Point> testValue = new java.util.ArrayList<java.awt.Point>() {{ add(null); }};
        final ocd.AggregateSurrogatePoint.Aggregate1L0Po aggregate =
                new ocd.AggregateSurrogatePoint.Aggregate1L0Po()
                .setP1L0Po(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.PointAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Po());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogatePoint.Aggregate1L0Po aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogatePoint.Aggregate1L0Po.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.PointAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1L0Po());
    }

    /* Testing the "p1L0Po" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP1L0PoNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<java.awt.Point> testValue = new java.util.ArrayList<java.awt.Point>() {{ add(null); }};
        final ocd.AggregateSurrogatePoint.Aggregate1L0Po aggregate =
                new ocd.AggregateSurrogatePoint.Aggregate1L0Po()
                .setP1L0Po(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.PointAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Po().getP1L0Po());

        final ocd.AggregateSurrogatePoint.Aggregate1L0Po aggregateFound =
                ocd.AggregateSurrogatePoint.Aggregate1L0Po.find(aggregate.getURI());

        final ocd.AggregateSurrogatePoint.Aggregate1L0Po aggregateFound =
                ocd.AggregateSurrogatePoint.Aggregate1L0Po.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.PointAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateFound.getP1L0Po());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L0Po" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L0PoNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<java.awt.Point> testValue = new java.util.ArrayList<java.awt.Point>() {{ add(new java.awt.Point()); }};
        final ocd.AggregateSurrogatePoint.Aggregate1L0Po aggregate =
                new ocd.AggregateSurrogatePoint.Aggregate1L0Po()
                .setP1L0Po(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.PointAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Po());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogatePoint.Aggregate1L0Po aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogatePoint.Aggregate1L0Po.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.PointAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1L0Po());
    }

    /* Testing the "p1L0Po" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP1L0PoNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<java.awt.Point> testValue = new java.util.ArrayList<java.awt.Point>() {{ add(new java.awt.Point()); }};
        final ocd.AggregateSurrogatePoint.Aggregate1L0Po aggregate =
                new ocd.AggregateSurrogatePoint.Aggregate1L0Po()
                .setP1L0Po(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.PointAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Po().getP1L0Po());

        final ocd.AggregateSurrogatePoint.Aggregate1L0Po aggregateFound =
                ocd.AggregateSurrogatePoint.Aggregate1L0Po.find(aggregate.getURI());

        final ocd.AggregateSurrogatePoint.Aggregate1L0Po aggregateFound =
                ocd.AggregateSurrogatePoint.Aggregate1L0Po.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.PointAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateFound.getP1L0Po());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L0Po" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L0PoNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<java.awt.Point> testValue = new java.util.ArrayList<java.awt.Point>() {{ add(new java.awt.Point(0, 1000000000)); }};
        final ocd.AggregateSurrogatePoint.Aggregate1L0Po aggregate =
                new ocd.AggregateSurrogatePoint.Aggregate1L0Po()
                .setP1L0Po(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.PointAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Po());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogatePoint.Aggregate1L0Po aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogatePoint.Aggregate1L0Po.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.PointAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1L0Po());
    }

    /* Testing the "p1L0Po" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP1L0PoNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<java.awt.Point> testValue = new java.util.ArrayList<java.awt.Point>() {{ add(new java.awt.Point(0, 1000000000)); }};
        final ocd.AggregateSurrogatePoint.Aggregate1L0Po aggregate =
                new ocd.AggregateSurrogatePoint.Aggregate1L0Po()
                .setP1L0Po(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.PointAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Po().getP1L0Po());

        final ocd.AggregateSurrogatePoint.Aggregate1L0Po aggregateFound =
                ocd.AggregateSurrogatePoint.Aggregate1L0Po.find(aggregate.getURI());

        final ocd.AggregateSurrogatePoint.Aggregate1L0Po aggregateFound =
                ocd.AggregateSurrogatePoint.Aggregate1L0Po.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.PointAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateFound.getP1L0Po());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L0Po" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L0PoNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<java.awt.Point> testValue = new java.util.ArrayList<java.awt.Point>() {{ add(new java.awt.Point()); add(new java.awt.Point(Integer.MIN_VALUE, Integer.MIN_VALUE)); add(new java.awt.Point(Integer.MAX_VALUE, Integer.MAX_VALUE)); add(new java.awt.Point(0, -1000000000)); add(new java.awt.Point(0, 1000000000)); }};
        final ocd.AggregateSurrogatePoint.Aggregate1L0Po aggregate =
                new ocd.AggregateSurrogatePoint.Aggregate1L0Po()
                .setP1L0Po(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.PointAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Po());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogatePoint.Aggregate1L0Po aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogatePoint.Aggregate1L0Po.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.PointAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1L0Po());
    }

    /* Testing the "p1L0Po" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP1L0PoNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<java.awt.Point> testValue = new java.util.ArrayList<java.awt.Point>() {{ add(new java.awt.Point()); add(new java.awt.Point(Integer.MIN_VALUE, Integer.MIN_VALUE)); add(new java.awt.Point(Integer.MAX_VALUE, Integer.MAX_VALUE)); add(new java.awt.Point(0, -1000000000)); add(new java.awt.Point(0, 1000000000)); }};
        final ocd.AggregateSurrogatePoint.Aggregate1L0Po aggregate =
                new ocd.AggregateSurrogatePoint.Aggregate1L0Po()
                .setP1L0Po(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.PointAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Po().getP1L0Po());

        final ocd.AggregateSurrogatePoint.Aggregate1L0Po aggregateFound =
                ocd.AggregateSurrogatePoint.Aggregate1L0Po.find(aggregate.getURI());

        final ocd.AggregateSurrogatePoint.Aggregate1L0Po aggregateFound =
                ocd.AggregateSurrogatePoint.Aggregate1L0Po.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.PointAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateFound.getP1L0Po());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L0Po" NonDefault5 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L0PoNonDefault5PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<java.awt.Point> testValue = new java.util.ArrayList<java.awt.Point>() {{ add(null); add(new java.awt.Point()); add(new java.awt.Point(Integer.MIN_VALUE, Integer.MIN_VALUE)); add(new java.awt.Point(Integer.MAX_VALUE, Integer.MAX_VALUE)); add(new java.awt.Point(0, -1000000000)); add(new java.awt.Point(0, 1000000000)); }};
        final ocd.AggregateSurrogatePoint.Aggregate1L0Po aggregate =
                new ocd.AggregateSurrogatePoint.Aggregate1L0Po()
                .setP1L0Po(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.PointAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Po());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogatePoint.Aggregate1L0Po aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogatePoint.Aggregate1L0Po.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.PointAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1L0Po());
    }

    /* Testing the "p1L0Po" NonDefault5 property value after active record persist */
    @org.junit.Test
    public void testP1L0PoNonDefault5PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<java.awt.Point> testValue = new java.util.ArrayList<java.awt.Point>() {{ add(null); add(new java.awt.Point()); add(new java.awt.Point(Integer.MIN_VALUE, Integer.MIN_VALUE)); add(new java.awt.Point(Integer.MAX_VALUE, Integer.MAX_VALUE)); add(new java.awt.Point(0, -1000000000)); add(new java.awt.Point(0, 1000000000)); }};
        final ocd.AggregateSurrogatePoint.Aggregate1L0Po aggregate =
                new ocd.AggregateSurrogatePoint.Aggregate1L0Po()
                .setP1L0Po(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.PointAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Po().getP1L0Po());

        final ocd.AggregateSurrogatePoint.Aggregate1L0Po aggregateFound =
                ocd.AggregateSurrogatePoint.Aggregate1L0Po.find(aggregate.getURI());

        final ocd.AggregateSurrogatePoint.Aggregate1L0Po aggregateFound =
                ocd.AggregateSurrogatePoint.Aggregate1L0Po.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.PointAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateFound.getP1L0Po());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
