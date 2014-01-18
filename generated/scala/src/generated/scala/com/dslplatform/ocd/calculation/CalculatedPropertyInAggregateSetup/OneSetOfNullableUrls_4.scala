package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfNullableUrls_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneSetOfNullableUrls: Set[Option[java.net.URI]],
    private var _calculatedOneSetOfNullableUrls: Set[Option[java.net.URI]],
    private var _persistedOneSetOfNullableUrls: Set[Option[java.net.URI]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfNullableUrls_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfNullableUrls_4("+ URI +")"

   def copy(oneSetOfNullableUrls: Set[Option[java.net.URI]] = this._oneSetOfNullableUrls): OneSetOfNullableUrls_4 = {

  require(oneSetOfNullableUrls ne null, "Null value was provided for property \"oneSetOfNullableUrls\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableUrls)
    new OneSetOfNullableUrls_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneSetOfNullableUrls = oneSetOfNullableUrls, _calculatedOneSetOfNullableUrls = _calculatedOneSetOfNullableUrls, _persistedOneSetOfNullableUrls = _persistedOneSetOfNullableUrls)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfNullableUrls_4): this.type = {
    this._URI = result._URI
    this._oneSetOfNullableUrls = result._oneSetOfNullableUrls
    this._calculatedOneSetOfNullableUrls = result._calculatedOneSetOfNullableUrls
    this._persistedOneSetOfNullableUrls = result._persistedOneSetOfNullableUrls
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfNullableUrls_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableUrls")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfNullableUrls = {
    _oneSetOfNullableUrls
  }

  def oneSetOfNullableUrls_= (value: Set[Option[java.net.URI]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _oneSetOfNullableUrls = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullableUrls")
  def calculatedOneSetOfNullableUrls = {
    _calculatedOneSetOfNullableUrls
  }

  def calculatedOneSetOfNullableUrls_= (value: Set[Option[java.net.URI]]) {
    _calculatedOneSetOfNullableUrls = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullableUrls")
  def persistedOneSetOfNullableUrls = {
    _persistedOneSetOfNullableUrls
  }

  def persistedOneSetOfNullableUrls_= (value: Set[Option[java.net.URI]]) {
    _persistedOneSetOfNullableUrls = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableUrls") oneSetOfNullableUrls: Set[Option[java.net.URI]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullableUrls") calculatedOneSetOfNullableUrls: Set[Option[java.net.URI]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullableUrls") persistedOneSetOfNullableUrls: Set[Option[java.net.URI]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneSetOfNullableUrls = if (oneSetOfNullableUrls == null) Set.empty else oneSetOfNullableUrls, _calculatedOneSetOfNullableUrls = calculatedOneSetOfNullableUrls, _persistedOneSetOfNullableUrls = persistedOneSetOfNullableUrls)

}

object OneSetOfNullableUrls_4 extends AggregateRootCompanion[OneSetOfNullableUrls_4]{

  def apply(
    oneSetOfNullableUrls: Set[Option[java.net.URI]] = Set.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableUrls)
    require(oneSetOfNullableUrls ne null, "Null value was provided for property \"oneSetOfNullableUrls\"")
    new OneSetOfNullableUrls_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneSetOfNullableUrls = oneSetOfNullableUrls
    , _calculatedOneSetOfNullableUrls = Set.empty
    , _persistedOneSetOfNullableUrls = Set.empty)
  }

}
