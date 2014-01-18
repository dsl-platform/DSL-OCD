package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfNullableFloats_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneSetOfNullableFloats: Set[Option[Float]],
    private var _calculatedOneSetOfNullableFloats: Set[Option[Float]],
    private var _persistedOneSetOfNullableFloats: Set[Option[Float]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfNullableFloats_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfNullableFloats_4("+ URI +")"

   def copy(oneSetOfNullableFloats: Set[Option[Float]] = this._oneSetOfNullableFloats): OneSetOfNullableFloats_4 = {

  require(oneSetOfNullableFloats ne null, "Null value was provided for property \"oneSetOfNullableFloats\"")
  com.dslplatform.api.Guards.checkCollectionOptionValNulls(oneSetOfNullableFloats)
    new OneSetOfNullableFloats_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneSetOfNullableFloats = oneSetOfNullableFloats, _calculatedOneSetOfNullableFloats = _calculatedOneSetOfNullableFloats, _persistedOneSetOfNullableFloats = _persistedOneSetOfNullableFloats)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfNullableFloats_4): this.type = {
    this._URI = result._URI
    this._oneSetOfNullableFloats = result._oneSetOfNullableFloats
    this._calculatedOneSetOfNullableFloats = result._calculatedOneSetOfNullableFloats
    this._persistedOneSetOfNullableFloats = result._persistedOneSetOfNullableFloats
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfNullableFloats_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableFloats")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfNullableFloats = {
    _oneSetOfNullableFloats
  }

  def oneSetOfNullableFloats_= (value: Set[Option[Float]]) {
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(value)
    _oneSetOfNullableFloats = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullableFloats")
  def calculatedOneSetOfNullableFloats = {
    _calculatedOneSetOfNullableFloats
  }

  def calculatedOneSetOfNullableFloats_= (value: Set[Option[Float]]) {
    _calculatedOneSetOfNullableFloats = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullableFloats")
  def persistedOneSetOfNullableFloats = {
    _persistedOneSetOfNullableFloats
  }

  def persistedOneSetOfNullableFloats_= (value: Set[Option[Float]]) {
    _persistedOneSetOfNullableFloats = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableFloats") oneSetOfNullableFloats: Set[Option[Float]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullableFloats") calculatedOneSetOfNullableFloats: Set[Option[Float]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullableFloats") persistedOneSetOfNullableFloats: Set[Option[Float]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneSetOfNullableFloats = if (oneSetOfNullableFloats == null) Set.empty else oneSetOfNullableFloats, _calculatedOneSetOfNullableFloats = calculatedOneSetOfNullableFloats, _persistedOneSetOfNullableFloats = persistedOneSetOfNullableFloats)

}

object OneSetOfNullableFloats_4 extends AggregateRootCompanion[OneSetOfNullableFloats_4]{

  def apply(
    oneSetOfNullableFloats: Set[Option[Float]] = Set.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(oneSetOfNullableFloats)
    require(oneSetOfNullableFloats ne null, "Null value was provided for property \"oneSetOfNullableFloats\"")
    new OneSetOfNullableFloats_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneSetOfNullableFloats = oneSetOfNullableFloats
    , _calculatedOneSetOfNullableFloats = Set.empty
    , _persistedOneSetOfNullableFloats = Set.empty)
  }

}
