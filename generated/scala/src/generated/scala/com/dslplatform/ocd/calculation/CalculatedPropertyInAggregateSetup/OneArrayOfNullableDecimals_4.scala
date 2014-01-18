package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneArrayOfNullableDecimals_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneArrayOfNullableDecimals: Array[Option[BigDecimal]],
    private var _calculatedOneArrayOfNullableDecimals: Array[Option[BigDecimal]],
    private var _persistedOneArrayOfNullableDecimals: Array[Option[BigDecimal]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneArrayOfNullableDecimals_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneArrayOfNullableDecimals_4("+ URI +")"

   def copy(oneArrayOfNullableDecimals: Array[Option[BigDecimal]] = this._oneArrayOfNullableDecimals): OneArrayOfNullableDecimals_4 = {

  require(oneArrayOfNullableDecimals ne null, "Null value was provided for property \"oneArrayOfNullableDecimals\"")
  com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableDecimals)
    new OneArrayOfNullableDecimals_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneArrayOfNullableDecimals = oneArrayOfNullableDecimals, _calculatedOneArrayOfNullableDecimals = _calculatedOneArrayOfNullableDecimals, _persistedOneArrayOfNullableDecimals = _persistedOneArrayOfNullableDecimals)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfNullableDecimals_4): this.type = {
    this._URI = result._URI
    this._oneArrayOfNullableDecimals = result._oneArrayOfNullableDecimals
    this._calculatedOneArrayOfNullableDecimals = result._calculatedOneArrayOfNullableDecimals
    this._persistedOneArrayOfNullableDecimals = result._persistedOneArrayOfNullableDecimals
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfNullableDecimals_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableDecimals")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneArrayOfNullableDecimals = {
    _oneArrayOfNullableDecimals
  }

  def oneArrayOfNullableDecimals_= (value: Array[Option[BigDecimal]]) {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(value)
    _oneArrayOfNullableDecimals = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfNullableDecimals")
  def calculatedOneArrayOfNullableDecimals = {
    _calculatedOneArrayOfNullableDecimals
  }

  def calculatedOneArrayOfNullableDecimals_= (value: Array[Option[BigDecimal]]) {
    _calculatedOneArrayOfNullableDecimals = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfNullableDecimals")
  def persistedOneArrayOfNullableDecimals = {
    _persistedOneArrayOfNullableDecimals
  }

  def persistedOneArrayOfNullableDecimals_= (value: Array[Option[BigDecimal]]) {
    _persistedOneArrayOfNullableDecimals = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableDecimals") oneArrayOfNullableDecimals: Array[Option[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfNullableDecimals") calculatedOneArrayOfNullableDecimals: Array[Option[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfNullableDecimals") persistedOneArrayOfNullableDecimals: Array[Option[BigDecimal]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneArrayOfNullableDecimals = if (oneArrayOfNullableDecimals == null) Array.empty else oneArrayOfNullableDecimals, _calculatedOneArrayOfNullableDecimals = calculatedOneArrayOfNullableDecimals, _persistedOneArrayOfNullableDecimals = persistedOneArrayOfNullableDecimals)

}

object OneArrayOfNullableDecimals_4 extends AggregateRootCompanion[OneArrayOfNullableDecimals_4]{

  def apply(
    oneArrayOfNullableDecimals: Array[Option[BigDecimal]] = Array.empty
  ) = {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableDecimals)
    require(oneArrayOfNullableDecimals ne null, "Null value was provided for property \"oneArrayOfNullableDecimals\"")
    new OneArrayOfNullableDecimals_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneArrayOfNullableDecimals = oneArrayOfNullableDecimals
    , _calculatedOneArrayOfNullableDecimals = Array.empty
    , _persistedOneArrayOfNullableDecimals = Array.empty)
  }

}
