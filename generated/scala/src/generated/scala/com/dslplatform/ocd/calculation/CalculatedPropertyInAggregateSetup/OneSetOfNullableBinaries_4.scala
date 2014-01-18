package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfNullableBinaries_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneSetOfNullableBinaries: Set[Option[Array[Byte]]],
    private var _calculatedOneSetOfNullableBinaries: Set[Option[Array[Byte]]],
    private var _persistedOneSetOfNullableBinaries: Set[Option[Array[Byte]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfNullableBinaries_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfNullableBinaries_4("+ URI +")"

   def copy(oneSetOfNullableBinaries: Set[Option[Array[Byte]]] = this._oneSetOfNullableBinaries): OneSetOfNullableBinaries_4 = {

  require(oneSetOfNullableBinaries ne null, "Null value was provided for property \"oneSetOfNullableBinaries\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableBinaries)
    new OneSetOfNullableBinaries_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneSetOfNullableBinaries = oneSetOfNullableBinaries, _calculatedOneSetOfNullableBinaries = _calculatedOneSetOfNullableBinaries, _persistedOneSetOfNullableBinaries = _persistedOneSetOfNullableBinaries)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfNullableBinaries_4): this.type = {
    this._URI = result._URI
    this._oneSetOfNullableBinaries = result._oneSetOfNullableBinaries
    this._calculatedOneSetOfNullableBinaries = result._calculatedOneSetOfNullableBinaries
    this._persistedOneSetOfNullableBinaries = result._persistedOneSetOfNullableBinaries
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfNullableBinaries_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableBinaries")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfNullableBinaries = {
    _oneSetOfNullableBinaries
  }

  def oneSetOfNullableBinaries_= (value: Set[Option[Array[Byte]]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _oneSetOfNullableBinaries = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullableBinaries")
  def calculatedOneSetOfNullableBinaries = {
    _calculatedOneSetOfNullableBinaries
  }

  def calculatedOneSetOfNullableBinaries_= (value: Set[Option[Array[Byte]]]) {
    _calculatedOneSetOfNullableBinaries = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullableBinaries")
  def persistedOneSetOfNullableBinaries = {
    _persistedOneSetOfNullableBinaries
  }

  def persistedOneSetOfNullableBinaries_= (value: Set[Option[Array[Byte]]]) {
    _persistedOneSetOfNullableBinaries = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableBinaries") oneSetOfNullableBinaries: Set[Option[Array[Byte]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullableBinaries") calculatedOneSetOfNullableBinaries: Set[Option[Array[Byte]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullableBinaries") persistedOneSetOfNullableBinaries: Set[Option[Array[Byte]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneSetOfNullableBinaries = if (oneSetOfNullableBinaries == null) Set.empty else oneSetOfNullableBinaries, _calculatedOneSetOfNullableBinaries = calculatedOneSetOfNullableBinaries, _persistedOneSetOfNullableBinaries = persistedOneSetOfNullableBinaries)

}

object OneSetOfNullableBinaries_4 extends AggregateRootCompanion[OneSetOfNullableBinaries_4]{

  def apply(
    oneSetOfNullableBinaries: Set[Option[Array[Byte]]] = Set.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableBinaries)
    require(oneSetOfNullableBinaries ne null, "Null value was provided for property \"oneSetOfNullableBinaries\"")
    new OneSetOfNullableBinaries_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneSetOfNullableBinaries = oneSetOfNullableBinaries
    , _calculatedOneSetOfNullableBinaries = Set.empty
    , _persistedOneSetOfNullableBinaries = Set.empty)
  }

}
