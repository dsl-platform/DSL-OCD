package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneListOfNullableMaps_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneListOfNullableMaps: IndexedSeq[Option[Map[String, String]]],
    private var _calculatedOneListOfNullableMaps: IndexedSeq[Option[Map[String, String]]],
    private var _persistedOneListOfNullableMaps: IndexedSeq[Option[Map[String, String]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneListOfNullableMaps_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneListOfNullableMaps_4("+ URI +")"

   def copy(oneListOfNullableMaps: IndexedSeq[Option[Map[String, String]]] = this._oneListOfNullableMaps): OneListOfNullableMaps_4 = {

  require(oneListOfNullableMaps ne null, "Null value was provided for property \"oneListOfNullableMaps\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableMaps)
    new OneListOfNullableMaps_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneListOfNullableMaps = oneListOfNullableMaps, _calculatedOneListOfNullableMaps = _calculatedOneListOfNullableMaps, _persistedOneListOfNullableMaps = _persistedOneListOfNullableMaps)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfNullableMaps_4): this.type = {
    this._URI = result._URI
    this._oneListOfNullableMaps = result._oneListOfNullableMaps
    this._calculatedOneListOfNullableMaps = result._calculatedOneListOfNullableMaps
    this._persistedOneListOfNullableMaps = result._persistedOneListOfNullableMaps
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfNullableMaps_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableMaps")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneListOfNullableMaps = {
    _oneListOfNullableMaps
  }

  def oneListOfNullableMaps_= (value: IndexedSeq[Option[Map[String, String]]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _oneListOfNullableMaps = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfNullableMaps")
  def calculatedOneListOfNullableMaps = {
    _calculatedOneListOfNullableMaps
  }

  def calculatedOneListOfNullableMaps_= (value: IndexedSeq[Option[Map[String, String]]]) {
    _calculatedOneListOfNullableMaps = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfNullableMaps")
  def persistedOneListOfNullableMaps = {
    _persistedOneListOfNullableMaps
  }

  def persistedOneListOfNullableMaps_= (value: IndexedSeq[Option[Map[String, String]]]) {
    _persistedOneListOfNullableMaps = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableMaps") oneListOfNullableMaps: IndexedSeq[Option[Map[String, String]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfNullableMaps") calculatedOneListOfNullableMaps: IndexedSeq[Option[Map[String, String]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfNullableMaps") persistedOneListOfNullableMaps: IndexedSeq[Option[Map[String, String]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneListOfNullableMaps = if (oneListOfNullableMaps == null) IndexedSeq.empty else oneListOfNullableMaps, _calculatedOneListOfNullableMaps = calculatedOneListOfNullableMaps, _persistedOneListOfNullableMaps = persistedOneListOfNullableMaps)

}

object OneListOfNullableMaps_4 extends AggregateRootCompanion[OneListOfNullableMaps_4]{

  def apply(
    oneListOfNullableMaps: IndexedSeq[Option[Map[String, String]]] = IndexedSeq.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableMaps)
    require(oneListOfNullableMaps ne null, "Null value was provided for property \"oneListOfNullableMaps\"")
    new OneListOfNullableMaps_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneListOfNullableMaps = oneListOfNullableMaps
    , _calculatedOneListOfNullableMaps = IndexedSeq.empty
    , _persistedOneListOfNullableMaps = IndexedSeq.empty)
  }

}
