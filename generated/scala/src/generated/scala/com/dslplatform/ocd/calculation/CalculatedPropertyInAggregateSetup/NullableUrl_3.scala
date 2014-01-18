package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableUrl_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableUrl: Option[java.net.URI],
    private var _calculatedNullableUrl: Option[java.net.URI],
    private var _persistedNullableUrl: Option[java.net.URI]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableUrl_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableUrl_3("+ URI +")"

   def copy(nullableUrl: Option[java.net.URI] = this._nullableUrl): NullableUrl_3 = {

  require(nullableUrl ne null, "Null value was provided for property \"nullableUrl\"")
  if(nullableUrl.isDefined) require(nullableUrl.get ne null, "Null value was provided for property \"nullableUrl\"")
    new NullableUrl_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableUrl = nullableUrl, _calculatedNullableUrl = _calculatedNullableUrl, _persistedNullableUrl = _persistedNullableUrl)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableUrl_3): this.type = {
    this._URI = result._URI
    this._nullableUrl = result._nullableUrl
    this._calculatedNullableUrl = result._calculatedNullableUrl
    this._persistedNullableUrl = result._persistedNullableUrl
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableUrl_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableUrl")
  def nullableUrl = {
    _nullableUrl
  }

  def nullableUrl_= (value: Option[java.net.URI]) {
    _nullableUrl = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableUrl")
  def calculatedNullableUrl = {
    _calculatedNullableUrl
  }

  def calculatedNullableUrl_= (value: Option[java.net.URI]) {
    _calculatedNullableUrl = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableUrl")
  def persistedNullableUrl = {
    _persistedNullableUrl
  }

  def persistedNullableUrl_= (value: Option[java.net.URI]) {
    _persistedNullableUrl = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableUrl") nullableUrl: Option[java.net.URI]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableUrl") calculatedNullableUrl: Option[java.net.URI]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableUrl") persistedNullableUrl: Option[java.net.URI]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableUrl = nullableUrl, _calculatedNullableUrl = calculatedNullableUrl, _persistedNullableUrl = persistedNullableUrl)

}

object NullableUrl_3 extends AggregateRootCompanion[NullableUrl_3]{

  def apply(
    nullableUrl: Option[java.net.URI] = None
  ) = {
    require(nullableUrl ne null, "Null value was provided for property \"nullableUrl\"")
    if (nullableUrl.isDefined) require(nullableUrl.get ne null, "Null value was provided for property \"nullableUrl\"")
    new NullableUrl_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableUrl = nullableUrl
    , _calculatedNullableUrl = None
    , _persistedNullableUrl = None)
  }

}
