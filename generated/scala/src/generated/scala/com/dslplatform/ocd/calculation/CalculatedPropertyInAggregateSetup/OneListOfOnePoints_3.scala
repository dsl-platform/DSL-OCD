package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneListOfOnePoints_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneListOfOnePoints: IndexedSeq[java.awt.geom.Point2D],
    private var _calculatedOneListOfOnePoints: IndexedSeq[java.awt.geom.Point2D],
    private var _persistedOneListOfOnePoints: IndexedSeq[java.awt.geom.Point2D]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneListOfOnePoints_3 => c.URI == URI
    case _ => false
  }

  override def toString = "OneListOfOnePoints_3("+ URI +")"

   def copy(oneListOfOnePoints: IndexedSeq[java.awt.geom.Point2D] = this._oneListOfOnePoints): OneListOfOnePoints_3 = {

  require(oneListOfOnePoints ne null, "Null value was provided for property \"oneListOfOnePoints\"")
  com.dslplatform.api.Guards.checkCollectionNulls(oneListOfOnePoints)
    new OneListOfOnePoints_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneListOfOnePoints = oneListOfOnePoints, _calculatedOneListOfOnePoints = _calculatedOneListOfOnePoints, _persistedOneListOfOnePoints = _persistedOneListOfOnePoints)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfOnePoints_3): this.type = {
    this._URI = result._URI
    this._oneListOfOnePoints = result._oneListOfOnePoints
    this._calculatedOneListOfOnePoints = result._calculatedOneListOfOnePoints
    this._persistedOneListOfOnePoints = result._persistedOneListOfOnePoints
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfOnePoints_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOnePoints")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneListOfOnePoints = {
    _oneListOfOnePoints
  }

  def oneListOfOnePoints_= (value: IndexedSeq[java.awt.geom.Point2D]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _oneListOfOnePoints = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfOnePoints")
  def calculatedOneListOfOnePoints = {
    _calculatedOneListOfOnePoints
  }

  def calculatedOneListOfOnePoints_= (value: IndexedSeq[java.awt.geom.Point2D]) {
    _calculatedOneListOfOnePoints = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfOnePoints")
  def persistedOneListOfOnePoints = {
    _persistedOneListOfOnePoints
  }

  def persistedOneListOfOnePoints_= (value: IndexedSeq[java.awt.geom.Point2D]) {
    _persistedOneListOfOnePoints = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOnePoints") oneListOfOnePoints: IndexedSeq[java.awt.geom.Point2D]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfOnePoints") calculatedOneListOfOnePoints: IndexedSeq[java.awt.geom.Point2D]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfOnePoints") persistedOneListOfOnePoints: IndexedSeq[java.awt.geom.Point2D]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneListOfOnePoints = if (oneListOfOnePoints == null) IndexedSeq.empty else oneListOfOnePoints, _calculatedOneListOfOnePoints = calculatedOneListOfOnePoints, _persistedOneListOfOnePoints = persistedOneListOfOnePoints)

}

object OneListOfOnePoints_3 extends AggregateRootCompanion[OneListOfOnePoints_3]{

  def apply(
    oneListOfOnePoints: IndexedSeq[java.awt.geom.Point2D] = IndexedSeq.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(oneListOfOnePoints)
    require(oneListOfOnePoints ne null, "Null value was provided for property \"oneListOfOnePoints\"")
    new OneListOfOnePoints_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneListOfOnePoints = oneListOfOnePoints
    , _calculatedOneListOfOnePoints = IndexedSeq.empty
    , _persistedOneListOfOnePoints = IndexedSeq.empty)
  }

}
