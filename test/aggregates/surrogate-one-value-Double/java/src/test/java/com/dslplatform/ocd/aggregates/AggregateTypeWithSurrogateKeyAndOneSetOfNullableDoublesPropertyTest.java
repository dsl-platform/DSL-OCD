package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndOneSetOfNullableDoublesPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateDouble.Aggregate1S0Do> aggregate1S0DoRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndOneSetOfNullableDoublesPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate1S0DoRepository = locator.resolve(ocd.AggregateSurrogateDouble.repositories.Aggregate1S0DoRepository.class);
    }

    /* Testing the "p1S0Do" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S0DoDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateDouble.Aggregate1S0Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate1S0Do();
        final java.util.Set<Double> testValue = aggregate.getP1S0Do();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Do());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDouble.Aggregate1S0Do aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDouble.Aggregate1S0Do.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1S0Do());
    }

    /* Testing the "p1S0Do" Default property value after active record persist */
    @org.junit.Test
    public void testP1S0DoDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateDouble.Aggregate1S0Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate1S0Do();
        final java.util.Set<Double> testValue = aggregate.getP1S0Do();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Do().getP1S0Do());

        final ocd.AggregateSurrogateDouble.Aggregate1S0Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate1S0Do.find(aggregate.getURI());

        final ocd.AggregateSurrogateDouble.Aggregate1S0Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate1S0Do.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateFound.getP1S0Do());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1S0Do" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S0DoNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<Double> testValue = new java.util.HashSet<Double>() {{ add(null); }};
        final ocd.AggregateSurrogateDouble.Aggregate1S0Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate1S0Do()
                .setP1S0Do(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Do());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDouble.Aggregate1S0Do aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDouble.Aggregate1S0Do.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1S0Do());
    }

    /* Testing the "p1S0Do" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP1S0DoNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<Double> testValue = new java.util.HashSet<Double>() {{ add(null); }};
        final ocd.AggregateSurrogateDouble.Aggregate1S0Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate1S0Do()
                .setP1S0Do(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Do().getP1S0Do());

        final ocd.AggregateSurrogateDouble.Aggregate1S0Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate1S0Do.find(aggregate.getURI());

        final ocd.AggregateSurrogateDouble.Aggregate1S0Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate1S0Do.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateFound.getP1S0Do());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1S0Do" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S0DoNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<Double> testValue = new java.util.HashSet<Double>() {{ add(0.0); }};
        final ocd.AggregateSurrogateDouble.Aggregate1S0Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate1S0Do()
                .setP1S0Do(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Do());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDouble.Aggregate1S0Do aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDouble.Aggregate1S0Do.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1S0Do());
    }

    /* Testing the "p1S0Do" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP1S0DoNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<Double> testValue = new java.util.HashSet<Double>() {{ add(0.0); }};
        final ocd.AggregateSurrogateDouble.Aggregate1S0Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate1S0Do()
                .setP1S0Do(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Do().getP1S0Do());

        final ocd.AggregateSurrogateDouble.Aggregate1S0Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate1S0Do.find(aggregate.getURI());

        final ocd.AggregateSurrogateDouble.Aggregate1S0Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate1S0Do.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateFound.getP1S0Do());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1S0Do" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S0DoNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<Double> testValue = new java.util.HashSet<Double>() {{ add(Double.NaN); }};
        final ocd.AggregateSurrogateDouble.Aggregate1S0Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate1S0Do()
                .setP1S0Do(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Do());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDouble.Aggregate1S0Do aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDouble.Aggregate1S0Do.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1S0Do());
    }

    /* Testing the "p1S0Do" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP1S0DoNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<Double> testValue = new java.util.HashSet<Double>() {{ add(Double.NaN); }};
        final ocd.AggregateSurrogateDouble.Aggregate1S0Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate1S0Do()
                .setP1S0Do(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Do().getP1S0Do());

        final ocd.AggregateSurrogateDouble.Aggregate1S0Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate1S0Do.find(aggregate.getURI());

        final ocd.AggregateSurrogateDouble.Aggregate1S0Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate1S0Do.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateFound.getP1S0Do());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1S0Do" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S0DoNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<Double> testValue = new java.util.HashSet<Double>() {{ add(0.0); add(1E-307); add(9E307); add(-1.23456789012345E-10); add(1.23456789012345E20); add(Double.NEGATIVE_INFINITY); add(Double.POSITIVE_INFINITY); add(Double.NaN); }};
        final ocd.AggregateSurrogateDouble.Aggregate1S0Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate1S0Do()
                .setP1S0Do(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Do());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDouble.Aggregate1S0Do aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDouble.Aggregate1S0Do.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1S0Do());
    }

    /* Testing the "p1S0Do" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP1S0DoNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<Double> testValue = new java.util.HashSet<Double>() {{ add(0.0); add(1E-307); add(9E307); add(-1.23456789012345E-10); add(1.23456789012345E20); add(Double.NEGATIVE_INFINITY); add(Double.POSITIVE_INFINITY); add(Double.NaN); }};
        final ocd.AggregateSurrogateDouble.Aggregate1S0Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate1S0Do()
                .setP1S0Do(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Do().getP1S0Do());

        final ocd.AggregateSurrogateDouble.Aggregate1S0Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate1S0Do.find(aggregate.getURI());

        final ocd.AggregateSurrogateDouble.Aggregate1S0Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate1S0Do.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateFound.getP1S0Do());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1S0Do" NonDefault5 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S0DoNonDefault5PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<Double> testValue = new java.util.HashSet<Double>() {{ add(null); add(0.0); add(1E-307); add(9E307); add(-1.23456789012345E-10); add(1.23456789012345E20); add(Double.NEGATIVE_INFINITY); add(Double.POSITIVE_INFINITY); add(Double.NaN); }};
        final ocd.AggregateSurrogateDouble.Aggregate1S0Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate1S0Do()
                .setP1S0Do(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Do());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDouble.Aggregate1S0Do aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDouble.Aggregate1S0Do.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1S0Do());
    }

    /* Testing the "p1S0Do" NonDefault5 property value after active record persist */
    @org.junit.Test
    public void testP1S0DoNonDefault5PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<Double> testValue = new java.util.HashSet<Double>() {{ add(null); add(0.0); add(1E-307); add(9E307); add(-1.23456789012345E-10); add(1.23456789012345E20); add(Double.NEGATIVE_INFINITY); add(Double.POSITIVE_INFINITY); add(Double.NaN); }};
        final ocd.AggregateSurrogateDouble.Aggregate1S0Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate1S0Do()
                .setP1S0Do(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Do().getP1S0Do());

        final ocd.AggregateSurrogateDouble.Aggregate1S0Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate1S0Do.find(aggregate.getURI());

        final ocd.AggregateSurrogateDouble.Aggregate1S0Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate1S0Do.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateFound.getP1S0Do());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
