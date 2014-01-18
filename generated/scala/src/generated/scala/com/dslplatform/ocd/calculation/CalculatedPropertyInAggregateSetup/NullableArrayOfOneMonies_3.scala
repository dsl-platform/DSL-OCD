package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableArrayOfOneMonies_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableArrayOfOneMonies: Option[Array[BigDecimal]],
    private var _calculatedNullableArrayOfOneMonies: Option[Array[BigDecimal]],
    private var _persistedNullableArrayOfOneMonies: Option[Array[BigDecimal]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableArrayOfOneMonies_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableArrayOfOneMonies_3("+ URI +")"

   def copy(nullableArrayOfOneMonies: Option[Array[BigDecimal]] = this._nullableArrayOfOneMonies): NullableArrayOfOneMonies_3 = {

  require(nullableArrayOfOneMonies ne null, "Null value was provided for property \"nullableArrayOfOneMonies\"")
  if(nullableArrayOfOneMonies.isDefined) require(nullableArrayOfOneMonies.get ne null, "Null value was provided for property \"nullableArrayOfOneMonies\"")
  com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneMonies)
    new NullableArrayOfOneMonies_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableArrayOfOneMonies = nullableArrayOfOneMonies, _calculatedNullableArrayOfOneMonies = _calculatedNullableArrayOfOneMonies, _persistedNullableArrayOfOneMonies = _persistedNullableArrayOfOneMonies)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfOneMonies_3): this.type = {
    this._URI = result._URI
    this._nullableArrayOfOneMonies = result._nullableArrayOfOneMonies
    this._calculatedNullableArrayOfOneMonies = result._calculatedNullableArrayOfOneMonies
    this._persistedNullableArrayOfOneMonies = result._persistedNullableArrayOfOneMonies
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfOneMonies_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneMonies")
  def nullableArrayOfOneMonies = {
    _nullableArrayOfOneMonies
  }

  def nullableArrayOfOneMonies_= (value: Option[Array[BigDecimal]]) {
    com.dslplatform.api.Guards.checkArrayNulls(value)
    _nullableArrayOfOneMonies = value

    _nullableArrayOfOneMonies = com.dslplatform.api.Guards.setArrayScale(_nullableArrayOfOneMonies, 2)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfOneMonies")
  def calculatedNullableArrayOfOneMonies = {
    _calculatedNullableArrayOfOneMonies
  }

  def calculatedNullableArrayOfOneMonies_= (value: Option[Array[BigDecimal]]) {
    _calculatedNullableArrayOfOneMonies = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfOneMonies")
  def persistedNullableArrayOfOneMonies = {
    _persistedNullableArrayOfOneMonies
  }

  def persistedNullableArrayOfOneMonies_= (value: Option[Array[BigDecimal]]) {
    _persistedNullableArrayOfOneMonies = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneMonies") nullableArrayOfOneMonies: Option[Array[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfOneMonies") calculatedNullableArrayOfOneMonies: Option[Array[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfOneMonies") persistedNullableArrayOfOneMonies: Option[Array[BigDecimal]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableArrayOfOneMonies = nullableArrayOfOneMonies, _calculatedNullableArrayOfOneMonies = calculatedNullableArrayOfOneMonies, _persistedNullableArrayOfOneMonies = persistedNullableArrayOfOneMonies)

}

object NullableArrayOfOneMonies_3 extends AggregateRootCompanion[NullableArrayOfOneMonies_3]{

  def apply(
    nullableArrayOfOneMonies: Option[Array[BigDecimal]] = None
  ) = {
    com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneMonies)
    require(nullableArrayOfOneMonies ne null, "Null value was provided for property \"nullableArrayOfOneMonies\"")
    if (nullableArrayOfOneMonies.isDefined) require(nullableArrayOfOneMonies.get ne null, "Null value was provided for property \"nullableArrayOfOneMonies\"")
    new NullableArrayOfOneMonies_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableArrayOfOneMonies = nullableArrayOfOneMonies
    , _calculatedNullableArrayOfOneMonies = None
    , _persistedNullableArrayOfOneMonies = None)
  }

}
