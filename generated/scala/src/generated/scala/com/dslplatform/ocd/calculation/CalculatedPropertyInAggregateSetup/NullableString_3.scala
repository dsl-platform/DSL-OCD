package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableString_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableString: Option[String],
    private var _calculatedNullableString: Option[String],
    private var _persistedNullableString: Option[String]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableString_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableString_3("+ URI +")"

   def copy(nullableString: Option[String] = this._nullableString): NullableString_3 = {

  require(nullableString ne null, "Null value was provided for property \"nullableString\"")
  if(nullableString.isDefined) require(nullableString.get ne null, "Null value was provided for property \"nullableString\"")
    new NullableString_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableString = nullableString, _calculatedNullableString = _calculatedNullableString, _persistedNullableString = _persistedNullableString)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableString_3): this.type = {
    this._URI = result._URI
    this._nullableString = result._nullableString
    this._calculatedNullableString = result._calculatedNullableString
    this._persistedNullableString = result._persistedNullableString
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableString_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableString")
  def nullableString = {
    _nullableString
  }

  def nullableString_= (value: Option[String]) {
    _nullableString = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableString")
  def calculatedNullableString = {
    _calculatedNullableString
  }

  def calculatedNullableString_= (value: Option[String]) {
    _calculatedNullableString = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableString")
  def persistedNullableString = {
    _persistedNullableString
  }

  def persistedNullableString_= (value: Option[String]) {
    _persistedNullableString = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableString") nullableString: Option[String]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableString") calculatedNullableString: Option[String]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableString") persistedNullableString: Option[String]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableString = nullableString, _calculatedNullableString = calculatedNullableString, _persistedNullableString = persistedNullableString)

}

object NullableString_3 extends AggregateRootCompanion[NullableString_3]{

  def apply(
    nullableString: Option[String] = None
  ) = {
    require(nullableString ne null, "Null value was provided for property \"nullableString\"")
    if (nullableString.isDefined) require(nullableString.get ne null, "Null value was provided for property \"nullableString\"")
    new NullableString_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableString = nullableString
    , _calculatedNullableString = None
    , _persistedNullableString = None)
  }

}
