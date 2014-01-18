package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfOneDecimals_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneSetOfOneDecimals: Set[BigDecimal],
    private var _calculatedOneSetOfOneDecimals: Set[BigDecimal],
    private var _persistedOneSetOfOneDecimals: Set[BigDecimal]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfOneDecimals_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfOneDecimals_4("+ URI +")"

   def copy(oneSetOfOneDecimals: Set[BigDecimal] = this._oneSetOfOneDecimals): OneSetOfOneDecimals_4 = {

  require(oneSetOfOneDecimals ne null, "Null value was provided for property \"oneSetOfOneDecimals\"")
  com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneDecimals)
    new OneSetOfOneDecimals_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneSetOfOneDecimals = oneSetOfOneDecimals, _calculatedOneSetOfOneDecimals = _calculatedOneSetOfOneDecimals, _persistedOneSetOfOneDecimals = _persistedOneSetOfOneDecimals)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfOneDecimals_4): this.type = {
    this._URI = result._URI
    this._oneSetOfOneDecimals = result._oneSetOfOneDecimals
    this._calculatedOneSetOfOneDecimals = result._calculatedOneSetOfOneDecimals
    this._persistedOneSetOfOneDecimals = result._persistedOneSetOfOneDecimals
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfOneDecimals_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneDecimals")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfOneDecimals = {
    _oneSetOfOneDecimals
  }

  def oneSetOfOneDecimals_= (value: Set[BigDecimal]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _oneSetOfOneDecimals = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfOneDecimals")
  def calculatedOneSetOfOneDecimals = {
    _calculatedOneSetOfOneDecimals
  }

  def calculatedOneSetOfOneDecimals_= (value: Set[BigDecimal]) {
    _calculatedOneSetOfOneDecimals = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfOneDecimals")
  def persistedOneSetOfOneDecimals = {
    _persistedOneSetOfOneDecimals
  }

  def persistedOneSetOfOneDecimals_= (value: Set[BigDecimal]) {
    _persistedOneSetOfOneDecimals = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneDecimals") oneSetOfOneDecimals: Set[BigDecimal]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfOneDecimals") calculatedOneSetOfOneDecimals: Set[BigDecimal]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfOneDecimals") persistedOneSetOfOneDecimals: Set[BigDecimal]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneSetOfOneDecimals = if (oneSetOfOneDecimals == null) Set.empty else oneSetOfOneDecimals, _calculatedOneSetOfOneDecimals = calculatedOneSetOfOneDecimals, _persistedOneSetOfOneDecimals = persistedOneSetOfOneDecimals)

}

object OneSetOfOneDecimals_4 extends AggregateRootCompanion[OneSetOfOneDecimals_4]{

  def apply(
    oneSetOfOneDecimals: Set[BigDecimal] = Set.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneDecimals)
    require(oneSetOfOneDecimals ne null, "Null value was provided for property \"oneSetOfOneDecimals\"")
    new OneSetOfOneDecimals_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneSetOfOneDecimals = oneSetOfOneDecimals
    , _calculatedOneSetOfOneDecimals = Set.empty
    , _persistedOneSetOfOneDecimals = Set.empty)
  }

}
