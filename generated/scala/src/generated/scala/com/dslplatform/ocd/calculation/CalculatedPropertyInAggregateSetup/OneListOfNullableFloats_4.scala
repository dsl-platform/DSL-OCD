package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneListOfNullableFloats_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneListOfNullableFloats: IndexedSeq[Option[Float]],
    private var _calculatedOneListOfNullableFloats: IndexedSeq[Option[Float]],
    private var _persistedOneListOfNullableFloats: IndexedSeq[Option[Float]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneListOfNullableFloats_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneListOfNullableFloats_4("+ URI +")"

   def copy(oneListOfNullableFloats: IndexedSeq[Option[Float]] = this._oneListOfNullableFloats): OneListOfNullableFloats_4 = {

  require(oneListOfNullableFloats ne null, "Null value was provided for property \"oneListOfNullableFloats\"")
  com.dslplatform.api.Guards.checkCollectionOptionValNulls(oneListOfNullableFloats)
    new OneListOfNullableFloats_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneListOfNullableFloats = oneListOfNullableFloats, _calculatedOneListOfNullableFloats = _calculatedOneListOfNullableFloats, _persistedOneListOfNullableFloats = _persistedOneListOfNullableFloats)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfNullableFloats_4): this.type = {
    this._URI = result._URI
    this._oneListOfNullableFloats = result._oneListOfNullableFloats
    this._calculatedOneListOfNullableFloats = result._calculatedOneListOfNullableFloats
    this._persistedOneListOfNullableFloats = result._persistedOneListOfNullableFloats
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfNullableFloats_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableFloats")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneListOfNullableFloats = {
    _oneListOfNullableFloats
  }

  def oneListOfNullableFloats_= (value: IndexedSeq[Option[Float]]) {
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(value)
    _oneListOfNullableFloats = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfNullableFloats")
  def calculatedOneListOfNullableFloats = {
    _calculatedOneListOfNullableFloats
  }

  def calculatedOneListOfNullableFloats_= (value: IndexedSeq[Option[Float]]) {
    _calculatedOneListOfNullableFloats = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfNullableFloats")
  def persistedOneListOfNullableFloats = {
    _persistedOneListOfNullableFloats
  }

  def persistedOneListOfNullableFloats_= (value: IndexedSeq[Option[Float]]) {
    _persistedOneListOfNullableFloats = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableFloats") oneListOfNullableFloats: IndexedSeq[Option[Float]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfNullableFloats") calculatedOneListOfNullableFloats: IndexedSeq[Option[Float]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfNullableFloats") persistedOneListOfNullableFloats: IndexedSeq[Option[Float]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneListOfNullableFloats = if (oneListOfNullableFloats == null) IndexedSeq.empty else oneListOfNullableFloats, _calculatedOneListOfNullableFloats = calculatedOneListOfNullableFloats, _persistedOneListOfNullableFloats = persistedOneListOfNullableFloats)

}

object OneListOfNullableFloats_4 extends AggregateRootCompanion[OneListOfNullableFloats_4]{

  def apply(
    oneListOfNullableFloats: IndexedSeq[Option[Float]] = IndexedSeq.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(oneListOfNullableFloats)
    require(oneListOfNullableFloats ne null, "Null value was provided for property \"oneListOfNullableFloats\"")
    new OneListOfNullableFloats_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneListOfNullableFloats = oneListOfNullableFloats
    , _calculatedOneListOfNullableFloats = IndexedSeq.empty
    , _persistedOneListOfNullableFloats = IndexedSeq.empty)
  }

}
