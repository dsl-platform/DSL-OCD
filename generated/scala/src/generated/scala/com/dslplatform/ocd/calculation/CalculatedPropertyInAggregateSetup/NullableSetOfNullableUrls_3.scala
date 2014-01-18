package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableSetOfNullableUrls_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableSetOfNullableUrls: Option[Set[Option[java.net.URI]]],
    private var _calculatedNullableSetOfNullableUrls: Option[Set[Option[java.net.URI]]],
    private var _persistedNullableSetOfNullableUrls: Option[Set[Option[java.net.URI]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableSetOfNullableUrls_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableSetOfNullableUrls_3("+ URI +")"

   def copy(nullableSetOfNullableUrls: Option[Set[Option[java.net.URI]]] = this._nullableSetOfNullableUrls): NullableSetOfNullableUrls_3 = {

  require(nullableSetOfNullableUrls ne null, "Null value was provided for property \"nullableSetOfNullableUrls\"")
  if(nullableSetOfNullableUrls.isDefined) require(nullableSetOfNullableUrls.get ne null, "Null value was provided for property \"nullableSetOfNullableUrls\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableSetOfNullableUrls)
    new NullableSetOfNullableUrls_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableSetOfNullableUrls = nullableSetOfNullableUrls, _calculatedNullableSetOfNullableUrls = _calculatedNullableSetOfNullableUrls, _persistedNullableSetOfNullableUrls = _persistedNullableSetOfNullableUrls)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfNullableUrls_3): this.type = {
    this._URI = result._URI
    this._nullableSetOfNullableUrls = result._nullableSetOfNullableUrls
    this._calculatedNullableSetOfNullableUrls = result._calculatedNullableSetOfNullableUrls
    this._persistedNullableSetOfNullableUrls = result._persistedNullableSetOfNullableUrls
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfNullableUrls_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableUrls")
  def nullableSetOfNullableUrls = {
    _nullableSetOfNullableUrls
  }

  def nullableSetOfNullableUrls_= (value: Option[Set[Option[java.net.URI]]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _nullableSetOfNullableUrls = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfNullableUrls")
  def calculatedNullableSetOfNullableUrls = {
    _calculatedNullableSetOfNullableUrls
  }

  def calculatedNullableSetOfNullableUrls_= (value: Option[Set[Option[java.net.URI]]]) {
    _calculatedNullableSetOfNullableUrls = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfNullableUrls")
  def persistedNullableSetOfNullableUrls = {
    _persistedNullableSetOfNullableUrls
  }

  def persistedNullableSetOfNullableUrls_= (value: Option[Set[Option[java.net.URI]]]) {
    _persistedNullableSetOfNullableUrls = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableUrls") nullableSetOfNullableUrls: Option[Set[Option[java.net.URI]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfNullableUrls") calculatedNullableSetOfNullableUrls: Option[Set[Option[java.net.URI]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfNullableUrls") persistedNullableSetOfNullableUrls: Option[Set[Option[java.net.URI]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableSetOfNullableUrls = nullableSetOfNullableUrls, _calculatedNullableSetOfNullableUrls = calculatedNullableSetOfNullableUrls, _persistedNullableSetOfNullableUrls = persistedNullableSetOfNullableUrls)

}

object NullableSetOfNullableUrls_3 extends AggregateRootCompanion[NullableSetOfNullableUrls_3]{

  def apply(
    nullableSetOfNullableUrls: Option[Set[Option[java.net.URI]]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableSetOfNullableUrls)
    require(nullableSetOfNullableUrls ne null, "Null value was provided for property \"nullableSetOfNullableUrls\"")
    if (nullableSetOfNullableUrls.isDefined) require(nullableSetOfNullableUrls.get ne null, "Null value was provided for property \"nullableSetOfNullableUrls\"")
    new NullableSetOfNullableUrls_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableSetOfNullableUrls = nullableSetOfNullableUrls
    , _calculatedNullableSetOfNullableUrls = None
    , _persistedNullableSetOfNullableUrls = None)
  }

}
