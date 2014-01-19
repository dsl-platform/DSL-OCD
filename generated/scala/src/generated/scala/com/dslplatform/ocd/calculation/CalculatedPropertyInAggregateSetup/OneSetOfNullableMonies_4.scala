package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfNullableMonies_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneSetOfNullableMonies: Set[Option[BigDecimal]],
    private var _calculatedOneSetOfNullableMonies: Set[Option[BigDecimal]],
    private var _persistedOneSetOfNullableMonies: Set[Option[BigDecimal]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfNullableMonies_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfNullableMonies_4("+ URI +")"

   def copy(oneSetOfNullableMonies: Set[Option[BigDecimal]] = this._oneSetOfNullableMonies): OneSetOfNullableMonies_4 = {

  require(oneSetOfNullableMonies ne null, "Null value was provided for property \"oneSetOfNullableMonies\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableMonies)
    new OneSetOfNullableMonies_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneSetOfNullableMonies = oneSetOfNullableMonies, _calculatedOneSetOfNullableMonies = _calculatedOneSetOfNullableMonies, _persistedOneSetOfNullableMonies = _persistedOneSetOfNullableMonies)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfNullableMonies_4): this.type = {
    this._URI = result._URI
    this._oneSetOfNullableMonies = result._oneSetOfNullableMonies
    this._calculatedOneSetOfNullableMonies = result._calculatedOneSetOfNullableMonies
    this._persistedOneSetOfNullableMonies = result._persistedOneSetOfNullableMonies
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfNullableMonies_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableMonies")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfNullableMonies = {
    _oneSetOfNullableMonies
  }

  def oneSetOfNullableMonies_= (value: Set[Option[BigDecimal]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _oneSetOfNullableMonies = value

    _oneSetOfNullableMonies = com.dslplatform.api.Guards.setCollectionOptionScale(_oneSetOfNullableMonies, 2)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullableMonies")
  def calculatedOneSetOfNullableMonies = {
    _calculatedOneSetOfNullableMonies
  }

  def calculatedOneSetOfNullableMonies_= (value: Set[Option[BigDecimal]]) {
    _calculatedOneSetOfNullableMonies = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullableMonies")
  def persistedOneSetOfNullableMonies = {
    _persistedOneSetOfNullableMonies
  }

  def persistedOneSetOfNullableMonies_= (value: Set[Option[BigDecimal]]) {
    _persistedOneSetOfNullableMonies = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableMonies") oneSetOfNullableMonies: Set[Option[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullableMonies") calculatedOneSetOfNullableMonies: Set[Option[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullableMonies") persistedOneSetOfNullableMonies: Set[Option[BigDecimal]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneSetOfNullableMonies = if (oneSetOfNullableMonies == null) Set.empty else oneSetOfNullableMonies, _calculatedOneSetOfNullableMonies = calculatedOneSetOfNullableMonies, _persistedOneSetOfNullableMonies = persistedOneSetOfNullableMonies)

}

object OneSetOfNullableMonies_4 extends AggregateRootCompanion[OneSetOfNullableMonies_4]{

  def apply(
    oneSetOfNullableMonies: Set[Option[BigDecimal]] = Set.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableMonies)
    require(oneSetOfNullableMonies ne null, "Null value was provided for property \"oneSetOfNullableMonies\"")
    new OneSetOfNullableMonies_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneSetOfNullableMonies = oneSetOfNullableMonies
    , _calculatedOneSetOfNullableMonies = Set.empty
    , _persistedOneSetOfNullableMonies = Set.empty)
  }

}
