package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndOneListOfNullableMoniesPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateMoney.Aggregate1L0Mo> aggregate1L0MoRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndOneListOfNullableMoniesPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate1L0MoRepository = locator.resolve(ocd.AggregateSurrogateMoney.repositories.Aggregate1L0MoRepository.class);
    }

    /* Testing the "p1L0Mo" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L0MoDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateMoney.Aggregate1L0Mo aggregate =
                new ocd.AggregateSurrogateMoney.Aggregate1L0Mo();
        final java.util.List<java.math.BigDecimal> testValue = aggregate.getP1L0Mo();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Mo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateMoney.Aggregate1L0Mo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateMoney.Aggregate1L0Mo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1L0Mo());
    }

    /* Testing the "p1L0Mo" Default property value after active record persist */
    @org.junit.Test
    public void testP1L0MoDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateMoney.Aggregate1L0Mo aggregate =
                new ocd.AggregateSurrogateMoney.Aggregate1L0Mo();
        final java.util.List<java.math.BigDecimal> testValue = aggregate.getP1L0Mo();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Mo().getP1L0Mo());

        final ocd.AggregateSurrogateMoney.Aggregate1L0Mo aggregateFound =
                ocd.AggregateSurrogateMoney.Aggregate1L0Mo.find(aggregate.getURI());

        final ocd.AggregateSurrogateMoney.Aggregate1L0Mo aggregateFound =
                ocd.AggregateSurrogateMoney.Aggregate1L0Mo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateFound.getP1L0Mo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L0Mo" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L0MoNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<java.math.BigDecimal> testValue = new java.util.ArrayList<java.math.BigDecimal>() {{ add(null); }};
        final ocd.AggregateSurrogateMoney.Aggregate1L0Mo aggregate =
                new ocd.AggregateSurrogateMoney.Aggregate1L0Mo()
                .setP1L0Mo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Mo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateMoney.Aggregate1L0Mo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateMoney.Aggregate1L0Mo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1L0Mo());
    }

    /* Testing the "p1L0Mo" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP1L0MoNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<java.math.BigDecimal> testValue = new java.util.ArrayList<java.math.BigDecimal>() {{ add(null); }};
        final ocd.AggregateSurrogateMoney.Aggregate1L0Mo aggregate =
                new ocd.AggregateSurrogateMoney.Aggregate1L0Mo()
                .setP1L0Mo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Mo().getP1L0Mo());

        final ocd.AggregateSurrogateMoney.Aggregate1L0Mo aggregateFound =
                ocd.AggregateSurrogateMoney.Aggregate1L0Mo.find(aggregate.getURI());

        final ocd.AggregateSurrogateMoney.Aggregate1L0Mo aggregateFound =
                ocd.AggregateSurrogateMoney.Aggregate1L0Mo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateFound.getP1L0Mo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L0Mo" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L0MoNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<java.math.BigDecimal> testValue = new java.util.ArrayList<java.math.BigDecimal>() {{ add(java.math.BigDecimal.ZERO.setScale(2)); }};
        final ocd.AggregateSurrogateMoney.Aggregate1L0Mo aggregate =
                new ocd.AggregateSurrogateMoney.Aggregate1L0Mo()
                .setP1L0Mo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Mo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateMoney.Aggregate1L0Mo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateMoney.Aggregate1L0Mo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1L0Mo());
    }

    /* Testing the "p1L0Mo" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP1L0MoNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<java.math.BigDecimal> testValue = new java.util.ArrayList<java.math.BigDecimal>() {{ add(java.math.BigDecimal.ZERO.setScale(2)); }};
        final ocd.AggregateSurrogateMoney.Aggregate1L0Mo aggregate =
                new ocd.AggregateSurrogateMoney.Aggregate1L0Mo()
                .setP1L0Mo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Mo().getP1L0Mo());

        final ocd.AggregateSurrogateMoney.Aggregate1L0Mo aggregateFound =
                ocd.AggregateSurrogateMoney.Aggregate1L0Mo.find(aggregate.getURI());

        final ocd.AggregateSurrogateMoney.Aggregate1L0Mo aggregateFound =
                ocd.AggregateSurrogateMoney.Aggregate1L0Mo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateFound.getP1L0Mo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L0Mo" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L0MoNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<java.math.BigDecimal> testValue = new java.util.ArrayList<java.math.BigDecimal>() {{ add(new java.math.BigDecimal("1E19")); }};
        final ocd.AggregateSurrogateMoney.Aggregate1L0Mo aggregate =
                new ocd.AggregateSurrogateMoney.Aggregate1L0Mo()
                .setP1L0Mo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Mo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateMoney.Aggregate1L0Mo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateMoney.Aggregate1L0Mo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1L0Mo());
    }

    /* Testing the "p1L0Mo" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP1L0MoNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<java.math.BigDecimal> testValue = new java.util.ArrayList<java.math.BigDecimal>() {{ add(new java.math.BigDecimal("1E19")); }};
        final ocd.AggregateSurrogateMoney.Aggregate1L0Mo aggregate =
                new ocd.AggregateSurrogateMoney.Aggregate1L0Mo()
                .setP1L0Mo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Mo().getP1L0Mo());

        final ocd.AggregateSurrogateMoney.Aggregate1L0Mo aggregateFound =
                ocd.AggregateSurrogateMoney.Aggregate1L0Mo.find(aggregate.getURI());

        final ocd.AggregateSurrogateMoney.Aggregate1L0Mo aggregateFound =
                ocd.AggregateSurrogateMoney.Aggregate1L0Mo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateFound.getP1L0Mo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L0Mo" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L0MoNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<java.math.BigDecimal> testValue = new java.util.ArrayList<java.math.BigDecimal>() {{ add(java.math.BigDecimal.ZERO.setScale(2)); add(java.math.BigDecimal.ONE); add(new java.math.BigDecimal("3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679").setScale(2, java.math.BigDecimal.ROUND_HALF_UP)); add(new java.math.BigDecimal("-1E-2")); add(new java.math.BigDecimal("1E19")); }};
        final ocd.AggregateSurrogateMoney.Aggregate1L0Mo aggregate =
                new ocd.AggregateSurrogateMoney.Aggregate1L0Mo()
                .setP1L0Mo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Mo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateMoney.Aggregate1L0Mo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateMoney.Aggregate1L0Mo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1L0Mo());
    }

    /* Testing the "p1L0Mo" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP1L0MoNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<java.math.BigDecimal> testValue = new java.util.ArrayList<java.math.BigDecimal>() {{ add(java.math.BigDecimal.ZERO.setScale(2)); add(java.math.BigDecimal.ONE); add(new java.math.BigDecimal("3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679").setScale(2, java.math.BigDecimal.ROUND_HALF_UP)); add(new java.math.BigDecimal("-1E-2")); add(new java.math.BigDecimal("1E19")); }};
        final ocd.AggregateSurrogateMoney.Aggregate1L0Mo aggregate =
                new ocd.AggregateSurrogateMoney.Aggregate1L0Mo()
                .setP1L0Mo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Mo().getP1L0Mo());

        final ocd.AggregateSurrogateMoney.Aggregate1L0Mo aggregateFound =
                ocd.AggregateSurrogateMoney.Aggregate1L0Mo.find(aggregate.getURI());

        final ocd.AggregateSurrogateMoney.Aggregate1L0Mo aggregateFound =
                ocd.AggregateSurrogateMoney.Aggregate1L0Mo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateFound.getP1L0Mo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L0Mo" NonDefault5 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L0MoNonDefault5PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<java.math.BigDecimal> testValue = new java.util.ArrayList<java.math.BigDecimal>() {{ add(null); add(java.math.BigDecimal.ZERO.setScale(2)); add(java.math.BigDecimal.ONE); add(new java.math.BigDecimal("3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679").setScale(2, java.math.BigDecimal.ROUND_HALF_UP)); add(new java.math.BigDecimal("-1E-2")); add(new java.math.BigDecimal("1E19")); }};
        final ocd.AggregateSurrogateMoney.Aggregate1L0Mo aggregate =
                new ocd.AggregateSurrogateMoney.Aggregate1L0Mo()
                .setP1L0Mo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Mo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateMoney.Aggregate1L0Mo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateMoney.Aggregate1L0Mo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1L0Mo());
    }

    /* Testing the "p1L0Mo" NonDefault5 property value after active record persist */
    @org.junit.Test
    public void testP1L0MoNonDefault5PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<java.math.BigDecimal> testValue = new java.util.ArrayList<java.math.BigDecimal>() {{ add(null); add(java.math.BigDecimal.ZERO.setScale(2)); add(java.math.BigDecimal.ONE); add(new java.math.BigDecimal("3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679").setScale(2, java.math.BigDecimal.ROUND_HALF_UP)); add(new java.math.BigDecimal("-1E-2")); add(new java.math.BigDecimal("1E19")); }};
        final ocd.AggregateSurrogateMoney.Aggregate1L0Mo aggregate =
                new ocd.AggregateSurrogateMoney.Aggregate1L0Mo()
                .setP1L0Mo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Mo().getP1L0Mo());

        final ocd.AggregateSurrogateMoney.Aggregate1L0Mo aggregateFound =
                ocd.AggregateSurrogateMoney.Aggregate1L0Mo.find(aggregate.getURI());

        final ocd.AggregateSurrogateMoney.Aggregate1L0Mo aggregateFound =
                ocd.AggregateSurrogateMoney.Aggregate1L0Mo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateFound.getP1L0Mo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
