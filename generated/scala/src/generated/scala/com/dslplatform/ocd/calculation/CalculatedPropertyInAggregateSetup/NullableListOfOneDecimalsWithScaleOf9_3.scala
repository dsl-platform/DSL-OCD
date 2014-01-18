package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableListOfOneDecimalsWithScaleOf9_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableListOfOneDecimalsWithScaleOf9: Option[IndexedSeq[BigDecimal]],
    private var _calculatedNullableListOfOneDecimalsWithScaleOf9: Option[IndexedSeq[BigDecimal]],
    private var _persistedNullableListOfOneDecimalsWithScaleOf9: Option[IndexedSeq[BigDecimal]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableListOfOneDecimalsWithScaleOf9_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableListOfOneDecimalsWithScaleOf9_3("+ URI +")"

   def copy(nullableListOfOneDecimalsWithScaleOf9: Option[IndexedSeq[BigDecimal]] = this._nullableListOfOneDecimalsWithScaleOf9): NullableListOfOneDecimalsWithScaleOf9_3 = {

  require(nullableListOfOneDecimalsWithScaleOf9 ne null, "Null value was provided for property \"nullableListOfOneDecimalsWithScaleOf9\"")
  if(nullableListOfOneDecimalsWithScaleOf9.isDefined) require(nullableListOfOneDecimalsWithScaleOf9.get ne null, "Null value was provided for property \"nullableListOfOneDecimalsWithScaleOf9\"")
  com.dslplatform.api.Guards.checkCollectionScale(nullableListOfOneDecimalsWithScaleOf9, 9)
  com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneDecimalsWithScaleOf9)
    new NullableListOfOneDecimalsWithScaleOf9_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableListOfOneDecimalsWithScaleOf9 = nullableListOfOneDecimalsWithScaleOf9, _calculatedNullableListOfOneDecimalsWithScaleOf9 = _calculatedNullableListOfOneDecimalsWithScaleOf9, _persistedNullableListOfOneDecimalsWithScaleOf9 = _persistedNullableListOfOneDecimalsWithScaleOf9)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfOneDecimalsWithScaleOf9_3): this.type = {
    this._URI = result._URI
    this._nullableListOfOneDecimalsWithScaleOf9 = result._nullableListOfOneDecimalsWithScaleOf9
    this._calculatedNullableListOfOneDecimalsWithScaleOf9 = result._calculatedNullableListOfOneDecimalsWithScaleOf9
    this._persistedNullableListOfOneDecimalsWithScaleOf9 = result._persistedNullableListOfOneDecimalsWithScaleOf9
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfOneDecimalsWithScaleOf9_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneDecimalsWithScaleOf9")
  def nullableListOfOneDecimalsWithScaleOf9 = {
    _nullableListOfOneDecimalsWithScaleOf9
  }

  def nullableListOfOneDecimalsWithScaleOf9_= (value: Option[IndexedSeq[BigDecimal]]) {
    com.dslplatform.api.Guards.checkCollectionScale(value, 9)
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _nullableListOfOneDecimalsWithScaleOf9 = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfOneDecimalsWithScaleOf9")
  def calculatedNullableListOfOneDecimalsWithScaleOf9 = {
    _calculatedNullableListOfOneDecimalsWithScaleOf9
  }

  def calculatedNullableListOfOneDecimalsWithScaleOf9_= (value: Option[IndexedSeq[BigDecimal]]) {
    _calculatedNullableListOfOneDecimalsWithScaleOf9 = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfOneDecimalsWithScaleOf9")
  def persistedNullableListOfOneDecimalsWithScaleOf9 = {
    _persistedNullableListOfOneDecimalsWithScaleOf9
  }

  def persistedNullableListOfOneDecimalsWithScaleOf9_= (value: Option[IndexedSeq[BigDecimal]]) {
    _persistedNullableListOfOneDecimalsWithScaleOf9 = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneDecimalsWithScaleOf9") nullableListOfOneDecimalsWithScaleOf9: Option[IndexedSeq[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfOneDecimalsWithScaleOf9") calculatedNullableListOfOneDecimalsWithScaleOf9: Option[IndexedSeq[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfOneDecimalsWithScaleOf9") persistedNullableListOfOneDecimalsWithScaleOf9: Option[IndexedSeq[BigDecimal]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableListOfOneDecimalsWithScaleOf9 = nullableListOfOneDecimalsWithScaleOf9, _calculatedNullableListOfOneDecimalsWithScaleOf9 = calculatedNullableListOfOneDecimalsWithScaleOf9, _persistedNullableListOfOneDecimalsWithScaleOf9 = persistedNullableListOfOneDecimalsWithScaleOf9)

}

object NullableListOfOneDecimalsWithScaleOf9_3 extends AggregateRootCompanion[NullableListOfOneDecimalsWithScaleOf9_3]{

  def apply(
    nullableListOfOneDecimalsWithScaleOf9: Option[IndexedSeq[BigDecimal]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionScale(nullableListOfOneDecimalsWithScaleOf9, 9)
    com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneDecimalsWithScaleOf9)
    require(nullableListOfOneDecimalsWithScaleOf9 ne null, "Null value was provided for property \"nullableListOfOneDecimalsWithScaleOf9\"")
    if (nullableListOfOneDecimalsWithScaleOf9.isDefined) require(nullableListOfOneDecimalsWithScaleOf9.get ne null, "Null value was provided for property \"nullableListOfOneDecimalsWithScaleOf9\"")
    new NullableListOfOneDecimalsWithScaleOf9_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableListOfOneDecimalsWithScaleOf9 = nullableListOfOneDecimalsWithScaleOf9
    , _calculatedNullableListOfOneDecimalsWithScaleOf9 = None
    , _persistedNullableListOfOneDecimalsWithScaleOf9 = None)
  }

}
