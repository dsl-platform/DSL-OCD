package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneListOfNullableStrings_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneListOfNullableStrings: IndexedSeq[Option[String]],
    private var _calculatedOneListOfNullableStrings: IndexedSeq[Option[String]],
    private var _persistedOneListOfNullableStrings: IndexedSeq[Option[String]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneListOfNullableStrings_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneListOfNullableStrings_4("+ URI +")"

   def copy(oneListOfNullableStrings: IndexedSeq[Option[String]] = this._oneListOfNullableStrings): OneListOfNullableStrings_4 = {

  require(oneListOfNullableStrings ne null, "Null value was provided for property \"oneListOfNullableStrings\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableStrings)
    new OneListOfNullableStrings_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneListOfNullableStrings = oneListOfNullableStrings, _calculatedOneListOfNullableStrings = _calculatedOneListOfNullableStrings, _persistedOneListOfNullableStrings = _persistedOneListOfNullableStrings)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfNullableStrings_4): this.type = {
    this._URI = result._URI
    this._oneListOfNullableStrings = result._oneListOfNullableStrings
    this._calculatedOneListOfNullableStrings = result._calculatedOneListOfNullableStrings
    this._persistedOneListOfNullableStrings = result._persistedOneListOfNullableStrings
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfNullableStrings_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableStrings")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneListOfNullableStrings = {
    _oneListOfNullableStrings
  }

  def oneListOfNullableStrings_= (value: IndexedSeq[Option[String]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _oneListOfNullableStrings = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfNullableStrings")
  def calculatedOneListOfNullableStrings = {
    _calculatedOneListOfNullableStrings
  }

  def calculatedOneListOfNullableStrings_= (value: IndexedSeq[Option[String]]) {
    _calculatedOneListOfNullableStrings = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfNullableStrings")
  def persistedOneListOfNullableStrings = {
    _persistedOneListOfNullableStrings
  }

  def persistedOneListOfNullableStrings_= (value: IndexedSeq[Option[String]]) {
    _persistedOneListOfNullableStrings = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableStrings") oneListOfNullableStrings: IndexedSeq[Option[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfNullableStrings") calculatedOneListOfNullableStrings: IndexedSeq[Option[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfNullableStrings") persistedOneListOfNullableStrings: IndexedSeq[Option[String]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneListOfNullableStrings = if (oneListOfNullableStrings == null) IndexedSeq.empty else oneListOfNullableStrings, _calculatedOneListOfNullableStrings = calculatedOneListOfNullableStrings, _persistedOneListOfNullableStrings = persistedOneListOfNullableStrings)

}

object OneListOfNullableStrings_4 extends AggregateRootCompanion[OneListOfNullableStrings_4]{

  def apply(
    oneListOfNullableStrings: IndexedSeq[Option[String]] = IndexedSeq.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableStrings)
    require(oneListOfNullableStrings ne null, "Null value was provided for property \"oneListOfNullableStrings\"")
    new OneListOfNullableStrings_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneListOfNullableStrings = oneListOfNullableStrings
    , _calculatedOneListOfNullableStrings = IndexedSeq.empty
    , _persistedOneListOfNullableStrings = IndexedSeq.empty)
  }

}
