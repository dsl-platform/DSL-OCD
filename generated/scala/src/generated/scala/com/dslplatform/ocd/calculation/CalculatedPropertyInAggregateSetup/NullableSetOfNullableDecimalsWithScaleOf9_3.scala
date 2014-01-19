package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableSetOfNullableDecimalsWithScaleOf9_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableSetOfNullableDecimalsWithScaleOf9: Option[Set[Option[BigDecimal]]],
    private var _calculatedNullableSetOfNullableDecimalsWithScaleOf9: Option[Set[Option[BigDecimal]]],
    private var _persistedNullableSetOfNullableDecimalsWithScaleOf9: Option[Set[Option[BigDecimal]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableSetOfNullableDecimalsWithScaleOf9_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableSetOfNullableDecimalsWithScaleOf9_3("+ URI +")"

   def copy(nullableSetOfNullableDecimalsWithScaleOf9: Option[Set[Option[BigDecimal]]] = this._nullableSetOfNullableDecimalsWithScaleOf9): NullableSetOfNullableDecimalsWithScaleOf9_3 = {

  require(nullableSetOfNullableDecimalsWithScaleOf9 ne null, "Null value was provided for property \"nullableSetOfNullableDecimalsWithScaleOf9\"")
  if(nullableSetOfNullableDecimalsWithScaleOf9.isDefined) require(nullableSetOfNullableDecimalsWithScaleOf9.get ne null, "Null value was provided for property \"nullableSetOfNullableDecimalsWithScaleOf9\"")
  com.dslplatform.api.Guards.checkCollectionOptionScale(nullableSetOfNullableDecimalsWithScaleOf9, 9)
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableSetOfNullableDecimalsWithScaleOf9)
    new NullableSetOfNullableDecimalsWithScaleOf9_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableSetOfNullableDecimalsWithScaleOf9 = nullableSetOfNullableDecimalsWithScaleOf9, _calculatedNullableSetOfNullableDecimalsWithScaleOf9 = _calculatedNullableSetOfNullableDecimalsWithScaleOf9, _persistedNullableSetOfNullableDecimalsWithScaleOf9 = _persistedNullableSetOfNullableDecimalsWithScaleOf9)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfNullableDecimalsWithScaleOf9_3): this.type = {
    this._URI = result._URI
    this._nullableSetOfNullableDecimalsWithScaleOf9 = result._nullableSetOfNullableDecimalsWithScaleOf9
    this._calculatedNullableSetOfNullableDecimalsWithScaleOf9 = result._calculatedNullableSetOfNullableDecimalsWithScaleOf9
    this._persistedNullableSetOfNullableDecimalsWithScaleOf9 = result._persistedNullableSetOfNullableDecimalsWithScaleOf9
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfNullableDecimalsWithScaleOf9_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableDecimalsWithScaleOf9")
  def nullableSetOfNullableDecimalsWithScaleOf9 = {
    _nullableSetOfNullableDecimalsWithScaleOf9
  }

  def nullableSetOfNullableDecimalsWithScaleOf9_= (value: Option[Set[Option[BigDecimal]]]) {
    com.dslplatform.api.Guards.checkCollectionOptionScale(value, 9)
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _nullableSetOfNullableDecimalsWithScaleOf9 = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfNullableDecimalsWithScaleOf9")
  def calculatedNullableSetOfNullableDecimalsWithScaleOf9 = {
    _calculatedNullableSetOfNullableDecimalsWithScaleOf9
  }

  def calculatedNullableSetOfNullableDecimalsWithScaleOf9_= (value: Option[Set[Option[BigDecimal]]]) {
    _calculatedNullableSetOfNullableDecimalsWithScaleOf9 = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfNullableDecimalsWithScaleOf9")
  def persistedNullableSetOfNullableDecimalsWithScaleOf9 = {
    _persistedNullableSetOfNullableDecimalsWithScaleOf9
  }

  def persistedNullableSetOfNullableDecimalsWithScaleOf9_= (value: Option[Set[Option[BigDecimal]]]) {
    _persistedNullableSetOfNullableDecimalsWithScaleOf9 = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableDecimalsWithScaleOf9") nullableSetOfNullableDecimalsWithScaleOf9: Option[Set[Option[BigDecimal]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfNullableDecimalsWithScaleOf9") calculatedNullableSetOfNullableDecimalsWithScaleOf9: Option[Set[Option[BigDecimal]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfNullableDecimalsWithScaleOf9") persistedNullableSetOfNullableDecimalsWithScaleOf9: Option[Set[Option[BigDecimal]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableSetOfNullableDecimalsWithScaleOf9 = nullableSetOfNullableDecimalsWithScaleOf9, _calculatedNullableSetOfNullableDecimalsWithScaleOf9 = calculatedNullableSetOfNullableDecimalsWithScaleOf9, _persistedNullableSetOfNullableDecimalsWithScaleOf9 = persistedNullableSetOfNullableDecimalsWithScaleOf9)

}

object NullableSetOfNullableDecimalsWithScaleOf9_3 extends AggregateRootCompanion[NullableSetOfNullableDecimalsWithScaleOf9_3]{

  def apply(
    nullableSetOfNullableDecimalsWithScaleOf9: Option[Set[Option[BigDecimal]]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionScale(nullableSetOfNullableDecimalsWithScaleOf9, 9)
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableSetOfNullableDecimalsWithScaleOf9)
    require(nullableSetOfNullableDecimalsWithScaleOf9 ne null, "Null value was provided for property \"nullableSetOfNullableDecimalsWithScaleOf9\"")
    if (nullableSetOfNullableDecimalsWithScaleOf9.isDefined) require(nullableSetOfNullableDecimalsWithScaleOf9.get ne null, "Null value was provided for property \"nullableSetOfNullableDecimalsWithScaleOf9\"")
    new NullableSetOfNullableDecimalsWithScaleOf9_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableSetOfNullableDecimalsWithScaleOf9 = nullableSetOfNullableDecimalsWithScaleOf9
    , _calculatedNullableSetOfNullableDecimalsWithScaleOf9 = None
    , _persistedNullableSetOfNullableDecimalsWithScaleOf9 = None)
  }

}