package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneArrayOfOneGuids_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneArrayOfOneGuids: Array[java.util.UUID],
    private var _calculatedOneArrayOfOneGuids: Array[java.util.UUID],
    private var _persistedOneArrayOfOneGuids: Array[java.util.UUID]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneArrayOfOneGuids_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneArrayOfOneGuids_4("+ URI +")"

   def copy(oneArrayOfOneGuids: Array[java.util.UUID] = this._oneArrayOfOneGuids): OneArrayOfOneGuids_4 = {

  require(oneArrayOfOneGuids ne null, "Null value was provided for property \"oneArrayOfOneGuids\"")
  com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneGuids)
    new OneArrayOfOneGuids_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneArrayOfOneGuids = oneArrayOfOneGuids, _calculatedOneArrayOfOneGuids = _calculatedOneArrayOfOneGuids, _persistedOneArrayOfOneGuids = _persistedOneArrayOfOneGuids)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfOneGuids_4): this.type = {
    this._URI = result._URI
    this._oneArrayOfOneGuids = result._oneArrayOfOneGuids
    this._calculatedOneArrayOfOneGuids = result._calculatedOneArrayOfOneGuids
    this._persistedOneArrayOfOneGuids = result._persistedOneArrayOfOneGuids
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfOneGuids_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneGuids")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneArrayOfOneGuids = {
    _oneArrayOfOneGuids
  }

  def oneArrayOfOneGuids_= (value: Array[java.util.UUID]) {
    com.dslplatform.api.Guards.checkArrayNulls(value)
    _oneArrayOfOneGuids = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfOneGuids")
  def calculatedOneArrayOfOneGuids = {
    _calculatedOneArrayOfOneGuids
  }

  def calculatedOneArrayOfOneGuids_= (value: Array[java.util.UUID]) {
    _calculatedOneArrayOfOneGuids = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfOneGuids")
  def persistedOneArrayOfOneGuids = {
    _persistedOneArrayOfOneGuids
  }

  def persistedOneArrayOfOneGuids_= (value: Array[java.util.UUID]) {
    _persistedOneArrayOfOneGuids = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneGuids") oneArrayOfOneGuids: Array[java.util.UUID]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfOneGuids") calculatedOneArrayOfOneGuids: Array[java.util.UUID]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfOneGuids") persistedOneArrayOfOneGuids: Array[java.util.UUID]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneArrayOfOneGuids = if (oneArrayOfOneGuids == null) Array.empty else oneArrayOfOneGuids, _calculatedOneArrayOfOneGuids = calculatedOneArrayOfOneGuids, _persistedOneArrayOfOneGuids = persistedOneArrayOfOneGuids)

}

object OneArrayOfOneGuids_4 extends AggregateRootCompanion[OneArrayOfOneGuids_4]{

  def apply(
    oneArrayOfOneGuids: Array[java.util.UUID] = Array.empty
  ) = {
    com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneGuids)
    require(oneArrayOfOneGuids ne null, "Null value was provided for property \"oneArrayOfOneGuids\"")
    new OneArrayOfOneGuids_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneArrayOfOneGuids = oneArrayOfOneGuids
    , _calculatedOneArrayOfOneGuids = Array.empty
    , _persistedOneArrayOfOneGuids = Array.empty)
  }

}
