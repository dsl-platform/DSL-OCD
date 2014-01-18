package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfNullableStrings_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneSetOfNullableStrings: Set[Option[String]],
    private var _calculatedOneSetOfNullableStrings: Set[Option[String]],
    private var _persistedOneSetOfNullableStrings: Set[Option[String]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfNullableStrings_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfNullableStrings_4("+ URI +")"

   def copy(oneSetOfNullableStrings: Set[Option[String]] = this._oneSetOfNullableStrings): OneSetOfNullableStrings_4 = {

  require(oneSetOfNullableStrings ne null, "Null value was provided for property \"oneSetOfNullableStrings\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableStrings)
    new OneSetOfNullableStrings_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneSetOfNullableStrings = oneSetOfNullableStrings, _calculatedOneSetOfNullableStrings = _calculatedOneSetOfNullableStrings, _persistedOneSetOfNullableStrings = _persistedOneSetOfNullableStrings)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfNullableStrings_4): this.type = {
    this._URI = result._URI
    this._oneSetOfNullableStrings = result._oneSetOfNullableStrings
    this._calculatedOneSetOfNullableStrings = result._calculatedOneSetOfNullableStrings
    this._persistedOneSetOfNullableStrings = result._persistedOneSetOfNullableStrings
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfNullableStrings_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableStrings")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfNullableStrings = {
    _oneSetOfNullableStrings
  }

  def oneSetOfNullableStrings_= (value: Set[Option[String]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _oneSetOfNullableStrings = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullableStrings")
  def calculatedOneSetOfNullableStrings = {
    _calculatedOneSetOfNullableStrings
  }

  def calculatedOneSetOfNullableStrings_= (value: Set[Option[String]]) {
    _calculatedOneSetOfNullableStrings = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullableStrings")
  def persistedOneSetOfNullableStrings = {
    _persistedOneSetOfNullableStrings
  }

  def persistedOneSetOfNullableStrings_= (value: Set[Option[String]]) {
    _persistedOneSetOfNullableStrings = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableStrings") oneSetOfNullableStrings: Set[Option[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullableStrings") calculatedOneSetOfNullableStrings: Set[Option[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullableStrings") persistedOneSetOfNullableStrings: Set[Option[String]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneSetOfNullableStrings = if (oneSetOfNullableStrings == null) Set.empty else oneSetOfNullableStrings, _calculatedOneSetOfNullableStrings = calculatedOneSetOfNullableStrings, _persistedOneSetOfNullableStrings = persistedOneSetOfNullableStrings)

}

object OneSetOfNullableStrings_4 extends AggregateRootCompanion[OneSetOfNullableStrings_4]{

  def apply(
    oneSetOfNullableStrings: Set[Option[String]] = Set.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableStrings)
    require(oneSetOfNullableStrings ne null, "Null value was provided for property \"oneSetOfNullableStrings\"")
    new OneSetOfNullableStrings_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneSetOfNullableStrings = oneSetOfNullableStrings
    , _calculatedOneSetOfNullableStrings = Set.empty
    , _persistedOneSetOfNullableStrings = Set.empty)
  }

}
