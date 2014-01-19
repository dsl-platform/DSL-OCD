package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableArrayOfNullableMonies_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableArrayOfNullableMonies: Option[Array[Option[BigDecimal]]],
    private var _calculatedNullableArrayOfNullableMonies: Option[Array[Option[BigDecimal]]],
    private var _persistedNullableArrayOfNullableMonies: Option[Array[Option[BigDecimal]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableArrayOfNullableMonies_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableArrayOfNullableMonies_3("+ URI +")"

   def copy(nullableArrayOfNullableMonies: Option[Array[Option[BigDecimal]]] = this._nullableArrayOfNullableMonies): NullableArrayOfNullableMonies_3 = {

  require(nullableArrayOfNullableMonies ne null, "Null value was provided for property \"nullableArrayOfNullableMonies\"")
  if(nullableArrayOfNullableMonies.isDefined) require(nullableArrayOfNullableMonies.get ne null, "Null value was provided for property \"nullableArrayOfNullableMonies\"")
  com.dslplatform.api.Guards.checkArrayOptionRefNulls(nullableArrayOfNullableMonies)
    new NullableArrayOfNullableMonies_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableArrayOfNullableMonies = nullableArrayOfNullableMonies, _calculatedNullableArrayOfNullableMonies = _calculatedNullableArrayOfNullableMonies, _persistedNullableArrayOfNullableMonies = _persistedNullableArrayOfNullableMonies)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfNullableMonies_3): this.type = {
    this._URI = result._URI
    this._nullableArrayOfNullableMonies = result._nullableArrayOfNullableMonies
    this._calculatedNullableArrayOfNullableMonies = result._calculatedNullableArrayOfNullableMonies
    this._persistedNullableArrayOfNullableMonies = result._persistedNullableArrayOfNullableMonies
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfNullableMonies_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableMonies")
  def nullableArrayOfNullableMonies = {
    _nullableArrayOfNullableMonies
  }

  def nullableArrayOfNullableMonies_= (value: Option[Array[Option[BigDecimal]]]) {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(value)
    _nullableArrayOfNullableMonies = value

    _nullableArrayOfNullableMonies = com.dslplatform.api.Guards.setArrayOptionScale(_nullableArrayOfNullableMonies, 2)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfNullableMonies")
  def calculatedNullableArrayOfNullableMonies = {
    _calculatedNullableArrayOfNullableMonies
  }

  def calculatedNullableArrayOfNullableMonies_= (value: Option[Array[Option[BigDecimal]]]) {
    _calculatedNullableArrayOfNullableMonies = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfNullableMonies")
  def persistedNullableArrayOfNullableMonies = {
    _persistedNullableArrayOfNullableMonies
  }

  def persistedNullableArrayOfNullableMonies_= (value: Option[Array[Option[BigDecimal]]]) {
    _persistedNullableArrayOfNullableMonies = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableMonies") nullableArrayOfNullableMonies: Option[Array[Option[BigDecimal]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfNullableMonies") calculatedNullableArrayOfNullableMonies: Option[Array[Option[BigDecimal]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfNullableMonies") persistedNullableArrayOfNullableMonies: Option[Array[Option[BigDecimal]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableArrayOfNullableMonies = nullableArrayOfNullableMonies, _calculatedNullableArrayOfNullableMonies = calculatedNullableArrayOfNullableMonies, _persistedNullableArrayOfNullableMonies = persistedNullableArrayOfNullableMonies)

}

object NullableArrayOfNullableMonies_3 extends AggregateRootCompanion[NullableArrayOfNullableMonies_3]{

  def apply(
    nullableArrayOfNullableMonies: Option[Array[Option[BigDecimal]]] = None
  ) = {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(nullableArrayOfNullableMonies)
    require(nullableArrayOfNullableMonies ne null, "Null value was provided for property \"nullableArrayOfNullableMonies\"")
    if (nullableArrayOfNullableMonies.isDefined) require(nullableArrayOfNullableMonies.get ne null, "Null value was provided for property \"nullableArrayOfNullableMonies\"")
    new NullableArrayOfNullableMonies_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableArrayOfNullableMonies = nullableArrayOfNullableMonies
    , _calculatedNullableArrayOfNullableMonies = None
    , _persistedNullableArrayOfNullableMonies = None)
  }

}
