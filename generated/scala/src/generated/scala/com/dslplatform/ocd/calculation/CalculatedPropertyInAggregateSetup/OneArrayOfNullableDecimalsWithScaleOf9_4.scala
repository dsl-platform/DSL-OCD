package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneArrayOfNullableDecimalsWithScaleOf9_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneArrayOfNullableDecimalsWithScaleOf9: Array[Option[BigDecimal]],
    private var _calculatedOneArrayOfNullableDecimalsWithScaleOf9: Array[Option[BigDecimal]],
    private var _persistedOneArrayOfNullableDecimalsWithScaleOf9: Array[Option[BigDecimal]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneArrayOfNullableDecimalsWithScaleOf9_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneArrayOfNullableDecimalsWithScaleOf9_4("+ URI +")"

   def copy(oneArrayOfNullableDecimalsWithScaleOf9: Array[Option[BigDecimal]] = this._oneArrayOfNullableDecimalsWithScaleOf9): OneArrayOfNullableDecimalsWithScaleOf9_4 = {

  require(oneArrayOfNullableDecimalsWithScaleOf9 ne null, "Null value was provided for property \"oneArrayOfNullableDecimalsWithScaleOf9\"")
  com.dslplatform.api.Guards.checkArrayOptionScale(oneArrayOfNullableDecimalsWithScaleOf9, 9)
  com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableDecimalsWithScaleOf9)
    new OneArrayOfNullableDecimalsWithScaleOf9_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneArrayOfNullableDecimalsWithScaleOf9 = oneArrayOfNullableDecimalsWithScaleOf9, _calculatedOneArrayOfNullableDecimalsWithScaleOf9 = _calculatedOneArrayOfNullableDecimalsWithScaleOf9, _persistedOneArrayOfNullableDecimalsWithScaleOf9 = _persistedOneArrayOfNullableDecimalsWithScaleOf9)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfNullableDecimalsWithScaleOf9_4): this.type = {
    this._URI = result._URI
    this._oneArrayOfNullableDecimalsWithScaleOf9 = result._oneArrayOfNullableDecimalsWithScaleOf9
    this._calculatedOneArrayOfNullableDecimalsWithScaleOf9 = result._calculatedOneArrayOfNullableDecimalsWithScaleOf9
    this._persistedOneArrayOfNullableDecimalsWithScaleOf9 = result._persistedOneArrayOfNullableDecimalsWithScaleOf9
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfNullableDecimalsWithScaleOf9_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableDecimalsWithScaleOf9")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneArrayOfNullableDecimalsWithScaleOf9 = {
    _oneArrayOfNullableDecimalsWithScaleOf9
  }

  def oneArrayOfNullableDecimalsWithScaleOf9_= (value: Array[Option[BigDecimal]]) {
    com.dslplatform.api.Guards.checkArrayOptionScale(value, 9)
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(value)
    _oneArrayOfNullableDecimalsWithScaleOf9 = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfNullableDecimalsWithScaleOf9")
  def calculatedOneArrayOfNullableDecimalsWithScaleOf9 = {
    _calculatedOneArrayOfNullableDecimalsWithScaleOf9
  }

  def calculatedOneArrayOfNullableDecimalsWithScaleOf9_= (value: Array[Option[BigDecimal]]) {
    _calculatedOneArrayOfNullableDecimalsWithScaleOf9 = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfNullableDecimalsWithScaleOf9")
  def persistedOneArrayOfNullableDecimalsWithScaleOf9 = {
    _persistedOneArrayOfNullableDecimalsWithScaleOf9
  }

  def persistedOneArrayOfNullableDecimalsWithScaleOf9_= (value: Array[Option[BigDecimal]]) {
    _persistedOneArrayOfNullableDecimalsWithScaleOf9 = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableDecimalsWithScaleOf9") oneArrayOfNullableDecimalsWithScaleOf9: Array[Option[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfNullableDecimalsWithScaleOf9") calculatedOneArrayOfNullableDecimalsWithScaleOf9: Array[Option[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfNullableDecimalsWithScaleOf9") persistedOneArrayOfNullableDecimalsWithScaleOf9: Array[Option[BigDecimal]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneArrayOfNullableDecimalsWithScaleOf9 = if (oneArrayOfNullableDecimalsWithScaleOf9 == null) Array.empty else oneArrayOfNullableDecimalsWithScaleOf9, _calculatedOneArrayOfNullableDecimalsWithScaleOf9 = calculatedOneArrayOfNullableDecimalsWithScaleOf9, _persistedOneArrayOfNullableDecimalsWithScaleOf9 = persistedOneArrayOfNullableDecimalsWithScaleOf9)

}

object OneArrayOfNullableDecimalsWithScaleOf9_4 extends AggregateRootCompanion[OneArrayOfNullableDecimalsWithScaleOf9_4]{

  def apply(
    oneArrayOfNullableDecimalsWithScaleOf9: Array[Option[BigDecimal]] = Array.empty
  ) = {
    com.dslplatform.api.Guards.checkArrayOptionScale(oneArrayOfNullableDecimalsWithScaleOf9, 9)
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableDecimalsWithScaleOf9)
    require(oneArrayOfNullableDecimalsWithScaleOf9 ne null, "Null value was provided for property \"oneArrayOfNullableDecimalsWithScaleOf9\"")
    new OneArrayOfNullableDecimalsWithScaleOf9_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneArrayOfNullableDecimalsWithScaleOf9 = oneArrayOfNullableDecimalsWithScaleOf9
    , _calculatedOneArrayOfNullableDecimalsWithScaleOf9 = Array.empty
    , _persistedOneArrayOfNullableDecimalsWithScaleOf9 = Array.empty)
  }

}
