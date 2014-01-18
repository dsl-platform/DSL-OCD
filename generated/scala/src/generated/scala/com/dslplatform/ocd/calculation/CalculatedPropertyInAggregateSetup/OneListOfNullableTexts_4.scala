package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneListOfNullableTexts_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneListOfNullableTexts: IndexedSeq[Option[String]],
    private var _calculatedOneListOfNullableTexts: IndexedSeq[Option[String]],
    private var _persistedOneListOfNullableTexts: IndexedSeq[Option[String]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneListOfNullableTexts_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneListOfNullableTexts_4("+ URI +")"

   def copy(oneListOfNullableTexts: IndexedSeq[Option[String]] = this._oneListOfNullableTexts): OneListOfNullableTexts_4 = {

  require(oneListOfNullableTexts ne null, "Null value was provided for property \"oneListOfNullableTexts\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableTexts)
    new OneListOfNullableTexts_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneListOfNullableTexts = oneListOfNullableTexts, _calculatedOneListOfNullableTexts = _calculatedOneListOfNullableTexts, _persistedOneListOfNullableTexts = _persistedOneListOfNullableTexts)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfNullableTexts_4): this.type = {
    this._URI = result._URI
    this._oneListOfNullableTexts = result._oneListOfNullableTexts
    this._calculatedOneListOfNullableTexts = result._calculatedOneListOfNullableTexts
    this._persistedOneListOfNullableTexts = result._persistedOneListOfNullableTexts
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfNullableTexts_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableTexts")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneListOfNullableTexts = {
    _oneListOfNullableTexts
  }

  def oneListOfNullableTexts_= (value: IndexedSeq[Option[String]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _oneListOfNullableTexts = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfNullableTexts")
  def calculatedOneListOfNullableTexts = {
    _calculatedOneListOfNullableTexts
  }

  def calculatedOneListOfNullableTexts_= (value: IndexedSeq[Option[String]]) {
    _calculatedOneListOfNullableTexts = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfNullableTexts")
  def persistedOneListOfNullableTexts = {
    _persistedOneListOfNullableTexts
  }

  def persistedOneListOfNullableTexts_= (value: IndexedSeq[Option[String]]) {
    _persistedOneListOfNullableTexts = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableTexts") oneListOfNullableTexts: IndexedSeq[Option[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfNullableTexts") calculatedOneListOfNullableTexts: IndexedSeq[Option[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfNullableTexts") persistedOneListOfNullableTexts: IndexedSeq[Option[String]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneListOfNullableTexts = if (oneListOfNullableTexts == null) IndexedSeq.empty else oneListOfNullableTexts, _calculatedOneListOfNullableTexts = calculatedOneListOfNullableTexts, _persistedOneListOfNullableTexts = persistedOneListOfNullableTexts)

}

object OneListOfNullableTexts_4 extends AggregateRootCompanion[OneListOfNullableTexts_4]{

  def apply(
    oneListOfNullableTexts: IndexedSeq[Option[String]] = IndexedSeq.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableTexts)
    require(oneListOfNullableTexts ne null, "Null value was provided for property \"oneListOfNullableTexts\"")
    new OneListOfNullableTexts_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneListOfNullableTexts = oneListOfNullableTexts
    , _calculatedOneListOfNullableTexts = IndexedSeq.empty
    , _persistedOneListOfNullableTexts = IndexedSeq.empty)
  }

}
