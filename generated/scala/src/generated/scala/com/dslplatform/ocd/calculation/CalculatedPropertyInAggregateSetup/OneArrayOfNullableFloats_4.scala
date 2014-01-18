package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneArrayOfNullableFloats_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneArrayOfNullableFloats: Array[Option[Float]],
    private var _calculatedOneArrayOfNullableFloats: Array[Option[Float]],
    private var _persistedOneArrayOfNullableFloats: Array[Option[Float]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneArrayOfNullableFloats_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneArrayOfNullableFloats_4("+ URI +")"

   def copy(oneArrayOfNullableFloats: Array[Option[Float]] = this._oneArrayOfNullableFloats): OneArrayOfNullableFloats_4 = {

  require(oneArrayOfNullableFloats ne null, "Null value was provided for property \"oneArrayOfNullableFloats\"")
  com.dslplatform.api.Guards.checkArrayOptionValNulls(oneArrayOfNullableFloats)
    new OneArrayOfNullableFloats_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneArrayOfNullableFloats = oneArrayOfNullableFloats, _calculatedOneArrayOfNullableFloats = _calculatedOneArrayOfNullableFloats, _persistedOneArrayOfNullableFloats = _persistedOneArrayOfNullableFloats)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfNullableFloats_4): this.type = {
    this._URI = result._URI
    this._oneArrayOfNullableFloats = result._oneArrayOfNullableFloats
    this._calculatedOneArrayOfNullableFloats = result._calculatedOneArrayOfNullableFloats
    this._persistedOneArrayOfNullableFloats = result._persistedOneArrayOfNullableFloats
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfNullableFloats_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableFloats")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneArrayOfNullableFloats = {
    _oneArrayOfNullableFloats
  }

  def oneArrayOfNullableFloats_= (value: Array[Option[Float]]) {
    com.dslplatform.api.Guards.checkArrayOptionValNulls(value)
    _oneArrayOfNullableFloats = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfNullableFloats")
  def calculatedOneArrayOfNullableFloats = {
    _calculatedOneArrayOfNullableFloats
  }

  def calculatedOneArrayOfNullableFloats_= (value: Array[Option[Float]]) {
    _calculatedOneArrayOfNullableFloats = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfNullableFloats")
  def persistedOneArrayOfNullableFloats = {
    _persistedOneArrayOfNullableFloats
  }

  def persistedOneArrayOfNullableFloats_= (value: Array[Option[Float]]) {
    _persistedOneArrayOfNullableFloats = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableFloats") oneArrayOfNullableFloats: Array[Option[Float]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfNullableFloats") calculatedOneArrayOfNullableFloats: Array[Option[Float]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfNullableFloats") persistedOneArrayOfNullableFloats: Array[Option[Float]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneArrayOfNullableFloats = if (oneArrayOfNullableFloats == null) Array.empty else oneArrayOfNullableFloats, _calculatedOneArrayOfNullableFloats = calculatedOneArrayOfNullableFloats, _persistedOneArrayOfNullableFloats = persistedOneArrayOfNullableFloats)

}

object OneArrayOfNullableFloats_4 extends AggregateRootCompanion[OneArrayOfNullableFloats_4]{

  def apply(
    oneArrayOfNullableFloats: Array[Option[Float]] = Array.empty
  ) = {
    com.dslplatform.api.Guards.checkArrayOptionValNulls(oneArrayOfNullableFloats)
    require(oneArrayOfNullableFloats ne null, "Null value was provided for property \"oneArrayOfNullableFloats\"")
    new OneArrayOfNullableFloats_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneArrayOfNullableFloats = oneArrayOfNullableFloats
    , _calculatedOneArrayOfNullableFloats = Array.empty
    , _persistedOneArrayOfNullableFloats = Array.empty)
  }

}
