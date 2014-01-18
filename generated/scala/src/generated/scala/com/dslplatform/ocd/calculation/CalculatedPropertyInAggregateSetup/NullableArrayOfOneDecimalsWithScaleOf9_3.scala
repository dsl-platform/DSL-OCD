package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableArrayOfOneDecimalsWithScaleOf9_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableArrayOfOneDecimalsWithScaleOf9: Option[Array[BigDecimal]],
    private var _calculatedNullableArrayOfOneDecimalsWithScaleOf9: Option[Array[BigDecimal]],
    private var _persistedNullableArrayOfOneDecimalsWithScaleOf9: Option[Array[BigDecimal]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableArrayOfOneDecimalsWithScaleOf9_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableArrayOfOneDecimalsWithScaleOf9_3("+ URI +")"

   def copy(nullableArrayOfOneDecimalsWithScaleOf9: Option[Array[BigDecimal]] = this._nullableArrayOfOneDecimalsWithScaleOf9): NullableArrayOfOneDecimalsWithScaleOf9_3 = {

  require(nullableArrayOfOneDecimalsWithScaleOf9 ne null, "Null value was provided for property \"nullableArrayOfOneDecimalsWithScaleOf9\"")
  if(nullableArrayOfOneDecimalsWithScaleOf9.isDefined) require(nullableArrayOfOneDecimalsWithScaleOf9.get ne null, "Null value was provided for property \"nullableArrayOfOneDecimalsWithScaleOf9\"")
  com.dslplatform.api.Guards.checkArrayScale(nullableArrayOfOneDecimalsWithScaleOf9, 9)
  com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneDecimalsWithScaleOf9)
    new NullableArrayOfOneDecimalsWithScaleOf9_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableArrayOfOneDecimalsWithScaleOf9 = nullableArrayOfOneDecimalsWithScaleOf9, _calculatedNullableArrayOfOneDecimalsWithScaleOf9 = _calculatedNullableArrayOfOneDecimalsWithScaleOf9, _persistedNullableArrayOfOneDecimalsWithScaleOf9 = _persistedNullableArrayOfOneDecimalsWithScaleOf9)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfOneDecimalsWithScaleOf9_3): this.type = {
    this._URI = result._URI
    this._nullableArrayOfOneDecimalsWithScaleOf9 = result._nullableArrayOfOneDecimalsWithScaleOf9
    this._calculatedNullableArrayOfOneDecimalsWithScaleOf9 = result._calculatedNullableArrayOfOneDecimalsWithScaleOf9
    this._persistedNullableArrayOfOneDecimalsWithScaleOf9 = result._persistedNullableArrayOfOneDecimalsWithScaleOf9
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfOneDecimalsWithScaleOf9_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneDecimalsWithScaleOf9")
  def nullableArrayOfOneDecimalsWithScaleOf9 = {
    _nullableArrayOfOneDecimalsWithScaleOf9
  }

  def nullableArrayOfOneDecimalsWithScaleOf9_= (value: Option[Array[BigDecimal]]) {
    com.dslplatform.api.Guards.checkArrayScale(value, 9)
    com.dslplatform.api.Guards.checkArrayNulls(value)
    _nullableArrayOfOneDecimalsWithScaleOf9 = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfOneDecimalsWithScaleOf9")
  def calculatedNullableArrayOfOneDecimalsWithScaleOf9 = {
    _calculatedNullableArrayOfOneDecimalsWithScaleOf9
  }

  def calculatedNullableArrayOfOneDecimalsWithScaleOf9_= (value: Option[Array[BigDecimal]]) {
    _calculatedNullableArrayOfOneDecimalsWithScaleOf9 = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfOneDecimalsWithScaleOf9")
  def persistedNullableArrayOfOneDecimalsWithScaleOf9 = {
    _persistedNullableArrayOfOneDecimalsWithScaleOf9
  }

  def persistedNullableArrayOfOneDecimalsWithScaleOf9_= (value: Option[Array[BigDecimal]]) {
    _persistedNullableArrayOfOneDecimalsWithScaleOf9 = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneDecimalsWithScaleOf9") nullableArrayOfOneDecimalsWithScaleOf9: Option[Array[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfOneDecimalsWithScaleOf9") calculatedNullableArrayOfOneDecimalsWithScaleOf9: Option[Array[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfOneDecimalsWithScaleOf9") persistedNullableArrayOfOneDecimalsWithScaleOf9: Option[Array[BigDecimal]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableArrayOfOneDecimalsWithScaleOf9 = nullableArrayOfOneDecimalsWithScaleOf9, _calculatedNullableArrayOfOneDecimalsWithScaleOf9 = calculatedNullableArrayOfOneDecimalsWithScaleOf9, _persistedNullableArrayOfOneDecimalsWithScaleOf9 = persistedNullableArrayOfOneDecimalsWithScaleOf9)

}

object NullableArrayOfOneDecimalsWithScaleOf9_3 extends AggregateRootCompanion[NullableArrayOfOneDecimalsWithScaleOf9_3]{

  def apply(
    nullableArrayOfOneDecimalsWithScaleOf9: Option[Array[BigDecimal]] = None
  ) = {
    com.dslplatform.api.Guards.checkArrayScale(nullableArrayOfOneDecimalsWithScaleOf9, 9)
    com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneDecimalsWithScaleOf9)
    require(nullableArrayOfOneDecimalsWithScaleOf9 ne null, "Null value was provided for property \"nullableArrayOfOneDecimalsWithScaleOf9\"")
    if (nullableArrayOfOneDecimalsWithScaleOf9.isDefined) require(nullableArrayOfOneDecimalsWithScaleOf9.get ne null, "Null value was provided for property \"nullableArrayOfOneDecimalsWithScaleOf9\"")
    new NullableArrayOfOneDecimalsWithScaleOf9_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableArrayOfOneDecimalsWithScaleOf9 = nullableArrayOfOneDecimalsWithScaleOf9
    , _calculatedNullableArrayOfOneDecimalsWithScaleOf9 = None
    , _persistedNullableArrayOfOneDecimalsWithScaleOf9 = None)
  }

}
