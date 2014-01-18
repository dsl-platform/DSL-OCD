package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneListOfOneFloats_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneListOfOneFloats: IndexedSeq[Float],
    private var _calculatedOneListOfOneFloats: IndexedSeq[Float],
    private var _persistedOneListOfOneFloats: IndexedSeq[Float]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneListOfOneFloats_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneListOfOneFloats_4("+ URI +")"

   def copy(oneListOfOneFloats: IndexedSeq[Float] = this._oneListOfOneFloats): OneListOfOneFloats_4 = {

  require(oneListOfOneFloats ne null, "Null value was provided for property \"oneListOfOneFloats\"")
    new OneListOfOneFloats_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneListOfOneFloats = oneListOfOneFloats, _calculatedOneListOfOneFloats = _calculatedOneListOfOneFloats, _persistedOneListOfOneFloats = _persistedOneListOfOneFloats)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfOneFloats_4): this.type = {
    this._URI = result._URI
    this._oneListOfOneFloats = result._oneListOfOneFloats
    this._calculatedOneListOfOneFloats = result._calculatedOneListOfOneFloats
    this._persistedOneListOfOneFloats = result._persistedOneListOfOneFloats
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfOneFloats_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneFloats")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneListOfOneFloats = {
    _oneListOfOneFloats
  }

  def oneListOfOneFloats_= (value: IndexedSeq[Float]) {
    _oneListOfOneFloats = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfOneFloats")
  def calculatedOneListOfOneFloats = {
    _calculatedOneListOfOneFloats
  }

  def calculatedOneListOfOneFloats_= (value: IndexedSeq[Float]) {
    _calculatedOneListOfOneFloats = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfOneFloats")
  def persistedOneListOfOneFloats = {
    _persistedOneListOfOneFloats
  }

  def persistedOneListOfOneFloats_= (value: IndexedSeq[Float]) {
    _persistedOneListOfOneFloats = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneFloats") oneListOfOneFloats: IndexedSeq[Float]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfOneFloats") calculatedOneListOfOneFloats: IndexedSeq[Float]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfOneFloats") persistedOneListOfOneFloats: IndexedSeq[Float]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneListOfOneFloats = if (oneListOfOneFloats == null) IndexedSeq.empty else oneListOfOneFloats, _calculatedOneListOfOneFloats = calculatedOneListOfOneFloats, _persistedOneListOfOneFloats = persistedOneListOfOneFloats)

}

object OneListOfOneFloats_4 extends AggregateRootCompanion[OneListOfOneFloats_4]{

  def apply(
    oneListOfOneFloats: IndexedSeq[Float] = IndexedSeq.empty
  ) = {
    require(oneListOfOneFloats ne null, "Null value was provided for property \"oneListOfOneFloats\"")
    new OneListOfOneFloats_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneListOfOneFloats = oneListOfOneFloats
    , _calculatedOneListOfOneFloats = IndexedSeq.empty
    , _persistedOneListOfOneFloats = IndexedSeq.empty)
  }

}
