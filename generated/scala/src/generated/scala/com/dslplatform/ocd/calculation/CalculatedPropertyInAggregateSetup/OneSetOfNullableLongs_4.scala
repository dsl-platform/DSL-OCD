package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfNullableLongs_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneSetOfNullableLongs: Set[Option[Long]],
    private var _calculatedOneSetOfNullableLongs: Set[Option[Long]],
    private var _persistedOneSetOfNullableLongs: Set[Option[Long]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfNullableLongs_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfNullableLongs_4("+ URI +")"

   def copy(oneSetOfNullableLongs: Set[Option[Long]] = this._oneSetOfNullableLongs): OneSetOfNullableLongs_4 = {

  require(oneSetOfNullableLongs ne null, "Null value was provided for property \"oneSetOfNullableLongs\"")
  com.dslplatform.api.Guards.checkCollectionOptionValNulls(oneSetOfNullableLongs)
    new OneSetOfNullableLongs_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneSetOfNullableLongs = oneSetOfNullableLongs, _calculatedOneSetOfNullableLongs = _calculatedOneSetOfNullableLongs, _persistedOneSetOfNullableLongs = _persistedOneSetOfNullableLongs)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfNullableLongs_4): this.type = {
    this._URI = result._URI
    this._oneSetOfNullableLongs = result._oneSetOfNullableLongs
    this._calculatedOneSetOfNullableLongs = result._calculatedOneSetOfNullableLongs
    this._persistedOneSetOfNullableLongs = result._persistedOneSetOfNullableLongs
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfNullableLongs_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableLongs")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfNullableLongs = {
    _oneSetOfNullableLongs
  }

  def oneSetOfNullableLongs_= (value: Set[Option[Long]]) {
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(value)
    _oneSetOfNullableLongs = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullableLongs")
  def calculatedOneSetOfNullableLongs = {
    _calculatedOneSetOfNullableLongs
  }

  def calculatedOneSetOfNullableLongs_= (value: Set[Option[Long]]) {
    _calculatedOneSetOfNullableLongs = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullableLongs")
  def persistedOneSetOfNullableLongs = {
    _persistedOneSetOfNullableLongs
  }

  def persistedOneSetOfNullableLongs_= (value: Set[Option[Long]]) {
    _persistedOneSetOfNullableLongs = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableLongs") oneSetOfNullableLongs: Set[Option[Long]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullableLongs") calculatedOneSetOfNullableLongs: Set[Option[Long]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullableLongs") persistedOneSetOfNullableLongs: Set[Option[Long]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneSetOfNullableLongs = if (oneSetOfNullableLongs == null) Set.empty else oneSetOfNullableLongs, _calculatedOneSetOfNullableLongs = calculatedOneSetOfNullableLongs, _persistedOneSetOfNullableLongs = persistedOneSetOfNullableLongs)

}

object OneSetOfNullableLongs_4 extends AggregateRootCompanion[OneSetOfNullableLongs_4]{

  def apply(
    oneSetOfNullableLongs: Set[Option[Long]] = Set.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(oneSetOfNullableLongs)
    require(oneSetOfNullableLongs ne null, "Null value was provided for property \"oneSetOfNullableLongs\"")
    new OneSetOfNullableLongs_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneSetOfNullableLongs = oneSetOfNullableLongs
    , _calculatedOneSetOfNullableLongs = Set.empty
    , _persistedOneSetOfNullableLongs = Set.empty)
  }

}
