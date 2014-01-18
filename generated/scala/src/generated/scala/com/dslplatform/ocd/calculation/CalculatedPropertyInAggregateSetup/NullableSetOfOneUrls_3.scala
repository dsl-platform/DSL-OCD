package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableSetOfOneUrls_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableSetOfOneUrls: Option[Set[java.net.URI]],
    private var _calculatedNullableSetOfOneUrls: Option[Set[java.net.URI]],
    private var _persistedNullableSetOfOneUrls: Option[Set[java.net.URI]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableSetOfOneUrls_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableSetOfOneUrls_3("+ URI +")"

   def copy(nullableSetOfOneUrls: Option[Set[java.net.URI]] = this._nullableSetOfOneUrls): NullableSetOfOneUrls_3 = {

  require(nullableSetOfOneUrls ne null, "Null value was provided for property \"nullableSetOfOneUrls\"")
  if(nullableSetOfOneUrls.isDefined) require(nullableSetOfOneUrls.get ne null, "Null value was provided for property \"nullableSetOfOneUrls\"")
  com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneUrls)
    new NullableSetOfOneUrls_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableSetOfOneUrls = nullableSetOfOneUrls, _calculatedNullableSetOfOneUrls = _calculatedNullableSetOfOneUrls, _persistedNullableSetOfOneUrls = _persistedNullableSetOfOneUrls)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfOneUrls_3): this.type = {
    this._URI = result._URI
    this._nullableSetOfOneUrls = result._nullableSetOfOneUrls
    this._calculatedNullableSetOfOneUrls = result._calculatedNullableSetOfOneUrls
    this._persistedNullableSetOfOneUrls = result._persistedNullableSetOfOneUrls
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfOneUrls_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneUrls")
  def nullableSetOfOneUrls = {
    _nullableSetOfOneUrls
  }

  def nullableSetOfOneUrls_= (value: Option[Set[java.net.URI]]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _nullableSetOfOneUrls = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfOneUrls")
  def calculatedNullableSetOfOneUrls = {
    _calculatedNullableSetOfOneUrls
  }

  def calculatedNullableSetOfOneUrls_= (value: Option[Set[java.net.URI]]) {
    _calculatedNullableSetOfOneUrls = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfOneUrls")
  def persistedNullableSetOfOneUrls = {
    _persistedNullableSetOfOneUrls
  }

  def persistedNullableSetOfOneUrls_= (value: Option[Set[java.net.URI]]) {
    _persistedNullableSetOfOneUrls = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneUrls") nullableSetOfOneUrls: Option[Set[java.net.URI]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfOneUrls") calculatedNullableSetOfOneUrls: Option[Set[java.net.URI]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfOneUrls") persistedNullableSetOfOneUrls: Option[Set[java.net.URI]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableSetOfOneUrls = nullableSetOfOneUrls, _calculatedNullableSetOfOneUrls = calculatedNullableSetOfOneUrls, _persistedNullableSetOfOneUrls = persistedNullableSetOfOneUrls)

}

object NullableSetOfOneUrls_3 extends AggregateRootCompanion[NullableSetOfOneUrls_3]{

  def apply(
    nullableSetOfOneUrls: Option[Set[java.net.URI]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneUrls)
    require(nullableSetOfOneUrls ne null, "Null value was provided for property \"nullableSetOfOneUrls\"")
    if (nullableSetOfOneUrls.isDefined) require(nullableSetOfOneUrls.get ne null, "Null value was provided for property \"nullableSetOfOneUrls\"")
    new NullableSetOfOneUrls_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableSetOfOneUrls = nullableSetOfOneUrls
    , _calculatedNullableSetOfOneUrls = None
    , _persistedNullableSetOfOneUrls = None)
  }

}
