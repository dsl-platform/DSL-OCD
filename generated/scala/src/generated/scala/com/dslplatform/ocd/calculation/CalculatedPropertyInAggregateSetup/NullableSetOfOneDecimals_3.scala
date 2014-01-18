package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableSetOfOneDecimals_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableSetOfOneDecimals: Option[Set[BigDecimal]],
    private var _calculatedNullableSetOfOneDecimals: Option[Set[BigDecimal]],
    private var _persistedNullableSetOfOneDecimals: Option[Set[BigDecimal]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableSetOfOneDecimals_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableSetOfOneDecimals_3("+ URI +")"

   def copy(nullableSetOfOneDecimals: Option[Set[BigDecimal]] = this._nullableSetOfOneDecimals): NullableSetOfOneDecimals_3 = {

  require(nullableSetOfOneDecimals ne null, "Null value was provided for property \"nullableSetOfOneDecimals\"")
  if(nullableSetOfOneDecimals.isDefined) require(nullableSetOfOneDecimals.get ne null, "Null value was provided for property \"nullableSetOfOneDecimals\"")
  com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneDecimals)
    new NullableSetOfOneDecimals_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableSetOfOneDecimals = nullableSetOfOneDecimals, _calculatedNullableSetOfOneDecimals = _calculatedNullableSetOfOneDecimals, _persistedNullableSetOfOneDecimals = _persistedNullableSetOfOneDecimals)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfOneDecimals_3): this.type = {
    this._URI = result._URI
    this._nullableSetOfOneDecimals = result._nullableSetOfOneDecimals
    this._calculatedNullableSetOfOneDecimals = result._calculatedNullableSetOfOneDecimals
    this._persistedNullableSetOfOneDecimals = result._persistedNullableSetOfOneDecimals
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfOneDecimals_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneDecimals")
  def nullableSetOfOneDecimals = {
    _nullableSetOfOneDecimals
  }

  def nullableSetOfOneDecimals_= (value: Option[Set[BigDecimal]]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _nullableSetOfOneDecimals = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfOneDecimals")
  def calculatedNullableSetOfOneDecimals = {
    _calculatedNullableSetOfOneDecimals
  }

  def calculatedNullableSetOfOneDecimals_= (value: Option[Set[BigDecimal]]) {
    _calculatedNullableSetOfOneDecimals = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfOneDecimals")
  def persistedNullableSetOfOneDecimals = {
    _persistedNullableSetOfOneDecimals
  }

  def persistedNullableSetOfOneDecimals_= (value: Option[Set[BigDecimal]]) {
    _persistedNullableSetOfOneDecimals = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneDecimals") nullableSetOfOneDecimals: Option[Set[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfOneDecimals") calculatedNullableSetOfOneDecimals: Option[Set[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfOneDecimals") persistedNullableSetOfOneDecimals: Option[Set[BigDecimal]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableSetOfOneDecimals = nullableSetOfOneDecimals, _calculatedNullableSetOfOneDecimals = calculatedNullableSetOfOneDecimals, _persistedNullableSetOfOneDecimals = persistedNullableSetOfOneDecimals)

}

object NullableSetOfOneDecimals_3 extends AggregateRootCompanion[NullableSetOfOneDecimals_3]{

  def apply(
    nullableSetOfOneDecimals: Option[Set[BigDecimal]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneDecimals)
    require(nullableSetOfOneDecimals ne null, "Null value was provided for property \"nullableSetOfOneDecimals\"")
    if (nullableSetOfOneDecimals.isDefined) require(nullableSetOfOneDecimals.get ne null, "Null value was provided for property \"nullableSetOfOneDecimals\"")
    new NullableSetOfOneDecimals_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableSetOfOneDecimals = nullableSetOfOneDecimals
    , _calculatedNullableSetOfOneDecimals = None
    , _persistedNullableSetOfOneDecimals = None)
  }

}
