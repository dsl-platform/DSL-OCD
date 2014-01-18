package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableBoolean_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableBoolean: Option[Boolean],
    private var _calculatedNullableBoolean: Option[Boolean],
    private var _persistedNullableBoolean: Option[Boolean]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableBoolean_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableBoolean_3("+ URI +")"

   def copy(nullableBoolean: Option[Boolean] = this._nullableBoolean): NullableBoolean_3 = {

  require(nullableBoolean ne null, "Null value was provided for property \"nullableBoolean\"")
    new NullableBoolean_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableBoolean = nullableBoolean, _calculatedNullableBoolean = _calculatedNullableBoolean, _persistedNullableBoolean = _persistedNullableBoolean)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableBoolean_3): this.type = {
    this._URI = result._URI
    this._nullableBoolean = result._nullableBoolean
    this._calculatedNullableBoolean = result._calculatedNullableBoolean
    this._persistedNullableBoolean = result._persistedNullableBoolean
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableBoolean_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableBoolean")
  def nullableBoolean = {
    _nullableBoolean
  }

  def nullableBoolean_= (value: Option[Boolean]) {
    _nullableBoolean = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableBoolean")
  def calculatedNullableBoolean = {
    _calculatedNullableBoolean
  }

  def calculatedNullableBoolean_= (value: Option[Boolean]) {
    _calculatedNullableBoolean = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableBoolean")
  def persistedNullableBoolean = {
    _persistedNullableBoolean
  }

  def persistedNullableBoolean_= (value: Option[Boolean]) {
    _persistedNullableBoolean = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableBoolean") nullableBoolean: Option[Boolean]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableBoolean") calculatedNullableBoolean: Option[Boolean]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableBoolean") persistedNullableBoolean: Option[Boolean]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableBoolean = nullableBoolean, _calculatedNullableBoolean = calculatedNullableBoolean, _persistedNullableBoolean = persistedNullableBoolean)

}

object NullableBoolean_3 extends AggregateRootCompanion[NullableBoolean_3]{

  def apply(
    nullableBoolean: Option[Boolean] = None
  ) = {
    require(nullableBoolean ne null, "Null value was provided for property \"nullableBoolean\"")
    new NullableBoolean_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableBoolean = nullableBoolean
    , _calculatedNullableBoolean = None
    , _persistedNullableBoolean = None)
  }

}
