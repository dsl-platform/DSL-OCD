package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneListOfOneIntegers_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneListOfOneIntegers: IndexedSeq[Int],
    private var _calculatedOneListOfOneIntegers: IndexedSeq[Int],
    private var _persistedOneListOfOneIntegers: IndexedSeq[Int]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneListOfOneIntegers_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneListOfOneIntegers_4("+ URI +")"

   def copy(oneListOfOneIntegers: IndexedSeq[Int] = this._oneListOfOneIntegers): OneListOfOneIntegers_4 = {

  require(oneListOfOneIntegers ne null, "Null value was provided for property \"oneListOfOneIntegers\"")
    new OneListOfOneIntegers_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneListOfOneIntegers = oneListOfOneIntegers, _calculatedOneListOfOneIntegers = _calculatedOneListOfOneIntegers, _persistedOneListOfOneIntegers = _persistedOneListOfOneIntegers)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfOneIntegers_4): this.type = {
    this._URI = result._URI
    this._oneListOfOneIntegers = result._oneListOfOneIntegers
    this._calculatedOneListOfOneIntegers = result._calculatedOneListOfOneIntegers
    this._persistedOneListOfOneIntegers = result._persistedOneListOfOneIntegers
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfOneIntegers_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneIntegers")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneListOfOneIntegers = {
    _oneListOfOneIntegers
  }

  def oneListOfOneIntegers_= (value: IndexedSeq[Int]) {
    _oneListOfOneIntegers = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfOneIntegers")
  def calculatedOneListOfOneIntegers = {
    _calculatedOneListOfOneIntegers
  }

  def calculatedOneListOfOneIntegers_= (value: IndexedSeq[Int]) {
    _calculatedOneListOfOneIntegers = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfOneIntegers")
  def persistedOneListOfOneIntegers = {
    _persistedOneListOfOneIntegers
  }

  def persistedOneListOfOneIntegers_= (value: IndexedSeq[Int]) {
    _persistedOneListOfOneIntegers = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneIntegers") oneListOfOneIntegers: IndexedSeq[Int]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfOneIntegers") calculatedOneListOfOneIntegers: IndexedSeq[Int]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfOneIntegers") persistedOneListOfOneIntegers: IndexedSeq[Int]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneListOfOneIntegers = if (oneListOfOneIntegers == null) IndexedSeq.empty else oneListOfOneIntegers, _calculatedOneListOfOneIntegers = calculatedOneListOfOneIntegers, _persistedOneListOfOneIntegers = persistedOneListOfOneIntegers)

}

object OneListOfOneIntegers_4 extends AggregateRootCompanion[OneListOfOneIntegers_4]{

  def apply(
    oneListOfOneIntegers: IndexedSeq[Int] = IndexedSeq.empty
  ) = {
    require(oneListOfOneIntegers ne null, "Null value was provided for property \"oneListOfOneIntegers\"")
    new OneListOfOneIntegers_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneListOfOneIntegers = oneListOfOneIntegers
    , _calculatedOneListOfOneIntegers = IndexedSeq.empty
    , _persistedOneListOfOneIntegers = IndexedSeq.empty)
  }

}
