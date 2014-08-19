package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndNullableArrayOfNullableXmlsPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateXml.Aggregate0A0Xm> aggregate0A0XmRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndNullableArrayOfNullableXmlsPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate0A0XmRepository = locator.resolve(ocd.AggregateSurrogateXml.repositories.Aggregate0A0XmRepository.class);
    }

    /* Testing the "p0A0Xm" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A0XmDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateXml.Aggregate0A0Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate0A0Xm();
        final org.w3c.dom.Element[] testValue = aggregate.getP0A0Xm();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Xm());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateXml.Aggregate0A0Xm aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateXml.Aggregate0A0Xm.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0A0Xm());
    }

    /* Testing the "p0A0Xm" Default property value after active record persist */
    @org.junit.Test
    public void testP0A0XmDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateXml.Aggregate0A0Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate0A0Xm();
        final org.w3c.dom.Element[] testValue = aggregate.getP0A0Xm();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Xm().getP0A0Xm());

        final ocd.AggregateSurrogateXml.Aggregate0A0Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate0A0Xm.find(aggregate.getURI());

        final ocd.AggregateSurrogateXml.Aggregate0A0Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate0A0Xm.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateFound.getP0A0Xm());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0A0Xm" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A0XmNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final org.w3c.dom.Element[] testValue = new org.w3c.dom.Element[] { null };
        final ocd.AggregateSurrogateXml.Aggregate0A0Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate0A0Xm()
                .setP0A0Xm(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Xm());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateXml.Aggregate0A0Xm aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateXml.Aggregate0A0Xm.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0A0Xm());
    }

    /* Testing the "p0A0Xm" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP0A0XmNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final org.w3c.dom.Element[] testValue = new org.w3c.dom.Element[] { null };
        final ocd.AggregateSurrogateXml.Aggregate0A0Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate0A0Xm()
                .setP0A0Xm(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Xm().getP0A0Xm());

        final ocd.AggregateSurrogateXml.Aggregate0A0Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate0A0Xm.find(aggregate.getURI());

        final ocd.AggregateSurrogateXml.Aggregate0A0Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate0A0Xm.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateFound.getP0A0Xm());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0A0Xm" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A0XmNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final org.w3c.dom.Element[] testValue = new org.w3c.dom.Element[] { com.dslplatform.ocd.test.Utils.stringToElement("<ns3000:NamespacedElement/>") };
        final ocd.AggregateSurrogateXml.Aggregate0A0Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate0A0Xm()
                .setP0A0Xm(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Xm());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateXml.Aggregate0A0Xm aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateXml.Aggregate0A0Xm.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0A0Xm());
    }

    /* Testing the "p0A0Xm" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP0A0XmNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final org.w3c.dom.Element[] testValue = new org.w3c.dom.Element[] { com.dslplatform.ocd.test.Utils.stringToElement("<ns3000:NamespacedElement/>") };
        final ocd.AggregateSurrogateXml.Aggregate0A0Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate0A0Xm()
                .setP0A0Xm(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Xm().getP0A0Xm());

        final ocd.AggregateSurrogateXml.Aggregate0A0Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate0A0Xm.find(aggregate.getURI());

        final ocd.AggregateSurrogateXml.Aggregate0A0Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate0A0Xm.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateFound.getP0A0Xm());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0A0Xm" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A0XmNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final org.w3c.dom.Element[] testValue = new org.w3c.dom.Element[] { com.dslplatform.ocd.test.Utils.stringToElement("<document/>"), com.dslplatform.ocd.test.Utils.stringToElement("<TextElement>some text &amp; &lt;stuff&gt;</TextElement>"), com.dslplatform.ocd.test.Utils.stringToElement("<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>"), com.dslplatform.ocd.test.Utils.stringToElement("<AtributedElement foo=\"bar\" qwe=\"poi\"/>"), com.dslplatform.ocd.test.Utils.stringToElement("<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>"), com.dslplatform.ocd.test.Utils.stringToElement("<ns3000:NamespacedElement/>") };
        final ocd.AggregateSurrogateXml.Aggregate0A0Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate0A0Xm()
                .setP0A0Xm(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Xm());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateXml.Aggregate0A0Xm aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateXml.Aggregate0A0Xm.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0A0Xm());
    }

    /* Testing the "p0A0Xm" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP0A0XmNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final org.w3c.dom.Element[] testValue = new org.w3c.dom.Element[] { com.dslplatform.ocd.test.Utils.stringToElement("<document/>"), com.dslplatform.ocd.test.Utils.stringToElement("<TextElement>some text &amp; &lt;stuff&gt;</TextElement>"), com.dslplatform.ocd.test.Utils.stringToElement("<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>"), com.dslplatform.ocd.test.Utils.stringToElement("<AtributedElement foo=\"bar\" qwe=\"poi\"/>"), com.dslplatform.ocd.test.Utils.stringToElement("<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>"), com.dslplatform.ocd.test.Utils.stringToElement("<ns3000:NamespacedElement/>") };
        final ocd.AggregateSurrogateXml.Aggregate0A0Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate0A0Xm()
                .setP0A0Xm(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Xm().getP0A0Xm());

        final ocd.AggregateSurrogateXml.Aggregate0A0Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate0A0Xm.find(aggregate.getURI());

        final ocd.AggregateSurrogateXml.Aggregate0A0Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate0A0Xm.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateFound.getP0A0Xm());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0A0Xm" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A0XmNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final org.w3c.dom.Element[] testValue = new org.w3c.dom.Element[] { null, com.dslplatform.ocd.test.Utils.stringToElement("<document/>"), com.dslplatform.ocd.test.Utils.stringToElement("<TextElement>some text &amp; &lt;stuff&gt;</TextElement>"), com.dslplatform.ocd.test.Utils.stringToElement("<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>"), com.dslplatform.ocd.test.Utils.stringToElement("<AtributedElement foo=\"bar\" qwe=\"poi\"/>"), com.dslplatform.ocd.test.Utils.stringToElement("<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>"), com.dslplatform.ocd.test.Utils.stringToElement("<ns3000:NamespacedElement/>") };
        final ocd.AggregateSurrogateXml.Aggregate0A0Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate0A0Xm()
                .setP0A0Xm(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Xm());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateXml.Aggregate0A0Xm aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateXml.Aggregate0A0Xm.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0A0Xm());
    }

    /* Testing the "p0A0Xm" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP0A0XmNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final org.w3c.dom.Element[] testValue = new org.w3c.dom.Element[] { null, com.dslplatform.ocd.test.Utils.stringToElement("<document/>"), com.dslplatform.ocd.test.Utils.stringToElement("<TextElement>some text &amp; &lt;stuff&gt;</TextElement>"), com.dslplatform.ocd.test.Utils.stringToElement("<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>"), com.dslplatform.ocd.test.Utils.stringToElement("<AtributedElement foo=\"bar\" qwe=\"poi\"/>"), com.dslplatform.ocd.test.Utils.stringToElement("<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>"), com.dslplatform.ocd.test.Utils.stringToElement("<ns3000:NamespacedElement/>") };
        final ocd.AggregateSurrogateXml.Aggregate0A0Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate0A0Xm()
                .setP0A0Xm(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Xm().getP0A0Xm());

        final ocd.AggregateSurrogateXml.Aggregate0A0Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate0A0Xm.find(aggregate.getURI());

        final ocd.AggregateSurrogateXml.Aggregate0A0Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate0A0Xm.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateFound.getP0A0Xm());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
