package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndNullableSetOfNullablePointsPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogatePoint.Aggregate0S0Po> aggregate0S0PoRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndNullableSetOfNullablePointsPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate0S0PoRepository = locator.resolve(ocd.AggregateSurrogatePoint.repositories.Aggregate0S0PoRepository.class);
    }

    /* Testing the "p0S0Po" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S0PoDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogatePoint.Aggregate0S0Po aggregate =
                new ocd.AggregateSurrogatePoint.Aggregate0S0Po();
        final java.util.Set<java.awt.Point> testValue = aggregate.getP0S0Po();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.PointAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregate.getP0S0Po());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogatePoint.Aggregate0S0Po aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogatePoint.Aggregate0S0Po.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.PointAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0S0Po());
    }

    /* Testing the "p0S0Po" Default property value after active record persist */
    @org.junit.Test
    public void testP0S0PoDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogatePoint.Aggregate0S0Po aggregate =
                new ocd.AggregateSurrogatePoint.Aggregate0S0Po();
        final java.util.Set<java.awt.Point> testValue = aggregate.getP0S0Po();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.PointAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregate.getP0S0Po().getP0S0Po());

        final ocd.AggregateSurrogatePoint.Aggregate0S0Po aggregateFound =
                ocd.AggregateSurrogatePoint.Aggregate0S0Po.find(aggregate.getURI());

        final ocd.AggregateSurrogatePoint.Aggregate0S0Po aggregateFound =
                ocd.AggregateSurrogatePoint.Aggregate0S0Po.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.PointAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregateFound.getP0S0Po());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0S0Po" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S0PoNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<java.awt.Point> testValue = new java.util.HashSet<java.awt.Point>() {{ add(null); }};
        final ocd.AggregateSurrogatePoint.Aggregate0S0Po aggregate =
                new ocd.AggregateSurrogatePoint.Aggregate0S0Po()
                .setP0S0Po(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.PointAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregate.getP0S0Po());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogatePoint.Aggregate0S0Po aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogatePoint.Aggregate0S0Po.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.PointAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0S0Po());
    }

    /* Testing the "p0S0Po" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP0S0PoNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<java.awt.Point> testValue = new java.util.HashSet<java.awt.Point>() {{ add(null); }};
        final ocd.AggregateSurrogatePoint.Aggregate0S0Po aggregate =
                new ocd.AggregateSurrogatePoint.Aggregate0S0Po()
                .setP0S0Po(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.PointAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregate.getP0S0Po().getP0S0Po());

        final ocd.AggregateSurrogatePoint.Aggregate0S0Po aggregateFound =
                ocd.AggregateSurrogatePoint.Aggregate0S0Po.find(aggregate.getURI());

        final ocd.AggregateSurrogatePoint.Aggregate0S0Po aggregateFound =
                ocd.AggregateSurrogatePoint.Aggregate0S0Po.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.PointAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregateFound.getP0S0Po());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0S0Po" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S0PoNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<java.awt.Point> testValue = new java.util.HashSet<java.awt.Point>() {{ add(new java.awt.Point()); }};
        final ocd.AggregateSurrogatePoint.Aggregate0S0Po aggregate =
                new ocd.AggregateSurrogatePoint.Aggregate0S0Po()
                .setP0S0Po(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.PointAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregate.getP0S0Po());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogatePoint.Aggregate0S0Po aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogatePoint.Aggregate0S0Po.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.PointAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0S0Po());
    }

    /* Testing the "p0S0Po" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP0S0PoNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<java.awt.Point> testValue = new java.util.HashSet<java.awt.Point>() {{ add(new java.awt.Point()); }};
        final ocd.AggregateSurrogatePoint.Aggregate0S0Po aggregate =
                new ocd.AggregateSurrogatePoint.Aggregate0S0Po()
                .setP0S0Po(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.PointAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregate.getP0S0Po().getP0S0Po());

        final ocd.AggregateSurrogatePoint.Aggregate0S0Po aggregateFound =
                ocd.AggregateSurrogatePoint.Aggregate0S0Po.find(aggregate.getURI());

        final ocd.AggregateSurrogatePoint.Aggregate0S0Po aggregateFound =
                ocd.AggregateSurrogatePoint.Aggregate0S0Po.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.PointAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregateFound.getP0S0Po());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0S0Po" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S0PoNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<java.awt.Point> testValue = new java.util.HashSet<java.awt.Point>() {{ add(new java.awt.Point(0, 1000000000)); }};
        final ocd.AggregateSurrogatePoint.Aggregate0S0Po aggregate =
                new ocd.AggregateSurrogatePoint.Aggregate0S0Po()
                .setP0S0Po(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.PointAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregate.getP0S0Po());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogatePoint.Aggregate0S0Po aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogatePoint.Aggregate0S0Po.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.PointAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0S0Po());
    }

    /* Testing the "p0S0Po" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP0S0PoNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<java.awt.Point> testValue = new java.util.HashSet<java.awt.Point>() {{ add(new java.awt.Point(0, 1000000000)); }};
        final ocd.AggregateSurrogatePoint.Aggregate0S0Po aggregate =
                new ocd.AggregateSurrogatePoint.Aggregate0S0Po()
                .setP0S0Po(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.PointAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregate.getP0S0Po().getP0S0Po());

        final ocd.AggregateSurrogatePoint.Aggregate0S0Po aggregateFound =
                ocd.AggregateSurrogatePoint.Aggregate0S0Po.find(aggregate.getURI());

        final ocd.AggregateSurrogatePoint.Aggregate0S0Po aggregateFound =
                ocd.AggregateSurrogatePoint.Aggregate0S0Po.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.PointAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregateFound.getP0S0Po());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0S0Po" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S0PoNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<java.awt.Point> testValue = new java.util.HashSet<java.awt.Point>() {{ add(new java.awt.Point()); add(new java.awt.Point(Integer.MIN_VALUE, Integer.MIN_VALUE)); add(new java.awt.Point(Integer.MAX_VALUE, Integer.MAX_VALUE)); add(new java.awt.Point(0, -1000000000)); add(new java.awt.Point(0, 1000000000)); }};
        final ocd.AggregateSurrogatePoint.Aggregate0S0Po aggregate =
                new ocd.AggregateSurrogatePoint.Aggregate0S0Po()
                .setP0S0Po(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.PointAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregate.getP0S0Po());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogatePoint.Aggregate0S0Po aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogatePoint.Aggregate0S0Po.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.PointAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0S0Po());
    }

    /* Testing the "p0S0Po" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP0S0PoNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<java.awt.Point> testValue = new java.util.HashSet<java.awt.Point>() {{ add(new java.awt.Point()); add(new java.awt.Point(Integer.MIN_VALUE, Integer.MIN_VALUE)); add(new java.awt.Point(Integer.MAX_VALUE, Integer.MAX_VALUE)); add(new java.awt.Point(0, -1000000000)); add(new java.awt.Point(0, 1000000000)); }};
        final ocd.AggregateSurrogatePoint.Aggregate0S0Po aggregate =
                new ocd.AggregateSurrogatePoint.Aggregate0S0Po()
                .setP0S0Po(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.PointAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregate.getP0S0Po().getP0S0Po());

        final ocd.AggregateSurrogatePoint.Aggregate0S0Po aggregateFound =
                ocd.AggregateSurrogatePoint.Aggregate0S0Po.find(aggregate.getURI());

        final ocd.AggregateSurrogatePoint.Aggregate0S0Po aggregateFound =
                ocd.AggregateSurrogatePoint.Aggregate0S0Po.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.PointAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregateFound.getP0S0Po());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0S0Po" NonDefault5 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S0PoNonDefault5PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<java.awt.Point> testValue = new java.util.HashSet<java.awt.Point>() {{ add(null); add(new java.awt.Point()); add(new java.awt.Point(Integer.MIN_VALUE, Integer.MIN_VALUE)); add(new java.awt.Point(Integer.MAX_VALUE, Integer.MAX_VALUE)); add(new java.awt.Point(0, -1000000000)); add(new java.awt.Point(0, 1000000000)); }};
        final ocd.AggregateSurrogatePoint.Aggregate0S0Po aggregate =
                new ocd.AggregateSurrogatePoint.Aggregate0S0Po()
                .setP0S0Po(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.PointAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregate.getP0S0Po());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogatePoint.Aggregate0S0Po aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogatePoint.Aggregate0S0Po.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.PointAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0S0Po());
    }

    /* Testing the "p0S0Po" NonDefault5 property value after active record persist */
    @org.junit.Test
    public void testP0S0PoNonDefault5PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<java.awt.Point> testValue = new java.util.HashSet<java.awt.Point>() {{ add(null); add(new java.awt.Point()); add(new java.awt.Point(Integer.MIN_VALUE, Integer.MIN_VALUE)); add(new java.awt.Point(Integer.MAX_VALUE, Integer.MAX_VALUE)); add(new java.awt.Point(0, -1000000000)); add(new java.awt.Point(0, 1000000000)); }};
        final ocd.AggregateSurrogatePoint.Aggregate0S0Po aggregate =
                new ocd.AggregateSurrogatePoint.Aggregate0S0Po()
                .setP0S0Po(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.PointAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregate.getP0S0Po().getP0S0Po());

        final ocd.AggregateSurrogatePoint.Aggregate0S0Po aggregateFound =
                ocd.AggregateSurrogatePoint.Aggregate0S0Po.find(aggregate.getURI());

        final ocd.AggregateSurrogatePoint.Aggregate0S0Po aggregateFound =
                ocd.AggregateSurrogatePoint.Aggregate0S0Po.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.PointAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregateFound.getP0S0Po());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
