package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableArrayOfOneIntegers_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableArrayOfOneIntegers: Option[Array[Int]],
    private var _calculatedNullableArrayOfOneIntegers: Option[Array[Int]],
    private var _persistedNullableArrayOfOneIntegers: Option[Array[Int]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableArrayOfOneIntegers_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableArrayOfOneIntegers_3("+ URI +")"

   def copy(nullableArrayOfOneIntegers: Option[Array[Int]] = this._nullableArrayOfOneIntegers): NullableArrayOfOneIntegers_3 = {

  require(nullableArrayOfOneIntegers ne null, "Null value was provided for property \"nullableArrayOfOneIntegers\"")
  if(nullableArrayOfOneIntegers.isDefined) require(nullableArrayOfOneIntegers.get ne null, "Null value was provided for property \"nullableArrayOfOneIntegers\"")
    new NullableArrayOfOneIntegers_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableArrayOfOneIntegers = nullableArrayOfOneIntegers, _calculatedNullableArrayOfOneIntegers = _calculatedNullableArrayOfOneIntegers, _persistedNullableArrayOfOneIntegers = _persistedNullableArrayOfOneIntegers)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfOneIntegers_3): this.type = {
    this._URI = result._URI
    this._nullableArrayOfOneIntegers = result._nullableArrayOfOneIntegers
    this._calculatedNullableArrayOfOneIntegers = result._calculatedNullableArrayOfOneIntegers
    this._persistedNullableArrayOfOneIntegers = result._persistedNullableArrayOfOneIntegers
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfOneIntegers_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneIntegers")
  def nullableArrayOfOneIntegers = {
    _nullableArrayOfOneIntegers
  }

  def nullableArrayOfOneIntegers_= (value: Option[Array[Int]]) {
    _nullableArrayOfOneIntegers = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfOneIntegers")
  def calculatedNullableArrayOfOneIntegers = {
    _calculatedNullableArrayOfOneIntegers
  }

  def calculatedNullableArrayOfOneIntegers_= (value: Option[Array[Int]]) {
    _calculatedNullableArrayOfOneIntegers = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfOneIntegers")
  def persistedNullableArrayOfOneIntegers = {
    _persistedNullableArrayOfOneIntegers
  }

  def persistedNullableArrayOfOneIntegers_= (value: Option[Array[Int]]) {
    _persistedNullableArrayOfOneIntegers = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneIntegers") nullableArrayOfOneIntegers: Option[Array[Int]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfOneIntegers") calculatedNullableArrayOfOneIntegers: Option[Array[Int]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfOneIntegers") persistedNullableArrayOfOneIntegers: Option[Array[Int]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableArrayOfOneIntegers = nullableArrayOfOneIntegers, _calculatedNullableArrayOfOneIntegers = calculatedNullableArrayOfOneIntegers, _persistedNullableArrayOfOneIntegers = persistedNullableArrayOfOneIntegers)

}

object NullableArrayOfOneIntegers_3 extends AggregateRootCompanion[NullableArrayOfOneIntegers_3]{

  def apply(
    nullableArrayOfOneIntegers: Option[Array[Int]] = None
  ) = {
    require(nullableArrayOfOneIntegers ne null, "Null value was provided for property \"nullableArrayOfOneIntegers\"")
    if (nullableArrayOfOneIntegers.isDefined) require(nullableArrayOfOneIntegers.get ne null, "Null value was provided for property \"nullableArrayOfOneIntegers\"")
    new NullableArrayOfOneIntegers_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableArrayOfOneIntegers = nullableArrayOfOneIntegers
    , _calculatedNullableArrayOfOneIntegers = None
    , _persistedNullableArrayOfOneIntegers = None)
  }

}
