package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfOneMonies_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneSetOfOneMonies: Set[BigDecimal],
    private var _calculatedOneSetOfOneMonies: Set[BigDecimal],
    private var _persistedOneSetOfOneMonies: Set[BigDecimal]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfOneMonies_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfOneMonies_4("+ URI +")"

   def copy(oneSetOfOneMonies: Set[BigDecimal] = this._oneSetOfOneMonies): OneSetOfOneMonies_4 = {

  require(oneSetOfOneMonies ne null, "Null value was provided for property \"oneSetOfOneMonies\"")
  com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneMonies)
    new OneSetOfOneMonies_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneSetOfOneMonies = oneSetOfOneMonies, _calculatedOneSetOfOneMonies = _calculatedOneSetOfOneMonies, _persistedOneSetOfOneMonies = _persistedOneSetOfOneMonies)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfOneMonies_4): this.type = {
    this._URI = result._URI
    this._oneSetOfOneMonies = result._oneSetOfOneMonies
    this._calculatedOneSetOfOneMonies = result._calculatedOneSetOfOneMonies
    this._persistedOneSetOfOneMonies = result._persistedOneSetOfOneMonies
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfOneMonies_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneMonies")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfOneMonies = {
    _oneSetOfOneMonies
  }

  def oneSetOfOneMonies_= (value: Set[BigDecimal]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _oneSetOfOneMonies = value

    _oneSetOfOneMonies = com.dslplatform.api.Guards.setCollectionScale(_oneSetOfOneMonies, 2)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfOneMonies")
  def calculatedOneSetOfOneMonies = {
    _calculatedOneSetOfOneMonies
  }

  def calculatedOneSetOfOneMonies_= (value: Set[BigDecimal]) {
    _calculatedOneSetOfOneMonies = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfOneMonies")
  def persistedOneSetOfOneMonies = {
    _persistedOneSetOfOneMonies
  }

  def persistedOneSetOfOneMonies_= (value: Set[BigDecimal]) {
    _persistedOneSetOfOneMonies = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneMonies") oneSetOfOneMonies: Set[BigDecimal]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfOneMonies") calculatedOneSetOfOneMonies: Set[BigDecimal]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfOneMonies") persistedOneSetOfOneMonies: Set[BigDecimal]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneSetOfOneMonies = if (oneSetOfOneMonies == null) Set.empty else oneSetOfOneMonies, _calculatedOneSetOfOneMonies = calculatedOneSetOfOneMonies, _persistedOneSetOfOneMonies = persistedOneSetOfOneMonies)

}

object OneSetOfOneMonies_4 extends AggregateRootCompanion[OneSetOfOneMonies_4]{

  def apply(
    oneSetOfOneMonies: Set[BigDecimal] = Set.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneMonies)
    require(oneSetOfOneMonies ne null, "Null value was provided for property \"oneSetOfOneMonies\"")
    new OneSetOfOneMonies_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneSetOfOneMonies = oneSetOfOneMonies
    , _calculatedOneSetOfOneMonies = Set.empty
    , _persistedOneSetOfOneMonies = Set.empty)
  }

}
