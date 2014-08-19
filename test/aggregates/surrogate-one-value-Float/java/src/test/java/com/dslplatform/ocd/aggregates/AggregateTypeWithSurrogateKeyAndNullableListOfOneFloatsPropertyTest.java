package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndNullableListOfOneFloatsPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateFloat.Aggregate0L1Fl> aggregate0L1FlRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndNullableListOfOneFloatsPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate0L1FlRepository = locator.resolve(ocd.AggregateSurrogateFloat.repositories.Aggregate0L1FlRepository.class);
    }

    /* Testing the "p0L1Fl" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP0L1FlDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateFloat.Aggregate0L1Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0L1Fl();
        final java.util.List<Float> testValue = aggregate.getP0L1Fl();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregate.getP0L1Fl());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateFloat.Aggregate0L1Fl aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateFloat.Aggregate0L1Fl.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregateDeserialized.getP0L1Fl());
    }

    /* Testing the "p0L1Fl" Default property value after active record persist */
    @org.junit.Test
    public void testP0L1FlDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateFloat.Aggregate0L1Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0L1Fl();
        final java.util.List<Float> testValue = aggregate.getP0L1Fl();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregate.getP0L1Fl().getP0L1Fl());

        final ocd.AggregateSurrogateFloat.Aggregate0L1Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0L1Fl.find(aggregate.getURI());

        final ocd.AggregateSurrogateFloat.Aggregate0L1Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0L1Fl.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregateFound.getP0L1Fl());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0L1Fl" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0L1FlNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<Float> testValue = new java.util.ArrayList<Float>() {{ add(0.0f); }};
        final ocd.AggregateSurrogateFloat.Aggregate0L1Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0L1Fl()
                .setP0L1Fl(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregate.getP0L1Fl());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateFloat.Aggregate0L1Fl aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateFloat.Aggregate0L1Fl.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregateDeserialized.getP0L1Fl());
    }

    /* Testing the "p0L1Fl" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP0L1FlNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<Float> testValue = new java.util.ArrayList<Float>() {{ add(0.0f); }};
        final ocd.AggregateSurrogateFloat.Aggregate0L1Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0L1Fl()
                .setP0L1Fl(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregate.getP0L1Fl().getP0L1Fl());

        final ocd.AggregateSurrogateFloat.Aggregate0L1Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0L1Fl.find(aggregate.getURI());

        final ocd.AggregateSurrogateFloat.Aggregate0L1Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0L1Fl.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregateFound.getP0L1Fl());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0L1Fl" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0L1FlNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<Float> testValue = new java.util.ArrayList<Float>() {{ add(Float.POSITIVE_INFINITY); }};
        final ocd.AggregateSurrogateFloat.Aggregate0L1Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0L1Fl()
                .setP0L1Fl(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregate.getP0L1Fl());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateFloat.Aggregate0L1Fl aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateFloat.Aggregate0L1Fl.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregateDeserialized.getP0L1Fl());
    }

    /* Testing the "p0L1Fl" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP0L1FlNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<Float> testValue = new java.util.ArrayList<Float>() {{ add(Float.POSITIVE_INFINITY); }};
        final ocd.AggregateSurrogateFloat.Aggregate0L1Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0L1Fl()
                .setP0L1Fl(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregate.getP0L1Fl().getP0L1Fl());

        final ocd.AggregateSurrogateFloat.Aggregate0L1Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0L1Fl.find(aggregate.getURI());

        final ocd.AggregateSurrogateFloat.Aggregate0L1Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0L1Fl.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregateFound.getP0L1Fl());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0L1Fl" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0L1FlNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<Float> testValue = new java.util.ArrayList<Float>() {{ add(0.0f); add(-1.2345E-10f); add(1.2345E20f); add(-1E-5f); add(Float.NaN); add(Float.NEGATIVE_INFINITY); add(Float.POSITIVE_INFINITY); }};
        final ocd.AggregateSurrogateFloat.Aggregate0L1Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0L1Fl()
                .setP0L1Fl(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregate.getP0L1Fl());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateFloat.Aggregate0L1Fl aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateFloat.Aggregate0L1Fl.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregateDeserialized.getP0L1Fl());
    }

    /* Testing the "p0L1Fl" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP0L1FlNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<Float> testValue = new java.util.ArrayList<Float>() {{ add(0.0f); add(-1.2345E-10f); add(1.2345E20f); add(-1E-5f); add(Float.NaN); add(Float.NEGATIVE_INFINITY); add(Float.POSITIVE_INFINITY); }};
        final ocd.AggregateSurrogateFloat.Aggregate0L1Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0L1Fl()
                .setP0L1Fl(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregate.getP0L1Fl().getP0L1Fl());

        final ocd.AggregateSurrogateFloat.Aggregate0L1Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0L1Fl.find(aggregate.getURI());

        final ocd.AggregateSurrogateFloat.Aggregate0L1Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0L1Fl.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregateFound.getP0L1Fl());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
