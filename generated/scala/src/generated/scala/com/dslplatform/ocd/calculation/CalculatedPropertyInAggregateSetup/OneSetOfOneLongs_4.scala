package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfOneLongs_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneSetOfOneLongs: Set[Long],
    private var _calculatedOneSetOfOneLongs: Set[Long],
    private var _persistedOneSetOfOneLongs: Set[Long]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfOneLongs_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfOneLongs_4("+ URI +")"

   def copy(oneSetOfOneLongs: Set[Long] = this._oneSetOfOneLongs): OneSetOfOneLongs_4 = {

  require(oneSetOfOneLongs ne null, "Null value was provided for property \"oneSetOfOneLongs\"")
    new OneSetOfOneLongs_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneSetOfOneLongs = oneSetOfOneLongs, _calculatedOneSetOfOneLongs = _calculatedOneSetOfOneLongs, _persistedOneSetOfOneLongs = _persistedOneSetOfOneLongs)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfOneLongs_4): this.type = {
    this._URI = result._URI
    this._oneSetOfOneLongs = result._oneSetOfOneLongs
    this._calculatedOneSetOfOneLongs = result._calculatedOneSetOfOneLongs
    this._persistedOneSetOfOneLongs = result._persistedOneSetOfOneLongs
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfOneLongs_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneLongs")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfOneLongs = {
    _oneSetOfOneLongs
  }

  def oneSetOfOneLongs_= (value: Set[Long]) {
    _oneSetOfOneLongs = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfOneLongs")
  def calculatedOneSetOfOneLongs = {
    _calculatedOneSetOfOneLongs
  }

  def calculatedOneSetOfOneLongs_= (value: Set[Long]) {
    _calculatedOneSetOfOneLongs = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfOneLongs")
  def persistedOneSetOfOneLongs = {
    _persistedOneSetOfOneLongs
  }

  def persistedOneSetOfOneLongs_= (value: Set[Long]) {
    _persistedOneSetOfOneLongs = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneLongs") oneSetOfOneLongs: Set[Long]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfOneLongs") calculatedOneSetOfOneLongs: Set[Long]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfOneLongs") persistedOneSetOfOneLongs: Set[Long]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneSetOfOneLongs = if (oneSetOfOneLongs == null) Set.empty else oneSetOfOneLongs, _calculatedOneSetOfOneLongs = calculatedOneSetOfOneLongs, _persistedOneSetOfOneLongs = persistedOneSetOfOneLongs)

}

object OneSetOfOneLongs_4 extends AggregateRootCompanion[OneSetOfOneLongs_4]{

  def apply(
    oneSetOfOneLongs: Set[Long] = Set.empty
  ) = {
    require(oneSetOfOneLongs ne null, "Null value was provided for property \"oneSetOfOneLongs\"")
    new OneSetOfOneLongs_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneSetOfOneLongs = oneSetOfOneLongs
    , _calculatedOneSetOfOneLongs = Set.empty
    , _persistedOneSetOfOneLongs = Set.empty)
  }

}
