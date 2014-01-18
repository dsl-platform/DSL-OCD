package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneListOfOneDoubles_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneListOfOneDoubles: IndexedSeq[Double],
    private var _calculatedOneListOfOneDoubles: IndexedSeq[Double],
    private var _persistedOneListOfOneDoubles: IndexedSeq[Double]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneListOfOneDoubles_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneListOfOneDoubles_4("+ URI +")"

   def copy(oneListOfOneDoubles: IndexedSeq[Double] = this._oneListOfOneDoubles): OneListOfOneDoubles_4 = {

  require(oneListOfOneDoubles ne null, "Null value was provided for property \"oneListOfOneDoubles\"")
    new OneListOfOneDoubles_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneListOfOneDoubles = oneListOfOneDoubles, _calculatedOneListOfOneDoubles = _calculatedOneListOfOneDoubles, _persistedOneListOfOneDoubles = _persistedOneListOfOneDoubles)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfOneDoubles_4): this.type = {
    this._URI = result._URI
    this._oneListOfOneDoubles = result._oneListOfOneDoubles
    this._calculatedOneListOfOneDoubles = result._calculatedOneListOfOneDoubles
    this._persistedOneListOfOneDoubles = result._persistedOneListOfOneDoubles
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfOneDoubles_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneDoubles")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneListOfOneDoubles = {
    _oneListOfOneDoubles
  }

  def oneListOfOneDoubles_= (value: IndexedSeq[Double]) {
    _oneListOfOneDoubles = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfOneDoubles")
  def calculatedOneListOfOneDoubles = {
    _calculatedOneListOfOneDoubles
  }

  def calculatedOneListOfOneDoubles_= (value: IndexedSeq[Double]) {
    _calculatedOneListOfOneDoubles = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfOneDoubles")
  def persistedOneListOfOneDoubles = {
    _persistedOneListOfOneDoubles
  }

  def persistedOneListOfOneDoubles_= (value: IndexedSeq[Double]) {
    _persistedOneListOfOneDoubles = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneDoubles") oneListOfOneDoubles: IndexedSeq[Double]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfOneDoubles") calculatedOneListOfOneDoubles: IndexedSeq[Double]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfOneDoubles") persistedOneListOfOneDoubles: IndexedSeq[Double]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneListOfOneDoubles = if (oneListOfOneDoubles == null) IndexedSeq.empty else oneListOfOneDoubles, _calculatedOneListOfOneDoubles = calculatedOneListOfOneDoubles, _persistedOneListOfOneDoubles = persistedOneListOfOneDoubles)

}

object OneListOfOneDoubles_4 extends AggregateRootCompanion[OneListOfOneDoubles_4]{

  def apply(
    oneListOfOneDoubles: IndexedSeq[Double] = IndexedSeq.empty
  ) = {
    require(oneListOfOneDoubles ne null, "Null value was provided for property \"oneListOfOneDoubles\"")
    new OneListOfOneDoubles_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneListOfOneDoubles = oneListOfOneDoubles
    , _calculatedOneListOfOneDoubles = IndexedSeq.empty
    , _persistedOneListOfOneDoubles = IndexedSeq.empty)
  }

}
