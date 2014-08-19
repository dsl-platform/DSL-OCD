package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndNullableSetOfNullableFloatsPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateFloat.Aggregate0S0Fl> aggregate0S0FlRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndNullableSetOfNullableFloatsPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate0S0FlRepository = locator.resolve(ocd.AggregateSurrogateFloat.repositories.Aggregate0S0FlRepository.class);
    }

    /* Testing the "p0S0Fl" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S0FlDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateFloat.Aggregate0S0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0S0Fl();
        final java.util.Set<Float> testValue = aggregate.getP0S0Fl();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregate.getP0S0Fl());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateFloat.Aggregate0S0Fl aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateFloat.Aggregate0S0Fl.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0S0Fl());
    }

    /* Testing the "p0S0Fl" Default property value after active record persist */
    @org.junit.Test
    public void testP0S0FlDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateFloat.Aggregate0S0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0S0Fl();
        final java.util.Set<Float> testValue = aggregate.getP0S0Fl();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregate.getP0S0Fl().getP0S0Fl());

        final ocd.AggregateSurrogateFloat.Aggregate0S0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0S0Fl.find(aggregate.getURI());

        final ocd.AggregateSurrogateFloat.Aggregate0S0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0S0Fl.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregateFound.getP0S0Fl());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0S0Fl" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S0FlNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<Float> testValue = new java.util.HashSet<Float>() {{ add(null); }};
        final ocd.AggregateSurrogateFloat.Aggregate0S0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0S0Fl()
                .setP0S0Fl(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregate.getP0S0Fl());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateFloat.Aggregate0S0Fl aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateFloat.Aggregate0S0Fl.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0S0Fl());
    }

    /* Testing the "p0S0Fl" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP0S0FlNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<Float> testValue = new java.util.HashSet<Float>() {{ add(null); }};
        final ocd.AggregateSurrogateFloat.Aggregate0S0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0S0Fl()
                .setP0S0Fl(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregate.getP0S0Fl().getP0S0Fl());

        final ocd.AggregateSurrogateFloat.Aggregate0S0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0S0Fl.find(aggregate.getURI());

        final ocd.AggregateSurrogateFloat.Aggregate0S0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0S0Fl.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregateFound.getP0S0Fl());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0S0Fl" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S0FlNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<Float> testValue = new java.util.HashSet<Float>() {{ add(0.0f); }};
        final ocd.AggregateSurrogateFloat.Aggregate0S0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0S0Fl()
                .setP0S0Fl(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregate.getP0S0Fl());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateFloat.Aggregate0S0Fl aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateFloat.Aggregate0S0Fl.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0S0Fl());
    }

    /* Testing the "p0S0Fl" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP0S0FlNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<Float> testValue = new java.util.HashSet<Float>() {{ add(0.0f); }};
        final ocd.AggregateSurrogateFloat.Aggregate0S0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0S0Fl()
                .setP0S0Fl(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregate.getP0S0Fl().getP0S0Fl());

        final ocd.AggregateSurrogateFloat.Aggregate0S0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0S0Fl.find(aggregate.getURI());

        final ocd.AggregateSurrogateFloat.Aggregate0S0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0S0Fl.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregateFound.getP0S0Fl());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0S0Fl" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S0FlNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<Float> testValue = new java.util.HashSet<Float>() {{ add(Float.POSITIVE_INFINITY); }};
        final ocd.AggregateSurrogateFloat.Aggregate0S0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0S0Fl()
                .setP0S0Fl(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregate.getP0S0Fl());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateFloat.Aggregate0S0Fl aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateFloat.Aggregate0S0Fl.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0S0Fl());
    }

    /* Testing the "p0S0Fl" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP0S0FlNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<Float> testValue = new java.util.HashSet<Float>() {{ add(Float.POSITIVE_INFINITY); }};
        final ocd.AggregateSurrogateFloat.Aggregate0S0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0S0Fl()
                .setP0S0Fl(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregate.getP0S0Fl().getP0S0Fl());

        final ocd.AggregateSurrogateFloat.Aggregate0S0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0S0Fl.find(aggregate.getURI());

        final ocd.AggregateSurrogateFloat.Aggregate0S0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0S0Fl.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregateFound.getP0S0Fl());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0S0Fl" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S0FlNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<Float> testValue = new java.util.HashSet<Float>() {{ add(0.0f); add(-1.2345E-10f); add(1.2345E20f); add(-1E-5f); add(Float.NaN); add(Float.NEGATIVE_INFINITY); add(Float.POSITIVE_INFINITY); }};
        final ocd.AggregateSurrogateFloat.Aggregate0S0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0S0Fl()
                .setP0S0Fl(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregate.getP0S0Fl());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateFloat.Aggregate0S0Fl aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateFloat.Aggregate0S0Fl.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0S0Fl());
    }

    /* Testing the "p0S0Fl" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP0S0FlNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<Float> testValue = new java.util.HashSet<Float>() {{ add(0.0f); add(-1.2345E-10f); add(1.2345E20f); add(-1E-5f); add(Float.NaN); add(Float.NEGATIVE_INFINITY); add(Float.POSITIVE_INFINITY); }};
        final ocd.AggregateSurrogateFloat.Aggregate0S0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0S0Fl()
                .setP0S0Fl(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregate.getP0S0Fl().getP0S0Fl());

        final ocd.AggregateSurrogateFloat.Aggregate0S0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0S0Fl.find(aggregate.getURI());

        final ocd.AggregateSurrogateFloat.Aggregate0S0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0S0Fl.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregateFound.getP0S0Fl());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0S0Fl" NonDefault5 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S0FlNonDefault5PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<Float> testValue = new java.util.HashSet<Float>() {{ add(null); add(0.0f); add(-1.2345E-10f); add(1.2345E20f); add(-1E-5f); add(Float.NaN); add(Float.NEGATIVE_INFINITY); add(Float.POSITIVE_INFINITY); }};
        final ocd.AggregateSurrogateFloat.Aggregate0S0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0S0Fl()
                .setP0S0Fl(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregate.getP0S0Fl());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateFloat.Aggregate0S0Fl aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateFloat.Aggregate0S0Fl.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0S0Fl());
    }

    /* Testing the "p0S0Fl" NonDefault5 property value after active record persist */
    @org.junit.Test
    public void testP0S0FlNonDefault5PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<Float> testValue = new java.util.HashSet<Float>() {{ add(null); add(0.0f); add(-1.2345E-10f); add(1.2345E20f); add(-1E-5f); add(Float.NaN); add(Float.NEGATIVE_INFINITY); add(Float.POSITIVE_INFINITY); }};
        final ocd.AggregateSurrogateFloat.Aggregate0S0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0S0Fl()
                .setP0S0Fl(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregate.getP0S0Fl().getP0S0Fl());

        final ocd.AggregateSurrogateFloat.Aggregate0S0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0S0Fl.find(aggregate.getURI());

        final ocd.AggregateSurrogateFloat.Aggregate0S0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0S0Fl.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregateFound.getP0S0Fl());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
