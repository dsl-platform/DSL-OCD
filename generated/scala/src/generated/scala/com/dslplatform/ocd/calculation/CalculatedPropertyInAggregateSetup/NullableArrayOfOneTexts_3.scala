package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableArrayOfOneTexts_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableArrayOfOneTexts: Option[Array[String]],
    private var _calculatedNullableArrayOfOneTexts: Option[Array[String]],
    private var _persistedNullableArrayOfOneTexts: Option[Array[String]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableArrayOfOneTexts_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableArrayOfOneTexts_3("+ URI +")"

   def copy(nullableArrayOfOneTexts: Option[Array[String]] = this._nullableArrayOfOneTexts): NullableArrayOfOneTexts_3 = {

  require(nullableArrayOfOneTexts ne null, "Null value was provided for property \"nullableArrayOfOneTexts\"")
  if(nullableArrayOfOneTexts.isDefined) require(nullableArrayOfOneTexts.get ne null, "Null value was provided for property \"nullableArrayOfOneTexts\"")
  com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneTexts)
    new NullableArrayOfOneTexts_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableArrayOfOneTexts = nullableArrayOfOneTexts, _calculatedNullableArrayOfOneTexts = _calculatedNullableArrayOfOneTexts, _persistedNullableArrayOfOneTexts = _persistedNullableArrayOfOneTexts)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfOneTexts_3): this.type = {
    this._URI = result._URI
    this._nullableArrayOfOneTexts = result._nullableArrayOfOneTexts
    this._calculatedNullableArrayOfOneTexts = result._calculatedNullableArrayOfOneTexts
    this._persistedNullableArrayOfOneTexts = result._persistedNullableArrayOfOneTexts
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfOneTexts_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneTexts")
  def nullableArrayOfOneTexts = {
    _nullableArrayOfOneTexts
  }

  def nullableArrayOfOneTexts_= (value: Option[Array[String]]) {
    com.dslplatform.api.Guards.checkArrayNulls(value)
    _nullableArrayOfOneTexts = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfOneTexts")
  def calculatedNullableArrayOfOneTexts = {
    _calculatedNullableArrayOfOneTexts
  }

  def calculatedNullableArrayOfOneTexts_= (value: Option[Array[String]]) {
    _calculatedNullableArrayOfOneTexts = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfOneTexts")
  def persistedNullableArrayOfOneTexts = {
    _persistedNullableArrayOfOneTexts
  }

  def persistedNullableArrayOfOneTexts_= (value: Option[Array[String]]) {
    _persistedNullableArrayOfOneTexts = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneTexts") nullableArrayOfOneTexts: Option[Array[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfOneTexts") calculatedNullableArrayOfOneTexts: Option[Array[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfOneTexts") persistedNullableArrayOfOneTexts: Option[Array[String]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableArrayOfOneTexts = nullableArrayOfOneTexts, _calculatedNullableArrayOfOneTexts = calculatedNullableArrayOfOneTexts, _persistedNullableArrayOfOneTexts = persistedNullableArrayOfOneTexts)

}

object NullableArrayOfOneTexts_3 extends AggregateRootCompanion[NullableArrayOfOneTexts_3]{

  def apply(
    nullableArrayOfOneTexts: Option[Array[String]] = None
  ) = {
    com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneTexts)
    require(nullableArrayOfOneTexts ne null, "Null value was provided for property \"nullableArrayOfOneTexts\"")
    if (nullableArrayOfOneTexts.isDefined) require(nullableArrayOfOneTexts.get ne null, "Null value was provided for property \"nullableArrayOfOneTexts\"")
    new NullableArrayOfOneTexts_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableArrayOfOneTexts = nullableArrayOfOneTexts
    , _calculatedNullableArrayOfOneTexts = None
    , _persistedNullableArrayOfOneTexts = None)
  }

}
