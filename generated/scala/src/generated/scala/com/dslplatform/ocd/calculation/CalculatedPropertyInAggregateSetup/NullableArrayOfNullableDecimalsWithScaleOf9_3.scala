package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableArrayOfNullableDecimalsWithScaleOf9_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableArrayOfNullableDecimalsWithScaleOf9: Option[Array[Option[BigDecimal]]],
    private var _calculatedNullableArrayOfNullableDecimalsWithScaleOf9: Option[Array[Option[BigDecimal]]],
    private var _persistedNullableArrayOfNullableDecimalsWithScaleOf9: Option[Array[Option[BigDecimal]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableArrayOfNullableDecimalsWithScaleOf9_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableArrayOfNullableDecimalsWithScaleOf9_3("+ URI +")"

   def copy(nullableArrayOfNullableDecimalsWithScaleOf9: Option[Array[Option[BigDecimal]]] = this._nullableArrayOfNullableDecimalsWithScaleOf9): NullableArrayOfNullableDecimalsWithScaleOf9_3 = {

  require(nullableArrayOfNullableDecimalsWithScaleOf9 ne null, "Null value was provided for property \"nullableArrayOfNullableDecimalsWithScaleOf9\"")
  if(nullableArrayOfNullableDecimalsWithScaleOf9.isDefined) require(nullableArrayOfNullableDecimalsWithScaleOf9.get ne null, "Null value was provided for property \"nullableArrayOfNullableDecimalsWithScaleOf9\"")
  com.dslplatform.api.Guards.checkArrayOptionScale(nullableArrayOfNullableDecimalsWithScaleOf9, 9)
  com.dslplatform.api.Guards.checkArrayOptionRefNulls(nullableArrayOfNullableDecimalsWithScaleOf9)
    new NullableArrayOfNullableDecimalsWithScaleOf9_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableArrayOfNullableDecimalsWithScaleOf9 = nullableArrayOfNullableDecimalsWithScaleOf9, _calculatedNullableArrayOfNullableDecimalsWithScaleOf9 = _calculatedNullableArrayOfNullableDecimalsWithScaleOf9, _persistedNullableArrayOfNullableDecimalsWithScaleOf9 = _persistedNullableArrayOfNullableDecimalsWithScaleOf9)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfNullableDecimalsWithScaleOf9_3): this.type = {
    this._URI = result._URI
    this._nullableArrayOfNullableDecimalsWithScaleOf9 = result._nullableArrayOfNullableDecimalsWithScaleOf9
    this._calculatedNullableArrayOfNullableDecimalsWithScaleOf9 = result._calculatedNullableArrayOfNullableDecimalsWithScaleOf9
    this._persistedNullableArrayOfNullableDecimalsWithScaleOf9 = result._persistedNullableArrayOfNullableDecimalsWithScaleOf9
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfNullableDecimalsWithScaleOf9_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableDecimalsWithScaleOf9")
  def nullableArrayOfNullableDecimalsWithScaleOf9 = {
    _nullableArrayOfNullableDecimalsWithScaleOf9
  }

  def nullableArrayOfNullableDecimalsWithScaleOf9_= (value: Option[Array[Option[BigDecimal]]]) {
    com.dslplatform.api.Guards.checkArrayOptionScale(value, 9)
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(value)
    _nullableArrayOfNullableDecimalsWithScaleOf9 = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfNullableDecimalsWithScaleOf9")
  def calculatedNullableArrayOfNullableDecimalsWithScaleOf9 = {
    _calculatedNullableArrayOfNullableDecimalsWithScaleOf9
  }

  def calculatedNullableArrayOfNullableDecimalsWithScaleOf9_= (value: Option[Array[Option[BigDecimal]]]) {
    _calculatedNullableArrayOfNullableDecimalsWithScaleOf9 = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfNullableDecimalsWithScaleOf9")
  def persistedNullableArrayOfNullableDecimalsWithScaleOf9 = {
    _persistedNullableArrayOfNullableDecimalsWithScaleOf9
  }

  def persistedNullableArrayOfNullableDecimalsWithScaleOf9_= (value: Option[Array[Option[BigDecimal]]]) {
    _persistedNullableArrayOfNullableDecimalsWithScaleOf9 = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableDecimalsWithScaleOf9") nullableArrayOfNullableDecimalsWithScaleOf9: Option[Array[Option[BigDecimal]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfNullableDecimalsWithScaleOf9") calculatedNullableArrayOfNullableDecimalsWithScaleOf9: Option[Array[Option[BigDecimal]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfNullableDecimalsWithScaleOf9") persistedNullableArrayOfNullableDecimalsWithScaleOf9: Option[Array[Option[BigDecimal]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableArrayOfNullableDecimalsWithScaleOf9 = nullableArrayOfNullableDecimalsWithScaleOf9, _calculatedNullableArrayOfNullableDecimalsWithScaleOf9 = calculatedNullableArrayOfNullableDecimalsWithScaleOf9, _persistedNullableArrayOfNullableDecimalsWithScaleOf9 = persistedNullableArrayOfNullableDecimalsWithScaleOf9)

}

object NullableArrayOfNullableDecimalsWithScaleOf9_3 extends AggregateRootCompanion[NullableArrayOfNullableDecimalsWithScaleOf9_3]{

  def apply(
    nullableArrayOfNullableDecimalsWithScaleOf9: Option[Array[Option[BigDecimal]]] = None
  ) = {
    com.dslplatform.api.Guards.checkArrayOptionScale(nullableArrayOfNullableDecimalsWithScaleOf9, 9)
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(nullableArrayOfNullableDecimalsWithScaleOf9)
    require(nullableArrayOfNullableDecimalsWithScaleOf9 ne null, "Null value was provided for property \"nullableArrayOfNullableDecimalsWithScaleOf9\"")
    if (nullableArrayOfNullableDecimalsWithScaleOf9.isDefined) require(nullableArrayOfNullableDecimalsWithScaleOf9.get ne null, "Null value was provided for property \"nullableArrayOfNullableDecimalsWithScaleOf9\"")
    new NullableArrayOfNullableDecimalsWithScaleOf9_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableArrayOfNullableDecimalsWithScaleOf9 = nullableArrayOfNullableDecimalsWithScaleOf9
    , _calculatedNullableArrayOfNullableDecimalsWithScaleOf9 = None
    , _persistedNullableArrayOfNullableDecimalsWithScaleOf9 = None)
  }

}
