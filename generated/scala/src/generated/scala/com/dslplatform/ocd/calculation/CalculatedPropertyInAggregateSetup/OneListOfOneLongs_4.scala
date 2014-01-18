package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneListOfOneLongs_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneListOfOneLongs: IndexedSeq[Long],
    private var _calculatedOneListOfOneLongs: IndexedSeq[Long],
    private var _persistedOneListOfOneLongs: IndexedSeq[Long]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneListOfOneLongs_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneListOfOneLongs_4("+ URI +")"

   def copy(oneListOfOneLongs: IndexedSeq[Long] = this._oneListOfOneLongs): OneListOfOneLongs_4 = {

  require(oneListOfOneLongs ne null, "Null value was provided for property \"oneListOfOneLongs\"")
    new OneListOfOneLongs_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneListOfOneLongs = oneListOfOneLongs, _calculatedOneListOfOneLongs = _calculatedOneListOfOneLongs, _persistedOneListOfOneLongs = _persistedOneListOfOneLongs)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfOneLongs_4): this.type = {
    this._URI = result._URI
    this._oneListOfOneLongs = result._oneListOfOneLongs
    this._calculatedOneListOfOneLongs = result._calculatedOneListOfOneLongs
    this._persistedOneListOfOneLongs = result._persistedOneListOfOneLongs
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfOneLongs_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneLongs")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneListOfOneLongs = {
    _oneListOfOneLongs
  }

  def oneListOfOneLongs_= (value: IndexedSeq[Long]) {
    _oneListOfOneLongs = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfOneLongs")
  def calculatedOneListOfOneLongs = {
    _calculatedOneListOfOneLongs
  }

  def calculatedOneListOfOneLongs_= (value: IndexedSeq[Long]) {
    _calculatedOneListOfOneLongs = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfOneLongs")
  def persistedOneListOfOneLongs = {
    _persistedOneListOfOneLongs
  }

  def persistedOneListOfOneLongs_= (value: IndexedSeq[Long]) {
    _persistedOneListOfOneLongs = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneLongs") oneListOfOneLongs: IndexedSeq[Long]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfOneLongs") calculatedOneListOfOneLongs: IndexedSeq[Long]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfOneLongs") persistedOneListOfOneLongs: IndexedSeq[Long]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneListOfOneLongs = if (oneListOfOneLongs == null) IndexedSeq.empty else oneListOfOneLongs, _calculatedOneListOfOneLongs = calculatedOneListOfOneLongs, _persistedOneListOfOneLongs = persistedOneListOfOneLongs)

}

object OneListOfOneLongs_4 extends AggregateRootCompanion[OneListOfOneLongs_4]{

  def apply(
    oneListOfOneLongs: IndexedSeq[Long] = IndexedSeq.empty
  ) = {
    require(oneListOfOneLongs ne null, "Null value was provided for property \"oneListOfOneLongs\"")
    new OneListOfOneLongs_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneListOfOneLongs = oneListOfOneLongs
    , _calculatedOneListOfOneLongs = IndexedSeq.empty
    , _persistedOneListOfOneLongs = IndexedSeq.empty)
  }

}
