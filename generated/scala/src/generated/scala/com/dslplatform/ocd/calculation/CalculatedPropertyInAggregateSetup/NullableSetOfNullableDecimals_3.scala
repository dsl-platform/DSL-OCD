package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableSetOfNullableDecimals_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableSetOfNullableDecimals: Option[Set[Option[BigDecimal]]],
    private var _calculatedNullableSetOfNullableDecimals: Option[Set[Option[BigDecimal]]],
    private var _persistedNullableSetOfNullableDecimals: Option[Set[Option[BigDecimal]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableSetOfNullableDecimals_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableSetOfNullableDecimals_3("+ URI +")"

   def copy(nullableSetOfNullableDecimals: Option[Set[Option[BigDecimal]]] = this._nullableSetOfNullableDecimals): NullableSetOfNullableDecimals_3 = {

  require(nullableSetOfNullableDecimals ne null, "Null value was provided for property \"nullableSetOfNullableDecimals\"")
  if(nullableSetOfNullableDecimals.isDefined) require(nullableSetOfNullableDecimals.get ne null, "Null value was provided for property \"nullableSetOfNullableDecimals\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableSetOfNullableDecimals)
    new NullableSetOfNullableDecimals_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableSetOfNullableDecimals = nullableSetOfNullableDecimals, _calculatedNullableSetOfNullableDecimals = _calculatedNullableSetOfNullableDecimals, _persistedNullableSetOfNullableDecimals = _persistedNullableSetOfNullableDecimals)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfNullableDecimals_3): this.type = {
    this._URI = result._URI
    this._nullableSetOfNullableDecimals = result._nullableSetOfNullableDecimals
    this._calculatedNullableSetOfNullableDecimals = result._calculatedNullableSetOfNullableDecimals
    this._persistedNullableSetOfNullableDecimals = result._persistedNullableSetOfNullableDecimals
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfNullableDecimals_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableDecimals")
  def nullableSetOfNullableDecimals = {
    _nullableSetOfNullableDecimals
  }

  def nullableSetOfNullableDecimals_= (value: Option[Set[Option[BigDecimal]]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _nullableSetOfNullableDecimals = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfNullableDecimals")
  def calculatedNullableSetOfNullableDecimals = {
    _calculatedNullableSetOfNullableDecimals
  }

  def calculatedNullableSetOfNullableDecimals_= (value: Option[Set[Option[BigDecimal]]]) {
    _calculatedNullableSetOfNullableDecimals = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfNullableDecimals")
  def persistedNullableSetOfNullableDecimals = {
    _persistedNullableSetOfNullableDecimals
  }

  def persistedNullableSetOfNullableDecimals_= (value: Option[Set[Option[BigDecimal]]]) {
    _persistedNullableSetOfNullableDecimals = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableDecimals") nullableSetOfNullableDecimals: Option[Set[Option[BigDecimal]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfNullableDecimals") calculatedNullableSetOfNullableDecimals: Option[Set[Option[BigDecimal]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfNullableDecimals") persistedNullableSetOfNullableDecimals: Option[Set[Option[BigDecimal]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableSetOfNullableDecimals = nullableSetOfNullableDecimals, _calculatedNullableSetOfNullableDecimals = calculatedNullableSetOfNullableDecimals, _persistedNullableSetOfNullableDecimals = persistedNullableSetOfNullableDecimals)

}

object NullableSetOfNullableDecimals_3 extends AggregateRootCompanion[NullableSetOfNullableDecimals_3]{

  def apply(
    nullableSetOfNullableDecimals: Option[Set[Option[BigDecimal]]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableSetOfNullableDecimals)
    require(nullableSetOfNullableDecimals ne null, "Null value was provided for property \"nullableSetOfNullableDecimals\"")
    if (nullableSetOfNullableDecimals.isDefined) require(nullableSetOfNullableDecimals.get ne null, "Null value was provided for property \"nullableSetOfNullableDecimals\"")
    new NullableSetOfNullableDecimals_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableSetOfNullableDecimals = nullableSetOfNullableDecimals
    , _calculatedNullableSetOfNullableDecimals = None
    , _persistedNullableSetOfNullableDecimals = None)
  }

}