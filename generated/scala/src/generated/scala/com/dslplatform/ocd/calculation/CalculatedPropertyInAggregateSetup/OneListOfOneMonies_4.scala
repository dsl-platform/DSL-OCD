package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneListOfOneMonies_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneListOfOneMonies: IndexedSeq[BigDecimal],
    private var _calculatedOneListOfOneMonies: IndexedSeq[BigDecimal],
    private var _persistedOneListOfOneMonies: IndexedSeq[BigDecimal]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneListOfOneMonies_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneListOfOneMonies_4("+ URI +")"

   def copy(oneListOfOneMonies: IndexedSeq[BigDecimal] = this._oneListOfOneMonies): OneListOfOneMonies_4 = {

  require(oneListOfOneMonies ne null, "Null value was provided for property \"oneListOfOneMonies\"")
  com.dslplatform.api.Guards.checkCollectionNulls(oneListOfOneMonies)
    new OneListOfOneMonies_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneListOfOneMonies = oneListOfOneMonies, _calculatedOneListOfOneMonies = _calculatedOneListOfOneMonies, _persistedOneListOfOneMonies = _persistedOneListOfOneMonies)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfOneMonies_4): this.type = {
    this._URI = result._URI
    this._oneListOfOneMonies = result._oneListOfOneMonies
    this._calculatedOneListOfOneMonies = result._calculatedOneListOfOneMonies
    this._persistedOneListOfOneMonies = result._persistedOneListOfOneMonies
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfOneMonies_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneMonies")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneListOfOneMonies = {
    _oneListOfOneMonies
  }

  def oneListOfOneMonies_= (value: IndexedSeq[BigDecimal]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _oneListOfOneMonies = value

    _oneListOfOneMonies = com.dslplatform.api.Guards.setCollectionScale(_oneListOfOneMonies, 2)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfOneMonies")
  def calculatedOneListOfOneMonies = {
    _calculatedOneListOfOneMonies
  }

  def calculatedOneListOfOneMonies_= (value: IndexedSeq[BigDecimal]) {
    _calculatedOneListOfOneMonies = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfOneMonies")
  def persistedOneListOfOneMonies = {
    _persistedOneListOfOneMonies
  }

  def persistedOneListOfOneMonies_= (value: IndexedSeq[BigDecimal]) {
    _persistedOneListOfOneMonies = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneMonies") oneListOfOneMonies: IndexedSeq[BigDecimal]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfOneMonies") calculatedOneListOfOneMonies: IndexedSeq[BigDecimal]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfOneMonies") persistedOneListOfOneMonies: IndexedSeq[BigDecimal]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneListOfOneMonies = if (oneListOfOneMonies == null) IndexedSeq.empty else oneListOfOneMonies, _calculatedOneListOfOneMonies = calculatedOneListOfOneMonies, _persistedOneListOfOneMonies = persistedOneListOfOneMonies)

}

object OneListOfOneMonies_4 extends AggregateRootCompanion[OneListOfOneMonies_4]{

  def apply(
    oneListOfOneMonies: IndexedSeq[BigDecimal] = IndexedSeq.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(oneListOfOneMonies)
    require(oneListOfOneMonies ne null, "Null value was provided for property \"oneListOfOneMonies\"")
    new OneListOfOneMonies_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneListOfOneMonies = oneListOfOneMonies
    , _calculatedOneListOfOneMonies = IndexedSeq.empty
    , _persistedOneListOfOneMonies = IndexedSeq.empty)
  }

}
