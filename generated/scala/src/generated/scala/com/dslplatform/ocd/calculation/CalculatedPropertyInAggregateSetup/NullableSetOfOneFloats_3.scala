package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableSetOfOneFloats_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableSetOfOneFloats: Option[Set[Float]],
    private var _calculatedNullableSetOfOneFloats: Option[Set[Float]],
    private var _persistedNullableSetOfOneFloats: Option[Set[Float]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableSetOfOneFloats_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableSetOfOneFloats_3("+ URI +")"

   def copy(nullableSetOfOneFloats: Option[Set[Float]] = this._nullableSetOfOneFloats): NullableSetOfOneFloats_3 = {

  require(nullableSetOfOneFloats ne null, "Null value was provided for property \"nullableSetOfOneFloats\"")
  if(nullableSetOfOneFloats.isDefined) require(nullableSetOfOneFloats.get ne null, "Null value was provided for property \"nullableSetOfOneFloats\"")
    new NullableSetOfOneFloats_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableSetOfOneFloats = nullableSetOfOneFloats, _calculatedNullableSetOfOneFloats = _calculatedNullableSetOfOneFloats, _persistedNullableSetOfOneFloats = _persistedNullableSetOfOneFloats)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfOneFloats_3): this.type = {
    this._URI = result._URI
    this._nullableSetOfOneFloats = result._nullableSetOfOneFloats
    this._calculatedNullableSetOfOneFloats = result._calculatedNullableSetOfOneFloats
    this._persistedNullableSetOfOneFloats = result._persistedNullableSetOfOneFloats
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfOneFloats_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneFloats")
  def nullableSetOfOneFloats = {
    _nullableSetOfOneFloats
  }

  def nullableSetOfOneFloats_= (value: Option[Set[Float]]) {
    _nullableSetOfOneFloats = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfOneFloats")
  def calculatedNullableSetOfOneFloats = {
    _calculatedNullableSetOfOneFloats
  }

  def calculatedNullableSetOfOneFloats_= (value: Option[Set[Float]]) {
    _calculatedNullableSetOfOneFloats = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfOneFloats")
  def persistedNullableSetOfOneFloats = {
    _persistedNullableSetOfOneFloats
  }

  def persistedNullableSetOfOneFloats_= (value: Option[Set[Float]]) {
    _persistedNullableSetOfOneFloats = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneFloats") nullableSetOfOneFloats: Option[Set[Float]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfOneFloats") calculatedNullableSetOfOneFloats: Option[Set[Float]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfOneFloats") persistedNullableSetOfOneFloats: Option[Set[Float]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableSetOfOneFloats = nullableSetOfOneFloats, _calculatedNullableSetOfOneFloats = calculatedNullableSetOfOneFloats, _persistedNullableSetOfOneFloats = persistedNullableSetOfOneFloats)

}

object NullableSetOfOneFloats_3 extends AggregateRootCompanion[NullableSetOfOneFloats_3]{

  def apply(
    nullableSetOfOneFloats: Option[Set[Float]] = None
  ) = {
    require(nullableSetOfOneFloats ne null, "Null value was provided for property \"nullableSetOfOneFloats\"")
    if (nullableSetOfOneFloats.isDefined) require(nullableSetOfOneFloats.get ne null, "Null value was provided for property \"nullableSetOfOneFloats\"")
    new NullableSetOfOneFloats_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableSetOfOneFloats = nullableSetOfOneFloats
    , _calculatedNullableSetOfOneFloats = None
    , _persistedNullableSetOfOneFloats = None)
  }

}
