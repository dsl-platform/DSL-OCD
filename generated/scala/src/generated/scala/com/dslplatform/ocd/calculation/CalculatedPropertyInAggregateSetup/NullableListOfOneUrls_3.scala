package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableListOfOneUrls_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableListOfOneUrls: Option[IndexedSeq[java.net.URI]],
    private var _calculatedNullableListOfOneUrls: Option[IndexedSeq[java.net.URI]],
    private var _persistedNullableListOfOneUrls: Option[IndexedSeq[java.net.URI]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableListOfOneUrls_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableListOfOneUrls_3("+ URI +")"

   def copy(nullableListOfOneUrls: Option[IndexedSeq[java.net.URI]] = this._nullableListOfOneUrls): NullableListOfOneUrls_3 = {

  require(nullableListOfOneUrls ne null, "Null value was provided for property \"nullableListOfOneUrls\"")
  if(nullableListOfOneUrls.isDefined) require(nullableListOfOneUrls.get ne null, "Null value was provided for property \"nullableListOfOneUrls\"")
  com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneUrls)
    new NullableListOfOneUrls_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableListOfOneUrls = nullableListOfOneUrls, _calculatedNullableListOfOneUrls = _calculatedNullableListOfOneUrls, _persistedNullableListOfOneUrls = _persistedNullableListOfOneUrls)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfOneUrls_3): this.type = {
    this._URI = result._URI
    this._nullableListOfOneUrls = result._nullableListOfOneUrls
    this._calculatedNullableListOfOneUrls = result._calculatedNullableListOfOneUrls
    this._persistedNullableListOfOneUrls = result._persistedNullableListOfOneUrls
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfOneUrls_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneUrls")
  def nullableListOfOneUrls = {
    _nullableListOfOneUrls
  }

  def nullableListOfOneUrls_= (value: Option[IndexedSeq[java.net.URI]]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _nullableListOfOneUrls = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfOneUrls")
  def calculatedNullableListOfOneUrls = {
    _calculatedNullableListOfOneUrls
  }

  def calculatedNullableListOfOneUrls_= (value: Option[IndexedSeq[java.net.URI]]) {
    _calculatedNullableListOfOneUrls = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfOneUrls")
  def persistedNullableListOfOneUrls = {
    _persistedNullableListOfOneUrls
  }

  def persistedNullableListOfOneUrls_= (value: Option[IndexedSeq[java.net.URI]]) {
    _persistedNullableListOfOneUrls = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneUrls") nullableListOfOneUrls: Option[IndexedSeq[java.net.URI]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfOneUrls") calculatedNullableListOfOneUrls: Option[IndexedSeq[java.net.URI]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfOneUrls") persistedNullableListOfOneUrls: Option[IndexedSeq[java.net.URI]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableListOfOneUrls = nullableListOfOneUrls, _calculatedNullableListOfOneUrls = calculatedNullableListOfOneUrls, _persistedNullableListOfOneUrls = persistedNullableListOfOneUrls)

}

object NullableListOfOneUrls_3 extends AggregateRootCompanion[NullableListOfOneUrls_3]{

  def apply(
    nullableListOfOneUrls: Option[IndexedSeq[java.net.URI]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneUrls)
    require(nullableListOfOneUrls ne null, "Null value was provided for property \"nullableListOfOneUrls\"")
    if (nullableListOfOneUrls.isDefined) require(nullableListOfOneUrls.get ne null, "Null value was provided for property \"nullableListOfOneUrls\"")
    new NullableListOfOneUrls_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableListOfOneUrls = nullableListOfOneUrls
    , _calculatedNullableListOfOneUrls = None
    , _persistedNullableListOfOneUrls = None)
  }

}
