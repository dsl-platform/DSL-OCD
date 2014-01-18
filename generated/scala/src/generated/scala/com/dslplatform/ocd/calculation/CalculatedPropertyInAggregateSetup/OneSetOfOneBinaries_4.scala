package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfOneBinaries_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneSetOfOneBinaries: Set[Array[Byte]],
    private var _calculatedOneSetOfOneBinaries: Set[Array[Byte]],
    private var _persistedOneSetOfOneBinaries: Set[Array[Byte]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfOneBinaries_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfOneBinaries_4("+ URI +")"

   def copy(oneSetOfOneBinaries: Set[Array[Byte]] = this._oneSetOfOneBinaries): OneSetOfOneBinaries_4 = {

  require(oneSetOfOneBinaries ne null, "Null value was provided for property \"oneSetOfOneBinaries\"")
  com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneBinaries)
    new OneSetOfOneBinaries_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneSetOfOneBinaries = oneSetOfOneBinaries, _calculatedOneSetOfOneBinaries = _calculatedOneSetOfOneBinaries, _persistedOneSetOfOneBinaries = _persistedOneSetOfOneBinaries)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfOneBinaries_4): this.type = {
    this._URI = result._URI
    this._oneSetOfOneBinaries = result._oneSetOfOneBinaries
    this._calculatedOneSetOfOneBinaries = result._calculatedOneSetOfOneBinaries
    this._persistedOneSetOfOneBinaries = result._persistedOneSetOfOneBinaries
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfOneBinaries_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneBinaries")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfOneBinaries = {
    _oneSetOfOneBinaries
  }

  def oneSetOfOneBinaries_= (value: Set[Array[Byte]]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _oneSetOfOneBinaries = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfOneBinaries")
  def calculatedOneSetOfOneBinaries = {
    _calculatedOneSetOfOneBinaries
  }

  def calculatedOneSetOfOneBinaries_= (value: Set[Array[Byte]]) {
    _calculatedOneSetOfOneBinaries = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfOneBinaries")
  def persistedOneSetOfOneBinaries = {
    _persistedOneSetOfOneBinaries
  }

  def persistedOneSetOfOneBinaries_= (value: Set[Array[Byte]]) {
    _persistedOneSetOfOneBinaries = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneBinaries") oneSetOfOneBinaries: Set[Array[Byte]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfOneBinaries") calculatedOneSetOfOneBinaries: Set[Array[Byte]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfOneBinaries") persistedOneSetOfOneBinaries: Set[Array[Byte]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneSetOfOneBinaries = if (oneSetOfOneBinaries == null) Set.empty else oneSetOfOneBinaries, _calculatedOneSetOfOneBinaries = calculatedOneSetOfOneBinaries, _persistedOneSetOfOneBinaries = persistedOneSetOfOneBinaries)

}

object OneSetOfOneBinaries_4 extends AggregateRootCompanion[OneSetOfOneBinaries_4]{

  def apply(
    oneSetOfOneBinaries: Set[Array[Byte]] = Set.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneBinaries)
    require(oneSetOfOneBinaries ne null, "Null value was provided for property \"oneSetOfOneBinaries\"")
    new OneSetOfOneBinaries_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneSetOfOneBinaries = oneSetOfOneBinaries
    , _calculatedOneSetOfOneBinaries = Set.empty
    , _persistedOneSetOfOneBinaries = Set.empty)
  }

}
