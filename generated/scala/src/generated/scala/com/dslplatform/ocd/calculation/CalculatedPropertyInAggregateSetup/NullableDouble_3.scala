package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableDouble_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableDouble: Option[Double],
    private var _calculatedNullableDouble: Option[Double],
    private var _persistedNullableDouble: Option[Double]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableDouble_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableDouble_3("+ URI +")"

   def copy(nullableDouble: Option[Double] = this._nullableDouble): NullableDouble_3 = {

  require(nullableDouble ne null, "Null value was provided for property \"nullableDouble\"")
    new NullableDouble_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableDouble = nullableDouble, _calculatedNullableDouble = _calculatedNullableDouble, _persistedNullableDouble = _persistedNullableDouble)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableDouble_3): this.type = {
    this._URI = result._URI
    this._nullableDouble = result._nullableDouble
    this._calculatedNullableDouble = result._calculatedNullableDouble
    this._persistedNullableDouble = result._persistedNullableDouble
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableDouble_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableDouble")
  def nullableDouble = {
    _nullableDouble
  }

  def nullableDouble_= (value: Option[Double]) {
    _nullableDouble = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableDouble")
  def calculatedNullableDouble = {
    _calculatedNullableDouble
  }

  def calculatedNullableDouble_= (value: Option[Double]) {
    _calculatedNullableDouble = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableDouble")
  def persistedNullableDouble = {
    _persistedNullableDouble
  }

  def persistedNullableDouble_= (value: Option[Double]) {
    _persistedNullableDouble = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableDouble") nullableDouble: Option[Double]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableDouble") calculatedNullableDouble: Option[Double]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableDouble") persistedNullableDouble: Option[Double]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableDouble = nullableDouble, _calculatedNullableDouble = calculatedNullableDouble, _persistedNullableDouble = persistedNullableDouble)

}

object NullableDouble_3 extends AggregateRootCompanion[NullableDouble_3]{

  def apply(
    nullableDouble: Option[Double] = None
  ) = {
    require(nullableDouble ne null, "Null value was provided for property \"nullableDouble\"")
    new NullableDouble_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableDouble = nullableDouble
    , _calculatedNullableDouble = None
    , _persistedNullableDouble = None)
  }

}
