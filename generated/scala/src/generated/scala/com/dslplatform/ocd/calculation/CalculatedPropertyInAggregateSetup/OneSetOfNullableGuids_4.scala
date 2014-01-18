package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfNullableGuids_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneSetOfNullableGuids: Set[Option[java.util.UUID]],
    private var _calculatedOneSetOfNullableGuids: Set[Option[java.util.UUID]],
    private var _persistedOneSetOfNullableGuids: Set[Option[java.util.UUID]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfNullableGuids_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfNullableGuids_4("+ URI +")"

   def copy(oneSetOfNullableGuids: Set[Option[java.util.UUID]] = this._oneSetOfNullableGuids): OneSetOfNullableGuids_4 = {

  require(oneSetOfNullableGuids ne null, "Null value was provided for property \"oneSetOfNullableGuids\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableGuids)
    new OneSetOfNullableGuids_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneSetOfNullableGuids = oneSetOfNullableGuids, _calculatedOneSetOfNullableGuids = _calculatedOneSetOfNullableGuids, _persistedOneSetOfNullableGuids = _persistedOneSetOfNullableGuids)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfNullableGuids_4): this.type = {
    this._URI = result._URI
    this._oneSetOfNullableGuids = result._oneSetOfNullableGuids
    this._calculatedOneSetOfNullableGuids = result._calculatedOneSetOfNullableGuids
    this._persistedOneSetOfNullableGuids = result._persistedOneSetOfNullableGuids
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfNullableGuids_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableGuids")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfNullableGuids = {
    _oneSetOfNullableGuids
  }

  def oneSetOfNullableGuids_= (value: Set[Option[java.util.UUID]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _oneSetOfNullableGuids = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullableGuids")
  def calculatedOneSetOfNullableGuids = {
    _calculatedOneSetOfNullableGuids
  }

  def calculatedOneSetOfNullableGuids_= (value: Set[Option[java.util.UUID]]) {
    _calculatedOneSetOfNullableGuids = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullableGuids")
  def persistedOneSetOfNullableGuids = {
    _persistedOneSetOfNullableGuids
  }

  def persistedOneSetOfNullableGuids_= (value: Set[Option[java.util.UUID]]) {
    _persistedOneSetOfNullableGuids = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableGuids") oneSetOfNullableGuids: Set[Option[java.util.UUID]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullableGuids") calculatedOneSetOfNullableGuids: Set[Option[java.util.UUID]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullableGuids") persistedOneSetOfNullableGuids: Set[Option[java.util.UUID]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneSetOfNullableGuids = if (oneSetOfNullableGuids == null) Set.empty else oneSetOfNullableGuids, _calculatedOneSetOfNullableGuids = calculatedOneSetOfNullableGuids, _persistedOneSetOfNullableGuids = persistedOneSetOfNullableGuids)

}

object OneSetOfNullableGuids_4 extends AggregateRootCompanion[OneSetOfNullableGuids_4]{

  def apply(
    oneSetOfNullableGuids: Set[Option[java.util.UUID]] = Set.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableGuids)
    require(oneSetOfNullableGuids ne null, "Null value was provided for property \"oneSetOfNullableGuids\"")
    new OneSetOfNullableGuids_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneSetOfNullableGuids = oneSetOfNullableGuids
    , _calculatedOneSetOfNullableGuids = Set.empty
    , _persistedOneSetOfNullableGuids = Set.empty)
  }

}
