package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableDecimalWithScaleOf9_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableDecimalWithScaleOf9: Option[BigDecimal],
    private var _calculatedNullableDecimalWithScaleOf9: Option[BigDecimal],
    private var _persistedNullableDecimalWithScaleOf9: Option[BigDecimal]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableDecimalWithScaleOf9_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableDecimalWithScaleOf9_3("+ URI +")"

   def copy(nullableDecimalWithScaleOf9: Option[BigDecimal] = this._nullableDecimalWithScaleOf9): NullableDecimalWithScaleOf9_3 = {

  require(nullableDecimalWithScaleOf9 ne null, "Null value was provided for property \"nullableDecimalWithScaleOf9\"")
  if(nullableDecimalWithScaleOf9.isDefined) require(nullableDecimalWithScaleOf9.get ne null, "Null value was provided for property \"nullableDecimalWithScaleOf9\"")
  com.dslplatform.api.Guards.checkScale(nullableDecimalWithScaleOf9, 9)
    new NullableDecimalWithScaleOf9_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableDecimalWithScaleOf9 = nullableDecimalWithScaleOf9, _calculatedNullableDecimalWithScaleOf9 = _calculatedNullableDecimalWithScaleOf9, _persistedNullableDecimalWithScaleOf9 = _persistedNullableDecimalWithScaleOf9)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableDecimalWithScaleOf9_3): this.type = {
    this._URI = result._URI
    this._nullableDecimalWithScaleOf9 = result._nullableDecimalWithScaleOf9
    this._calculatedNullableDecimalWithScaleOf9 = result._calculatedNullableDecimalWithScaleOf9
    this._persistedNullableDecimalWithScaleOf9 = result._persistedNullableDecimalWithScaleOf9
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableDecimalWithScaleOf9_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableDecimalWithScaleOf9")
  def nullableDecimalWithScaleOf9 = {
    _nullableDecimalWithScaleOf9
  }

  def nullableDecimalWithScaleOf9_= (value: Option[BigDecimal]) {
    com.dslplatform.api.Guards.checkScale(value, 9)
    _nullableDecimalWithScaleOf9 = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableDecimalWithScaleOf9")
  def calculatedNullableDecimalWithScaleOf9 = {
    _calculatedNullableDecimalWithScaleOf9
  }

  def calculatedNullableDecimalWithScaleOf9_= (value: Option[BigDecimal]) {
    _calculatedNullableDecimalWithScaleOf9 = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableDecimalWithScaleOf9")
  def persistedNullableDecimalWithScaleOf9 = {
    _persistedNullableDecimalWithScaleOf9
  }

  def persistedNullableDecimalWithScaleOf9_= (value: Option[BigDecimal]) {
    _persistedNullableDecimalWithScaleOf9 = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableDecimalWithScaleOf9") nullableDecimalWithScaleOf9: Option[BigDecimal]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableDecimalWithScaleOf9") calculatedNullableDecimalWithScaleOf9: Option[BigDecimal]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableDecimalWithScaleOf9") persistedNullableDecimalWithScaleOf9: Option[BigDecimal]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableDecimalWithScaleOf9 = nullableDecimalWithScaleOf9, _calculatedNullableDecimalWithScaleOf9 = calculatedNullableDecimalWithScaleOf9, _persistedNullableDecimalWithScaleOf9 = persistedNullableDecimalWithScaleOf9)

}

object NullableDecimalWithScaleOf9_3 extends AggregateRootCompanion[NullableDecimalWithScaleOf9_3]{

  def apply(
    nullableDecimalWithScaleOf9: Option[BigDecimal] = None
  ) = {
    com.dslplatform.api.Guards.checkScale(nullableDecimalWithScaleOf9, 9)
    require(nullableDecimalWithScaleOf9 ne null, "Null value was provided for property \"nullableDecimalWithScaleOf9\"")
    if (nullableDecimalWithScaleOf9.isDefined) require(nullableDecimalWithScaleOf9.get ne null, "Null value was provided for property \"nullableDecimalWithScaleOf9\"")
    new NullableDecimalWithScaleOf9_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableDecimalWithScaleOf9 = nullableDecimalWithScaleOf9
    , _calculatedNullableDecimalWithScaleOf9 = None
    , _persistedNullableDecimalWithScaleOf9 = None)
  }

}
