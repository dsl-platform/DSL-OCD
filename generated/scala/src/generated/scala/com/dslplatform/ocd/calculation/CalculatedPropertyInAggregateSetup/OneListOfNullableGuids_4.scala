package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneListOfNullableGuids_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneListOfNullableGuids: IndexedSeq[Option[java.util.UUID]],
    private var _calculatedOneListOfNullableGuids: IndexedSeq[Option[java.util.UUID]],
    private var _persistedOneListOfNullableGuids: IndexedSeq[Option[java.util.UUID]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneListOfNullableGuids_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneListOfNullableGuids_4("+ URI +")"

   def copy(oneListOfNullableGuids: IndexedSeq[Option[java.util.UUID]] = this._oneListOfNullableGuids): OneListOfNullableGuids_4 = {

  require(oneListOfNullableGuids ne null, "Null value was provided for property \"oneListOfNullableGuids\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableGuids)
    new OneListOfNullableGuids_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneListOfNullableGuids = oneListOfNullableGuids, _calculatedOneListOfNullableGuids = _calculatedOneListOfNullableGuids, _persistedOneListOfNullableGuids = _persistedOneListOfNullableGuids)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfNullableGuids_4): this.type = {
    this._URI = result._URI
    this._oneListOfNullableGuids = result._oneListOfNullableGuids
    this._calculatedOneListOfNullableGuids = result._calculatedOneListOfNullableGuids
    this._persistedOneListOfNullableGuids = result._persistedOneListOfNullableGuids
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfNullableGuids_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableGuids")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneListOfNullableGuids = {
    _oneListOfNullableGuids
  }

  def oneListOfNullableGuids_= (value: IndexedSeq[Option[java.util.UUID]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _oneListOfNullableGuids = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfNullableGuids")
  def calculatedOneListOfNullableGuids = {
    _calculatedOneListOfNullableGuids
  }

  def calculatedOneListOfNullableGuids_= (value: IndexedSeq[Option[java.util.UUID]]) {
    _calculatedOneListOfNullableGuids = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfNullableGuids")
  def persistedOneListOfNullableGuids = {
    _persistedOneListOfNullableGuids
  }

  def persistedOneListOfNullableGuids_= (value: IndexedSeq[Option[java.util.UUID]]) {
    _persistedOneListOfNullableGuids = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableGuids") oneListOfNullableGuids: IndexedSeq[Option[java.util.UUID]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfNullableGuids") calculatedOneListOfNullableGuids: IndexedSeq[Option[java.util.UUID]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfNullableGuids") persistedOneListOfNullableGuids: IndexedSeq[Option[java.util.UUID]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneListOfNullableGuids = if (oneListOfNullableGuids == null) IndexedSeq.empty else oneListOfNullableGuids, _calculatedOneListOfNullableGuids = calculatedOneListOfNullableGuids, _persistedOneListOfNullableGuids = persistedOneListOfNullableGuids)

}

object OneListOfNullableGuids_4 extends AggregateRootCompanion[OneListOfNullableGuids_4]{

  def apply(
    oneListOfNullableGuids: IndexedSeq[Option[java.util.UUID]] = IndexedSeq.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableGuids)
    require(oneListOfNullableGuids ne null, "Null value was provided for property \"oneListOfNullableGuids\"")
    new OneListOfNullableGuids_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneListOfNullableGuids = oneListOfNullableGuids
    , _calculatedOneListOfNullableGuids = IndexedSeq.empty
    , _persistedOneListOfNullableGuids = IndexedSeq.empty)
  }

}
