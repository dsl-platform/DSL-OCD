package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfNullableTexts_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneSetOfNullableTexts: Set[Option[String]],
    private var _calculatedOneSetOfNullableTexts: Set[Option[String]],
    private var _persistedOneSetOfNullableTexts: Set[Option[String]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfNullableTexts_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfNullableTexts_4("+ URI +")"

   def copy(oneSetOfNullableTexts: Set[Option[String]] = this._oneSetOfNullableTexts): OneSetOfNullableTexts_4 = {

  require(oneSetOfNullableTexts ne null, "Null value was provided for property \"oneSetOfNullableTexts\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableTexts)
    new OneSetOfNullableTexts_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneSetOfNullableTexts = oneSetOfNullableTexts, _calculatedOneSetOfNullableTexts = _calculatedOneSetOfNullableTexts, _persistedOneSetOfNullableTexts = _persistedOneSetOfNullableTexts)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfNullableTexts_4): this.type = {
    this._URI = result._URI
    this._oneSetOfNullableTexts = result._oneSetOfNullableTexts
    this._calculatedOneSetOfNullableTexts = result._calculatedOneSetOfNullableTexts
    this._persistedOneSetOfNullableTexts = result._persistedOneSetOfNullableTexts
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfNullableTexts_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableTexts")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfNullableTexts = {
    _oneSetOfNullableTexts
  }

  def oneSetOfNullableTexts_= (value: Set[Option[String]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _oneSetOfNullableTexts = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullableTexts")
  def calculatedOneSetOfNullableTexts = {
    _calculatedOneSetOfNullableTexts
  }

  def calculatedOneSetOfNullableTexts_= (value: Set[Option[String]]) {
    _calculatedOneSetOfNullableTexts = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullableTexts")
  def persistedOneSetOfNullableTexts = {
    _persistedOneSetOfNullableTexts
  }

  def persistedOneSetOfNullableTexts_= (value: Set[Option[String]]) {
    _persistedOneSetOfNullableTexts = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableTexts") oneSetOfNullableTexts: Set[Option[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullableTexts") calculatedOneSetOfNullableTexts: Set[Option[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullableTexts") persistedOneSetOfNullableTexts: Set[Option[String]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneSetOfNullableTexts = if (oneSetOfNullableTexts == null) Set.empty else oneSetOfNullableTexts, _calculatedOneSetOfNullableTexts = calculatedOneSetOfNullableTexts, _persistedOneSetOfNullableTexts = persistedOneSetOfNullableTexts)

}

object OneSetOfNullableTexts_4 extends AggregateRootCompanion[OneSetOfNullableTexts_4]{

  def apply(
    oneSetOfNullableTexts: Set[Option[String]] = Set.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableTexts)
    require(oneSetOfNullableTexts ne null, "Null value was provided for property \"oneSetOfNullableTexts\"")
    new OneSetOfNullableTexts_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneSetOfNullableTexts = oneSetOfNullableTexts
    , _calculatedOneSetOfNullableTexts = Set.empty
    , _persistedOneSetOfNullableTexts = Set.empty)
  }

}
