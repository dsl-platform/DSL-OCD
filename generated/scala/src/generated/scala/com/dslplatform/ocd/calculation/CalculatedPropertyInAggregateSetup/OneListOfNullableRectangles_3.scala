package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneListOfNullableRectangles_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneListOfNullableRectangles: IndexedSeq[Option[java.awt.geom.Rectangle2D]],
    private var _calculatedOneListOfNullableRectangles: IndexedSeq[Option[java.awt.geom.Rectangle2D]],
    private var _persistedOneListOfNullableRectangles: IndexedSeq[Option[java.awt.geom.Rectangle2D]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneListOfNullableRectangles_3 => c.URI == URI
    case _ => false
  }

  override def toString = "OneListOfNullableRectangles_3("+ URI +")"

   def copy(oneListOfNullableRectangles: IndexedSeq[Option[java.awt.geom.Rectangle2D]] = this._oneListOfNullableRectangles): OneListOfNullableRectangles_3 = {

  require(oneListOfNullableRectangles ne null, "Null value was provided for property \"oneListOfNullableRectangles\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableRectangles)
    new OneListOfNullableRectangles_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneListOfNullableRectangles = oneListOfNullableRectangles, _calculatedOneListOfNullableRectangles = _calculatedOneListOfNullableRectangles, _persistedOneListOfNullableRectangles = _persistedOneListOfNullableRectangles)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfNullableRectangles_3): this.type = {
    this._URI = result._URI
    this._oneListOfNullableRectangles = result._oneListOfNullableRectangles
    this._calculatedOneListOfNullableRectangles = result._calculatedOneListOfNullableRectangles
    this._persistedOneListOfNullableRectangles = result._persistedOneListOfNullableRectangles
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfNullableRectangles_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableRectangles")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneListOfNullableRectangles = {
    _oneListOfNullableRectangles
  }

  def oneListOfNullableRectangles_= (value: IndexedSeq[Option[java.awt.geom.Rectangle2D]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _oneListOfNullableRectangles = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfNullableRectangles")
  def calculatedOneListOfNullableRectangles = {
    _calculatedOneListOfNullableRectangles
  }

  def calculatedOneListOfNullableRectangles_= (value: IndexedSeq[Option[java.awt.geom.Rectangle2D]]) {
    _calculatedOneListOfNullableRectangles = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfNullableRectangles")
  def persistedOneListOfNullableRectangles = {
    _persistedOneListOfNullableRectangles
  }

  def persistedOneListOfNullableRectangles_= (value: IndexedSeq[Option[java.awt.geom.Rectangle2D]]) {
    _persistedOneListOfNullableRectangles = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableRectangles") oneListOfNullableRectangles: IndexedSeq[Option[java.awt.geom.Rectangle2D]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfNullableRectangles") calculatedOneListOfNullableRectangles: IndexedSeq[Option[java.awt.geom.Rectangle2D]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfNullableRectangles") persistedOneListOfNullableRectangles: IndexedSeq[Option[java.awt.geom.Rectangle2D]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneListOfNullableRectangles = if (oneListOfNullableRectangles == null) IndexedSeq.empty else oneListOfNullableRectangles, _calculatedOneListOfNullableRectangles = calculatedOneListOfNullableRectangles, _persistedOneListOfNullableRectangles = persistedOneListOfNullableRectangles)

}

object OneListOfNullableRectangles_3 extends AggregateRootCompanion[OneListOfNullableRectangles_3]{

  def apply(
    oneListOfNullableRectangles: IndexedSeq[Option[java.awt.geom.Rectangle2D]] = IndexedSeq.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableRectangles)
    require(oneListOfNullableRectangles ne null, "Null value was provided for property \"oneListOfNullableRectangles\"")
    new OneListOfNullableRectangles_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneListOfNullableRectangles = oneListOfNullableRectangles
    , _calculatedOneListOfNullableRectangles = IndexedSeq.empty
    , _persistedOneListOfNullableRectangles = IndexedSeq.empty)
  }

}
