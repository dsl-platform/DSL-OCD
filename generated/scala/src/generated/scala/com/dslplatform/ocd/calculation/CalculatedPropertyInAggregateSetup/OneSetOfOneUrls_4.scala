package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfOneUrls_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneSetOfOneUrls: Set[java.net.URI],
    private var _calculatedOneSetOfOneUrls: Set[java.net.URI],
    private var _persistedOneSetOfOneUrls: Set[java.net.URI]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfOneUrls_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfOneUrls_4("+ URI +")"

   def copy(oneSetOfOneUrls: Set[java.net.URI] = this._oneSetOfOneUrls): OneSetOfOneUrls_4 = {

  require(oneSetOfOneUrls ne null, "Null value was provided for property \"oneSetOfOneUrls\"")
  com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneUrls)
    new OneSetOfOneUrls_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneSetOfOneUrls = oneSetOfOneUrls, _calculatedOneSetOfOneUrls = _calculatedOneSetOfOneUrls, _persistedOneSetOfOneUrls = _persistedOneSetOfOneUrls)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfOneUrls_4): this.type = {
    this._URI = result._URI
    this._oneSetOfOneUrls = result._oneSetOfOneUrls
    this._calculatedOneSetOfOneUrls = result._calculatedOneSetOfOneUrls
    this._persistedOneSetOfOneUrls = result._persistedOneSetOfOneUrls
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfOneUrls_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneUrls")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfOneUrls = {
    _oneSetOfOneUrls
  }

  def oneSetOfOneUrls_= (value: Set[java.net.URI]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _oneSetOfOneUrls = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfOneUrls")
  def calculatedOneSetOfOneUrls = {
    _calculatedOneSetOfOneUrls
  }

  def calculatedOneSetOfOneUrls_= (value: Set[java.net.URI]) {
    _calculatedOneSetOfOneUrls = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfOneUrls")
  def persistedOneSetOfOneUrls = {
    _persistedOneSetOfOneUrls
  }

  def persistedOneSetOfOneUrls_= (value: Set[java.net.URI]) {
    _persistedOneSetOfOneUrls = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneUrls") oneSetOfOneUrls: Set[java.net.URI]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfOneUrls") calculatedOneSetOfOneUrls: Set[java.net.URI]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfOneUrls") persistedOneSetOfOneUrls: Set[java.net.URI]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneSetOfOneUrls = if (oneSetOfOneUrls == null) Set.empty else oneSetOfOneUrls, _calculatedOneSetOfOneUrls = calculatedOneSetOfOneUrls, _persistedOneSetOfOneUrls = persistedOneSetOfOneUrls)

}

object OneSetOfOneUrls_4 extends AggregateRootCompanion[OneSetOfOneUrls_4]{

  def apply(
    oneSetOfOneUrls: Set[java.net.URI] = Set.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneUrls)
    require(oneSetOfOneUrls ne null, "Null value was provided for property \"oneSetOfOneUrls\"")
    new OneSetOfOneUrls_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneSetOfOneUrls = oneSetOfOneUrls
    , _calculatedOneSetOfOneUrls = Set.empty
    , _persistedOneSetOfOneUrls = Set.empty)
  }

}
