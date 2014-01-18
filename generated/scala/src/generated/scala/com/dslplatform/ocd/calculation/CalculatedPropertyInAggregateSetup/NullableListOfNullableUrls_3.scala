package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableListOfNullableUrls_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableListOfNullableUrls: Option[IndexedSeq[Option[java.net.URI]]],
    private var _calculatedNullableListOfNullableUrls: Option[IndexedSeq[Option[java.net.URI]]],
    private var _persistedNullableListOfNullableUrls: Option[IndexedSeq[Option[java.net.URI]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableListOfNullableUrls_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableListOfNullableUrls_3("+ URI +")"

   def copy(nullableListOfNullableUrls: Option[IndexedSeq[Option[java.net.URI]]] = this._nullableListOfNullableUrls): NullableListOfNullableUrls_3 = {

  require(nullableListOfNullableUrls ne null, "Null value was provided for property \"nullableListOfNullableUrls\"")
  if(nullableListOfNullableUrls.isDefined) require(nullableListOfNullableUrls.get ne null, "Null value was provided for property \"nullableListOfNullableUrls\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableListOfNullableUrls)
    new NullableListOfNullableUrls_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableListOfNullableUrls = nullableListOfNullableUrls, _calculatedNullableListOfNullableUrls = _calculatedNullableListOfNullableUrls, _persistedNullableListOfNullableUrls = _persistedNullableListOfNullableUrls)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("ID")
  def ID = {
    _ID
  }

  private def ID_= (value: Int) {
    _ID = value

  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfNullableUrls_3): this.type = {
    this._URI = result._URI
    this._nullableListOfNullableUrls = result._nullableListOfNullableUrls
    this._calculatedNullableListOfNullableUrls = result._calculatedNullableListOfNullableUrls
    this._persistedNullableListOfNullableUrls = result._persistedNullableListOfNullableUrls
    this._ID = result._ID
    this
  }

  def create()(implicit locator: ServiceLocator, ec: ExecutionContext, duration: Duration): this.type = {
    __locator = Some(Option(locator).getOrElse(Bootstrap.getLocator))
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).create(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def update()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).update(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def delete()(implicit ec: ExecutionContext, duration: Duration) = {
    if (__locator.isEmpty) throw new IllegalArgumentException("Can't delete aggregate before it's saved")
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfNullableUrls_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableUrls")
  def nullableListOfNullableUrls = {
    _nullableListOfNullableUrls
  }

  def nullableListOfNullableUrls_= (value: Option[IndexedSeq[Option[java.net.URI]]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _nullableListOfNullableUrls = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfNullableUrls")
  def calculatedNullableListOfNullableUrls = {
    _calculatedNullableListOfNullableUrls
  }

  def calculatedNullableListOfNullableUrls_= (value: Option[IndexedSeq[Option[java.net.URI]]]) {
    _calculatedNullableListOfNullableUrls = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfNullableUrls")
  def persistedNullableListOfNullableUrls = {
    _persistedNullableListOfNullableUrls
  }

  def persistedNullableListOfNullableUrls_= (value: Option[IndexedSeq[Option[java.net.URI]]]) {
    _persistedNullableListOfNullableUrls = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableUrls") nullableListOfNullableUrls: Option[IndexedSeq[Option[java.net.URI]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfNullableUrls") calculatedNullableListOfNullableUrls: Option[IndexedSeq[Option[java.net.URI]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfNullableUrls") persistedNullableListOfNullableUrls: Option[IndexedSeq[Option[java.net.URI]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableListOfNullableUrls = nullableListOfNullableUrls, _calculatedNullableListOfNullableUrls = calculatedNullableListOfNullableUrls, _persistedNullableListOfNullableUrls = persistedNullableListOfNullableUrls)

}

object NullableListOfNullableUrls_3 extends AggregateRootCompanion[NullableListOfNullableUrls_3]{

  def apply(
    nullableListOfNullableUrls: Option[IndexedSeq[Option[java.net.URI]]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableListOfNullableUrls)
    require(nullableListOfNullableUrls ne null, "Null value was provided for property \"nullableListOfNullableUrls\"")
    if (nullableListOfNullableUrls.isDefined) require(nullableListOfNullableUrls.get ne null, "Null value was provided for property \"nullableListOfNullableUrls\"")
    new NullableListOfNullableUrls_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableListOfNullableUrls = nullableListOfNullableUrls
    , _calculatedNullableListOfNullableUrls = None
    , _persistedNullableListOfNullableUrls = None)
  }

}
