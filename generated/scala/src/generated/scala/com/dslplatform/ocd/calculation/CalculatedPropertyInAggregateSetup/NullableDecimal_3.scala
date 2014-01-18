package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableDecimal_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableDecimal: Option[BigDecimal],
    private var _calculatedNullableDecimal: Option[BigDecimal],
    private var _persistedNullableDecimal: Option[BigDecimal]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableDecimal_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableDecimal_3("+ URI +")"

   def copy(nullableDecimal: Option[BigDecimal] = this._nullableDecimal): NullableDecimal_3 = {

  require(nullableDecimal ne null, "Null value was provided for property \"nullableDecimal\"")
  if(nullableDecimal.isDefined) require(nullableDecimal.get ne null, "Null value was provided for property \"nullableDecimal\"")
    new NullableDecimal_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableDecimal = nullableDecimal, _calculatedNullableDecimal = _calculatedNullableDecimal, _persistedNullableDecimal = _persistedNullableDecimal)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableDecimal_3): this.type = {
    this._URI = result._URI
    this._nullableDecimal = result._nullableDecimal
    this._calculatedNullableDecimal = result._calculatedNullableDecimal
    this._persistedNullableDecimal = result._persistedNullableDecimal
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableDecimal_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableDecimal")
  def nullableDecimal = {
    _nullableDecimal
  }

  def nullableDecimal_= (value: Option[BigDecimal]) {
    _nullableDecimal = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableDecimal")
  def calculatedNullableDecimal = {
    _calculatedNullableDecimal
  }

  def calculatedNullableDecimal_= (value: Option[BigDecimal]) {
    _calculatedNullableDecimal = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableDecimal")
  def persistedNullableDecimal = {
    _persistedNullableDecimal
  }

  def persistedNullableDecimal_= (value: Option[BigDecimal]) {
    _persistedNullableDecimal = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableDecimal") nullableDecimal: Option[BigDecimal]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableDecimal") calculatedNullableDecimal: Option[BigDecimal]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableDecimal") persistedNullableDecimal: Option[BigDecimal]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableDecimal = nullableDecimal, _calculatedNullableDecimal = calculatedNullableDecimal, _persistedNullableDecimal = persistedNullableDecimal)

}

object NullableDecimal_3 extends AggregateRootCompanion[NullableDecimal_3]{

  def apply(
    nullableDecimal: Option[BigDecimal] = None
  ) = {
    require(nullableDecimal ne null, "Null value was provided for property \"nullableDecimal\"")
    if (nullableDecimal.isDefined) require(nullableDecimal.get ne null, "Null value was provided for property \"nullableDecimal\"")
    new NullableDecimal_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableDecimal = nullableDecimal
    , _calculatedNullableDecimal = None
    , _persistedNullableDecimal = None)
  }

}
