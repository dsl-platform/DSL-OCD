package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndNullableListOfOneDoublesPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateDouble.Aggregate0L1Do> aggregate0L1DoRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndNullableListOfOneDoublesPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate0L1DoRepository = locator.resolve(ocd.AggregateSurrogateDouble.repositories.Aggregate0L1DoRepository.class);
    }

    /* Testing the "p0L1Do" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP0L1DoDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateDouble.Aggregate0L1Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate0L1Do();
        final java.util.List<Double> testValue = aggregate.getP0L1Do();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregate.getP0L1Do());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDouble.Aggregate0L1Do aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDouble.Aggregate0L1Do.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregateDeserialized.getP0L1Do());
    }

    /* Testing the "p0L1Do" Default property value after active record persist */
    @org.junit.Test
    public void testP0L1DoDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateDouble.Aggregate0L1Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate0L1Do();
        final java.util.List<Double> testValue = aggregate.getP0L1Do();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregate.getP0L1Do().getP0L1Do());

        final ocd.AggregateSurrogateDouble.Aggregate0L1Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate0L1Do.find(aggregate.getURI());

        final ocd.AggregateSurrogateDouble.Aggregate0L1Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate0L1Do.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregateFound.getP0L1Do());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0L1Do" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0L1DoNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<Double> testValue = new java.util.ArrayList<Double>() {{ add(0.0); }};
        final ocd.AggregateSurrogateDouble.Aggregate0L1Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate0L1Do()
                .setP0L1Do(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregate.getP0L1Do());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDouble.Aggregate0L1Do aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDouble.Aggregate0L1Do.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregateDeserialized.getP0L1Do());
    }

    /* Testing the "p0L1Do" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP0L1DoNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<Double> testValue = new java.util.ArrayList<Double>() {{ add(0.0); }};
        final ocd.AggregateSurrogateDouble.Aggregate0L1Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate0L1Do()
                .setP0L1Do(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregate.getP0L1Do().getP0L1Do());

        final ocd.AggregateSurrogateDouble.Aggregate0L1Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate0L1Do.find(aggregate.getURI());

        final ocd.AggregateSurrogateDouble.Aggregate0L1Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate0L1Do.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregateFound.getP0L1Do());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0L1Do" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0L1DoNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<Double> testValue = new java.util.ArrayList<Double>() {{ add(Double.NaN); }};
        final ocd.AggregateSurrogateDouble.Aggregate0L1Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate0L1Do()
                .setP0L1Do(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregate.getP0L1Do());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDouble.Aggregate0L1Do aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDouble.Aggregate0L1Do.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregateDeserialized.getP0L1Do());
    }

    /* Testing the "p0L1Do" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP0L1DoNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<Double> testValue = new java.util.ArrayList<Double>() {{ add(Double.NaN); }};
        final ocd.AggregateSurrogateDouble.Aggregate0L1Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate0L1Do()
                .setP0L1Do(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregate.getP0L1Do().getP0L1Do());

        final ocd.AggregateSurrogateDouble.Aggregate0L1Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate0L1Do.find(aggregate.getURI());

        final ocd.AggregateSurrogateDouble.Aggregate0L1Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate0L1Do.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregateFound.getP0L1Do());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0L1Do" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0L1DoNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<Double> testValue = new java.util.ArrayList<Double>() {{ add(0.0); add(1E-307); add(9E307); add(-1.23456789012345E-10); add(1.23456789012345E20); add(Double.NEGATIVE_INFINITY); add(Double.POSITIVE_INFINITY); add(Double.NaN); }};
        final ocd.AggregateSurrogateDouble.Aggregate0L1Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate0L1Do()
                .setP0L1Do(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregate.getP0L1Do());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDouble.Aggregate0L1Do aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDouble.Aggregate0L1Do.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregateDeserialized.getP0L1Do());
    }

    /* Testing the "p0L1Do" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP0L1DoNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<Double> testValue = new java.util.ArrayList<Double>() {{ add(0.0); add(1E-307); add(9E307); add(-1.23456789012345E-10); add(1.23456789012345E20); add(Double.NEGATIVE_INFINITY); add(Double.POSITIVE_INFINITY); add(Double.NaN); }};
        final ocd.AggregateSurrogateDouble.Aggregate0L1Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate0L1Do()
                .setP0L1Do(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregate.getP0L1Do().getP0L1Do());

        final ocd.AggregateSurrogateDouble.Aggregate0L1Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate0L1Do.find(aggregate.getURI());

        final ocd.AggregateSurrogateDouble.Aggregate0L1Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate0L1Do.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregateFound.getP0L1Do());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
