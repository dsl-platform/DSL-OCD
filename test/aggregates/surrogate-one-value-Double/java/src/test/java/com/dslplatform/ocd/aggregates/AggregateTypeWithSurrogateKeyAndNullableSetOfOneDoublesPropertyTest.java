package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndNullableSetOfOneDoublesPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateDouble.Aggregate0S1Do> aggregate0S1DoRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndNullableSetOfOneDoublesPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate0S1DoRepository = locator.resolve(ocd.AggregateSurrogateDouble.repositories.Aggregate0S1DoRepository.class);
    }

    /* Testing the "p0S1Do" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S1DoDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateDouble.Aggregate0S1Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate0S1Do();
        final java.util.Set<Double> testValue = aggregate.getP0S1Do();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Do());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDouble.Aggregate0S1Do aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDouble.Aggregate0S1Do.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP0S1Do());
    }

    /* Testing the "p0S1Do" Default property value after active record persist */
    @org.junit.Test
    public void testP0S1DoDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateDouble.Aggregate0S1Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate0S1Do();
        final java.util.Set<Double> testValue = aggregate.getP0S1Do();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Do().getP0S1Do());

        final ocd.AggregateSurrogateDouble.Aggregate0S1Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate0S1Do.find(aggregate.getURI());

        final ocd.AggregateSurrogateDouble.Aggregate0S1Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate0S1Do.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateFound.getP0S1Do());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0S1Do" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S1DoNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<Double> testValue = new java.util.HashSet<Double>() {{ add(0.0); }};
        final ocd.AggregateSurrogateDouble.Aggregate0S1Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate0S1Do()
                .setP0S1Do(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Do());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDouble.Aggregate0S1Do aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDouble.Aggregate0S1Do.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP0S1Do());
    }

    /* Testing the "p0S1Do" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP0S1DoNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<Double> testValue = new java.util.HashSet<Double>() {{ add(0.0); }};
        final ocd.AggregateSurrogateDouble.Aggregate0S1Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate0S1Do()
                .setP0S1Do(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Do().getP0S1Do());

        final ocd.AggregateSurrogateDouble.Aggregate0S1Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate0S1Do.find(aggregate.getURI());

        final ocd.AggregateSurrogateDouble.Aggregate0S1Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate0S1Do.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateFound.getP0S1Do());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0S1Do" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S1DoNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<Double> testValue = new java.util.HashSet<Double>() {{ add(Double.NaN); }};
        final ocd.AggregateSurrogateDouble.Aggregate0S1Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate0S1Do()
                .setP0S1Do(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Do());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDouble.Aggregate0S1Do aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDouble.Aggregate0S1Do.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP0S1Do());
    }

    /* Testing the "p0S1Do" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP0S1DoNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<Double> testValue = new java.util.HashSet<Double>() {{ add(Double.NaN); }};
        final ocd.AggregateSurrogateDouble.Aggregate0S1Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate0S1Do()
                .setP0S1Do(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Do().getP0S1Do());

        final ocd.AggregateSurrogateDouble.Aggregate0S1Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate0S1Do.find(aggregate.getURI());

        final ocd.AggregateSurrogateDouble.Aggregate0S1Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate0S1Do.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateFound.getP0S1Do());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0S1Do" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S1DoNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<Double> testValue = new java.util.HashSet<Double>() {{ add(0.0); add(1E-307); add(9E307); add(-1.23456789012345E-10); add(1.23456789012345E20); add(Double.NEGATIVE_INFINITY); add(Double.POSITIVE_INFINITY); add(Double.NaN); }};
        final ocd.AggregateSurrogateDouble.Aggregate0S1Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate0S1Do()
                .setP0S1Do(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Do());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDouble.Aggregate0S1Do aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDouble.Aggregate0S1Do.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP0S1Do());
    }

    /* Testing the "p0S1Do" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP0S1DoNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<Double> testValue = new java.util.HashSet<Double>() {{ add(0.0); add(1E-307); add(9E307); add(-1.23456789012345E-10); add(1.23456789012345E20); add(Double.NEGATIVE_INFINITY); add(Double.POSITIVE_INFINITY); add(Double.NaN); }};
        final ocd.AggregateSurrogateDouble.Aggregate0S1Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate0S1Do()
                .setP0S1Do(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Do().getP0S1Do());

        final ocd.AggregateSurrogateDouble.Aggregate0S1Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate0S1Do.find(aggregate.getURI());

        final ocd.AggregateSurrogateDouble.Aggregate0S1Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate0S1Do.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateFound.getP0S1Do());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
