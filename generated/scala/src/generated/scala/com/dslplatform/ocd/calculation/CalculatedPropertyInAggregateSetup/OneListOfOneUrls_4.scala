package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneListOfOneUrls_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneListOfOneUrls: IndexedSeq[java.net.URI],
    private var _calculatedOneListOfOneUrls: IndexedSeq[java.net.URI],
    private var _persistedOneListOfOneUrls: IndexedSeq[java.net.URI]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneListOfOneUrls_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneListOfOneUrls_4("+ URI +")"

   def copy(oneListOfOneUrls: IndexedSeq[java.net.URI] = this._oneListOfOneUrls): OneListOfOneUrls_4 = {

  require(oneListOfOneUrls ne null, "Null value was provided for property \"oneListOfOneUrls\"")
  com.dslplatform.api.Guards.checkCollectionNulls(oneListOfOneUrls)
    new OneListOfOneUrls_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneListOfOneUrls = oneListOfOneUrls, _calculatedOneListOfOneUrls = _calculatedOneListOfOneUrls, _persistedOneListOfOneUrls = _persistedOneListOfOneUrls)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfOneUrls_4): this.type = {
    this._URI = result._URI
    this._oneListOfOneUrls = result._oneListOfOneUrls
    this._calculatedOneListOfOneUrls = result._calculatedOneListOfOneUrls
    this._persistedOneListOfOneUrls = result._persistedOneListOfOneUrls
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfOneUrls_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneUrls")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneListOfOneUrls = {
    _oneListOfOneUrls
  }

  def oneListOfOneUrls_= (value: IndexedSeq[java.net.URI]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _oneListOfOneUrls = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfOneUrls")
  def calculatedOneListOfOneUrls = {
    _calculatedOneListOfOneUrls
  }

  def calculatedOneListOfOneUrls_= (value: IndexedSeq[java.net.URI]) {
    _calculatedOneListOfOneUrls = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfOneUrls")
  def persistedOneListOfOneUrls = {
    _persistedOneListOfOneUrls
  }

  def persistedOneListOfOneUrls_= (value: IndexedSeq[java.net.URI]) {
    _persistedOneListOfOneUrls = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneUrls") oneListOfOneUrls: IndexedSeq[java.net.URI]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfOneUrls") calculatedOneListOfOneUrls: IndexedSeq[java.net.URI]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfOneUrls") persistedOneListOfOneUrls: IndexedSeq[java.net.URI]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneListOfOneUrls = if (oneListOfOneUrls == null) IndexedSeq.empty else oneListOfOneUrls, _calculatedOneListOfOneUrls = calculatedOneListOfOneUrls, _persistedOneListOfOneUrls = persistedOneListOfOneUrls)

}

object OneListOfOneUrls_4 extends AggregateRootCompanion[OneListOfOneUrls_4]{

  def apply(
    oneListOfOneUrls: IndexedSeq[java.net.URI] = IndexedSeq.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(oneListOfOneUrls)
    require(oneListOfOneUrls ne null, "Null value was provided for property \"oneListOfOneUrls\"")
    new OneListOfOneUrls_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneListOfOneUrls = oneListOfOneUrls
    , _calculatedOneListOfOneUrls = IndexedSeq.empty
    , _persistedOneListOfOneUrls = IndexedSeq.empty)
  }

}
