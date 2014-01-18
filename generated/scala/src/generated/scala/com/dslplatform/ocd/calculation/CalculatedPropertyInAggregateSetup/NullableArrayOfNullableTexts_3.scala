package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableArrayOfNullableTexts_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableArrayOfNullableTexts: Option[Array[Option[String]]],
    private var _calculatedNullableArrayOfNullableTexts: Option[Array[Option[String]]],
    private var _persistedNullableArrayOfNullableTexts: Option[Array[Option[String]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableArrayOfNullableTexts_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableArrayOfNullableTexts_3("+ URI +")"

   def copy(nullableArrayOfNullableTexts: Option[Array[Option[String]]] = this._nullableArrayOfNullableTexts): NullableArrayOfNullableTexts_3 = {

  require(nullableArrayOfNullableTexts ne null, "Null value was provided for property \"nullableArrayOfNullableTexts\"")
  if(nullableArrayOfNullableTexts.isDefined) require(nullableArrayOfNullableTexts.get ne null, "Null value was provided for property \"nullableArrayOfNullableTexts\"")
  com.dslplatform.api.Guards.checkArrayOptionRefNulls(nullableArrayOfNullableTexts)
    new NullableArrayOfNullableTexts_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableArrayOfNullableTexts = nullableArrayOfNullableTexts, _calculatedNullableArrayOfNullableTexts = _calculatedNullableArrayOfNullableTexts, _persistedNullableArrayOfNullableTexts = _persistedNullableArrayOfNullableTexts)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfNullableTexts_3): this.type = {
    this._URI = result._URI
    this._nullableArrayOfNullableTexts = result._nullableArrayOfNullableTexts
    this._calculatedNullableArrayOfNullableTexts = result._calculatedNullableArrayOfNullableTexts
    this._persistedNullableArrayOfNullableTexts = result._persistedNullableArrayOfNullableTexts
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfNullableTexts_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableTexts")
  def nullableArrayOfNullableTexts = {
    _nullableArrayOfNullableTexts
  }

  def nullableArrayOfNullableTexts_= (value: Option[Array[Option[String]]]) {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(value)
    _nullableArrayOfNullableTexts = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfNullableTexts")
  def calculatedNullableArrayOfNullableTexts = {
    _calculatedNullableArrayOfNullableTexts
  }

  def calculatedNullableArrayOfNullableTexts_= (value: Option[Array[Option[String]]]) {
    _calculatedNullableArrayOfNullableTexts = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfNullableTexts")
  def persistedNullableArrayOfNullableTexts = {
    _persistedNullableArrayOfNullableTexts
  }

  def persistedNullableArrayOfNullableTexts_= (value: Option[Array[Option[String]]]) {
    _persistedNullableArrayOfNullableTexts = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableTexts") nullableArrayOfNullableTexts: Option[Array[Option[String]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfNullableTexts") calculatedNullableArrayOfNullableTexts: Option[Array[Option[String]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfNullableTexts") persistedNullableArrayOfNullableTexts: Option[Array[Option[String]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableArrayOfNullableTexts = nullableArrayOfNullableTexts, _calculatedNullableArrayOfNullableTexts = calculatedNullableArrayOfNullableTexts, _persistedNullableArrayOfNullableTexts = persistedNullableArrayOfNullableTexts)

}

object NullableArrayOfNullableTexts_3 extends AggregateRootCompanion[NullableArrayOfNullableTexts_3]{

  def apply(
    nullableArrayOfNullableTexts: Option[Array[Option[String]]] = None
  ) = {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(nullableArrayOfNullableTexts)
    require(nullableArrayOfNullableTexts ne null, "Null value was provided for property \"nullableArrayOfNullableTexts\"")
    if (nullableArrayOfNullableTexts.isDefined) require(nullableArrayOfNullableTexts.get ne null, "Null value was provided for property \"nullableArrayOfNullableTexts\"")
    new NullableArrayOfNullableTexts_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableArrayOfNullableTexts = nullableArrayOfNullableTexts
    , _calculatedNullableArrayOfNullableTexts = None
    , _persistedNullableArrayOfNullableTexts = None)
  }

}
