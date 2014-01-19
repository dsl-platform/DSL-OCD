package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfOneStrings_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneSetOfOneStrings: Set[String],
    private var _calculatedOneSetOfOneStrings: Set[String],
    private var _persistedOneSetOfOneStrings: Set[String]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfOneStrings_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfOneStrings_4("+ URI +")"

   def copy(oneSetOfOneStrings: Set[String] = this._oneSetOfOneStrings): OneSetOfOneStrings_4 = {

  require(oneSetOfOneStrings ne null, "Null value was provided for property \"oneSetOfOneStrings\"")
  com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneStrings)
    new OneSetOfOneStrings_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneSetOfOneStrings = oneSetOfOneStrings, _calculatedOneSetOfOneStrings = _calculatedOneSetOfOneStrings, _persistedOneSetOfOneStrings = _persistedOneSetOfOneStrings)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfOneStrings_4): this.type = {
    this._URI = result._URI
    this._oneSetOfOneStrings = result._oneSetOfOneStrings
    this._calculatedOneSetOfOneStrings = result._calculatedOneSetOfOneStrings
    this._persistedOneSetOfOneStrings = result._persistedOneSetOfOneStrings
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfOneStrings_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneStrings")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfOneStrings = {
    _oneSetOfOneStrings
  }

  def oneSetOfOneStrings_= (value: Set[String]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _oneSetOfOneStrings = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfOneStrings")
  def calculatedOneSetOfOneStrings = {
    _calculatedOneSetOfOneStrings
  }

  def calculatedOneSetOfOneStrings_= (value: Set[String]) {
    _calculatedOneSetOfOneStrings = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfOneStrings")
  def persistedOneSetOfOneStrings = {
    _persistedOneSetOfOneStrings
  }

  def persistedOneSetOfOneStrings_= (value: Set[String]) {
    _persistedOneSetOfOneStrings = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneStrings") oneSetOfOneStrings: Set[String]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfOneStrings") calculatedOneSetOfOneStrings: Set[String]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfOneStrings") persistedOneSetOfOneStrings: Set[String]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneSetOfOneStrings = if (oneSetOfOneStrings == null) Set.empty else oneSetOfOneStrings, _calculatedOneSetOfOneStrings = calculatedOneSetOfOneStrings, _persistedOneSetOfOneStrings = persistedOneSetOfOneStrings)

}

object OneSetOfOneStrings_4 extends AggregateRootCompanion[OneSetOfOneStrings_4]{

  def apply(
    oneSetOfOneStrings: Set[String] = Set.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneStrings)
    require(oneSetOfOneStrings ne null, "Null value was provided for property \"oneSetOfOneStrings\"")
    new OneSetOfOneStrings_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneSetOfOneStrings = oneSetOfOneStrings
    , _calculatedOneSetOfOneStrings = Set.empty
    , _persistedOneSetOfOneStrings = Set.empty)
  }

}