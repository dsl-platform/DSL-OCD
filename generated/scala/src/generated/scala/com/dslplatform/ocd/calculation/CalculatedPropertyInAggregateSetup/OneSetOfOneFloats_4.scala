package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfOneFloats_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneSetOfOneFloats: Set[Float],
    private var _calculatedOneSetOfOneFloats: Set[Float],
    private var _persistedOneSetOfOneFloats: Set[Float]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfOneFloats_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfOneFloats_4("+ URI +")"

   def copy(oneSetOfOneFloats: Set[Float] = this._oneSetOfOneFloats): OneSetOfOneFloats_4 = {

  require(oneSetOfOneFloats ne null, "Null value was provided for property \"oneSetOfOneFloats\"")
    new OneSetOfOneFloats_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneSetOfOneFloats = oneSetOfOneFloats, _calculatedOneSetOfOneFloats = _calculatedOneSetOfOneFloats, _persistedOneSetOfOneFloats = _persistedOneSetOfOneFloats)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfOneFloats_4): this.type = {
    this._URI = result._URI
    this._oneSetOfOneFloats = result._oneSetOfOneFloats
    this._calculatedOneSetOfOneFloats = result._calculatedOneSetOfOneFloats
    this._persistedOneSetOfOneFloats = result._persistedOneSetOfOneFloats
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfOneFloats_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneFloats")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfOneFloats = {
    _oneSetOfOneFloats
  }

  def oneSetOfOneFloats_= (value: Set[Float]) {
    _oneSetOfOneFloats = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfOneFloats")
  def calculatedOneSetOfOneFloats = {
    _calculatedOneSetOfOneFloats
  }

  def calculatedOneSetOfOneFloats_= (value: Set[Float]) {
    _calculatedOneSetOfOneFloats = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfOneFloats")
  def persistedOneSetOfOneFloats = {
    _persistedOneSetOfOneFloats
  }

  def persistedOneSetOfOneFloats_= (value: Set[Float]) {
    _persistedOneSetOfOneFloats = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneFloats") oneSetOfOneFloats: Set[Float]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfOneFloats") calculatedOneSetOfOneFloats: Set[Float]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfOneFloats") persistedOneSetOfOneFloats: Set[Float]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneSetOfOneFloats = if (oneSetOfOneFloats == null) Set.empty else oneSetOfOneFloats, _calculatedOneSetOfOneFloats = calculatedOneSetOfOneFloats, _persistedOneSetOfOneFloats = persistedOneSetOfOneFloats)

}

object OneSetOfOneFloats_4 extends AggregateRootCompanion[OneSetOfOneFloats_4]{

  def apply(
    oneSetOfOneFloats: Set[Float] = Set.empty
  ) = {
    require(oneSetOfOneFloats ne null, "Null value was provided for property \"oneSetOfOneFloats\"")
    new OneSetOfOneFloats_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneSetOfOneFloats = oneSetOfOneFloats
    , _calculatedOneSetOfOneFloats = Set.empty
    , _persistedOneSetOfOneFloats = Set.empty)
  }

}
