package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableSetOfOneDoubles_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableSetOfOneDoubles: Option[Set[Double]],
    private var _calculatedNullableSetOfOneDoubles: Option[Set[Double]],
    private var _persistedNullableSetOfOneDoubles: Option[Set[Double]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableSetOfOneDoubles_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableSetOfOneDoubles_3("+ URI +")"

   def copy(nullableSetOfOneDoubles: Option[Set[Double]] = this._nullableSetOfOneDoubles): NullableSetOfOneDoubles_3 = {

  require(nullableSetOfOneDoubles ne null, "Null value was provided for property \"nullableSetOfOneDoubles\"")
  if(nullableSetOfOneDoubles.isDefined) require(nullableSetOfOneDoubles.get ne null, "Null value was provided for property \"nullableSetOfOneDoubles\"")
    new NullableSetOfOneDoubles_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableSetOfOneDoubles = nullableSetOfOneDoubles, _calculatedNullableSetOfOneDoubles = _calculatedNullableSetOfOneDoubles, _persistedNullableSetOfOneDoubles = _persistedNullableSetOfOneDoubles)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfOneDoubles_3): this.type = {
    this._URI = result._URI
    this._nullableSetOfOneDoubles = result._nullableSetOfOneDoubles
    this._calculatedNullableSetOfOneDoubles = result._calculatedNullableSetOfOneDoubles
    this._persistedNullableSetOfOneDoubles = result._persistedNullableSetOfOneDoubles
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfOneDoubles_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneDoubles")
  def nullableSetOfOneDoubles = {
    _nullableSetOfOneDoubles
  }

  def nullableSetOfOneDoubles_= (value: Option[Set[Double]]) {
    _nullableSetOfOneDoubles = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfOneDoubles")
  def calculatedNullableSetOfOneDoubles = {
    _calculatedNullableSetOfOneDoubles
  }

  def calculatedNullableSetOfOneDoubles_= (value: Option[Set[Double]]) {
    _calculatedNullableSetOfOneDoubles = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfOneDoubles")
  def persistedNullableSetOfOneDoubles = {
    _persistedNullableSetOfOneDoubles
  }

  def persistedNullableSetOfOneDoubles_= (value: Option[Set[Double]]) {
    _persistedNullableSetOfOneDoubles = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneDoubles") nullableSetOfOneDoubles: Option[Set[Double]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfOneDoubles") calculatedNullableSetOfOneDoubles: Option[Set[Double]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfOneDoubles") persistedNullableSetOfOneDoubles: Option[Set[Double]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableSetOfOneDoubles = nullableSetOfOneDoubles, _calculatedNullableSetOfOneDoubles = calculatedNullableSetOfOneDoubles, _persistedNullableSetOfOneDoubles = persistedNullableSetOfOneDoubles)

}

object NullableSetOfOneDoubles_3 extends AggregateRootCompanion[NullableSetOfOneDoubles_3]{

  def apply(
    nullableSetOfOneDoubles: Option[Set[Double]] = None
  ) = {
    require(nullableSetOfOneDoubles ne null, "Null value was provided for property \"nullableSetOfOneDoubles\"")
    if (nullableSetOfOneDoubles.isDefined) require(nullableSetOfOneDoubles.get ne null, "Null value was provided for property \"nullableSetOfOneDoubles\"")
    new NullableSetOfOneDoubles_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableSetOfOneDoubles = nullableSetOfOneDoubles
    , _calculatedNullableSetOfOneDoubles = None
    , _persistedNullableSetOfOneDoubles = None)
  }

}
