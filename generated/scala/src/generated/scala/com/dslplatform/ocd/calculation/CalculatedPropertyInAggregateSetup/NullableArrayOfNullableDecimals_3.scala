package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableArrayOfNullableDecimals_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableArrayOfNullableDecimals: Option[Array[Option[BigDecimal]]],
    private var _calculatedNullableArrayOfNullableDecimals: Option[Array[Option[BigDecimal]]],
    private var _persistedNullableArrayOfNullableDecimals: Option[Array[Option[BigDecimal]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableArrayOfNullableDecimals_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableArrayOfNullableDecimals_3("+ URI +")"

   def copy(nullableArrayOfNullableDecimals: Option[Array[Option[BigDecimal]]] = this._nullableArrayOfNullableDecimals): NullableArrayOfNullableDecimals_3 = {

  require(nullableArrayOfNullableDecimals ne null, "Null value was provided for property \"nullableArrayOfNullableDecimals\"")
  if(nullableArrayOfNullableDecimals.isDefined) require(nullableArrayOfNullableDecimals.get ne null, "Null value was provided for property \"nullableArrayOfNullableDecimals\"")
  com.dslplatform.api.Guards.checkArrayOptionRefNulls(nullableArrayOfNullableDecimals)
    new NullableArrayOfNullableDecimals_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableArrayOfNullableDecimals = nullableArrayOfNullableDecimals, _calculatedNullableArrayOfNullableDecimals = _calculatedNullableArrayOfNullableDecimals, _persistedNullableArrayOfNullableDecimals = _persistedNullableArrayOfNullableDecimals)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfNullableDecimals_3): this.type = {
    this._URI = result._URI
    this._nullableArrayOfNullableDecimals = result._nullableArrayOfNullableDecimals
    this._calculatedNullableArrayOfNullableDecimals = result._calculatedNullableArrayOfNullableDecimals
    this._persistedNullableArrayOfNullableDecimals = result._persistedNullableArrayOfNullableDecimals
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfNullableDecimals_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableDecimals")
  def nullableArrayOfNullableDecimals = {
    _nullableArrayOfNullableDecimals
  }

  def nullableArrayOfNullableDecimals_= (value: Option[Array[Option[BigDecimal]]]) {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(value)
    _nullableArrayOfNullableDecimals = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfNullableDecimals")
  def calculatedNullableArrayOfNullableDecimals = {
    _calculatedNullableArrayOfNullableDecimals
  }

  def calculatedNullableArrayOfNullableDecimals_= (value: Option[Array[Option[BigDecimal]]]) {
    _calculatedNullableArrayOfNullableDecimals = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfNullableDecimals")
  def persistedNullableArrayOfNullableDecimals = {
    _persistedNullableArrayOfNullableDecimals
  }

  def persistedNullableArrayOfNullableDecimals_= (value: Option[Array[Option[BigDecimal]]]) {
    _persistedNullableArrayOfNullableDecimals = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableDecimals") nullableArrayOfNullableDecimals: Option[Array[Option[BigDecimal]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfNullableDecimals") calculatedNullableArrayOfNullableDecimals: Option[Array[Option[BigDecimal]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfNullableDecimals") persistedNullableArrayOfNullableDecimals: Option[Array[Option[BigDecimal]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableArrayOfNullableDecimals = nullableArrayOfNullableDecimals, _calculatedNullableArrayOfNullableDecimals = calculatedNullableArrayOfNullableDecimals, _persistedNullableArrayOfNullableDecimals = persistedNullableArrayOfNullableDecimals)

}

object NullableArrayOfNullableDecimals_3 extends AggregateRootCompanion[NullableArrayOfNullableDecimals_3]{

  def apply(
    nullableArrayOfNullableDecimals: Option[Array[Option[BigDecimal]]] = None
  ) = {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(nullableArrayOfNullableDecimals)
    require(nullableArrayOfNullableDecimals ne null, "Null value was provided for property \"nullableArrayOfNullableDecimals\"")
    if (nullableArrayOfNullableDecimals.isDefined) require(nullableArrayOfNullableDecimals.get ne null, "Null value was provided for property \"nullableArrayOfNullableDecimals\"")
    new NullableArrayOfNullableDecimals_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableArrayOfNullableDecimals = nullableArrayOfNullableDecimals
    , _calculatedNullableArrayOfNullableDecimals = None
    , _persistedNullableArrayOfNullableDecimals = None)
  }

}
