package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndNullableListOfNullableFloatsPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateFloat.Aggregate0L0Fl> aggregate0L0FlRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndNullableListOfNullableFloatsPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate0L0FlRepository = locator.resolve(ocd.AggregateSurrogateFloat.repositories.Aggregate0L0FlRepository.class);
    }

    /* Testing the "p0L0Fl" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP0L0FlDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateFloat.Aggregate0L0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0L0Fl();
        final java.util.List<Float> testValue = aggregate.getP0L0Fl();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Fl());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateFloat.Aggregate0L0Fl aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateFloat.Aggregate0L0Fl.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0L0Fl());
    }

    /* Testing the "p0L0Fl" Default property value after active record persist */
    @org.junit.Test
    public void testP0L0FlDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateFloat.Aggregate0L0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0L0Fl();
        final java.util.List<Float> testValue = aggregate.getP0L0Fl();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Fl().getP0L0Fl());

        final ocd.AggregateSurrogateFloat.Aggregate0L0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0L0Fl.find(aggregate.getURI());

        final ocd.AggregateSurrogateFloat.Aggregate0L0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0L0Fl.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateFound.getP0L0Fl());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0L0Fl" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0L0FlNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<Float> testValue = new java.util.ArrayList<Float>() {{ add(null); }};
        final ocd.AggregateSurrogateFloat.Aggregate0L0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0L0Fl()
                .setP0L0Fl(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Fl());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateFloat.Aggregate0L0Fl aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateFloat.Aggregate0L0Fl.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0L0Fl());
    }

    /* Testing the "p0L0Fl" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP0L0FlNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<Float> testValue = new java.util.ArrayList<Float>() {{ add(null); }};
        final ocd.AggregateSurrogateFloat.Aggregate0L0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0L0Fl()
                .setP0L0Fl(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Fl().getP0L0Fl());

        final ocd.AggregateSurrogateFloat.Aggregate0L0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0L0Fl.find(aggregate.getURI());

        final ocd.AggregateSurrogateFloat.Aggregate0L0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0L0Fl.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateFound.getP0L0Fl());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0L0Fl" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0L0FlNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<Float> testValue = new java.util.ArrayList<Float>() {{ add(0.0f); }};
        final ocd.AggregateSurrogateFloat.Aggregate0L0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0L0Fl()
                .setP0L0Fl(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Fl());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateFloat.Aggregate0L0Fl aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateFloat.Aggregate0L0Fl.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0L0Fl());
    }

    /* Testing the "p0L0Fl" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP0L0FlNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<Float> testValue = new java.util.ArrayList<Float>() {{ add(0.0f); }};
        final ocd.AggregateSurrogateFloat.Aggregate0L0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0L0Fl()
                .setP0L0Fl(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Fl().getP0L0Fl());

        final ocd.AggregateSurrogateFloat.Aggregate0L0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0L0Fl.find(aggregate.getURI());

        final ocd.AggregateSurrogateFloat.Aggregate0L0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0L0Fl.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateFound.getP0L0Fl());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0L0Fl" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0L0FlNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<Float> testValue = new java.util.ArrayList<Float>() {{ add(Float.POSITIVE_INFINITY); }};
        final ocd.AggregateSurrogateFloat.Aggregate0L0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0L0Fl()
                .setP0L0Fl(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Fl());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateFloat.Aggregate0L0Fl aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateFloat.Aggregate0L0Fl.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0L0Fl());
    }

    /* Testing the "p0L0Fl" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP0L0FlNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<Float> testValue = new java.util.ArrayList<Float>() {{ add(Float.POSITIVE_INFINITY); }};
        final ocd.AggregateSurrogateFloat.Aggregate0L0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0L0Fl()
                .setP0L0Fl(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Fl().getP0L0Fl());

        final ocd.AggregateSurrogateFloat.Aggregate0L0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0L0Fl.find(aggregate.getURI());

        final ocd.AggregateSurrogateFloat.Aggregate0L0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0L0Fl.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateFound.getP0L0Fl());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0L0Fl" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0L0FlNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<Float> testValue = new java.util.ArrayList<Float>() {{ add(0.0f); add(-1.2345E-10f); add(1.2345E20f); add(-1E-5f); add(Float.NaN); add(Float.NEGATIVE_INFINITY); add(Float.POSITIVE_INFINITY); }};
        final ocd.AggregateSurrogateFloat.Aggregate0L0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0L0Fl()
                .setP0L0Fl(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Fl());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateFloat.Aggregate0L0Fl aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateFloat.Aggregate0L0Fl.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0L0Fl());
    }

    /* Testing the "p0L0Fl" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP0L0FlNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<Float> testValue = new java.util.ArrayList<Float>() {{ add(0.0f); add(-1.2345E-10f); add(1.2345E20f); add(-1E-5f); add(Float.NaN); add(Float.NEGATIVE_INFINITY); add(Float.POSITIVE_INFINITY); }};
        final ocd.AggregateSurrogateFloat.Aggregate0L0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0L0Fl()
                .setP0L0Fl(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Fl().getP0L0Fl());

        final ocd.AggregateSurrogateFloat.Aggregate0L0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0L0Fl.find(aggregate.getURI());

        final ocd.AggregateSurrogateFloat.Aggregate0L0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0L0Fl.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateFound.getP0L0Fl());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0L0Fl" NonDefault5 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0L0FlNonDefault5PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<Float> testValue = new java.util.ArrayList<Float>() {{ add(null); add(0.0f); add(-1.2345E-10f); add(1.2345E20f); add(-1E-5f); add(Float.NaN); add(Float.NEGATIVE_INFINITY); add(Float.POSITIVE_INFINITY); }};
        final ocd.AggregateSurrogateFloat.Aggregate0L0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0L0Fl()
                .setP0L0Fl(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Fl());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateFloat.Aggregate0L0Fl aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateFloat.Aggregate0L0Fl.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0L0Fl());
    }

    /* Testing the "p0L0Fl" NonDefault5 property value after active record persist */
    @org.junit.Test
    public void testP0L0FlNonDefault5PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<Float> testValue = new java.util.ArrayList<Float>() {{ add(null); add(0.0f); add(-1.2345E-10f); add(1.2345E20f); add(-1E-5f); add(Float.NaN); add(Float.NEGATIVE_INFINITY); add(Float.POSITIVE_INFINITY); }};
        final ocd.AggregateSurrogateFloat.Aggregate0L0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0L0Fl()
                .setP0L0Fl(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Fl().getP0L0Fl());

        final ocd.AggregateSurrogateFloat.Aggregate0L0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0L0Fl.find(aggregate.getURI());

        final ocd.AggregateSurrogateFloat.Aggregate0L0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0L0Fl.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateFound.getP0L0Fl());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
