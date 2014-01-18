package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneListOfNullableLongs_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneListOfNullableLongs: IndexedSeq[Option[Long]],
    private var _calculatedOneListOfNullableLongs: IndexedSeq[Option[Long]],
    private var _persistedOneListOfNullableLongs: IndexedSeq[Option[Long]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneListOfNullableLongs_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneListOfNullableLongs_4("+ URI +")"

   def copy(oneListOfNullableLongs: IndexedSeq[Option[Long]] = this._oneListOfNullableLongs): OneListOfNullableLongs_4 = {

  require(oneListOfNullableLongs ne null, "Null value was provided for property \"oneListOfNullableLongs\"")
  com.dslplatform.api.Guards.checkCollectionOptionValNulls(oneListOfNullableLongs)
    new OneListOfNullableLongs_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneListOfNullableLongs = oneListOfNullableLongs, _calculatedOneListOfNullableLongs = _calculatedOneListOfNullableLongs, _persistedOneListOfNullableLongs = _persistedOneListOfNullableLongs)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfNullableLongs_4): this.type = {
    this._URI = result._URI
    this._oneListOfNullableLongs = result._oneListOfNullableLongs
    this._calculatedOneListOfNullableLongs = result._calculatedOneListOfNullableLongs
    this._persistedOneListOfNullableLongs = result._persistedOneListOfNullableLongs
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfNullableLongs_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableLongs")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneListOfNullableLongs = {
    _oneListOfNullableLongs
  }

  def oneListOfNullableLongs_= (value: IndexedSeq[Option[Long]]) {
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(value)
    _oneListOfNullableLongs = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfNullableLongs")
  def calculatedOneListOfNullableLongs = {
    _calculatedOneListOfNullableLongs
  }

  def calculatedOneListOfNullableLongs_= (value: IndexedSeq[Option[Long]]) {
    _calculatedOneListOfNullableLongs = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfNullableLongs")
  def persistedOneListOfNullableLongs = {
    _persistedOneListOfNullableLongs
  }

  def persistedOneListOfNullableLongs_= (value: IndexedSeq[Option[Long]]) {
    _persistedOneListOfNullableLongs = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableLongs") oneListOfNullableLongs: IndexedSeq[Option[Long]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfNullableLongs") calculatedOneListOfNullableLongs: IndexedSeq[Option[Long]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfNullableLongs") persistedOneListOfNullableLongs: IndexedSeq[Option[Long]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneListOfNullableLongs = if (oneListOfNullableLongs == null) IndexedSeq.empty else oneListOfNullableLongs, _calculatedOneListOfNullableLongs = calculatedOneListOfNullableLongs, _persistedOneListOfNullableLongs = persistedOneListOfNullableLongs)

}

object OneListOfNullableLongs_4 extends AggregateRootCompanion[OneListOfNullableLongs_4]{

  def apply(
    oneListOfNullableLongs: IndexedSeq[Option[Long]] = IndexedSeq.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(oneListOfNullableLongs)
    require(oneListOfNullableLongs ne null, "Null value was provided for property \"oneListOfNullableLongs\"")
    new OneListOfNullableLongs_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneListOfNullableLongs = oneListOfNullableLongs
    , _calculatedOneListOfNullableLongs = IndexedSeq.empty
    , _persistedOneListOfNullableLongs = IndexedSeq.empty)
  }

}
