package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndNullableSetOfNullableDecimalsPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateDecimal.Aggregate0S0De> aggregate0S0DeRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndNullableSetOfNullableDecimalsPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate0S0DeRepository = locator.resolve(ocd.AggregateSurrogateDecimal.repositories.Aggregate0S0DeRepository.class);
    }

    /* Testing the "p0S0De" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S0DeDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateDecimal.Aggregate0S0De aggregate =
                new ocd.AggregateSurrogateDecimal.Aggregate0S0De();
        final java.util.Set<java.math.BigDecimal> testValue = aggregate.getP0S0De();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregate.getP0S0De());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDecimal.Aggregate0S0De aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDecimal.Aggregate0S0De.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0S0De());
    }

    /* Testing the "p0S0De" Default property value after active record persist */
    @org.junit.Test
    public void testP0S0DeDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateDecimal.Aggregate0S0De aggregate =
                new ocd.AggregateSurrogateDecimal.Aggregate0S0De();
        final java.util.Set<java.math.BigDecimal> testValue = aggregate.getP0S0De();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregate.getP0S0De().getP0S0De());

        final ocd.AggregateSurrogateDecimal.Aggregate0S0De aggregateFound =
                ocd.AggregateSurrogateDecimal.Aggregate0S0De.find(aggregate.getURI());

        final ocd.AggregateSurrogateDecimal.Aggregate0S0De aggregateFound =
                ocd.AggregateSurrogateDecimal.Aggregate0S0De.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregateFound.getP0S0De());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0S0De" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S0DeNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<java.math.BigDecimal> testValue = new java.util.HashSet<java.math.BigDecimal>() {{ add(null); }};
        final ocd.AggregateSurrogateDecimal.Aggregate0S0De aggregate =
                new ocd.AggregateSurrogateDecimal.Aggregate0S0De()
                .setP0S0De(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregate.getP0S0De());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDecimal.Aggregate0S0De aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDecimal.Aggregate0S0De.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0S0De());
    }

    /* Testing the "p0S0De" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP0S0DeNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<java.math.BigDecimal> testValue = new java.util.HashSet<java.math.BigDecimal>() {{ add(null); }};
        final ocd.AggregateSurrogateDecimal.Aggregate0S0De aggregate =
                new ocd.AggregateSurrogateDecimal.Aggregate0S0De()
                .setP0S0De(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregate.getP0S0De().getP0S0De());

        final ocd.AggregateSurrogateDecimal.Aggregate0S0De aggregateFound =
                ocd.AggregateSurrogateDecimal.Aggregate0S0De.find(aggregate.getURI());

        final ocd.AggregateSurrogateDecimal.Aggregate0S0De aggregateFound =
                ocd.AggregateSurrogateDecimal.Aggregate0S0De.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregateFound.getP0S0De());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0S0De" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S0DeNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<java.math.BigDecimal> testValue = new java.util.HashSet<java.math.BigDecimal>() {{ add(java.math.BigDecimal.ZERO); }};
        final ocd.AggregateSurrogateDecimal.Aggregate0S0De aggregate =
                new ocd.AggregateSurrogateDecimal.Aggregate0S0De()
                .setP0S0De(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregate.getP0S0De());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDecimal.Aggregate0S0De aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDecimal.Aggregate0S0De.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0S0De());
    }

    /* Testing the "p0S0De" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP0S0DeNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<java.math.BigDecimal> testValue = new java.util.HashSet<java.math.BigDecimal>() {{ add(java.math.BigDecimal.ZERO); }};
        final ocd.AggregateSurrogateDecimal.Aggregate0S0De aggregate =
                new ocd.AggregateSurrogateDecimal.Aggregate0S0De()
                .setP0S0De(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregate.getP0S0De().getP0S0De());

        final ocd.AggregateSurrogateDecimal.Aggregate0S0De aggregateFound =
                ocd.AggregateSurrogateDecimal.Aggregate0S0De.find(aggregate.getURI());

        final ocd.AggregateSurrogateDecimal.Aggregate0S0De aggregateFound =
                ocd.AggregateSurrogateDecimal.Aggregate0S0De.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregateFound.getP0S0De());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0S0De" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S0DeNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<java.math.BigDecimal> testValue = new java.util.HashSet<java.math.BigDecimal>() {{ add(new java.math.BigDecimal("1E28")); }};
        final ocd.AggregateSurrogateDecimal.Aggregate0S0De aggregate =
                new ocd.AggregateSurrogateDecimal.Aggregate0S0De()
                .setP0S0De(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregate.getP0S0De());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDecimal.Aggregate0S0De aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDecimal.Aggregate0S0De.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0S0De());
    }

    /* Testing the "p0S0De" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP0S0DeNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<java.math.BigDecimal> testValue = new java.util.HashSet<java.math.BigDecimal>() {{ add(new java.math.BigDecimal("1E28")); }};
        final ocd.AggregateSurrogateDecimal.Aggregate0S0De aggregate =
                new ocd.AggregateSurrogateDecimal.Aggregate0S0De()
                .setP0S0De(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregate.getP0S0De().getP0S0De());

        final ocd.AggregateSurrogateDecimal.Aggregate0S0De aggregateFound =
                ocd.AggregateSurrogateDecimal.Aggregate0S0De.find(aggregate.getURI());

        final ocd.AggregateSurrogateDecimal.Aggregate0S0De aggregateFound =
                ocd.AggregateSurrogateDecimal.Aggregate0S0De.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregateFound.getP0S0De());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0S0De" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S0DeNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<java.math.BigDecimal> testValue = new java.util.HashSet<java.math.BigDecimal>() {{ add(java.math.BigDecimal.ZERO); add(java.math.BigDecimal.ONE); add(new java.math.BigDecimal("3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679").setScale(28, java.math.BigDecimal.ROUND_HALF_UP)); add(new java.math.BigDecimal("-1E-28")); add(new java.math.BigDecimal("1E28")); }};
        final ocd.AggregateSurrogateDecimal.Aggregate0S0De aggregate =
                new ocd.AggregateSurrogateDecimal.Aggregate0S0De()
                .setP0S0De(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregate.getP0S0De());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDecimal.Aggregate0S0De aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDecimal.Aggregate0S0De.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0S0De());
    }

    /* Testing the "p0S0De" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP0S0DeNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<java.math.BigDecimal> testValue = new java.util.HashSet<java.math.BigDecimal>() {{ add(java.math.BigDecimal.ZERO); add(java.math.BigDecimal.ONE); add(new java.math.BigDecimal("3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679").setScale(28, java.math.BigDecimal.ROUND_HALF_UP)); add(new java.math.BigDecimal("-1E-28")); add(new java.math.BigDecimal("1E28")); }};
        final ocd.AggregateSurrogateDecimal.Aggregate0S0De aggregate =
                new ocd.AggregateSurrogateDecimal.Aggregate0S0De()
                .setP0S0De(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregate.getP0S0De().getP0S0De());

        final ocd.AggregateSurrogateDecimal.Aggregate0S0De aggregateFound =
                ocd.AggregateSurrogateDecimal.Aggregate0S0De.find(aggregate.getURI());

        final ocd.AggregateSurrogateDecimal.Aggregate0S0De aggregateFound =
                ocd.AggregateSurrogateDecimal.Aggregate0S0De.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregateFound.getP0S0De());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0S0De" NonDefault5 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S0DeNonDefault5PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<java.math.BigDecimal> testValue = new java.util.HashSet<java.math.BigDecimal>() {{ add(null); add(java.math.BigDecimal.ZERO); add(java.math.BigDecimal.ONE); add(new java.math.BigDecimal("3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679").setScale(28, java.math.BigDecimal.ROUND_HALF_UP)); add(new java.math.BigDecimal("-1E-28")); add(new java.math.BigDecimal("1E28")); }};
        final ocd.AggregateSurrogateDecimal.Aggregate0S0De aggregate =
                new ocd.AggregateSurrogateDecimal.Aggregate0S0De()
                .setP0S0De(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregate.getP0S0De());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDecimal.Aggregate0S0De aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDecimal.Aggregate0S0De.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0S0De());
    }

    /* Testing the "p0S0De" NonDefault5 property value after active record persist */
    @org.junit.Test
    public void testP0S0DeNonDefault5PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<java.math.BigDecimal> testValue = new java.util.HashSet<java.math.BigDecimal>() {{ add(null); add(java.math.BigDecimal.ZERO); add(java.math.BigDecimal.ONE); add(new java.math.BigDecimal("3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679").setScale(28, java.math.BigDecimal.ROUND_HALF_UP)); add(new java.math.BigDecimal("-1E-28")); add(new java.math.BigDecimal("1E28")); }};
        final ocd.AggregateSurrogateDecimal.Aggregate0S0De aggregate =
                new ocd.AggregateSurrogateDecimal.Aggregate0S0De()
                .setP0S0De(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregate.getP0S0De().getP0S0De());

        final ocd.AggregateSurrogateDecimal.Aggregate0S0De aggregateFound =
                ocd.AggregateSurrogateDecimal.Aggregate0S0De.find(aggregate.getURI());

        final ocd.AggregateSurrogateDecimal.Aggregate0S0De aggregateFound =
                ocd.AggregateSurrogateDecimal.Aggregate0S0De.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregateFound.getP0S0De());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
