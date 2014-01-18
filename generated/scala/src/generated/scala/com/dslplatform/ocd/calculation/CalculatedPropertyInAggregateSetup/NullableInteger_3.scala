package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableInteger_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableInteger: Option[Int],
    private var _calculatedNullableInteger: Option[Int],
    private var _persistedNullableInteger: Option[Int]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableInteger_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableInteger_3("+ URI +")"

   def copy(nullableInteger: Option[Int] = this._nullableInteger): NullableInteger_3 = {

  require(nullableInteger ne null, "Null value was provided for property \"nullableInteger\"")
    new NullableInteger_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableInteger = nullableInteger, _calculatedNullableInteger = _calculatedNullableInteger, _persistedNullableInteger = _persistedNullableInteger)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableInteger_3): this.type = {
    this._URI = result._URI
    this._nullableInteger = result._nullableInteger
    this._calculatedNullableInteger = result._calculatedNullableInteger
    this._persistedNullableInteger = result._persistedNullableInteger
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableInteger_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableInteger")
  def nullableInteger = {
    _nullableInteger
  }

  def nullableInteger_= (value: Option[Int]) {
    _nullableInteger = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableInteger")
  def calculatedNullableInteger = {
    _calculatedNullableInteger
  }

  def calculatedNullableInteger_= (value: Option[Int]) {
    _calculatedNullableInteger = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableInteger")
  def persistedNullableInteger = {
    _persistedNullableInteger
  }

  def persistedNullableInteger_= (value: Option[Int]) {
    _persistedNullableInteger = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableInteger") nullableInteger: Option[Int]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableInteger") calculatedNullableInteger: Option[Int]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableInteger") persistedNullableInteger: Option[Int]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableInteger = nullableInteger, _calculatedNullableInteger = calculatedNullableInteger, _persistedNullableInteger = persistedNullableInteger)

}

object NullableInteger_3 extends AggregateRootCompanion[NullableInteger_3]{

  def apply(
    nullableInteger: Option[Int] = None
  ) = {
    require(nullableInteger ne null, "Null value was provided for property \"nullableInteger\"")
    new NullableInteger_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableInteger = nullableInteger
    , _calculatedNullableInteger = None
    , _persistedNullableInteger = None)
  }

}
