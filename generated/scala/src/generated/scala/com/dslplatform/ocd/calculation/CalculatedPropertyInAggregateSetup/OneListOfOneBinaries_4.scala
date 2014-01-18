package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneListOfOneBinaries_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneListOfOneBinaries: IndexedSeq[Array[Byte]],
    private var _calculatedOneListOfOneBinaries: IndexedSeq[Array[Byte]],
    private var _persistedOneListOfOneBinaries: IndexedSeq[Array[Byte]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneListOfOneBinaries_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneListOfOneBinaries_4("+ URI +")"

   def copy(oneListOfOneBinaries: IndexedSeq[Array[Byte]] = this._oneListOfOneBinaries): OneListOfOneBinaries_4 = {

  require(oneListOfOneBinaries ne null, "Null value was provided for property \"oneListOfOneBinaries\"")
  com.dslplatform.api.Guards.checkCollectionNulls(oneListOfOneBinaries)
    new OneListOfOneBinaries_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneListOfOneBinaries = oneListOfOneBinaries, _calculatedOneListOfOneBinaries = _calculatedOneListOfOneBinaries, _persistedOneListOfOneBinaries = _persistedOneListOfOneBinaries)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfOneBinaries_4): this.type = {
    this._URI = result._URI
    this._oneListOfOneBinaries = result._oneListOfOneBinaries
    this._calculatedOneListOfOneBinaries = result._calculatedOneListOfOneBinaries
    this._persistedOneListOfOneBinaries = result._persistedOneListOfOneBinaries
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfOneBinaries_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneBinaries")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneListOfOneBinaries = {
    _oneListOfOneBinaries
  }

  def oneListOfOneBinaries_= (value: IndexedSeq[Array[Byte]]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _oneListOfOneBinaries = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfOneBinaries")
  def calculatedOneListOfOneBinaries = {
    _calculatedOneListOfOneBinaries
  }

  def calculatedOneListOfOneBinaries_= (value: IndexedSeq[Array[Byte]]) {
    _calculatedOneListOfOneBinaries = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfOneBinaries")
  def persistedOneListOfOneBinaries = {
    _persistedOneListOfOneBinaries
  }

  def persistedOneListOfOneBinaries_= (value: IndexedSeq[Array[Byte]]) {
    _persistedOneListOfOneBinaries = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneBinaries") oneListOfOneBinaries: IndexedSeq[Array[Byte]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfOneBinaries") calculatedOneListOfOneBinaries: IndexedSeq[Array[Byte]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfOneBinaries") persistedOneListOfOneBinaries: IndexedSeq[Array[Byte]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneListOfOneBinaries = if (oneListOfOneBinaries == null) IndexedSeq.empty else oneListOfOneBinaries, _calculatedOneListOfOneBinaries = calculatedOneListOfOneBinaries, _persistedOneListOfOneBinaries = persistedOneListOfOneBinaries)

}

object OneListOfOneBinaries_4 extends AggregateRootCompanion[OneListOfOneBinaries_4]{

  def apply(
    oneListOfOneBinaries: IndexedSeq[Array[Byte]] = IndexedSeq.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(oneListOfOneBinaries)
    require(oneListOfOneBinaries ne null, "Null value was provided for property \"oneListOfOneBinaries\"")
    new OneListOfOneBinaries_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneListOfOneBinaries = oneListOfOneBinaries
    , _calculatedOneListOfOneBinaries = IndexedSeq.empty
    , _persistedOneListOfOneBinaries = IndexedSeq.empty)
  }

}
