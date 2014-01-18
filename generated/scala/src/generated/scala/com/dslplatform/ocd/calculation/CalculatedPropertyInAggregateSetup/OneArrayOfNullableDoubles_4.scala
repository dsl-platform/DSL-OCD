package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneArrayOfNullableDoubles_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneArrayOfNullableDoubles: Array[Option[Double]],
    private var _calculatedOneArrayOfNullableDoubles: Array[Option[Double]],
    private var _persistedOneArrayOfNullableDoubles: Array[Option[Double]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneArrayOfNullableDoubles_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneArrayOfNullableDoubles_4("+ URI +")"

   def copy(oneArrayOfNullableDoubles: Array[Option[Double]] = this._oneArrayOfNullableDoubles): OneArrayOfNullableDoubles_4 = {

  require(oneArrayOfNullableDoubles ne null, "Null value was provided for property \"oneArrayOfNullableDoubles\"")
  com.dslplatform.api.Guards.checkArrayOptionValNulls(oneArrayOfNullableDoubles)
    new OneArrayOfNullableDoubles_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneArrayOfNullableDoubles = oneArrayOfNullableDoubles, _calculatedOneArrayOfNullableDoubles = _calculatedOneArrayOfNullableDoubles, _persistedOneArrayOfNullableDoubles = _persistedOneArrayOfNullableDoubles)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfNullableDoubles_4): this.type = {
    this._URI = result._URI
    this._oneArrayOfNullableDoubles = result._oneArrayOfNullableDoubles
    this._calculatedOneArrayOfNullableDoubles = result._calculatedOneArrayOfNullableDoubles
    this._persistedOneArrayOfNullableDoubles = result._persistedOneArrayOfNullableDoubles
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfNullableDoubles_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableDoubles")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneArrayOfNullableDoubles = {
    _oneArrayOfNullableDoubles
  }

  def oneArrayOfNullableDoubles_= (value: Array[Option[Double]]) {
    com.dslplatform.api.Guards.checkArrayOptionValNulls(value)
    _oneArrayOfNullableDoubles = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfNullableDoubles")
  def calculatedOneArrayOfNullableDoubles = {
    _calculatedOneArrayOfNullableDoubles
  }

  def calculatedOneArrayOfNullableDoubles_= (value: Array[Option[Double]]) {
    _calculatedOneArrayOfNullableDoubles = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfNullableDoubles")
  def persistedOneArrayOfNullableDoubles = {
    _persistedOneArrayOfNullableDoubles
  }

  def persistedOneArrayOfNullableDoubles_= (value: Array[Option[Double]]) {
    _persistedOneArrayOfNullableDoubles = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableDoubles") oneArrayOfNullableDoubles: Array[Option[Double]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfNullableDoubles") calculatedOneArrayOfNullableDoubles: Array[Option[Double]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfNullableDoubles") persistedOneArrayOfNullableDoubles: Array[Option[Double]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneArrayOfNullableDoubles = if (oneArrayOfNullableDoubles == null) Array.empty else oneArrayOfNullableDoubles, _calculatedOneArrayOfNullableDoubles = calculatedOneArrayOfNullableDoubles, _persistedOneArrayOfNullableDoubles = persistedOneArrayOfNullableDoubles)

}

object OneArrayOfNullableDoubles_4 extends AggregateRootCompanion[OneArrayOfNullableDoubles_4]{

  def apply(
    oneArrayOfNullableDoubles: Array[Option[Double]] = Array.empty
  ) = {
    com.dslplatform.api.Guards.checkArrayOptionValNulls(oneArrayOfNullableDoubles)
    require(oneArrayOfNullableDoubles ne null, "Null value was provided for property \"oneArrayOfNullableDoubles\"")
    new OneArrayOfNullableDoubles_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneArrayOfNullableDoubles = oneArrayOfNullableDoubles
    , _calculatedOneArrayOfNullableDoubles = Array.empty
    , _persistedOneArrayOfNullableDoubles = Array.empty)
  }

}
