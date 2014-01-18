package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfOneTexts_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneSetOfOneTexts: Set[String],
    private var _calculatedOneSetOfOneTexts: Set[String],
    private var _persistedOneSetOfOneTexts: Set[String]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfOneTexts_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfOneTexts_4("+ URI +")"

   def copy(oneSetOfOneTexts: Set[String] = this._oneSetOfOneTexts): OneSetOfOneTexts_4 = {

  require(oneSetOfOneTexts ne null, "Null value was provided for property \"oneSetOfOneTexts\"")
  com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneTexts)
    new OneSetOfOneTexts_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneSetOfOneTexts = oneSetOfOneTexts, _calculatedOneSetOfOneTexts = _calculatedOneSetOfOneTexts, _persistedOneSetOfOneTexts = _persistedOneSetOfOneTexts)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfOneTexts_4): this.type = {
    this._URI = result._URI
    this._oneSetOfOneTexts = result._oneSetOfOneTexts
    this._calculatedOneSetOfOneTexts = result._calculatedOneSetOfOneTexts
    this._persistedOneSetOfOneTexts = result._persistedOneSetOfOneTexts
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfOneTexts_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneTexts")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfOneTexts = {
    _oneSetOfOneTexts
  }

  def oneSetOfOneTexts_= (value: Set[String]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _oneSetOfOneTexts = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfOneTexts")
  def calculatedOneSetOfOneTexts = {
    _calculatedOneSetOfOneTexts
  }

  def calculatedOneSetOfOneTexts_= (value: Set[String]) {
    _calculatedOneSetOfOneTexts = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfOneTexts")
  def persistedOneSetOfOneTexts = {
    _persistedOneSetOfOneTexts
  }

  def persistedOneSetOfOneTexts_= (value: Set[String]) {
    _persistedOneSetOfOneTexts = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneTexts") oneSetOfOneTexts: Set[String]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfOneTexts") calculatedOneSetOfOneTexts: Set[String]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfOneTexts") persistedOneSetOfOneTexts: Set[String]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneSetOfOneTexts = if (oneSetOfOneTexts == null) Set.empty else oneSetOfOneTexts, _calculatedOneSetOfOneTexts = calculatedOneSetOfOneTexts, _persistedOneSetOfOneTexts = persistedOneSetOfOneTexts)

}

object OneSetOfOneTexts_4 extends AggregateRootCompanion[OneSetOfOneTexts_4]{

  def apply(
    oneSetOfOneTexts: Set[String] = Set.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneTexts)
    require(oneSetOfOneTexts ne null, "Null value was provided for property \"oneSetOfOneTexts\"")
    new OneSetOfOneTexts_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneSetOfOneTexts = oneSetOfOneTexts
    , _calculatedOneSetOfOneTexts = Set.empty
    , _persistedOneSetOfOneTexts = Set.empty)
  }

}
