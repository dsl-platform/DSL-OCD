package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableArrayOfNullableStrings_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableArrayOfNullableStrings: Option[Array[Option[String]]],
    private var _calculatedNullableArrayOfNullableStrings: Option[Array[Option[String]]],
    private var _persistedNullableArrayOfNullableStrings: Option[Array[Option[String]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableArrayOfNullableStrings_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableArrayOfNullableStrings_3("+ URI +")"

   def copy(nullableArrayOfNullableStrings: Option[Array[Option[String]]] = this._nullableArrayOfNullableStrings): NullableArrayOfNullableStrings_3 = {

  require(nullableArrayOfNullableStrings ne null, "Null value was provided for property \"nullableArrayOfNullableStrings\"")
  if(nullableArrayOfNullableStrings.isDefined) require(nullableArrayOfNullableStrings.get ne null, "Null value was provided for property \"nullableArrayOfNullableStrings\"")
  com.dslplatform.api.Guards.checkArrayOptionRefNulls(nullableArrayOfNullableStrings)
    new NullableArrayOfNullableStrings_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableArrayOfNullableStrings = nullableArrayOfNullableStrings, _calculatedNullableArrayOfNullableStrings = _calculatedNullableArrayOfNullableStrings, _persistedNullableArrayOfNullableStrings = _persistedNullableArrayOfNullableStrings)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfNullableStrings_3): this.type = {
    this._URI = result._URI
    this._nullableArrayOfNullableStrings = result._nullableArrayOfNullableStrings
    this._calculatedNullableArrayOfNullableStrings = result._calculatedNullableArrayOfNullableStrings
    this._persistedNullableArrayOfNullableStrings = result._persistedNullableArrayOfNullableStrings
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfNullableStrings_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableStrings")
  def nullableArrayOfNullableStrings = {
    _nullableArrayOfNullableStrings
  }

  def nullableArrayOfNullableStrings_= (value: Option[Array[Option[String]]]) {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(value)
    _nullableArrayOfNullableStrings = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfNullableStrings")
  def calculatedNullableArrayOfNullableStrings = {
    _calculatedNullableArrayOfNullableStrings
  }

  def calculatedNullableArrayOfNullableStrings_= (value: Option[Array[Option[String]]]) {
    _calculatedNullableArrayOfNullableStrings = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfNullableStrings")
  def persistedNullableArrayOfNullableStrings = {
    _persistedNullableArrayOfNullableStrings
  }

  def persistedNullableArrayOfNullableStrings_= (value: Option[Array[Option[String]]]) {
    _persistedNullableArrayOfNullableStrings = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableStrings") nullableArrayOfNullableStrings: Option[Array[Option[String]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfNullableStrings") calculatedNullableArrayOfNullableStrings: Option[Array[Option[String]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfNullableStrings") persistedNullableArrayOfNullableStrings: Option[Array[Option[String]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableArrayOfNullableStrings = nullableArrayOfNullableStrings, _calculatedNullableArrayOfNullableStrings = calculatedNullableArrayOfNullableStrings, _persistedNullableArrayOfNullableStrings = persistedNullableArrayOfNullableStrings)

}

object NullableArrayOfNullableStrings_3 extends AggregateRootCompanion[NullableArrayOfNullableStrings_3]{

  def apply(
    nullableArrayOfNullableStrings: Option[Array[Option[String]]] = None
  ) = {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(nullableArrayOfNullableStrings)
    require(nullableArrayOfNullableStrings ne null, "Null value was provided for property \"nullableArrayOfNullableStrings\"")
    if (nullableArrayOfNullableStrings.isDefined) require(nullableArrayOfNullableStrings.get ne null, "Null value was provided for property \"nullableArrayOfNullableStrings\"")
    new NullableArrayOfNullableStrings_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableArrayOfNullableStrings = nullableArrayOfNullableStrings
    , _calculatedNullableArrayOfNullableStrings = None
    , _persistedNullableArrayOfNullableStrings = None)
  }

}
