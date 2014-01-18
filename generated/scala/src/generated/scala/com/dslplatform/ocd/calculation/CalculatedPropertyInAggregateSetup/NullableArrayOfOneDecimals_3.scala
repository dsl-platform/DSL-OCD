package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableArrayOfOneDecimals_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableArrayOfOneDecimals: Option[Array[BigDecimal]],
    private var _calculatedNullableArrayOfOneDecimals: Option[Array[BigDecimal]],
    private var _persistedNullableArrayOfOneDecimals: Option[Array[BigDecimal]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableArrayOfOneDecimals_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableArrayOfOneDecimals_3("+ URI +")"

   def copy(nullableArrayOfOneDecimals: Option[Array[BigDecimal]] = this._nullableArrayOfOneDecimals): NullableArrayOfOneDecimals_3 = {

  require(nullableArrayOfOneDecimals ne null, "Null value was provided for property \"nullableArrayOfOneDecimals\"")
  if(nullableArrayOfOneDecimals.isDefined) require(nullableArrayOfOneDecimals.get ne null, "Null value was provided for property \"nullableArrayOfOneDecimals\"")
  com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneDecimals)
    new NullableArrayOfOneDecimals_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableArrayOfOneDecimals = nullableArrayOfOneDecimals, _calculatedNullableArrayOfOneDecimals = _calculatedNullableArrayOfOneDecimals, _persistedNullableArrayOfOneDecimals = _persistedNullableArrayOfOneDecimals)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfOneDecimals_3): this.type = {
    this._URI = result._URI
    this._nullableArrayOfOneDecimals = result._nullableArrayOfOneDecimals
    this._calculatedNullableArrayOfOneDecimals = result._calculatedNullableArrayOfOneDecimals
    this._persistedNullableArrayOfOneDecimals = result._persistedNullableArrayOfOneDecimals
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfOneDecimals_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneDecimals")
  def nullableArrayOfOneDecimals = {
    _nullableArrayOfOneDecimals
  }

  def nullableArrayOfOneDecimals_= (value: Option[Array[BigDecimal]]) {
    com.dslplatform.api.Guards.checkArrayNulls(value)
    _nullableArrayOfOneDecimals = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfOneDecimals")
  def calculatedNullableArrayOfOneDecimals = {
    _calculatedNullableArrayOfOneDecimals
  }

  def calculatedNullableArrayOfOneDecimals_= (value: Option[Array[BigDecimal]]) {
    _calculatedNullableArrayOfOneDecimals = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfOneDecimals")
  def persistedNullableArrayOfOneDecimals = {
    _persistedNullableArrayOfOneDecimals
  }

  def persistedNullableArrayOfOneDecimals_= (value: Option[Array[BigDecimal]]) {
    _persistedNullableArrayOfOneDecimals = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneDecimals") nullableArrayOfOneDecimals: Option[Array[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfOneDecimals") calculatedNullableArrayOfOneDecimals: Option[Array[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfOneDecimals") persistedNullableArrayOfOneDecimals: Option[Array[BigDecimal]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableArrayOfOneDecimals = nullableArrayOfOneDecimals, _calculatedNullableArrayOfOneDecimals = calculatedNullableArrayOfOneDecimals, _persistedNullableArrayOfOneDecimals = persistedNullableArrayOfOneDecimals)

}

object NullableArrayOfOneDecimals_3 extends AggregateRootCompanion[NullableArrayOfOneDecimals_3]{

  def apply(
    nullableArrayOfOneDecimals: Option[Array[BigDecimal]] = None
  ) = {
    com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneDecimals)
    require(nullableArrayOfOneDecimals ne null, "Null value was provided for property \"nullableArrayOfOneDecimals\"")
    if (nullableArrayOfOneDecimals.isDefined) require(nullableArrayOfOneDecimals.get ne null, "Null value was provided for property \"nullableArrayOfOneDecimals\"")
    new NullableArrayOfOneDecimals_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableArrayOfOneDecimals = nullableArrayOfOneDecimals
    , _calculatedNullableArrayOfOneDecimals = None
    , _persistedNullableArrayOfOneDecimals = None)
  }

}
