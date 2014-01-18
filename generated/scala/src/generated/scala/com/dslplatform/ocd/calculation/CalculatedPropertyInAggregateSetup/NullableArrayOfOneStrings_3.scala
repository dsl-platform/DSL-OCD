package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableArrayOfOneStrings_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableArrayOfOneStrings: Option[Array[String]],
    private var _calculatedNullableArrayOfOneStrings: Option[Array[String]],
    private var _persistedNullableArrayOfOneStrings: Option[Array[String]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableArrayOfOneStrings_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableArrayOfOneStrings_3("+ URI +")"

   def copy(nullableArrayOfOneStrings: Option[Array[String]] = this._nullableArrayOfOneStrings): NullableArrayOfOneStrings_3 = {

  require(nullableArrayOfOneStrings ne null, "Null value was provided for property \"nullableArrayOfOneStrings\"")
  if(nullableArrayOfOneStrings.isDefined) require(nullableArrayOfOneStrings.get ne null, "Null value was provided for property \"nullableArrayOfOneStrings\"")
  com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneStrings)
    new NullableArrayOfOneStrings_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableArrayOfOneStrings = nullableArrayOfOneStrings, _calculatedNullableArrayOfOneStrings = _calculatedNullableArrayOfOneStrings, _persistedNullableArrayOfOneStrings = _persistedNullableArrayOfOneStrings)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfOneStrings_3): this.type = {
    this._URI = result._URI
    this._nullableArrayOfOneStrings = result._nullableArrayOfOneStrings
    this._calculatedNullableArrayOfOneStrings = result._calculatedNullableArrayOfOneStrings
    this._persistedNullableArrayOfOneStrings = result._persistedNullableArrayOfOneStrings
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfOneStrings_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneStrings")
  def nullableArrayOfOneStrings = {
    _nullableArrayOfOneStrings
  }

  def nullableArrayOfOneStrings_= (value: Option[Array[String]]) {
    com.dslplatform.api.Guards.checkArrayNulls(value)
    _nullableArrayOfOneStrings = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfOneStrings")
  def calculatedNullableArrayOfOneStrings = {
    _calculatedNullableArrayOfOneStrings
  }

  def calculatedNullableArrayOfOneStrings_= (value: Option[Array[String]]) {
    _calculatedNullableArrayOfOneStrings = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfOneStrings")
  def persistedNullableArrayOfOneStrings = {
    _persistedNullableArrayOfOneStrings
  }

  def persistedNullableArrayOfOneStrings_= (value: Option[Array[String]]) {
    _persistedNullableArrayOfOneStrings = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneStrings") nullableArrayOfOneStrings: Option[Array[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfOneStrings") calculatedNullableArrayOfOneStrings: Option[Array[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfOneStrings") persistedNullableArrayOfOneStrings: Option[Array[String]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableArrayOfOneStrings = nullableArrayOfOneStrings, _calculatedNullableArrayOfOneStrings = calculatedNullableArrayOfOneStrings, _persistedNullableArrayOfOneStrings = persistedNullableArrayOfOneStrings)

}

object NullableArrayOfOneStrings_3 extends AggregateRootCompanion[NullableArrayOfOneStrings_3]{

  def apply(
    nullableArrayOfOneStrings: Option[Array[String]] = None
  ) = {
    com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneStrings)
    require(nullableArrayOfOneStrings ne null, "Null value was provided for property \"nullableArrayOfOneStrings\"")
    if (nullableArrayOfOneStrings.isDefined) require(nullableArrayOfOneStrings.get ne null, "Null value was provided for property \"nullableArrayOfOneStrings\"")
    new NullableArrayOfOneStrings_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableArrayOfOneStrings = nullableArrayOfOneStrings
    , _calculatedNullableArrayOfOneStrings = None
    , _persistedNullableArrayOfOneStrings = None)
  }

}
